/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpserver;

import foodreservation.Ws;
import foodreservation.Ws_Service;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jevon
 */
public class HandleSocket extends Thread {

    private Socket socket;
    private DataOutputStream out;
    private BufferedReader in;
    private FormServer server;


    public HandleSocket(Socket socket, FormServer server) {
        this.socket = socket;
        this.server = server;
        try {
            out = new DataOutputStream(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            server.log("[HandleSocket] Gagal init stream: " + e.getMessage());
        }
    }

    private Ws getPort() {
        return new Ws_Service().getWsPort();
    }

    @Override
    public void run() {
        try {
            String command;
            while ((command = in.readLine()) != null) {
                server.log("[IN]  " + command);
                String response = processCommand(command);
                sendResponse(response);
                server.log("[OUT] " + response);
            }
        } catch (IOException e) {
            server.log("[DISCONNECT] " + socket.getInetAddress() + ": " + e.getMessage());
        } finally {
            try {
                if (socket != null && !socket.isClosed()) {
                    socket.close();
                }
            } catch (IOException e) {
                server.log("[ERROR] Gagal tutup socket: " + e.getMessage());
            }
        }
    }

    private String processCommand(String command) {
        String[] parts = command.split("~");
        String cmd = parts[0].toUpperCase().trim();

        try {

            //user management
            if (cmd.equals("LOGIN")) {
                if (parts.length < 3) {
                    return "FAILED~Format: LOGIN~username~password";
                }
                boolean ok = getPort().login(parts[1], parts[2]);
                if (ok) {
                    String role = getPort().getUserRole(parts[1]);
                    return "SUCCESS~" + role;
                }
                return "FAILED~Username atau password salah";

            } else if (cmd.equals("REGISTER")) {
                if (parts.length < 4) {
                    return "FAILED~Format: REGISTER~username~password~nama";
                }
                boolean ok = getPort().register(parts[1], parts[2], parts[3]);
                return ok ? "SUCCESS" : "FAILED~Username sudah digunakan";

            } else if (cmd.equals("GET_USER_LIST")) {
                List<String> users = getPort().getUserList();
                if (users.isEmpty()) {
                    return "USER_LIST~KOSONG";
                }
                return "USER_LIST~" + String.join("~", users);

            } else if (cmd.equals("UPDATE_PROFILE")) {
                if (parts.length < 4) {
                    return "FAILED~Format: UPDATE_PROFILE~userId~nama~password";
                }
                boolean ok = getPort().updateProfile(
                        Integer.parseInt(parts[1]), parts[2], parts[3]);
                return ok ? "SUCCESS" : "FAILED~Gagal update profil";

                //menu management
            } else if (cmd.equals("GET_MENU")) {
                List<String> menus = getPort().getMenuList();
                if (menus.isEmpty()) {
                    return "MENU~KOSONG";
                }
                return "MENU~" + String.join("~", menus);

            } else if (cmd.equals("GET_ALL_MENU")) {
                List<String> menus = getPort().getAllMenuList();
                if (menus.isEmpty()) {
                    return "ALL_MENU~KOSONG";
                }
                return "ALL_MENU~" + String.join("~", menus);

            } else if (cmd.equals("ADD_MENU")) {
                if (parts.length < 4) {
                    return "FAILED~Format: ADD_MENU~nama~kategori~harga";
                }
                boolean ok = getPort().addMenu(
                        parts[1], parts[2], Double.parseDouble(parts[3]));
                return ok ? "SUCCESS" : "FAILED~Gagal tambah menu";

            } else if (cmd.equals("UPDATE_MENU")) {
                if (parts.length < 6) {
                    return "FAILED~Format: UPDATE_MENU~id~nama~kat~harga~available";
                }
                boolean ok = getPort().updateMenu(
                        Integer.parseInt(parts[1]),
                        parts[2], parts[3],
                        Double.parseDouble(parts[4]),
                        parts[5].equals("1"));
                return ok ? "SUCCESS" : "FAILED~Gagal update menu";

            } else if (cmd.equals("DELETE_MENU")) {
                if (parts.length < 2) {
                    return "FAILED~Format: DELETE_MENU~menuId";
                }
                boolean ok = getPort().deleteMenu(Integer.parseInt(parts[1]));
                return ok ? "SUCCESS" : "FAILED~Gagal hapus menu";

                //table management
            } else if (cmd.equals("GET_TABLE")) {
                List<String> tables = getPort().getTableList();
                if (tables.isEmpty()) {
                    return "TABLE~KOSONG";
                }
                return "TABLE~" + String.join("~", tables);

            } else if (cmd.equals("UPDATE_TABLE")) {
                if (parts.length < 3) {
                    return "FAILED~Format: UPDATE_TABLE~tableId~status";
                }
                boolean ok = getPort().updateTableStatus(
                        Integer.parseInt(parts[1]), parts[2]);
                return ok ? "SUCCESS" : "FAILED~Gagal update status meja";

                //reservation
            } else if (cmd.equals("MAKE_RESERVATION")) {
                if (parts.length < 5) {
                    return "FAILED~Format: MAKE_RESERVATION~user~tamu~tgl~jam";
                }
                String result = getPort().makeReservation(
                        parts[1],
                        Integer.parseInt(parts[2]),
                        parts[3],
                        parts[4]
                );
                return result.replace("|", "~");

            } else if (cmd.equals("CANCEL")) {
                if (parts.length < 2) {
                    return "FAILED~Format: CANCEL~reservationId";
                }
                boolean ok = getPort().cancelReservation(
                        Integer.parseInt(parts[1]));
                return ok ? "SUCCESS" : "FAILED~Gagal cancel reservasi";

            } else if (cmd.equals("CONFIRM")) {
                if (parts.length < 2) {
                    return "FAILED~Format: CONFIRM~reservationId";
                }
                boolean ok = getPort().confirmReservation(
                        Integer.parseInt(parts[1]));
                return ok ? "SUCCESS" : "FAILED~Gagal konfirmasi reservasi";

            } else if (cmd.equals("GET_HISTORY")) {
                if (parts.length < 2) {
                    return "FAILED~Format: GET_HISTORY~username";
                }
                List<String> history = getPort().getReservationHistory(parts[1]);
                if (history.isEmpty()) {
                    return "HISTORY~KOSONG";
                }
                return "HISTORY~" + String.join("~", history);

            } else if (cmd.equals("GET_ALL_RESERVATIONS")) {
                List<String> all = getPort().getAllReservations();
                if (all.isEmpty()) {
                    return "ALL_RESERVATIONS~KOSONG";
                }
                return "ALL_RESERVATIONS~" + String.join("~", all);

                // ── FOOD ORDERING ─────────────────────────────────────
            } else if (cmd.equals("ADD_ORDER")) {
                if (parts.length < 4) {
                    return "FAILED~Format: ADD_ORDER~reservId~menuId~qty";
                }
                boolean ok = getPort().addOrderItem(
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),
                        Integer.parseInt(parts[3])
                );
                return ok ? "SUCCESS" : "FAILED~Gagal tambah pesanan";

            } else if (cmd.equals("GET_ORDER")) {
                if (parts.length < 2) {
                    return "FAILED~Format: GET_ORDER~reservationId";
                }
                List<String> orders = getPort().getOrderByReservation(
                        Integer.parseInt(parts[1]));
                if (orders.isEmpty()) {
                    return "ORDER~KOSONG";
                }
                return "ORDER~" + String.join("~", orders);

            } else if (cmd.equals("UPDATE_ORDER")) {
                if (parts.length < 3) {
                    return "FAILED~Format: UPDATE_ORDER~orderId~status";
                }
                boolean ok = getPort().updateOrderStatus(
                        Integer.parseInt(parts[1]), parts[2]);
                return ok ? "SUCCESS" : "FAILED~Gagal update status pesanan";

            } else if (cmd.equals("DELETE_ORDER")) {
                if (parts.length < 2) {
                    return "FAILED~Format: DELETE_ORDER~orderId";
                }
                boolean ok = getPort().deleteOrderItem(
                        Integer.parseInt(parts[1]));
                return ok ? "SUCCESS" : "FAILED~Gagal hapus item pesanan";

                // ── DEFAULT ───────────────────────────────────────────
            } else {
                return "FAILED~Command tidak dikenal: " + cmd;
            }

        } catch (NumberFormatException e) {
            return "FAILED~Format angka salah: " + e.getMessage();
        } catch (Exception e) {
            server.log("[ERROR] " + e.getMessage());
            return "FAILED~Server error: " + e.getMessage();
        }
    }

    // ── sendResponse() ────────────────────────────────────────────
    public void sendResponse(String msg) {
        try {
            out.writeBytes(msg + "\n");
        } catch (IOException e) {
            server.log("[sendResponse ERROR] " + e.getMessage());
        }
    }

}

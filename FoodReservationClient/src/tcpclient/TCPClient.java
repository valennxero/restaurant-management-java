/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpclient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Jevon
 */
public class TCPClient {

    private static Socket socket;
    private static DataOutputStream out;
    private static BufferedReader in;

    public static String loggedUser = "";
    public static String loggedRole = "";
    public static int loggedId = -1;

    public static void connect() throws IOException {
        socket = new Socket("localhost", 7000);
        out = new DataOutputStream(socket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public static String sendCommand(String command) {
        try {
            out.writeBytes(command + "\n");
            return in.readLine();
        } catch (IOException e) {
            return "FAILED~Koneksi ke server bermasalah: " + e.getMessage();
        }
    }

    public static void disconnect() {
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {
            System.out.println("Disconnect error: " + e.getMessage());
        }
    }

}

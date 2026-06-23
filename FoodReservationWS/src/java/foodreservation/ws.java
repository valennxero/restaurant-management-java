/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package foodreservation;

import foodreservation.model.*;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 *
 * @author Jevon
 */
@WebService(serviceName = "ws")
public class ws {

    /**
     * This is a sample web service operation
     */
    @WebMethod
    public boolean login(String username, String password) {
        User u = new User();
        boolean ok = u.checkLogin(username, password);
        if (ok) {
            u.updateLoginAt(username);
        }
        return ok;
    }
    @WebMethod
    public String getUserRole(String username) {
        return new User().getUserRole(username);
    }

    @WebMethod
    public boolean register(String username, String password, String name) {
        User u = new User();
        if (u.checkUsernameExists(username)) {
            return false;  // username sudah digunakan
        }
        return new User(username, password, name).insertData();
    }
    @WebMethod
    public String[] getUserList() {
        ArrayList<String> list = new User().viewListDataString();
        return list.toArray(new String[0]);
    }
    @WebMethod
    public boolean updateProfile(int userId, String name, String password) {
        User u = new User();
        u.setId(userId);
        u.setName(name);
        u.setPassword(password);
        return u.updateData();
    }

    @WebMethod
    public int getUserIdByUsername(String username) {
        return new User().getUserIdByUsername(username);
    }
    //MENU MANAGEMENT
    @WebMethod
    public String[] getMenuList() {
        ArrayList<String> list = new MenuItem().viewListDataString();
        return list.toArray(new String[0]);
    }

    @WebMethod
    public String[] getAllMenuList() {
        ArrayList<String> list = new MenuItem().viewAllDataString();
        return list.toArray(new String[0]);
    }


    @WebMethod
    public boolean addMenu(String name, String category, double price) {
        return new MenuItem(name, category, price).insertData();
    }

    @WebMethod
    public boolean updateMenu(int id, String name, String category,
                              double price, boolean available) {
        MenuItem m = new MenuItem();
        m.setId(id);
        m.setName(name);
        m.setCategory(category);
        m.setPrice(price);
        m.setAvailable(available);
        return m.updateData();
    }

    @WebMethod
    public boolean deleteMenu(int id) {
        MenuItem m = new MenuItem();
        m.setId(id);
        return m.deleteData();
    }

    //TABLE MANAGEMENT

    @WebMethod
    public String[] getTableList() {
        ArrayList<String> list = new TableResto().viewListDataString();
        return list.toArray(new String[0]);
    }

    @WebMethod
    public int findAvailableTable(int guestCount) {
        return new TableResto().findAvailableTable(guestCount);
    }

    @WebMethod
    public boolean updateTableStatus(int tableId, String status) {
        TableResto t = new TableResto();
        t.setId(tableId);
        t.setStatus(status);
        return t.updateData();
    }

    // reservation

    @WebMethod
    public synchronized String makeReservation(String username, int guestCount,
                                               String date, String time) {
        int userId = new User().getUserIdByUsername(username);
        if (userId == -1) {
            return "FAILED|User tidak ditemukan";
        }

        int tableId = new TableResto().findAvailableTable(guestCount);
        if (tableId == -1) {
            return "FAILED|Tidak ada meja tersedia untuk " + guestCount + " tamu";
        }

        Reservation res = new Reservation(userId, tableId, date, time, guestCount);
        boolean inserted = res.insertData();
        if (!inserted) {
            return "FAILED|Meja sudah dipesan pada waktu tersebut";
        }

        TableResto t = new TableResto();
        t.setId(tableId);
        t.setStatus("reserved");
        t.updateData();

        int newId = new Reservation().getLastInsertedId(userId);
        return "SUCCESS|" + newId;
    }

    @WebMethod
    public boolean cancelReservation(int reservationId) {
        Reservation res = new Reservation();
        res.setId(reservationId);
        res.setStatus("cancelled");
        return res.updateData();
    }


    @WebMethod
    public boolean confirmReservation(int reservationId) {
        Reservation res = new Reservation();
        res.setId(reservationId);
        res.setStatus("confirmed");
        return res.updateData();
    }


    @WebMethod
    public String[] getReservationHistory(String username) {
        ArrayList<String> list = new Reservation().viewByUsernameString(username);
        return list.toArray(new String[0]);
    }


    @WebMethod
    public String[] getAllReservations() {
        ArrayList<String> list = new Reservation().viewListDataString();
        return list.toArray(new String[0]);
    }

    //FOOD ORDERING

    @WebMethod
    public boolean addOrderItem(int reservationId, int menuId, int quantity) {
        return new OrderItem(reservationId, menuId, quantity).insertData();
    }

    /**
     * getOrderByReservation() — Ambil semua pesanan dalam 1 reservasi.
     * Return: array String format id|menuName|quantity|menuPrice|status
     */
    @WebMethod
    public String[] getOrderByReservation(int reservationId) {
        ArrayList<String> list = new OrderItem().viewListDataString(reservationId);
        return list.toArray(new String[0]);
    }


    @WebMethod
    public boolean updateOrderStatus(int orderId, String status) {
        OrderItem item = new OrderItem();
        item.setId(orderId);
        item.setStatus(status);
        return item.updateData();
    }

    @WebMethod
    public boolean deleteOrderItem(int orderId) {
        OrderItem item = new OrderItem();
        item.setId(orderId);
        return item.deleteData();
    }

}

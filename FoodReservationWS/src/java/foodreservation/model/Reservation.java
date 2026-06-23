/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodreservation.model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jevon
 */
public class Reservation extends MyModel {

    private int id;
    private int userId;
    private int tableId;
    private int guestCount;
    private String date;
    private String time;
    private String status;
    private String createdAt;
    private String username;
    private String tableName;

    public Reservation(int userId, int tableId, String date,
            String time, int guestCount) {
        this.userId = userId;
        this.tableId = tableId;
        this.date = date;
        this.time = time;
        this.guestCount = guestCount;
        this.status = "pending";
    }

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public synchronized boolean insertData() {
        try (Connection con = getConnection()) {
            PreparedStatement check = con.prepareStatement(
                "SELECT id FROM reservations " +
                "WHERE table_id = ? " +
                "  AND reservation_date = ? " +
                "  AND reservation_time = ? " +
                "  AND status != 'cancelled'");
            check.setInt(1,    tableId);
            check.setString(2, date);
            check.setString(3, time);
            ResultSet existing = check.executeQuery();
            if (existing.next()) {
                // Meja sudah dipesan di waktu tersebut
                return false;
            }

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO reservations " +
                "(user_id, table_id, reservation_date, " +
                " reservation_time, guest_count, status) " +
                "VALUES (?, ?, ?, ?, ?, 'pending')");
            ps.setInt(1,    userId);
            ps.setInt(2,    tableId);
            ps.setString(3, date);
            ps.setString(4, time);
            ps.setInt(5,    guestCount);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[Reservation.insertData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE reservations SET status = ? WHERE id = ?");
            ps.setString(1, status);
            ps.setInt(2,    id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[Reservation.updateData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM reservations WHERE id = ?");
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[Reservation.deleteData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList viewListData() {
        ArrayList<Reservation> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "SELECT r.*, u.username, t.table_number " +
                "FROM reservations r " +
                "JOIN users u         ON r.user_id  = u.id " +
                "JOIN tables_resto t  ON r.table_id = t.id " +
                "ORDER BY r.id DESC");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reservation res = new Reservation();
                res.setId(rs.getInt("id"));
                res.setUserId(rs.getInt("user_id"));
                res.setTableId(rs.getInt("table_id"));
                res.setDate(rs.getString("reservation_date"));
                res.setTime(rs.getString("reservation_time"));
                res.setGuestCount(rs.getInt("guest_count"));
                res.setStatus(rs.getString("status"));
                res.setUsername(rs.getString("username"));
                res.setTableName(rs.getString("table_number"));
                list.add(res);
            }
        } catch (Exception e) {
            System.out.println("[Reservation.viewListData] " + e.getMessage());
        }
        return list;
    }

    public ArrayList viewByUsername(String username) {
        ArrayList<Reservation> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "SELECT r.*, u.username, t.table_number " +
                "FROM reservations r " +
                "JOIN users u         ON r.user_id  = u.id " +
                "JOIN tables_resto t  ON r.table_id = t.id " +
                "WHERE u.username = ? " +
                "ORDER BY r.id DESC");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reservation res = new Reservation();
                res.setId(rs.getInt("id"));
                res.setDate(rs.getString("reservation_date"));
                res.setTime(rs.getString("reservation_time"));
                res.setGuestCount(rs.getInt("guest_count"));
                res.setStatus(rs.getString("status"));
                res.setTableName(rs.getString("table_number"));
                list.add(res);
            }
        } catch (Exception e) {
            System.out.println("[Reservation.viewByUsername] " + e.getMessage());
        }
        return list;
    }

    public int getLastInsertedId(int userId) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "SELECT id FROM reservations " +
                "WHERE user_id = ? ORDER BY id DESC LIMIT 1");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt("id");
        } catch (Exception e) {
            System.out.println("[Reservation.getLastInsertedId] " + e.getMessage());
        }
        return -1;
    }

    public ArrayList<String> viewListDataString() {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewListData()) {
            Reservation r = (Reservation) obj;
            result.add(r.getId()          + "|" +
                       r.getUsername()    + "|" +
                       r.getTableName()   + "|" +
                       r.getDate()        + "|" +
                       r.getTime()        + "|" +
                       r.getGuestCount()  + "|" +
                       r.getStatus());
        }
        return result;
    }

    public ArrayList<String> viewByUsernameString(String username) {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewByUsername(username)) {
            Reservation r = (Reservation) obj;
            result.add(r.getId()         + "|" +
                       r.getTableName()  + "|" +
                       r.getDate()       + "|" +
                       r.getTime()       + "|" +
                       r.getGuestCount() + "|" +
                       r.getStatus());
        }
        return result;
    }

}

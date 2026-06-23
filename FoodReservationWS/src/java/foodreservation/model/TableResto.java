/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodreservation.model;

import java.util.ArrayList;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jevon
 */
public class TableResto extends MyModel {

    private int id;
    private String tableNumber;
    private int capacity;
    private String status;

    public TableResto(String tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = "available";
    }

    public TableResto(int id, String tableNumber, int capacity, String status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = status;
    }

    public TableResto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean insertData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tables_resto (table_number, capacity) VALUES (?, ?)");
            ps.setString(1, tableNumber);
            ps.setInt(2, capacity);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[TableResto.insertData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE tables_resto SET status = ? WHERE id = ?");
            ps.setString(1, status);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[TableResto.updateData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM tables_resto WHERE id = ?");
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[TableResto.deleteData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList viewListData() {
        ArrayList<TableResto> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM tables_resto ORDER BY id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TableResto(
                        rs.getInt("id"),
                        rs.getString("table_number"),
                        rs.getInt("capacity"),
                        rs.getString("status")
                ));
            }
        } catch (Exception e) {
            System.out.println("[TableResto.viewListData] " + e.getMessage());
        }
        return list;
    }

    public int findAvailableTable(int guestCount) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT id FROM tables_resto "
                    + "WHERE status = 'available' AND capacity >= ? "
                    + "ORDER BY capacity ASC LIMIT 1");
            ps.setInt(1, guestCount);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("[TableResto.findAvailableTable] " + e.getMessage());
        }
        return -1;
    }

    public ArrayList<String> viewListDataString() {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewListData()) {
            TableResto t = (TableResto) obj;
            result.add(t.getId() + "|"
                    + t.getTableNumber() + "|"
                    + t.getCapacity() + "|"
                    + t.getStatus());
        }
        return result;
    }

}

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
public class OrderItem extends MyModel {

    private int id;
    private int reservationId;
    private int menuId;
    private int quantity;
    private String status;

    private String menuName;
    private double menuPrice;
    public OrderItem(int reservationId, int menuId, int quantity) {
        this.reservationId = reservationId;
        this.menuId        = menuId;
        this.quantity      = quantity;
        this.status        = "Pending";
    }

    public OrderItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }
    @Override
    public boolean insertData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO order_items " +
                "(reservation_id, menu_id, quantity) VALUES (?, ?, ?)");
            ps.setInt(1, reservationId);
            ps.setInt(2, menuId);
            ps.setInt(3, quantity);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[OrderItem.insertData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE order_items SET status = ? WHERE id = ?");
            ps.setString(1, status);
            ps.setInt(2,    id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[OrderItem.updateData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM order_items WHERE id = ?");
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[OrderItem.deleteData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList viewListData() {
        ArrayList<OrderItem> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "SELECT oi.*, m.name AS menu_name, m.price AS menu_price " +
                "FROM order_items oi " +
                "JOIN menu_items m ON oi.menu_id = m.id " +
                "WHERE oi.reservation_id = ? " +
                "ORDER BY oi.id");
            ps.setInt(1, reservationId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                OrderItem item = new OrderItem();
                item.setId(rs.getInt("id"));
                item.setReservationId(rs.getInt("reservation_id"));
                item.setMenuId(rs.getInt("menu_id"));
                item.setQuantity(rs.getInt("quantity"));
                item.setStatus(rs.getString("status"));
                item.setMenuName(rs.getString("menu_name"));
                item.setMenuPrice(rs.getDouble("menu_price"));
                list.add(item);
            }
        } catch (Exception e) {
            System.out.println("[OrderItem.viewListData] " + e.getMessage());
        }
        return list;
    }

    public ArrayList<String> viewListDataString(int reservationId) {
        this.reservationId = reservationId;
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewListData()) {
            OrderItem item = (OrderItem) obj;
            result.add(item.getId()          + "|" +
                       item.getMenuName()    + "|" +
                       item.getQuantity()    + "|" +
                       item.getMenuPrice()   + "|" +
                       item.getStatus());
        }
        return result;
    }

}

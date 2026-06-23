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
public class MenuItem extends MyModel {

    private int id;
    private String name;
    private String category;
    private double price;
    private boolean available;

    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = true;
    }

    public MenuItem(int id, String name, String category,
            double price, boolean available) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public MenuItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean insertData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO menu_items (name, category, price) VALUES (?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setDouble(3, price);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[MenuItem.insertData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE menu_items "
                    + "SET name = ?, category = ?, price = ?, available = ? "
                    + "WHERE id = ?");
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setDouble(3, price);
            ps.setBoolean(4, available);
            ps.setInt(5, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[MenuItem.updateData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM menu_items WHERE id = ?");
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[MenuItem.deleteData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList viewListData() {
        ArrayList<MenuItem> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM menu_items "
                    + "WHERE available = 1 ORDER BY category, name");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MenuItem(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"),
                        rs.getBoolean("available")
                ));
            }
        } catch (Exception e) {
            System.out.println("[MenuItem.viewListData] " + e.getMessage());
        }
        return list;
    }

    public ArrayList viewAllData() {
        ArrayList<MenuItem> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM menu_items ORDER BY id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MenuItem(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"),
                        rs.getBoolean("available")
                ));
            }
        } catch (Exception e) {
            System.out.println("[MenuItem.viewAllData] " + e.getMessage());
        }
        return list;
    }

    public ArrayList<String> viewListDataString() {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewListData()) {
            MenuItem m = (MenuItem) obj;
            result.add(m.getId() + "|"
                    + m.getName() + "|"
                    + m.getCategory() + "|"
                    + m.getPrice());
        }
        return result;
    }

    public ArrayList<String> viewAllDataString() {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewAllData()) {
            MenuItem m = (MenuItem) obj;
            result.add(m.getId() + "|"
                    + m.getName() + "|"
                    + m.getCategory() + "|"
                    + m.getPrice() + "|"
                    + (m.isAvailable() ? "1" : "0"));
        }
        return result;
    }

}

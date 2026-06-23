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
public class User extends MyModel {

    private int id;
    private String username;
    private String password;
    private String name;
    private String role;
    private String loginAt;

    public User() {
    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = "customer";
    }

    public User(int id, String username, String password,
            String name, String role, String loginAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
        this.loginAt = loginAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(String loginAt) {
        this.loginAt = loginAt;
    }

    @Override
    public boolean insertData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO users (username, password, name, role) "
                    + "VALUES (?, ?, ?, ?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setString(4, role);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[User.insertData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList viewListData() {
        ArrayList<User> list = new ArrayList<>();
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users ORDER BY id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getString("login_at") != null
                        ? rs.getString("login_at") : "-"
                ));
            }
        } catch (Exception e) {
            System.out.println("[User.viewListData] " + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean updateData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE users SET name = ?, password = ? WHERE id = ?");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setInt(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[User.updateData] " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM users WHERE id = ?");
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[User.deleteData] " + e.getMessage());
            return false;
        }
    }

    public boolean checkLogin(String username, String password) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT id FROM users WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            return ps.executeQuery().next();
        } catch (Exception e) {
            System.out.println("[User.checkLogin] " + e.getMessage());
            return false;
        }
    }

    public String getUserRole(String username) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT role FROM users WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("role");
            }
        } catch (Exception e) {
            System.out.println("[User.getUserRole] " + e.getMessage());
        }
        return "customer";
    }

    public boolean checkUsernameExists(String username) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT id FROM users WHERE username = ?");
            ps.setString(1, username);
            return ps.executeQuery().next();
        } catch (Exception e) {
            System.out.println("[User.checkUsernameExists] " + e.getMessage());
            return false;
        }
    }

    public boolean updateLoginAt(String username) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE users SET login_at = NOW() WHERE username = ?");
            ps.setString(1, username);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("[User.updateLoginAt] " + e.getMessage());
            return false;
        }
    }

    public int getUserIdByUsername(String username) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT id FROM users WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("[User.getUserIdByUsername] " + e.getMessage());
        }
        return -1;
    }

    public ArrayList<String> viewListDataString() {
        ArrayList<String> result = new ArrayList<>();
        for (Object obj : viewListData()) {
            User u = (User) obj;
            result.add(u.getId() + "|"
                    + u.getUsername() + "|"
                    + u.getName() + "|"
                    + u.getRole() + "|"
                    + u.getLoginAt());
        }
        return result;
    }

}

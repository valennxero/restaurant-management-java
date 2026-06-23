/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodreservation.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author Jevon
 */
public abstract class MyModel {

    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/food_reservation_160424066";
            String user = "root";
            String pass = "";
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("[MyModel] Koneksi gagal: " + e.getMessage());
            return null;
        }
    }

    public abstract ArrayList viewListData();

    public abstract boolean insertData();

    public abstract boolean updateData();

    public abstract boolean deleteData();

}

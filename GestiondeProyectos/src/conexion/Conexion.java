/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jaevi
 */
public class Conexion {

    Connection conex;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/cuarto", "root", "");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "En este momento no te puede conectar. Comunicate con el administrador");
        }
        return conex;
    }
}

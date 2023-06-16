/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeproyectos;

import conexion.Conexion;
import javax.swing.JFrame;

/**
 *
 * @author jaevi
 */
public class GestiondeProyectos extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        Conexion c = new Conexion();
        c.conectar();
        System.out.println("caiza");
    }
    
}

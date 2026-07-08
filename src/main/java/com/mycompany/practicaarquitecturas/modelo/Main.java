/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaarquitecturas.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author SUPERTRONICA
 */
public class Main {

    public static void main(String[] args) {
        //objeto pais"
        Pais p = new Pais();
        p.setNombre("Ecuador");
        p.setCapital("Quito");

        //objeto de direecion
        Direccion d = new Direccion();
        d.setCalle("Bolivar");
        d.setCiudad("Ibarra");
        d.setCodPostal(100100);
        d.setPais(p);
        System.out.print(d.toString());
        
        
         //Estudiante
        Estudiante e = new Estudiante();
        e.setNombre(JOptionPane.showInputDialog("Ingrese sus nombres: "));
        e.setApellido(JOptionPane.showInputDialog("Ingrese sus apellidos: "));
        String cedulaInput = JOptionPane.showInputDialog("Ingrese su número de cédula:");
        if (e.validarCedula(cedulaInput)) {
            System.out.println("Cédula válida");
            e.setCedula(Integer.parseInt(cedulaInput)); 
        } else {
            JOptionPane.showMessageDialog(null, "Cédula inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Direccion dir = new Direccion();
        dir.setCalle(JOptionPane.showInputDialog("Ingrese su direccion: "));
        dir.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad: "));
        dir.setCodPostal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo postal: ")));
        dir.setPais(p);
        e.setDireccion(dir);
        JOptionPane.showMessageDialog(null, e.toString());
        System.out.println(e.toString());
        System.exit(0);
                
        // Cedula 
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante:");

        if (e.validarCedula(cedula)) {
        System.out.println("Cédula válida");
        JOptionPane.showMessageDialog(null, "¡La cédula es válida!");
        }
        else {
        System.out.println("Cédula inválida");
        JOptionPane.showMessageDialog(null, "Cédula inválida.");
        }
        
        
    }
    
    
   
    
}

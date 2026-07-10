/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.PaisControlador;
import com.mycompany.practicaarquitecturas.modelo.Pais;
import javax.swing.JOptionPane;
import controlador.ConexionBDD;
import java.util.ArrayList;

/**
 *
 * @author SUPERTRONICA
 */
public class Main {

    public static void main(String[] args) {
        //objeto pais"
//          Pais p = new Pais();
//          p.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del pais: "));
//          p.setCapital(JOptionPane.showInputDialog("Ingrese el nombre de la capital: "));
//          
//          PaisControlador p1 = new PaisControlador();
//          p1.insertarPais(p);
//
//        //objeto de direecion
//        Direccion d = new Direccion();
//        d.setCalle("Bolivar");
//        d.setCiudad("Ibarra");
//        d.setCodPostal(100100);
//        d.setPais(p);
//        System.out.print(d.toString());
        
        
         //Estudiante
//        Estudiante e = new Estudiante();
//        e.setNombre(JOptionPane.showInputDialog("Ingrese sus nombres: "));
//        e.setApellido(JOptionPane.showInputDialog("Ingrese sus apellidos: "));
//        String cedulaInput = JOptionPane.showInputDialog("Ingrese su número de cédula:");
//        if (e.validarCedula(cedulaInput)) {
//            System.out.println("Cédula válida");
//            e.setCedula(Integer.parseInt(cedulaInput)); 
//        } else {
//            JOptionPane.showMessageDialog(null, "Cédula inválida.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        Direccion dir = new Direccion();
//        dir.setCalle(JOptionPane.showInputDialog("Ingrese su direccion: "));
//        dir.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad: "));
//        dir.setCodPostal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo postal: ")));
//        dir.setPais(p);
//        e.setDireccion(dir);
//        JOptionPane.showMessageDialog(null, e.toString());
//        System.out.println(e.toString());
//        System.exit(0);
//                

        
        // Cedula 
//        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante:");
//
//        if (e.validarCedula(cedula)) {
//        System.out.println("Cédula válida");
//        JOptionPane.showMessageDialog(null, "¡La cédula es válida!");
//        }
//        else {
//        System.out.println("Cédula inválida");
//        JOptionPane.showMessageDialog(null, "Cédula inválida.");
        
        
        ConexionBDD prueba = new ConexionBDD();
        prueba.conectar();
        
        
        PaisControlador controlador = new PaisControlador();
        ArrayList<String[]> lPais = controlador.obtenerPaises();

        System.out.println("Lista de países:");
        for (String[] pais : lPais) {
            System.out.println("ID: " + pais[0] + " Nombre: " + pais[1] + " Capital: " + pais[2]);
        }
    }
        
}   
    
    
   
    


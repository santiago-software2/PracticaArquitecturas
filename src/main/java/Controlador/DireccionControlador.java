/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mycompany.practicaarquitecturas.modelo.Direccion;
import controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SUPERTRONICA
 */
public class DireccionControlador {
    //INSTANCIAR LA CONEXIÓN A LA BASE DE DATOS
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITA CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection) conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL
    PreparedStatement ejecutar;
    //OBTENER RESULTADOS DE LA CONSULTA, PARECIDA A LAS LISTAS
    ResultSet resultado;
    
    //METODOS DE TRANSACCIONABILIDAD
    public void insertarDireccion(Direccion d1) {
        //1.- UTILIZAR EXCEPCIÓN
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO 
            String sentenciaSQL = "INSERT INTO direccion (calle,ciudad,codPostal,idPais) values "
                    + "('" + d1.getCalle() + "','" + d1.getCiudad() +  "'," + d1.getCodPostal() + 
                    "," + d1.getPais().getId() + ");";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, 
                        "Direccion Creada con éxito");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, 
                        "La Direccion no ha sido creada,"
                        + " revise que los datos ingresados sean correctos");
            }
            conectado.close();

        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO 
            JOptionPane.showMessageDialog(null, 
                    "Comuniquese con el Administrador para solicitar ayuda");
            System.out.println("---------------" + e);
        }
        
    }
    
    public ArrayList<String[]> obtenerDirecciones() {
        ArrayList<String[]> lregistros = new ArrayList<>();
        try {
            String sentenciaSQL = "select *from direccion;";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            ResultSet res = ejecutar.executeQuery();
            
            while (res.next()) {
                String[] listaDirecciones = new String[5];
                listaDirecciones[0] = res.getString("idDireccion");
                listaDirecciones[1] = res.getString("calle");
                listaDirecciones[2] = res.getString("ciudad");
                listaDirecciones[3] = res.getString("codPostal");
                listaDirecciones[4] = res.getString("idPais");
                lregistros.add(listaDirecciones);
            }
             ejecutar.close();
            conectado.close();
            return lregistros;
        } catch (SQLException e) {
            System.out.println("------" + e);
        }
            return lregistros;
    }
    
    public void actualizarDireccion(Direccion d2) {
         try {
             String sentenciaSQL = "update direccion set calle = '" + d2.getCalle() + "' "
                     + " where idDireccion = '" + d2.getIdDireccion() + "';";
             ejecutar = conectado.prepareCall(sentenciaSQL);
             
             int res = ejecutar.executeUpdate();
             if (res > 0) {
                 JOptionPane.showMessageDialog(null, "Direccion actualizada");
             }
             else {
                 JOptionPane.showMessageDialog(null, "No se encontro la direccion");
             }
             ejecutar.close();
             conectado.close();
                 
         }
         catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Comuniquese con el administrador para obtener ayuda");
             System.out.println("--------" + e); 
                     
         }
     }
    
    public void eliminarDireccion(int idDireccion) {
         try {
             String sentenciaSQL = "delete from direccion where idDireccion = " + idDireccion + ";";
             ejecutar = conectado.prepareCall(sentenciaSQL);
             
             int res = ejecutar.executeUpdate();
             if(res > 0) {
                 JOptionPane.showMessageDialog(null, "Direccion eliminada");
             }
             else {
                 JOptionPane.showMessageDialog(null, "No se borro ninguna direccion");
             }
             ejecutar.close();
             conectado.close();
             
         } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Comuniquese con el administrador");
             System.out.println("--------" + e);  
         }
     }
}

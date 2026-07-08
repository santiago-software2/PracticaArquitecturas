/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaarquitecturas.modelo;

/**
 *
 * @author SUPERTRONICA
 */
public class Estudiante extends Persona{
    private int idEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(int idEstudiante, String nombre, String apellido, int cedula, Direccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "---Estudiante---" + "\n" + "Nombres:" + getNombre() + "\n"+
               "Apellidos:" + getApellido() + "\n" + 
               "Cedula:" + getCedula() + "\n" +
                getDireccion();
    }

    @Override
    public void identificacion() {
        System.out.print("Clase estudiante");
    }
    
    public boolean validarCedula(String cedula) {
        if (cedula.length() != 10) {
        System.out.println("La cédula debe tener exactamente 10 dígitos.");
        return false;
    }
        int numero;
    
    try {
        numero = Integer.parseInt(cedula);
    } 
    catch (NumberFormatException e) {
        System.out.println("Solo se permiten números en la cédula.");
        return false;
    }
    
    int contador = 0;
    int copia = numero;
    
    
    while (copia > 0) {
        contador = contador + 1;
        copia = copia / 10;
    }
    
    int provincia = numero / 100000000;
    
    if (provincia > 24 && provincia != 30) {
        System.out.println("Cédula inválida.");
        return false;
    }
    
    if (provincia < 1 && contador == 10) { 
        System.out.println("Cédula inválida: Provincia incorrecta.");
        return false;
    }
    
    
    if (contador == 10 || contador == 9) {
        return true;
    } 
    else {
        System.out.println("La cédula debe tener 10 dígitos.");
        return false;
    }
    
    
}
    
}

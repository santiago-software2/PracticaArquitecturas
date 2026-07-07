/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaarquitecturas.modelo;

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
    }

}

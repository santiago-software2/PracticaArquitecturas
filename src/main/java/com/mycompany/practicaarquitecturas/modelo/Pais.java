/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaarquitecturas.modelo;

/**
 *
 * @author SUPERTRONICA
 */
public class Pais {
    private String nombre;
    private String capital;
    private int id;

    public Pais() {
    }

    public Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "----Pais----" +"\n" + "nombre=" + nombre + "\n capital=" + capital + '}';
    }   
    
    
}

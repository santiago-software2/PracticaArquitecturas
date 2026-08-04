/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaarquitecturas.modelo;

/**
 *
 * @author SUPERTRONICA
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private int codPostal;
    private Pais pais;
    private int idDireccion;

    public Direccion() {
    }

    
    public Direccion(String calle, String ciudad, int codPostal, Pais pais, int idDireccion) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
    
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getIdDireccion() {
        return idDireccion;
    }
    
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
    @Override
    public String toString() {
        return "----Direccion----" + "\n" + 
               "Calle:" + calle +"\n"+ 
                "Ciudad:" + ciudad +"\n"+  
                "Código Postal:" + codPostal +"\n"+ 
                "País:" + pais.getNombre();
    }
    
    
    
}

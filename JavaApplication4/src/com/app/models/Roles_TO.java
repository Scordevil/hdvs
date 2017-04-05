/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

/**
 *
 * @author user
 */
public class Roles_TO {

    //objeto que tiene la informacion de la tabla roles
    private int idRol;

    private String nombreRol;

    //Constructores
    public Roles_TO() {
    }

    public Roles_TO(int idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    //Getters and setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    //tostring
    @Override
    public String toString() {
        return "Roles_TO{" + "idRol=" + idRol + ", nombreRol=" + nombreRol + '}';
    }

}

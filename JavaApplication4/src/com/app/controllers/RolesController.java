/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controllers;

import com.app.bdd.conexion.ConexionSQL;
import com.app.models.Roles_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class RolesController {
    
    Statement st;
    
    
    public RolesController() throws SQLException {

        this.st = ConexionSQL.conexion();
    }
    
    
    public List<Roles_TO> consultarRoles() throws Exception {

        this.st = ConexionSQL.conexion();

        List<Roles_TO> roles = new ArrayList<>();

        try {

            String sql = "SELECT [idRol] "
                    + "      ,[nombreRol] "
                    + "  FROM [dbo].[sadCargo];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                roles.add(new Roles_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return roles;

    }
    
    public List<Roles_TO> consultarRoles(int idRol) throws Exception {

        this.st = ConexionSQL.conexion();

        List<Roles_TO> roles = new ArrayList<>();

        try {

            String sql = "SELECT [idRol] "
                    + "      ,[nombreRol] "
                    + "  FROM [dbo].[roles]"
                    + " where idRol = "+idRol+";";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                roles.add(new Roles_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return roles;

    }
    
    
}

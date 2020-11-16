/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class Conexion {
    
    private static Connection myConnection;
    
    public Connection get_connection(){
        
        if (myConnection != null) {
            return myConnection;
        }
        
        try{
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        }catch(SQLException e) {
            System.out.println(e);
        }
        return myConnection;
        
    }
    
}

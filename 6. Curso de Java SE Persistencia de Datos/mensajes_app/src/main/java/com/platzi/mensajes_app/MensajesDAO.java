/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.get_connection()) {
            PreparedStatement preparedStatement = null;
            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mensaje.getMensaje());
                preparedStatement.setString(2, mensaje.getAutor_mensaje());
                preparedStatement.executeUpdate();
                System.out.println("Mensaje creado exitosamente.");
            } catch (SQLException e) {
                System.out.println("El mensaje no se pudo crear :(");
            }
     
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void leerMensajeDB() {
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.get_connection()) {
            PreparedStatement preparedStatement = null;
            ResultSet rs = null;
            try {
                String query = "SELECT * FROM mensajes";
                preparedStatement = connection.prepareStatement(query);
                rs = preparedStatement.executeQuery();
                
                while(rs.next()) {
                    System.out.println("ID: " + rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: " + rs.getString("mensaje"));
                    System.out.println("Autor: " + rs.getString("autor_mensaje"));
                    System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                    System.out.println("");
                    System.out.println("---------------------");
                    System.out.println("");
                }
            } catch (SQLException e) {
                System.out.println("Hubo un problema al recuperar los mensajes, favor vuelva a intentarlo o contacte a su administrador.");
            }
     
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje) {
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.get_connection()) {
            PreparedStatement preparedStatement = null;
            try {
                String query = "DELETE FROM `mensajes` WHERE `mensajes`.`id_mensaje` = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id_mensaje);
                int countRow = preparedStatement.executeUpdate();
                if (countRow == 0) {
                    System.out.println("El mensaje que desea borrar no existe");
                } else {
                    System.out.println("El mensaje ha sido borrado.");
                }
                
            } catch (SQLException e) {
                System.out.println("Hubo un problema al borrar el mensaje, favor vuelva a intentarlo o contacte a su administrador.");
            }
     
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.get_connection()) {
            PreparedStatement preparedStatement = null;
            try {
                String query = "UPDATE `mensajes` SET `mensaje` = ? = 'Cristian A' WHERE `mensajes`.`id_mensaje` = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mensaje.getMensaje());
                preparedStatement.setInt(2, mensaje.getId_mensajes());
                int countRow = preparedStatement.executeUpdate();
                if (countRow == 0) {
                    System.out.println("El mensaje que desea actualizar no existe");
                } else {
                    System.out.println("El mensaje ha sido actualizado.");
                }
                
            } catch (SQLException e) {
                System.out.println("Hubo un problema al actualizar el mensaje, favor vuelva a intentarlo o contacte a su administrador.");
            }
     
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}

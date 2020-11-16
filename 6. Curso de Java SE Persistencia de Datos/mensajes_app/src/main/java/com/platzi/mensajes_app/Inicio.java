/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Inicio {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        
        do {
            
            System.out.println("---------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar Mensaje");
            System.out.println("5. Salir");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    MensajesServices.crearMensaje();
                    break;
                case 2:
                    MensajesServices.listarMensajes();
                    break;
                case 3:
                    MensajesServices.borrarMensaje();
                    break;
                case 4:
                    MensajesServices.editarMensaje();
                    break;
                default:
                    break;
            }
            
        } while (opcion != 5);
        
        sc.close();
    
       //Conexion conexion = new Conexion();
       
       //try(Connection cnx = conexion.get_connection()){
           
       //}catch(Exception e) {
       //    System.out.println(e);
       //}
    }
    
}

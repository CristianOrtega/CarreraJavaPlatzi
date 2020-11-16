/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class MensajesServices {
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String msg = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes mensaje = new Mensajes();
        mensaje.setMensaje(msg);
        mensaje.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(mensaje);
    }
    
    public static void listarMensajes() {
        MensajesDAO.leerMensajeDB();
    }
    
    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la ID que desea borrar?");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nuevo mensaje");
        String msg = sc.nextLine();
        System.out.println("¿Cuál es la ID que desea actualizar?");
        int id_mensaje = sc.nextInt();
        
        Mensajes mensaje = new Mensajes();
        mensaje.setMensaje(msg);
        mensaje.setId_mensajes(id_mensaje);
        
        
        
        
        
        
        
        
        MensajesDAO.actualizarMensajeDB(mensaje);
        
    }
    
}

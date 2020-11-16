/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

/**
 *
 * @author Cristian
 */
public class Mensajes {
    
    private int id_mensajes;
    private String mensaje;
    private String autor_mensaje;
    private String fecha_mensaje;
    
    public Mensajes() {
        super();
    }

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensajes() {
        return id_mensajes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setId_mensajes(int id_mensajes) {
        this.id_mensajes = id_mensajes;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
}

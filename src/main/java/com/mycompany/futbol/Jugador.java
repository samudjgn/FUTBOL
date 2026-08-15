/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futbol;

/**
 *
 * @author jkmil
 */
public abstract class Jugador implements ReaccionPenalti {
    private String nombre;
    private int numeroCamiseta;
    private int nivelHabilidad; //Habilidad base del 1 al 100
    
    public abstract int ejecutarAccion();
    
    public Jugador(String nombre, int numeroCamiseta, int nivelHabilidad){
        this.nivelHabilidad = nivelHabilidad;
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getnumeroCamiseta(){
        return numeroCamiseta;
    }
    
    public void setnumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
    }
    
    public int getnivelHabilidad(){
        return nivelHabilidad;
    }
    
    public void setnivelHabilidad(int nivelHabilidad){
        this.nivelHabilidad = nivelHabilidad;
    }
}

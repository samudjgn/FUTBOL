/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futbol;


public class Mediocampista extends Jugador implements ReaccionPenalti{
    
    public Mediocampista(String nombre, int numeroCamiseta, int nivelHabilidad) {
    super(nombre, numeroCamiseta, nivelHabilidad);
    }
    
    @Override
    public int ejecutarAccion(){
        int precisionTiro = getnivelHabilidad() + 7;
        
        System.out.println("El nivel de precision del mediocampista es de "+ precisionTiro);
        System.out.println("El dorsal del mediocampista es: "+ getnumeroCamiseta());
        
        return precisionTiro;
    }
    
    @Override
    public void celebrarExito(){
        System.out.println(getNombre()+"Se tira al cesped celebrando la anotación y corre hacia sus compañeros a darles confianza");
    }

    @Override
    public void lamentarFracaso() {
        System.out.println(getNombre()+"Se va lentamente hacia el centro del campo y pide perdon a la aficion");
    }
}


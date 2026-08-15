/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futbol;

/**
 *
 * @author jkmil
 */
public class Arquero extends Jugador implements ReaccionPenalti{
    
    public Arquero(String nombre, int numeroCamiseta, int nivelHabilidad) {
        super(nombre, numeroCamiseta, nivelHabilidad);
    }

    @Override
    public int ejecutarAccion() {
        
        int factorSuerte = (int) (Math.random() * 20);
        
        int reflejosFinal = getnivelHabilidad() + factorSuerte;
        System.out.println("Nivel de portero: "+getnivelHabilidad());
        System.out.println("Factor de suerte: "+factorSuerte);
        return reflejosFinal;
    }

    @Override
    public void celebrarExito() {
        System.out.println(getNombre()+" Alza el puño celebrando la atajada, y celebra con los aficionados");
    }

    @Override
    public void lamentarFracaso() {
        System.out.println(getNombre()+" Se dirige triste hacia la esquina, a esperar al siguiente penalti");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futbol;

/**
 *
 * @author jkmil
 */
public class Delantero extends Jugador implements ReaccionPenalti{
    
    public Delantero(String nombre, int numeroCamiseta, int nivelHabilidad) {
        super(nombre, numeroCamiseta, nivelHabilidad);
    }
      
   @Override
   public int ejecutarAccion(){
       
       int factorSuerte = (int) (Math.random()* 20);
       
       int tiroFinal = getnivelHabilidad() + factorSuerte;
       System.out.println("Nivel de habilidad del delantero: "+ getnivelHabilidad());
       System.out.println("Nivel de suerte: "+factorSuerte);
       return tiroFinal;
   }

    @Override
    public void celebrarExito() {
        System.out.println(getNombre()+" Se va hacia sus compañeros, alza las manos mirando hacia la aficion y le da confianza a los siguientes pateadores de su equipo");
    }
    
    
    @Override
    public void lamentarFracaso() {
        System.out.println(getNombre()+" Se sube la camiseta a la cara, mostrando verguenza despues de haber fallado el penalti");
    }
    
}

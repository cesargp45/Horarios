/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import java.util.LinkedList;

public class Materia {
    private String nombre; 
   
    
    
    public Materia (){
    }
    
    
    public Materia  ( String nombre  ) {
       
        this.nombre = nombre ;       
     }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

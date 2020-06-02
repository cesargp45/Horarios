
package Profesor;

import java.util.LinkedList;


public class Profesor {  
    private String nombre; 
    private LinkedList<Materia> materias;
    
    
    public Profesor (){
    }
    
    
    public Profesor  ( LinkedList<Materia> materias, String nombre ) {
       
        this.nombre = nombre ;
        this.materias = materias ;
     
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

    /**
     * @return the materias
     */
    public LinkedList<Materia> getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(LinkedList<Materia> materias) {
        this.materias = materias;
    } 
}

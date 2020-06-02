
package Profesor;

import java.util.LinkedList;


public class Grado {
    
    private String nombre; 
    private String seccion;
  
    
    
    public Grado (){
    }
    
    public Grado  ( String nombre, String seccion) {
       
        this.nombre = nombre ;
        this.seccion = seccion ;
 
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
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }


}

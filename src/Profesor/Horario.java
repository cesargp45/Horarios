/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import java.util.LinkedList;


public class Horario {
     private String anio; 
     private String grado;
     private String seccion;
     private LinkedList<Periodo> periodos;
    
    
    public Horario (){
    }
    
    
    public Horario  ( String anio,String grado, LinkedList<Periodo> periodos, String seccion  ) {
       
        this.anio= anio ; 
        this.grado= grado;
        this.seccion = seccion;
        this.periodos= periodos;
     }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the grado
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    /**
     * @return the periodos
     */
    public LinkedList<Periodo> getPeriodos() {
        return periodos;
    }

    /**
     * @param periodos the periodos to set
     */
    public void setPeriodos(LinkedList<Periodo> periodos) {
        this.periodos = periodos;
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

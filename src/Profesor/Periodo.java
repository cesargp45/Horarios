
package Profesor;

import java.util.LinkedList;


public class Periodo {
    
    private String no; 
    private LinkedList<Dia> dias;
    
    
    public Periodo (){
    }
    
    
    public Periodo  ( String no, LinkedList<Dia> dias  ) {
       
        this.no= no ; 
        this.dias = dias;
     }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the dias
     */
    public LinkedList<Dia> getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(LinkedList<Dia> dias) {
        this.dias = dias;
    }
    
}

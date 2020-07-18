/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import static Inicio.CrearHorario.diaSelect;
import static Inicio.CrearHorario.noSelect;
import static Inicio.CrearHorario.guardado;
import static Inicio.elegirAnio.anioActual;
import static Inicio.elegirAnio.gradoSelect;
import static Inicio.elegirAnio.seccionSelect;
import static Inicio.inicio.listaGrados;
import static Inicio.inicio.listaHorarios;
import static Inicio.inicio.listaProfesores;
import Profesor.Dia;
import Profesor.Horario;
import Profesor.Periodo;
import java.awt.Color;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CrearHorarioBasicos extends javax.swing.JFrame {

 
     public String sec = "";
     public String gra = ""; 
     
      public CrearHorarioBasicos() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblAnio.setText(anioActual);
        lblGrado.setText(gradoSelect +" "+ seccionSelect);
        
        boolean existe= false;
        
         for (int i = 0; i < listaHorarios.size(); i++) {
            if(listaHorarios.get(i).getAnio().compareTo(anioActual) == 0){
                String gradselect =listaHorarios.get(i).getGrado();
                String secselect = listaHorarios.get(i).getSeccion();
                if((gradselect.compareTo(gradoSelect) == 0) && (secselect.compareTo(seccionSelect)== 0)){
                    existe = true;
                    for (int j = 0; j < listaHorarios.get(i).getPeriodos().size(); j++) {
                         String numPeriodo = listaHorarios.get(i).getPeriodos().get(j).getNo();
                  
                     for (int k = 0; k < listaHorarios.get(i).getPeriodos().get(j).getDias().size(); k++) {
                         String dia = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getNombre();
                         String prof = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getMateria();
                         String mat = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getProfesor();
                         switch(numPeriodo){
                             
                             case "0" :
                                  switch(dia){
                                    case "Lunes" :
                                        lblLunes0.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes0.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes0.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Martes" :
                                        lblMartes0.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes0.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes0.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles0.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles0.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles0.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves0.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves0.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves0.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes0.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes0.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes0.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
    
                               break; 
   
                              case "1" :
                                  switch(dia){
                                    case "Lunes" :
                                        lblLunes1.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes1.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes1.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Martes" :
                                        lblMartes1.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes1.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes1.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles1.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles1.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles1.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves1.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves1.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves1.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes1.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes1.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes1.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
    
                               break; 
   
                              case "2" :
                                  switch(dia){
                                    case "Lunes" :
                                        lblLunes2.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes2.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes2.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes2.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles2.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles2.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves2.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves2.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes2.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes2.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break; 
                              
                               case "3" :
                                   switch(dia){
                                    case "Lunes" :
                                        lblLunes3.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes3.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes3.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes3.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes3.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes3.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles3.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles3.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles3.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves3.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves3.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves3.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes3.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes3.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes3.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break;
                                   
                               case "4" :
                                   switch(dia){
                                    case "Lunes" :
                                        lblLunes4.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes4.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes4.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes4.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes4.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes4.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles4.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles4.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles4.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves4.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves4.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves4.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes4.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes4.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes4.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break;
                                   
                               case "5" :
                                   switch(dia){
                                    case "Lunes" :
                                        lblLunes5.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes5.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes5.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes5.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes5.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes5.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles5.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles5.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles5.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves5.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves5.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves5.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes5.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes5.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes5.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break;
                                   
                               case "6" :
                                   switch(dia){
                                    case "Lunes" :
                                        lblLunes6.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes6.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes6.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes6.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes6.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes6.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles6.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles6.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles6.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves6.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves6.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves6.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes6.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes6.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes6.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break;
                               
                               case "7" :
                                   switch(dia){
                                    case "Lunes" :
                                        lblLunes7.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblLunes7.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblLunes7.setVerticalAlignment(SwingConstants.CENTER);
                                        
                                    break;
                                    case "Martes" :
                                        lblMartes7.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMartes7.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMartes7.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Miercoles" :
                                        lblMiercoles7.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblMiercoles7.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblMiercoles7.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Jueves" :
                                        lblJueves7.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblJueves7.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblJueves7.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                    case "Viernes" :
                                        lblViernes7.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");
                                        lblViernes7.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblViernes7.setVerticalAlignment(SwingConstants.CENTER);
                                    break;
                                                                                              
                                  }
      
                               break;

                          }
                                                
                     }
                 }
              }
            }
         }
        
         if(!existe){
             lblLunes0.setText("Vacio");
             lblLunes0.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes0.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes0.setText("Vacio");
             lblMartes0.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes0.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles0.setText("Vacio");
             lblMiercoles0.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles0.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves0.setText("Vacio");
             lblJueves0.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves0.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes0.setText("Vacio");
             lblViernes0.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes0.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes1.setText("Vacio");
             lblLunes1.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes1.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes1.setText("Vacio");
             lblMartes1.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes1.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles1.setText("Vacio");
             lblMiercoles1.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles1.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves1.setText("Vacio");
             lblJueves1.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves1.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes1.setText("Vacio");
             lblViernes1.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes1.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes2.setText("Vacio");
             lblLunes2.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes2.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes2.setText("Vacio");
             lblMartes2.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes2.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles2.setText("Vacio");
             lblMiercoles2.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles2.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves2.setText("Vacio");
             lblJueves2.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves2.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes2.setText("Vacio");
             lblViernes2.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes2.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes3.setText("Vacio");
             lblLunes3.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes3.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes3.setText("Vacio");
             lblMartes3.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes3.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles3.setText("Vacio");
             lblMiercoles3.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles3.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves3.setText("Vacio");
             lblJueves3.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves3.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes3.setText("Vacio");
             lblViernes3.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes3.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes4.setText("Vacio");
             lblLunes4.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes4.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes4.setText("Vacio");
             lblMartes4.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes4.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles4.setText("Vacio");
             lblMiercoles4.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles4.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves4.setText("Vacio");
             lblJueves4.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves4.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes4.setText("Vacio");
             lblViernes4.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes4.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes5.setText("Vacio");
             lblLunes5.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes5.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes5.setText("Vacio");
             lblMartes5.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes5.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles5.setText("Vacio");
             lblMiercoles5.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles5.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves5.setText("Vacio");
             lblJueves5.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves5.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes5.setText("Vacio");
             lblViernes5.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes5.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes6.setText("Vacio");
             lblLunes6.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes6.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes6.setText("Vacio");
             lblMartes6.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes6.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles6.setText("Vacio");
             lblMiercoles6.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles6.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves6.setText("Vacio");
             lblJueves6.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves6.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes6.setText("Vacio");
             lblViernes6.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes6.setVerticalAlignment(SwingConstants.CENTER);
             
             lblLunes7.setText("Vacio");
             lblLunes7.setHorizontalAlignment(SwingConstants.CENTER);
             lblLunes7.setVerticalAlignment(SwingConstants.CENTER);            
             lblMartes7.setText("Vacio");
             lblMartes7.setHorizontalAlignment(SwingConstants.CENTER);
             lblMartes7.setVerticalAlignment(SwingConstants.CENTER);
             lblMiercoles7.setText("Vacio");
             lblMiercoles7.setHorizontalAlignment(SwingConstants.CENTER);
             lblMiercoles7.setVerticalAlignment(SwingConstants.CENTER);
             lblJueves7.setText("Vacio");
             lblJueves7.setHorizontalAlignment(SwingConstants.CENTER);
             lblJueves7.setVerticalAlignment(SwingConstants.CENTER);
             lblViernes7.setText("Vacio");
             lblViernes7.setHorizontalAlignment(SwingConstants.CENTER);
             lblViernes7.setVerticalAlignment(SwingConstants.CENTER);
             
         }
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        lblLunes1 = new javax.swing.JLabel();
        lblLunes2 = new javax.swing.JLabel();
        lblLunes3 = new javax.swing.JLabel();
        lblLunes4 = new javax.swing.JLabel();
        lblLunes5 = new javax.swing.JLabel();
        lblLunes6 = new javax.swing.JLabel();
        lblLunes7 = new javax.swing.JLabel();
        lblMartes1 = new javax.swing.JLabel();
        lblMartes2 = new javax.swing.JLabel();
        lblMartes3 = new javax.swing.JLabel();
        lblMartes4 = new javax.swing.JLabel();
        lblMartes5 = new javax.swing.JLabel();
        lblMartes6 = new javax.swing.JLabel();
        lblMartes7 = new javax.swing.JLabel();
        lblMiercoles1 = new javax.swing.JLabel();
        lblMiercoles2 = new javax.swing.JLabel();
        lblMiercoles3 = new javax.swing.JLabel();
        lblMiercoles4 = new javax.swing.JLabel();
        lblMiercoles5 = new javax.swing.JLabel();
        lblMiercoles6 = new javax.swing.JLabel();
        lblMiercoles7 = new javax.swing.JLabel();
        lblJueves1 = new javax.swing.JLabel();
        lblJueves2 = new javax.swing.JLabel();
        lblJueves3 = new javax.swing.JLabel();
        lblJueves4 = new javax.swing.JLabel();
        lblJueves5 = new javax.swing.JLabel();
        lblJueves6 = new javax.swing.JLabel();
        lblJueves7 = new javax.swing.JLabel();
        lblViernes1 = new javax.swing.JLabel();
        lblViernes2 = new javax.swing.JLabel();
        lblViernes3 = new javax.swing.JLabel();
        lblViernes4 = new javax.swing.JLabel();
        lblViernes5 = new javax.swing.JLabel();
        lblViernes6 = new javax.swing.JLabel();
        lblViernes7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblLunes0 = new javax.swing.JLabel();
        lblMartes0 = new javax.swing.JLabel();
        lblMiercoles0 = new javax.swing.JLabel();
        lblJueves0 = new javax.swing.JLabel();
        lblViernes0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(965, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(965, 703));

        jPanel1.setMaximumSize(new java.awt.Dimension(965, 703));
        jPanel1.setMinimumSize(new java.awt.Dimension(965, 703));
        jPanel1.setPreferredSize(new java.awt.Dimension(965, 703));
        jPanel1.setLayout(null);

        jLabel1.setText("Horario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 10, 80, 20);

        jLabel2.setBackground(new java.awt.Color(153, 255, 0));
        jLabel2.setText("                   Viernes");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(750, 90, 150, 30);

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setText("                  Lunes");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 90, 150, 30);

        jLabel4.setBackground(new java.awt.Color(153, 255, 0));
        jLabel4.setText("                   Martes");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 90, 150, 30);

        jLabel5.setBackground(new java.awt.Color(153, 255, 0));
        jLabel5.setText("                  Miercoles");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 90, 150, 30);

        jLabel6.setBackground(new java.awt.Color(153, 255, 0));
        jLabel6.setText("                   Jueves");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(600, 90, 150, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(60, 530, 840, 10);

        jLabel7.setBackground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("     1:45 - 1:45");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 530, 90, 50);

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("     7:15 - 8:00");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 120, 90, 50);

        jLabel9.setBackground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("     8:45 - 9:30");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 220, 90, 50);

        jLabel10.setBackground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("     9:30 - 10:15");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 270, 90, 50);

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("    10:45 - 11:30");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 380, 90, 50);

        jLabel12.setBackground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("    10:15 - 10:45");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 320, 90, 60);

        jLabel13.setBackground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("     12:15 - 1:00");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 480, 90, 50);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(900, 90, 10, 440);

        jLabel15.setBackground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("          Hora");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 90, 90, 30);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(60, 120, 840, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(60, 90, 840, 10);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(60, 220, 840, 10);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(60, 270, 840, 10);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(60, 320, 840, 10);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(60, 380, 840, 10);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(60, 430, 840, 10);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(750, 90, 10, 230);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(60, 170, 840, 10);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(60, 90, 10, 440);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(150, 90, 10, 490);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(750, 380, 10, 200);

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator17);
        jSeparator17.setBounds(450, 90, 10, 230);

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator18);
        jSeparator18.setBounds(600, 90, 10, 230);

        jLabel14.setBackground(new java.awt.Color(102, 153, 255));
        jLabel14.setText("    11:30 - 12:15");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 430, 90, 50);
        jPanel1.add(jSeparator19);
        jSeparator19.setBounds(60, 480, 840, 10);

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator20);
        jSeparator20.setBounds(300, 90, 10, 230);

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator21);
        jSeparator21.setBounds(300, 380, 10, 200);

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator22);
        jSeparator22.setBounds(450, 380, 10, 200);

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator23);
        jSeparator23.setBounds(600, 380, 10, 200);

        jLabel16.setBackground(new java.awt.Color(255, 204, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel16.setText("                         Recreo");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(150, 320, 750, 60);

        lblLunes1.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes1.setOpaque(true);
        lblLunes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes1MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes1);
        lblLunes1.setBounds(150, 170, 150, 50);

        lblLunes2.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes2.setOpaque(true);
        lblLunes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes2MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes2);
        lblLunes2.setBounds(150, 220, 150, 50);

        lblLunes3.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes3.setOpaque(true);
        lblLunes3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes3MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes3);
        lblLunes3.setBounds(150, 270, 150, 50);

        lblLunes4.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes4.setOpaque(true);
        lblLunes4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes4MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes4);
        lblLunes4.setBounds(150, 380, 150, 50);

        lblLunes5.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes5.setOpaque(true);
        lblLunes5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes5MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes5);
        lblLunes5.setBounds(150, 430, 150, 50);

        lblLunes6.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes6.setOpaque(true);
        lblLunes6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes6MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes6);
        lblLunes6.setBounds(150, 480, 150, 50);

        lblLunes7.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes7.setOpaque(true);
        lblLunes7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes7MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes7);
        lblLunes7.setBounds(150, 530, 150, 50);

        lblMartes1.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes1.setOpaque(true);
        lblMartes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes1MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes1);
        lblMartes1.setBounds(300, 170, 150, 50);

        lblMartes2.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes2.setOpaque(true);
        lblMartes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes2MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes2);
        lblMartes2.setBounds(300, 220, 150, 50);

        lblMartes3.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes3.setOpaque(true);
        lblMartes3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes3MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes3);
        lblMartes3.setBounds(300, 270, 150, 50);

        lblMartes4.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes4.setOpaque(true);
        lblMartes4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes4MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes4);
        lblMartes4.setBounds(300, 380, 150, 50);

        lblMartes5.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes5.setText("                   ");
        lblMartes5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes5.setOpaque(true);
        lblMartes5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes5MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes5);
        lblMartes5.setBounds(300, 430, 150, 50);

        lblMartes6.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes6.setOpaque(true);
        lblMartes6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes6MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes6);
        lblMartes6.setBounds(300, 480, 150, 50);

        lblMartes7.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes7.setOpaque(true);
        lblMartes7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes7MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes7);
        lblMartes7.setBounds(300, 530, 150, 50);

        lblMiercoles1.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles1.setOpaque(true);
        lblMiercoles1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles1MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles1);
        lblMiercoles1.setBounds(450, 170, 150, 50);

        lblMiercoles2.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles2.setOpaque(true);
        lblMiercoles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles2MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles2);
        lblMiercoles2.setBounds(450, 220, 150, 50);

        lblMiercoles3.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles3.setOpaque(true);
        lblMiercoles3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles3MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles3);
        lblMiercoles3.setBounds(450, 270, 150, 50);

        lblMiercoles4.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles4.setOpaque(true);
        lblMiercoles4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles4MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles4);
        lblMiercoles4.setBounds(450, 380, 150, 50);

        lblMiercoles5.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles5.setOpaque(true);
        lblMiercoles5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles5MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles5);
        lblMiercoles5.setBounds(450, 430, 150, 50);

        lblMiercoles6.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles6.setOpaque(true);
        lblMiercoles6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles6MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles6);
        lblMiercoles6.setBounds(450, 480, 150, 50);

        lblMiercoles7.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles7.setOpaque(true);
        lblMiercoles7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles7MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles7);
        lblMiercoles7.setBounds(450, 530, 150, 50);

        lblJueves1.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves1.setOpaque(true);
        lblJueves1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves1MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves1);
        lblJueves1.setBounds(600, 170, 150, 50);

        lblJueves2.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves2.setOpaque(true);
        lblJueves2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves2MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves2);
        lblJueves2.setBounds(600, 220, 150, 50);

        lblJueves3.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves3.setOpaque(true);
        lblJueves3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves3MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves3);
        lblJueves3.setBounds(600, 270, 150, 50);

        lblJueves4.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves4.setOpaque(true);
        lblJueves4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves4MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves4);
        lblJueves4.setBounds(600, 380, 150, 50);

        lblJueves5.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves5.setOpaque(true);
        lblJueves5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves5MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves5);
        lblJueves5.setBounds(600, 430, 150, 50);

        lblJueves6.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves6.setOpaque(true);
        lblJueves6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves6MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves6);
        lblJueves6.setBounds(600, 480, 150, 50);

        lblJueves7.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves7.setOpaque(true);
        lblJueves7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves7MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves7);
        lblJueves7.setBounds(600, 530, 150, 50);

        lblViernes1.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes1.setOpaque(true);
        lblViernes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes1MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes1);
        lblViernes1.setBounds(750, 170, 150, 50);

        lblViernes2.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes2.setOpaque(true);
        lblViernes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes2MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes2);
        lblViernes2.setBounds(750, 220, 150, 50);

        lblViernes3.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes3.setOpaque(true);
        lblViernes3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes3MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes3);
        lblViernes3.setBounds(750, 270, 150, 50);

        lblViernes4.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes4.setOpaque(true);
        lblViernes4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes4MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes4);
        lblViernes4.setBounds(750, 380, 150, 50);

        lblViernes5.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes5.setOpaque(true);
        lblViernes5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes5MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes5);
        lblViernes5.setBounds(750, 430, 150, 50);

        lblViernes6.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes6.setOpaque(true);
        lblViernes6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes6MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes6);
        lblViernes6.setBounds(750, 480, 150, 50);

        lblViernes7.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes7.setOpaque(true);
        lblViernes7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes7MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes7);
        lblViernes7.setBounds(750, 530, 150, 50);

        jLabel17.setText("Año:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(410, 40, 40, 20);

        lblAnio.setText(".");
        jPanel1.add(lblAnio);
        lblAnio.setBounds(440, 40, 70, 20);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 640, 90, 23);

        jButton2.setText("Descargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(770, 640, 100, 23);

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 650, 100, 23);

        jLabel18.setText("Grado:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 10, 60, 14);
        jPanel1.add(lblGrado);
        lblGrado.setBounds(20, 30, 150, 20);

        jLabel19.setBackground(new java.awt.Color(102, 153, 255));
        jLabel19.setText("     8:00 - 8:45");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(60, 170, 90, 50);

        lblLunes0.setBackground(new java.awt.Color(255, 153, 51));
        lblLunes0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLunes0.setOpaque(true);
        lblLunes0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLunes0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLunes0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLunes0MouseExited(evt);
            }
        });
        jPanel1.add(lblLunes0);
        lblLunes0.setBounds(150, 120, 150, 50);

        lblMartes0.setBackground(new java.awt.Color(255, 153, 51));
        lblMartes0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMartes0.setOpaque(true);
        lblMartes0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMartes0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMartes0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMartes0MouseExited(evt);
            }
        });
        jPanel1.add(lblMartes0);
        lblMartes0.setBounds(300, 120, 150, 50);

        lblMiercoles0.setBackground(new java.awt.Color(255, 153, 51));
        lblMiercoles0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMiercoles0.setOpaque(true);
        lblMiercoles0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiercoles0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiercoles0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiercoles0MouseExited(evt);
            }
        });
        jPanel1.add(lblMiercoles0);
        lblMiercoles0.setBounds(450, 120, 150, 50);

        lblJueves0.setBackground(new java.awt.Color(255, 153, 51));
        lblJueves0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJueves0.setOpaque(true);
        lblJueves0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJueves0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJueves0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJueves0MouseExited(evt);
            }
        });
        jPanel1.add(lblJueves0);
        lblJueves0.setBounds(600, 120, 150, 50);

        lblViernes0.setBackground(new java.awt.Color(255, 153, 51));
        lblViernes0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViernes0.setOpaque(true);
        lblViernes0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViernes0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViernes0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViernes0MouseExited(evt);
            }
        });
        jPanel1.add(lblViernes0);
        lblViernes0.setBounds(750, 120, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLunes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes1MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblLunes1);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "1";
       
    }//GEN-LAST:event_lblLunes1MouseClicked

    private void lblLunes1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes1MouseEntered
                lblLunes1.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes1MouseEntered

    private void lblLunes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes1MouseExited
                  lblLunes1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes1MouseExited

    private void lblLunes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes2MouseClicked
            AsignarMateria AsignarMateria = new AsignarMateria(lblLunes2);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "2";
    }//GEN-LAST:event_lblLunes2MouseClicked

    private void lblLunes2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes2MouseEntered
       lblLunes2.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes2MouseEntered

    private void lblLunes2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes2MouseExited
        lblLunes2.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes2MouseExited

    private void lblLunes3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes3MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblLunes3);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "3";
    }//GEN-LAST:event_lblLunes3MouseClicked

    private void lblLunes3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes3MouseEntered
        lblLunes3.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes3MouseEntered

    private void lblLunes3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes3MouseExited
        lblLunes3.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes3MouseExited

    private void lblLunes4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes4MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblLunes4);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "4";
    }//GEN-LAST:event_lblLunes4MouseClicked

    private void lblLunes4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes4MouseEntered
        lblLunes4.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes4MouseEntered

    private void lblLunes4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes4MouseExited
        lblLunes4.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes4MouseExited

    private void lblLunes5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes5MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblLunes5);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "5";
    }//GEN-LAST:event_lblLunes5MouseClicked

    private void lblLunes5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes5MouseEntered
        lblLunes5.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes5MouseEntered

    private void lblLunes5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes5MouseExited
       lblLunes5.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes5MouseExited

    private void lblLunes6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes6MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblLunes6);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "6";
    }//GEN-LAST:event_lblLunes6MouseClicked

    private void lblLunes6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes6MouseEntered
        lblLunes6.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes6MouseEntered

    private void lblLunes6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes6MouseExited
        lblLunes6.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes6MouseExited

    private void lblLunes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes7MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblLunes7);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "7";
    }//GEN-LAST:event_lblLunes7MouseClicked

    private void lblLunes7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes7MouseEntered
        lblLunes7.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes7MouseEntered

    private void lblLunes7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes7MouseExited
       lblLunes7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes7MouseExited

    private void lblMartes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes1MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes1);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "1";
    }//GEN-LAST:event_lblMartes1MouseClicked

    private void lblMartes1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes1MouseEntered
        lblMartes1.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes1MouseEntered

    private void lblMartes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes1MouseExited
        lblMartes1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes1MouseExited

    private void lblMartes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes2MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes2);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "2";
    }//GEN-LAST:event_lblMartes2MouseClicked

    private void lblMartes2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes2MouseEntered
        lblMartes2.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes2MouseEntered

    private void lblMartes2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes2MouseExited
        lblMartes2.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes2MouseExited

    private void lblMartes3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes3MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes3);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "3";
    }//GEN-LAST:event_lblMartes3MouseClicked

    private void lblMartes3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes3MouseEntered
        lblMartes3.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes3MouseEntered

    private void lblMartes3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes3MouseExited
        lblMartes3.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes3MouseExited

    private void lblMartes4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes4MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes4);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "4";
    }//GEN-LAST:event_lblMartes4MouseClicked

    private void lblMartes4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes4MouseEntered
        lblMartes4.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes4MouseEntered

    private void lblMartes4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes4MouseExited
        lblMartes4.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes4MouseExited

    private void lblMartes5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes5MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes5);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "5";
    }//GEN-LAST:event_lblMartes5MouseClicked

    private void lblMartes5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes5MouseEntered
        lblMartes5.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes5MouseEntered

    private void lblMartes5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes5MouseExited
        lblMartes5.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes5MouseExited

    private void lblMartes6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes6MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes6);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "6";
    }//GEN-LAST:event_lblMartes6MouseClicked

    private void lblMartes6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes6MouseEntered
        lblMartes6.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes6MouseEntered

    private void lblMartes6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes6MouseExited
        lblMartes6.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes6MouseExited

    private void lblMartes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes7MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes7);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "7";
    }//GEN-LAST:event_lblMartes7MouseClicked

    private void lblMartes7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes7MouseEntered
        lblMartes7.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes7MouseEntered

    private void lblMartes7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes7MouseExited
        lblMartes7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes7MouseExited

    private void lblMiercoles1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles1MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles1);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "1";
    }//GEN-LAST:event_lblMiercoles1MouseClicked

    private void lblMiercoles1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles1MouseEntered
        lblMiercoles1.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles1MouseEntered

    private void lblMiercoles1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles1MouseExited
       lblMiercoles1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles1MouseExited

    private void lblMiercoles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles2MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles2);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "2";
    }//GEN-LAST:event_lblMiercoles2MouseClicked

    private void lblMiercoles2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles2MouseEntered
        lblMiercoles2.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles2MouseEntered

    private void lblMiercoles2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles2MouseExited
        lblMiercoles2.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles2MouseExited

    private void lblMiercoles3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles3MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles3);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "3";
    }//GEN-LAST:event_lblMiercoles3MouseClicked

    private void lblMiercoles3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles3MouseEntered
        lblMiercoles3.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles3MouseEntered

    private void lblMiercoles3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles3MouseExited
       lblMiercoles3.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles3MouseExited

    private void lblMiercoles4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles4MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles4);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "4";
    }//GEN-LAST:event_lblMiercoles4MouseClicked

    private void lblMiercoles4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles4MouseEntered
        lblMiercoles4.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles4MouseEntered

    private void lblMiercoles4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles4MouseExited
       lblMiercoles4.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles4MouseExited

    private void lblMiercoles5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles5MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles5);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "5";
    }//GEN-LAST:event_lblMiercoles5MouseClicked

    private void lblMiercoles5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles5MouseEntered
        lblMiercoles5.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles5MouseEntered

    private void lblMiercoles5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles5MouseExited
        lblMiercoles5.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles5MouseExited

    private void lblMiercoles6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles6MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles6);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "6";
    }//GEN-LAST:event_lblMiercoles6MouseClicked

    private void lblMiercoles6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles6MouseEntered
        lblMiercoles6.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles6MouseEntered

    private void lblMiercoles6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles6MouseExited
        lblMiercoles6.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles6MouseExited

    private void lblMiercoles7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles7MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles7);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "7";
    }//GEN-LAST:event_lblMiercoles7MouseClicked

    private void lblMiercoles7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles7MouseEntered
       lblMiercoles7.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles7MouseEntered

    private void lblMiercoles7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles7MouseExited
        lblMiercoles7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles7MouseExited

    private void lblJueves1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves1MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblJueves1);
       AsignarMateria.setVisible(true);
        diaSelect = "Jueves";
        noSelect = "1";
    }//GEN-LAST:event_lblJueves1MouseClicked

    private void lblJueves1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves1MouseEntered
        lblJueves1.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves1MouseEntered

    private void lblJueves1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves1MouseExited
        lblJueves1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves1MouseExited

    private void lblJueves2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves2MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblJueves2);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "2";
    }//GEN-LAST:event_lblJueves2MouseClicked

    private void lblJueves2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves2MouseEntered
        lblJueves2.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves2MouseEntered

    private void lblJueves2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves2MouseExited
        lblJueves2.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves2MouseExited

    private void lblJueves3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves3MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblJueves3);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "3";
    }//GEN-LAST:event_lblJueves3MouseClicked

    private void lblJueves3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves3MouseEntered
        lblJueves3.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves3MouseEntered

    private void lblJueves3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves3MouseExited
        lblJueves3.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves3MouseExited

    private void lblJueves4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves4MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblJueves4);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "4";
    }//GEN-LAST:event_lblJueves4MouseClicked

    private void lblJueves4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves4MouseEntered
        lblJueves4.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves4MouseEntered

    private void lblJueves4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves4MouseExited
        lblJueves4.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves4MouseExited

    private void lblJueves5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves5MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblJueves5);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "5";
    }//GEN-LAST:event_lblJueves5MouseClicked

    private void lblJueves5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves5MouseEntered
        lblJueves5.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves5MouseEntered

    private void lblJueves5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves5MouseExited
        lblJueves5.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves5MouseExited

    private void lblJueves6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves6MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblJueves6);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "6";
    }//GEN-LAST:event_lblJueves6MouseClicked

    private void lblJueves6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves6MouseEntered
        lblJueves6.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves6MouseEntered

    private void lblJueves6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves6MouseExited
        lblJueves6.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves6MouseExited

    private void lblJueves7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves7MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblJueves7);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "7";
    }//GEN-LAST:event_lblJueves7MouseClicked

    private void lblJueves7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves7MouseEntered
        lblJueves7.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves7MouseEntered

    private void lblJueves7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves7MouseExited
        lblJueves7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves7MouseExited

    private void lblViernes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes1MouseClicked
         AsignarMateria AsignarMateria = new AsignarMateria(lblViernes1);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "1";
    }//GEN-LAST:event_lblViernes1MouseClicked

    private void lblViernes1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes1MouseEntered
        lblViernes1.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes1MouseEntered

    private void lblViernes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes1MouseExited
        lblViernes1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes1MouseExited

    private void lblViernes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes2MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes2);
       AsignarMateria.setVisible(true);
        diaSelect = "Viernes";
       noSelect = "2";
    }//GEN-LAST:event_lblViernes2MouseClicked

    private void lblViernes2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes2MouseEntered
        lblViernes2.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes2MouseEntered

    private void lblViernes2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes2MouseExited
        lblViernes2.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes2MouseExited

    private void lblViernes3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes3MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes3);
       AsignarMateria.setVisible(true);
        diaSelect = "Viernes";
       noSelect = "3";
    }//GEN-LAST:event_lblViernes3MouseClicked

    private void lblViernes3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes3MouseEntered
        lblViernes3.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes3MouseEntered

    private void lblViernes3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes3MouseExited
        lblViernes3.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes3MouseExited

    private void lblViernes4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes4MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes4);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "4";
    }//GEN-LAST:event_lblViernes4MouseClicked

    private void lblViernes4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes4MouseEntered
        lblViernes4.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes4MouseEntered

    private void lblViernes4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes4MouseExited
        lblViernes4.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes4MouseExited

    private void lblViernes5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes5MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes5);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "5";
    }//GEN-LAST:event_lblViernes5MouseClicked

    private void lblViernes5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes5MouseEntered
       lblViernes5.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes5MouseEntered

    private void lblViernes5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes5MouseExited
        lblViernes5.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes5MouseExited

    private void lblViernes6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes6MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes6);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "6";
    }//GEN-LAST:event_lblViernes6MouseClicked

    private void lblViernes6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes6MouseEntered
        lblViernes6.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes6MouseEntered

    private void lblViernes6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes6MouseExited
       lblViernes6.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes6MouseExited

    private void lblViernes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes7MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblViernes7);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "7";
    }//GEN-LAST:event_lblViernes7MouseClicked

    private void lblViernes7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes7MouseEntered
       lblViernes7.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes7MouseEntered

    private void lblViernes7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes7MouseExited
        lblViernes7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes7MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
          
          LinkedList<Periodo> recogerPeriodos = new  LinkedList<Periodo>();
          String profe = "";
          String contenido = "";
          boolean vacio = false;
          
          
          
          if(!vacio){
           contenido = lblLunes0.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("0");
               nuevo2.setDias(recogerDias);
               
               recogerPeriodos.add(nuevo2);
               
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes0.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("0");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles0.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("0");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves0.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("0");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes0.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("0");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          
          if(!vacio){
           contenido = lblLunes1.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("1");
               nuevo2.setDias(recogerDias);
               
               recogerPeriodos.add(nuevo2);
               
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes1.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("1");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles1.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("1");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves1.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("1");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes1.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("1");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
        
              
              

        if(!vacio){
           contenido = lblLunes2.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("2");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes2.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("2");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles2.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("2");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves2.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("2");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes2.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("2");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
              
              
              
              
              if(!vacio){
           contenido = lblLunes3.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("3");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes3.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("3");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles3.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("3");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves3.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("3");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes3.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("3");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
        

        

        
        if(!vacio){
           contenido = lblLunes4.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("4");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes4.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("4");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles4.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("4");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves4.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("4");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes4.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("4");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
        

              
              
              if(!vacio){
           contenido = lblLunes5.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("5");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes5.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("5");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles5.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("5");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves5.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("5");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes5.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("5");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
        

         
              
              if(!vacio){
           contenido = lblLunes6.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("6");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes6.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("6");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles6.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("6");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves6.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("6");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes6.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("6");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
        

              
              if(!vacio){
           contenido = lblLunes7.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Lunes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("7");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMartes7.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Martes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("7");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
          
          if(!vacio){
           contenido = lblMiercoles7.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Miercoles");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("7");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
          
            if(!vacio){
           contenido = lblJueves7.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Jueves");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("7");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
            
              if(!vacio){
           contenido = lblViernes7.getText();
           if(contenido.compareTo("Vacio") != 0){
               String[] separado = contenido.split("#");
               LinkedList<Dia> recogerDias = new  LinkedList<Dia>();
               Dia nuevo = new Dia();
               nuevo.setMateria(separado[1]);
               nuevo.setProfesor(separado[3]);
               nuevo.setNombre("Viernes");
               recogerDias.add(nuevo);
               
               Periodo nuevo2 = new Periodo();
               nuevo2.setNo("7");
               nuevo2.setDias(recogerDias);
               recogerPeriodos.add(nuevo2);
           } else{
               JOptionPane.showMessageDialog(null, "Existen lugares Vacios, no puede Guardarse el horario");
               recogerPeriodos.clear();
               vacio = true;
           }      
          }
 
              if(!vacio){
                  
                  for (int i = 0; i < listaHorarios.size(); i++) {
                       if(listaHorarios.get(i).getAnio().compareTo(anioActual) == 0){
                           String gradselect =listaHorarios.get(i).getGrado();
                           String secselect = listaHorarios.get(i).getSeccion();
                           if((gradselect.compareTo(gradoSelect) == 0) && (secselect.compareTo(seccionSelect)==0)){
                               listaHorarios.remove(i);
                               break;
                           }
                       }
                  }
                  Horario nuevo = new Horario ();
                  nuevo.setAnio(anioActual);
                  nuevo.setGrado(gradoSelect);
                  nuevo.setSeccion(seccionSelect);
                  nuevo.setPeriodos(recogerPeriodos);
                  listaHorarios.add(nuevo);
                  guardado = true;
                  guardarHorario();
                  JOptionPane.showMessageDialog(null, "Guardado Con Exito");
                  
              }
 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        if (guardado){
             inicio inicio = new inicio();
              inicio.setVisible(true);
              dispose(); 
        }else{           
            int desicion = JOptionPane.showConfirmDialog(null, "Si sale sin guardar, no se aplicaran los cambios \n ¿Deseea salir?");
            
             if(desicion == JOptionPane.YES_OPTION){
                 
              inicio inicio = new inicio();
              inicio.setVisible(true);
              dispose();  
              
             }  
        }
        
        
             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(lblLunes2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblLunes0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes0MouseClicked
        
       AsignarMateria AsignarMateria = new AsignarMateria(lblLunes0);
       AsignarMateria.setVisible(true);
       diaSelect = "Lunes";
       noSelect = "0";

    }//GEN-LAST:event_lblLunes0MouseClicked

    private void lblLunes0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes0MouseEntered
        lblLunes0.setBackground(Color.orange);
    }//GEN-LAST:event_lblLunes0MouseEntered

    private void lblLunes0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLunes0MouseExited
         lblLunes0.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblLunes0MouseExited

    private void lblMartes0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes0MouseClicked
        AsignarMateria AsignarMateria = new AsignarMateria(lblMartes0);
       AsignarMateria.setVisible(true);
       diaSelect = "Martes";
       noSelect = "0";
    }//GEN-LAST:event_lblMartes0MouseClicked

    private void lblMartes0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes0MouseEntered
        lblMartes0.setBackground(Color.orange);
    }//GEN-LAST:event_lblMartes0MouseEntered

    private void lblMartes0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMartes0MouseExited
        lblMartes0.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMartes0MouseExited

    private void lblMiercoles0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles0MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblMiercoles0);
       AsignarMateria.setVisible(true);
       diaSelect = "Miercoles";
       noSelect = "0";
    }//GEN-LAST:event_lblMiercoles0MouseClicked

    private void lblMiercoles0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles0MouseEntered
        lblMiercoles0.setBackground(Color.orange);
    }//GEN-LAST:event_lblMiercoles0MouseEntered

    private void lblMiercoles0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiercoles0MouseExited
        lblMiercoles0.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblMiercoles0MouseExited

    private void lblJueves0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves0MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblJueves0);
       AsignarMateria.setVisible(true);
       diaSelect = "Jueves";
       noSelect = "0";
    }//GEN-LAST:event_lblJueves0MouseClicked

    private void lblJueves0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves0MouseEntered
        lblJueves0.setBackground(Color.orange);
    }//GEN-LAST:event_lblJueves0MouseEntered

    private void lblJueves0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJueves0MouseExited
       lblJueves0.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblJueves0MouseExited

    private void lblViernes0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes0MouseClicked
       AsignarMateria AsignarMateria = new AsignarMateria(lblViernes0);
       AsignarMateria.setVisible(true);
       diaSelect = "Viernes";
       noSelect = "0";
    }//GEN-LAST:event_lblViernes0MouseClicked

    private void lblViernes0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes0MouseEntered
        lblViernes0.setBackground(Color.orange);
    }//GEN-LAST:event_lblViernes0MouseEntered

    private void lblViernes0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViernes0MouseExited
        lblViernes0.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_lblViernes0MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioBasicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioBasicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioBasicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearHorarioBasicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearHorarioBasicos().setVisible(true);
            }
        });
    }

  public void guardarHorario(){
        

             JSONArray list = new JSONArray();
            for (int i = 0; i < listaHorarios.size(); i++) {   
                JSONObject obj0 = new JSONObject();
                String grad =listaHorarios.get(i).getGrado();
                String sec = listaHorarios.get(i).getSeccion();
                String anio = listaHorarios.get(i).getAnio();
                obj0.put("GRADO", grad);
                obj0.put("SECCION", sec);
                obj0.put("ANIO", anio);
                JSONArray list1 = new JSONArray();
                    for (int j = 0; j < listaHorarios.get(i).getPeriodos().size(); j++) {
                        JSONObject obj1 = new JSONObject();
                         String numPeriodo = listaHorarios.get(i).getPeriodos().get(j).getNo(); 
                         obj1.put("NO", numPeriodo);
                         JSONArray list2 = new JSONArray();
                      for (int k = 0; k < listaHorarios.get(i).getPeriodos().get(j).getDias().size(); k++) {   
                         JSONObject obj2 = new JSONObject();
                         String dia =listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getNombre();
                         String prof = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getProfesor();
                         String mat = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getMateria();
                         obj2.put("NOMBRE",dia);
                         obj2.put("MATERIA", prof);
                         obj2.put("PROFESOR", mat);
                         list2.add(obj2); 
                     } 
                      obj1.put("DIAS", list2);
                      list1.add(obj1); 
                 }
                    
                    obj0.put("PERIODOS", list1);
                    
                     list.add(obj0); 
            }
        
            
            JSONObject obj3 = new JSONObject();
		obj3.put("Horarios", list);
		
		try{
			FileWriter file = new FileWriter("Horarios.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
        

             

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblJueves0;
    private javax.swing.JLabel lblJueves1;
    private javax.swing.JLabel lblJueves2;
    private javax.swing.JLabel lblJueves3;
    private javax.swing.JLabel lblJueves4;
    private javax.swing.JLabel lblJueves5;
    private javax.swing.JLabel lblJueves6;
    private javax.swing.JLabel lblJueves7;
    private javax.swing.JLabel lblLunes0;
    private javax.swing.JLabel lblLunes1;
    private javax.swing.JLabel lblLunes2;
    private javax.swing.JLabel lblLunes3;
    private javax.swing.JLabel lblLunes4;
    private javax.swing.JLabel lblLunes5;
    private javax.swing.JLabel lblLunes6;
    private javax.swing.JLabel lblLunes7;
    private javax.swing.JLabel lblMartes0;
    private javax.swing.JLabel lblMartes1;
    private javax.swing.JLabel lblMartes2;
    private javax.swing.JLabel lblMartes3;
    private javax.swing.JLabel lblMartes4;
    private javax.swing.JLabel lblMartes5;
    private javax.swing.JLabel lblMartes6;
    private javax.swing.JLabel lblMartes7;
    private javax.swing.JLabel lblMiercoles0;
    private javax.swing.JLabel lblMiercoles1;
    private javax.swing.JLabel lblMiercoles2;
    private javax.swing.JLabel lblMiercoles3;
    private javax.swing.JLabel lblMiercoles4;
    private javax.swing.JLabel lblMiercoles5;
    private javax.swing.JLabel lblMiercoles6;
    private javax.swing.JLabel lblMiercoles7;
    private javax.swing.JLabel lblViernes0;
    private javax.swing.JLabel lblViernes1;
    private javax.swing.JLabel lblViernes2;
    private javax.swing.JLabel lblViernes3;
    private javax.swing.JLabel lblViernes4;
    private javax.swing.JLabel lblViernes5;
    private javax.swing.JLabel lblViernes6;
    private javax.swing.JLabel lblViernes7;
    // End of variables declaration//GEN-END:variables
}

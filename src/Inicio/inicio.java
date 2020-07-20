
package Inicio;

import Profesor.Dia;
import Profesor.Grado;
import Profesor.Horario;
import Profesor.Materia;
import Profesor.Periodo;
import Profesor.Profesor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class inicio extends javax.swing.JFrame {
 public static LinkedList<Profesor> listaProfesores = new LinkedList<Profesor>();
 public static LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
 public static LinkedList<Grado> listaGrados = new LinkedList<Grado>();
 public static LinkedList<Horario> listaHorarios = new LinkedList<Horario>();
 public static boolean carga = true;   
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        if (carga){
                  // para leer las profesores 
          JSONParser parser = new JSONParser();
          String Archivo = "Profesores.txt";
              try {
           File archivo = new File(Archivo);
           FileInputStream is = new FileInputStream(archivo);
           InputStreamReader sr = new InputStreamReader(is,"UTF-8");
           BufferedReader br = new BufferedReader(sr,8);
           Object obj =  parser.parse(br);
           JSONObject jsonObject  = (JSONObject) obj;
          
          JSONArray array = (JSONArray) jsonObject.get("Profesores");
          
               
                  for (int i = 0; i < array.size(); i++) {
                      Profesor nuevo = new Profesor();
                      JSONObject jsonObject1 = (JSONObject) array.get(i);                     
                      String nombre = jsonObject1.get("NOMBRE").toString();
                      System.out.println("profe: "+nombre);
                      nuevo.setNombre(nombre);
                      LinkedList<Materia> materiasP = new LinkedList<Materia>();
                      JSONArray array2 = (JSONArray) jsonObject1.get("MATERIAS");                     
                       for (int j = 0; j < array2.size(); j++) {
                         JSONObject jsonObject2 = (JSONObject) array2.get(j);                     
                         String nombrem = jsonObject2.get("NOMBRE").toString();
                         System.out.println("materia: "+nombrem);
                         Materia nuevaMateria = new Materia ();
                         nuevaMateria.setNombre(nombrem);
                         materiasP.add(nuevaMateria);
                       }   
                       nuevo.setMaterias(materiasP);
                       listaProfesores.add(nuevo);    
           }
                 
     } 
      catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");}
      catch (IOException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");} catch (ParseException ex) {
         Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
     }
              
       ///      
              
              
               // para leer las materias 
          JSONParser parser2 = new JSONParser();
          String Archivo2 = "Materias.txt";
              try {
           File archivo = new File(Archivo2);
           FileInputStream is = new FileInputStream(archivo);
           InputStreamReader sr = new InputStreamReader(is,"UTF-8");
           BufferedReader br = new BufferedReader(sr,8);
           Object obj =  parser2.parse(br);
           JSONObject jsonObject  = (JSONObject) obj;
          
          JSONArray array = (JSONArray) jsonObject.get("Materias");
                       
                  for (int i = 0; i < array.size(); i++) {
                      Materia nuevo = new Materia();
                      JSONObject jsonObject1 = (JSONObject) array.get(i);                     
                      String nombre = jsonObject1.get("NOMBRE").toString();
                      System.out.println("lista Materias: "+nombre);                     
                      nuevo.setNombre(nombre);  
                      listaMaterias.add(nuevo);
           }
                 
     } 
      catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");}
      catch (IOException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");} catch (ParseException ex) {
         Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
     }
              
       ///   
              
              
          // para leer las Grados
          JSONParser parser3 = new JSONParser();
          String Archivo3 = "Grados.txt";
              try {
           File archivo = new File(Archivo3);
           FileInputStream is = new FileInputStream(archivo);
           InputStreamReader sr = new InputStreamReader(is,"UTF-8");
           BufferedReader br = new BufferedReader(sr,8);
           Object obj =  parser3.parse(br);
           JSONObject jsonObject  = (JSONObject) obj;
          
          JSONArray array = (JSONArray) jsonObject.get("Grados");
                       
                  for (int i = 0; i < array.size(); i++) {
                      Grado nuevo = new Grado();
                      JSONObject jsonObject1 = (JSONObject) array.get(i);                     
                      String nombre = jsonObject1.get("NOMBRE").toString();
                      System.out.println("lista grados: "+nombre);
                      String seccion = jsonObject1.get("SECCION").toString();
                      System.out.println("seccion: "+seccion);
                      nuevo.setNombre(nombre);
                      nuevo.setSeccion(seccion);
                      listaGrados.add(nuevo);
           }
                 
     } 
      catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");}
      catch (IOException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");} catch (ParseException ex) {
         Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
     }
              
       ///  
              
              
                // para leer los horarios
          JSONParser parser4 = new JSONParser();
          String Archivo4 = "Horarios.txt";
              try {
           File archivo = new File(Archivo4);
           FileInputStream is = new FileInputStream(archivo);
           InputStreamReader sr = new InputStreamReader(is,"UTF-8");
           BufferedReader br = new BufferedReader(sr,8);
           Object obj =  parser4.parse(br);
           JSONObject jsonObject  = (JSONObject) obj;
          
          JSONArray array = (JSONArray) jsonObject.get("Horarios");
          
               
                  for (int i = 0; i < array.size(); i++) {
                      Horario nuevoHorario = new Horario();
                      JSONObject jsonObject1 = (JSONObject) array.get(i);                     
                      String grado = jsonObject1.get("GRADO").toString();
                      System.out.println("grado: "+grado);
                      String seccion = jsonObject1.get("SECCION").toString();
                      System.out.println("seccion: "+seccion);
                      String anio = jsonObject1.get("ANIO").toString();
                      System.out.println("anio: "+anio);
                      nuevoHorario.setGrado(grado);
                      nuevoHorario.setAnio(anio);
                      nuevoHorario.setSeccion(seccion);
                      LinkedList<Periodo> lisPeriodos = new LinkedList<Periodo>();
                      JSONArray array2 = (JSONArray) jsonObject1.get("PERIODOS");                     
                       for (int j = 0; j < array2.size(); j++) {
                         Periodo nuevoPeriodo = new Periodo();
                         JSONObject jsonObject2 = (JSONObject) array2.get(j);                     
                         String numeroPeriodo = jsonObject2.get("NO").toString();
                         System.out.println("  periodo: "+numeroPeriodo);
                         nuevoPeriodo.setNo(numeroPeriodo);
                         LinkedList<Dia> lisDias = new LinkedList<Dia>();
                         JSONArray array3 = (JSONArray) jsonObject2.get("DIAS"); 
                           for (int k = 0; k < array3.size(); k++) {
                         Dia nuevoDia =  new Dia();
                         JSONObject jsonObject3 = (JSONObject) array3.get(k);                     
                         String nombreD = jsonObject3.get("NOMBRE").toString();
                         System.out.println("    dia: "+nombreD);
                         String materia = jsonObject3.get("MATERIA").toString();
                         System.out.println("    materia: "+materia);
                         String profesor = jsonObject3.get("PROFESOR").toString();
                         System.out.println("    profesor: "+profesor);
                          nuevoDia.setMateria(materia);
                          nuevoDia.setNombre(nombreD);
                          nuevoDia.setProfesor(profesor);
                          lisDias.add(nuevoDia);                         
                         }
                          nuevoPeriodo.setDias(lisDias);
                          lisPeriodos.add(nuevoPeriodo);
  
                       }   
                       nuevoHorario.setPeriodos(lisPeriodos);
                       listaHorarios.add(nuevoHorario);
           }
                 
     } 
      catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");}
      catch (IOException e){JOptionPane.showMessageDialog(null, "Archivo no cargado!!!!");} catch (ParseException ex) {
         Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
     }
              
       ///      
              
      
            System.out.println(""+listaHorarios.size());   
       
      carga = false;  
    }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHorarios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("INICIO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 30, 110, 40);

        btnHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/horario1.png"))); // NOI18N
        btnHorarios.setToolTipText("Crear Horario");
        btnHorarios.setBorderPainted(false);
        btnHorarios.setContentAreaFilled(false);
        btnHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorarios.setDefaultCapable(false);
        btnHorarios.setFocusPainted(false);
        btnHorarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/horario2.png"))); // NOI18N
        btnHorarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/horario1.png"))); // NOI18N
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnHorarios);
        btnHorarios.setBounds(240, 110, 110, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maestra1.png"))); // NOI18N
        jButton2.setToolTipText("Profesores");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maestra2.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maestra1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 100, 130, 110);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materias1.png"))); // NOI18N
        jButton3.setToolTipText("Materias");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materias2.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materias1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(230, 310, 110, 110);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grados1.png"))); // NOI18N
        jButton1.setToolTipText("Grados");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grados2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grados1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 310, 150, 110);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.png"))); // NOI18N
        jButton5.setToolTipText("Salir");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 450, 90, 90);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Profesores Profesores = new Profesores();
       Profesores.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
       elegirAnio elegirAnio = new elegirAnio();
       elegirAnio.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         clases clases = new clases();
         clases.setVisible(true);
         dispose();          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Grados Grados = new Grados();
         Grados.setVisible(true);
         dispose();               
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

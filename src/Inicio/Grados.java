/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import static Inicio.Profesores.seleccionado;
import static Inicio.inicio.listaGrados;
import static Inicio.inicio.listaHorarios;
import static Inicio.inicio.listaMaterias;
import static Inicio.inicio.listaProfesores;
import Profesor.Grado;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author A8
 */
public class Grados extends javax.swing.JFrame {

     public String gradoSelect = "";
     public String seccionSelect = "";
    public Grados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        
        cbxSeccion.addItem("Unica");
        cbxSeccion.addItem("A");
        cbxSeccion.addItem("B");
        cbxSeccion.addItem("C");
        cbxSeccion.addItem("D");
        cbxSeccion.addItem("E");
        
        // lista de grados posibles
        cbxGrado.addItem("Inicial");
        cbxGrado.addItem("PreKinder");
        cbxGrado.addItem("Kinder");
        cbxGrado.addItem("Preparatoria");
        cbxGrado.addItem("Primero Primaria");
        cbxGrado.addItem("Segundo Primaria");
        cbxGrado.addItem("Tercero Primaria");
        cbxGrado.addItem("Cuarto Primaria");
        cbxGrado.addItem("Quinto Primaria");
        cbxGrado.addItem("Sexto Primaria");
        cbxGrado.addItem("Primero Básico");
        cbxGrado.addItem("Segundo Básico");
        cbxGrado.addItem("Tercero Básico");
        cbxGrado.addItem("Cuarto Bachillerato");
        cbxGrado.addItem("Quinto Bachillerato");

        try{
          
           String nombreColumnas [] ={"Grados","Sección"};
           String data [][] = new String [listaGrados.size()][2];
         
        for (int i = 0; i < listaGrados.size(); i++) {  
            
                   data[i][0] = listaGrados.get(i).getNombre(); 
                   data[i][1] = listaGrados.get(i).getSeccion();
                   tableGrados.setModel(new DefaultTableModel(data,nombreColumnas));                   
        }
        }catch( Exception a ){}
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGrados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbxGrado = new javax.swing.JComboBox();
        cbxSeccion = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel1.setText("Grados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 60, 20);

        tableGrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grado", "Sección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGrados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 440, 270);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras1.png"))); // NOI18N
        jButton1.setToolTipText("Regresar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 490, 70, 70);

        jPanel1.add(cbxGrado);
        cbxGrado.setBounds(520, 110, 190, 20);

        jPanel1.add(cbxSeccion);
        cbxSeccion.setBounds(750, 110, 70, 20);

        jLabel2.setText("Grado");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 80, 60, 14);

        jLabel3.setText("Sección");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 80, 70, 14);

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 40, 100, 23);

        jButton3.setText("Eliminar Grado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 340, 140, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         inicio inicio = new inicio();
         inicio.setVisible(true);
         dispose();         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String grado = cbxGrado.getSelectedItem().toString();
        String seccion = cbxSeccion.getSelectedItem().toString();
        
        if (((grado.compareTo("") == 0) || (grado == null)) || ((seccion.compareTo("") == 0) || (seccion == null)) ){
            JOptionPane.showMessageDialog(null, "Seleccione un grado por favor !!!");
         }else{
              boolean esta = true;
              for (int i = 0; i < listaGrados.size(); i++) {
                if (listaGrados.get(i).getNombre().compareTo(grado) == 0 && listaGrados.get(i).getSeccion().compareTo(seccion)==0 ){
                   esta = false;
                   break;
                }
            }
            
            if (esta){
            Grado nuevo = new Grado ();
            nuevo.setNombre(grado);
            nuevo.setSeccion(seccion);
            listaGrados.add(nuevo);
            JOptionPane.showMessageDialog(null, "Agregado con exito.");
            
            
            
            JSONArray list = new JSONArray();
           for (int i = 0; i < listaGrados.size(); i++) {
                JSONObject obj0 = new JSONObject();
		obj0.put("NOMBRE", listaGrados.get(i).getNombre()); 
                obj0.put("SECCION", listaGrados.get(i).getSeccion());
                list.add(obj0);
           }

	        JSONObject obj3 = new JSONObject();
		obj3.put("Grados", list);
		
		try{
			FileWriter file = new FileWriter("Grados.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			//System.out.println(obj1);
		}
            
            try{
          
           String nombreColumnas [] ={"Grados","Sección"};
           String data [][] = new String [listaGrados.size()][2];
         
            for (int i = 0; i < listaGrados.size(); i++) {  
            
                   data[i][0] = listaGrados.get(i).getNombre(); 
                   data[i][1] = listaGrados.get(i).getSeccion();
                   tableGrados.setModel(new DefaultTableModel(data,nombreColumnas));                   
           }
        }catch( Exception a ){}
            }else{
              JOptionPane.showMessageDialog(null, "El grado que desea crear ya existe !!!");
            }
            
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (gradoSelect.compareTo("") == 0 || gradoSelect.compareTo("null") == 0 ){
            JOptionPane.showMessageDialog(null, "Seleccione un grado");        
        }else{
           
             int desicion = JOptionPane.showConfirmDialog(null, "Si elimina el grado, se eliminaran todos\n los horarios relacionados con este grado \n ¿Seguro que quiere eliminar el grado?");
            
             if(desicion == JOptionPane.YES_OPTION){
              
                 
                 
            for (int i = 0; i < listaGrados.size(); i++) {
                if (listaGrados.get(i).getNombre().compareTo(gradoSelect) == 0 && listaGrados.get(i).getSeccion().compareTo(seccionSelect)== 0 ){
                   listaGrados.remove(i);
                   JOptionPane.showMessageDialog(null, "Eliminado con exito.");  
                }
            }
            
            
            JSONArray list = new JSONArray();
           for (int i = 0; i < listaGrados.size(); i++) {
                JSONObject obj0 = new JSONObject();
		obj0.put("NOMBRE", listaGrados.get(i).getNombre()); 
                obj0.put("SECCION", listaGrados.get(i).getSeccion());
                list.add(obj0);
           }

	        JSONObject obj3 = new JSONObject();
		obj3.put("Grados", list);
		
		try{
			FileWriter file = new FileWriter("Grados.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			//System.out.println(obj1);
		}
            
            try{
          
           String nombreColumnas [] ={"Grados","Sección"};
           String data [][] = new String [listaGrados.size()][2];
         
            for (int i = 0; i < listaGrados.size(); i++) {  
            
                   data[i][0] = listaGrados.get(i).getNombre(); 
                   data[i][1] = listaGrados.get(i).getSeccion();
                   tableGrados.setModel(new DefaultTableModel(data,nombreColumnas));                   
           }
        }catch( Exception a ){}
              
             }  
            
             for (int i = 0; i < listaHorarios.size(); i++) {   
               
                String grad =listaHorarios.get(i).getGrado();
                String sec = listaHorarios.get(i).getSeccion();
                  if (grad.compareTo(gradoSelect) == 0 && sec.compareTo(seccionSelect) ==0 ){
                      listaHorarios.remove(i);
                      break;
                  }
             }
            
             guardarHorario();
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableGradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGradosMouseClicked
        int seleccion = tableGrados.rowAtPoint(evt.getPoint());
        gradoSelect = String.valueOf(tableGrados.getValueAt(seleccion, 0));
        seccionSelect = String.valueOf(tableGrados.getValueAt(seleccion, 1));
    }//GEN-LAST:event_tableGradosMouseClicked

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
            java.util.logging.Logger.getLogger(Grados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grados().setVisible(true);
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
    private javax.swing.JComboBox cbxGrado;
    private javax.swing.JComboBox cbxSeccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableGrados;
    // End of variables declaration//GEN-END:variables
}

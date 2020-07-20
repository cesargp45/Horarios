/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import static Inicio.inicio.listaMaterias;
import static Inicio.inicio.listaProfesores;
import Profesor.Materia;
import Profesor.Profesor;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author A8
 */
public class agregarProfesor extends javax.swing.JFrame {

  public LinkedList<Materia> materiasProfesor = new LinkedList<Materia>();
  public String materiaselec = "";
    public agregarProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
       
        for (int i = 0; i < listaMaterias.size(); i++) {
            cbxClases.addItem(listaMaterias.get(i).getNombre());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        cbxClases = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel1.setText("Agregar Profesor");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 30, 90, 30);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(210, 120, 380, 30);

        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 124, 50, 30);

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materias"
            }
        ));
        tableMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMaterias);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 180, 150, 170);

        cbxClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClasesActionPerformed(evt);
            }
        });
        jPanel1.add(cbxClases);
        cbxClases.setBounds(170, 180, 220, 20);

        jButton1.setText("Agregar Materia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 370, 140, 23);

        jButton2.setText("Agregar Profesor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 460, 130, 23);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras1.png"))); // NOI18N
        jButton3.setToolTipText("Regresar");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 470, 70, 70);

        jButton4.setText("Eliminar Materia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(453, 400, 140, 23);

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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cbxClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClasesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        String i = cbxClases.getSelectedItem().toString();
         if ((i.compareTo("") == 0) || (i == null)){
            JOptionPane.showMessageDialog(null, "Seleccione una Materia por favor !!!");
         }else{
             Materia nueva = new Materia();
             nueva.setNombre(i);
             boolean paso = true;
             for (int j = 0; j < materiasProfesor.size(); j++) {               
                 if (materiasProfesor.get(j).getNombre().compareTo(nueva.getNombre()) == 0){
                     paso = false;
                     break;
                 }
             }
             
             if (paso){
               materiasProfesor.add(nueva);
             }
             
             
           try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [materiasProfesor.size()][1];
         
           for (int j = 0; j < materiasProfesor.size(); j++) {             
                   data[j][0] = materiasProfesor.get(j).getNombre();                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
          }
        }catch( Exception a ){}
          
         }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (txtNombre.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Campo del nombre vacio!!!");                  
        }else{
        if (materiasProfesor.size() == 0){
          JOptionPane.showMessageDialog(null, "Asigne al menos una materia");       
         }else{
            boolean paso = true;
            for (int i = 0; i < listaProfesores.size(); i++) {
                if (listaProfesores.get(i).getNombre().equalsIgnoreCase(txtNombre.getText())){
                    paso = false;
                    break;
                }
            }
            
            if (paso){
           LinkedList<Materia> materiasaux = new LinkedList<Materia>();  
                for (int i = 0; i < materiasProfesor.size(); i++) {
                    materiasaux.add(materiasProfesor.get(i));
                }
           Profesor nuevo = new Profesor();
           nuevo.setNombre(txtNombre.getText());
           nuevo.setMaterias(materiasaux);
           listaProfesores.add(nuevo);

           JSONArray list = new JSONArray();
           for (int i = 0; i < listaProfesores.size(); i++) {
                JSONObject obj0 = new JSONObject();
		obj0.put("NOMBRE", listaProfesores.get(i).getNombre());
                JSONArray list1 = new JSONArray();
               for (int j = 0; j < listaProfesores.get(i).getMaterias().size(); j++) {
                  JSONObject obj1 = new JSONObject();
		  obj1.put("NOMBRE", listaProfesores.get(i).getMaterias().get(j).getNombre());
                  list1.add(obj1);
               }
                //JSONObject obj2 = new JSONObject();
		obj0.put("MATERIAS", list1);
               
               list.add(obj0);          
         }

	        JSONObject obj3 = new JSONObject();
		obj3.put("Profesores", list);
		
		try{
			FileWriter file = new FileWriter("Profesores.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			//System.out.println(obj1);
		}
                materiasProfesor.clear();
                    JOptionPane.showMessageDialog(null, "Creado Exitosamente");
                     agregarProfesor agregarProfesor = new agregarProfesor();
                     agregarProfesor.setVisible(true);
                     dispose(); 
            
            }else{
              JOptionPane.showMessageDialog(null, "El nombre que desea registrar\n ya se encuentra registrado\n intentelo de nuevo.");
            }
            
           
               
         } 
        }

                

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Profesores Profesores = new Profesores();
       Profesores.setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMateriasMouseClicked
       int seleccion = tableMaterias.rowAtPoint(evt.getPoint());
        materiaselec = String.valueOf(tableMaterias.getValueAt(seleccion, 0));           
    }//GEN-LAST:event_tableMateriasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          if (materiaselec.compareTo("") == 0 || materiaselec.compareTo("null") == 0 ){
            JOptionPane.showMessageDialog(null, "Seleccione una materia");        
          }else{
              for (int i = 0; i < materiasProfesor.size(); i++) {
                  if(materiasProfesor.get(i).getNombre().compareTo(materiaselec)==0){
                    materiasProfesor.remove(i);
                  }
              }
              
           if(materiasProfesor.size()==0){
                  
            try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [0][1];
         
                        
                   //data[1][0] = null;                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
             
             }catch( Exception a ){}
         }
              
            try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [materiasProfesor.size()][1];
         
           for (int j = 0; j < materiasProfesor.size(); j++) {             
                   data[j][0] = materiasProfesor.get(j).getNombre();                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
          }
        }catch( Exception a ){}
          }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(agregarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxClases;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

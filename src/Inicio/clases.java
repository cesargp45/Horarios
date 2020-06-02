/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import static Inicio.Profesores.seleccionado;
import static Inicio.inicio.listaMaterias;
import static Inicio.inicio.listaProfesores;
import Profesor.Materia;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author A8
 */
public class clases extends javax.swing.JFrame {

   public String materiaSelect = "";
    public clases() {
        initComponents();
        this.setLocationRelativeTo(null);
        
           try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [listaMaterias.size()][1];
         
        for (int i = 0; i < listaMaterias.size(); i++) {  
            
                   data[i][0] = listaMaterias.get(i).getNombre();                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
        }
        }catch( Exception a ){}
        
        
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMateria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel1.setText("Materias");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 60, 30);

        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 500, 73, 23);

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia"
            }
        ));
        tableMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMaterias);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 400, 310);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 370, 120, 23);

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(630, 220, 71, 23);
        jPanel1.add(txtMateria);
        txtMateria.setBounds(470, 170, 350, 30);

        jLabel2.setText("Nueva Materia:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 140, 100, 14);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         inicio inicio = new inicio();
         inicio.setVisible(true);
         dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMateriasMouseClicked
        int seleccion = tableMaterias.rowAtPoint(evt.getPoint());
        materiaSelect = String.valueOf(tableMaterias.getValueAt(seleccion, 0));    
    }//GEN-LAST:event_tableMateriasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        
        if ( materiaSelect.compareTo("") == 0 ||  materiaSelect.compareTo("null") == 0){
             JOptionPane.showMessageDialog(null, "Seleccione una materia!");        
         }else{
             
         
             for (int i = 0; i < listaMaterias.size(); i++) {
                 if(listaMaterias.get(i).getNombre().compareTo(materiaSelect) == 0){
                     listaMaterias.remove(i);
                  
                 }
             }
             
             
             for (int i = 0; i < listaProfesores.size(); i++) {
                  for (int j = 0; j < listaProfesores.get(i).getMaterias().size(); j++) {
                     if (listaProfesores.get(i).getMaterias().get(j).getNombre().compareTo(materiaSelect) == 0){
                         listaProfesores.get(i).getMaterias().remove(j);
                         JOptionPane.showMessageDialog(null, "Eliminado con exito"); 
                     }
                 }
             }
             
             JSONArray list = new JSONArray();
           for (int i = 0; i < listaMaterias.size(); i++) {
                JSONObject obj0 = new JSONObject();
		obj0.put("NOMBRE", listaMaterias.get(i).getNombre()); 
                list.add(obj0);
           }

	        JSONObject obj3 = new JSONObject();
		obj3.put("Materias", list);
		
		try{
			FileWriter file = new FileWriter("Materias.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			//System.out.println(obj1);
		}
             
             if (listaMaterias.size() == 0){
                  try{
          
                     String nombreColumnas [] ={"Materias"};
                     String data [][] = new String [0][1];
                         
                     tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
             
                   }catch( Exception a ){}
                 
             }else{
           try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [listaMaterias.size()][1];
         
            for (int i = 0; i < listaMaterias.size(); i++) {  
            
                   data[i][0] = listaMaterias.get(i).getNombre();                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
            }
            }catch( Exception a ){}  
             
            }
     
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtMateria.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Rellene el campo del nombre de la materia!"); 
        }else{
            boolean paso = true;
            for (int i = 0; i < listaMaterias.size(); i++) {
                if (listaMaterias.get(i).getNombre().equalsIgnoreCase(txtMateria.getText())){
                    paso = false;
                    break;
                }
            }
            
            if (paso){
                
                Materia nueva = new Materia ();
            nueva.setNombre(txtMateria.getText());
            listaMaterias.add(nueva);
            txtMateria.setText(null);
            JOptionPane.showMessageDialog(null, "Agregado con exito."); 
            try{
          
           String nombreColumnas [] ={"Materias"};
           String data [][] = new String [listaMaterias.size()][1];
         
            for (int i = 0; i < listaMaterias.size(); i++) {  
            
                   data[i][0] = listaMaterias.get(i).getNombre();                          
                   tableMaterias.setModel(new DefaultTableModel(data,nombreColumnas));                   
            }
            }catch( Exception a ){}  
            
 
           JSONArray list = new JSONArray();
           for (int i = 0; i < listaMaterias.size(); i++) {
                JSONObject obj0 = new JSONObject();
		obj0.put("NOMBRE", listaMaterias.get(i).getNombre()); 
                list.add(obj0);
           }

	        JSONObject obj3 = new JSONObject();
		obj3.put("Materias", list);
		
		try{
			FileWriter file = new FileWriter("Materias.txt");
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			//System.out.println(obj1);
		}
            }else{
            JOptionPane.showMessageDialog(null, "La materia que desea ingresar\n ya existe!!!"); 
            }
            
            
            
            
   
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(clases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}

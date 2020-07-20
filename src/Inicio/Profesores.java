
package Inicio;

import static Inicio.inicio.listaProfesores;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Profesores extends javax.swing.JFrame {
  public static String seleccionado = "";
   
    public Profesores() {
        initComponents();
        this.setLocationRelativeTo(null);
        
          try{
          
           String nombreColumnas [] ={"Profesor"};
           String data [][] = new String [listaProfesores.size()][1];
         
        for (int i = 0; i < listaProfesores.size(); i++) {  
            
                   data[i][0] = listaProfesores.get(i).getNombre();                          
                   tableProfesores.setModel(new DefaultTableModel(data,nombreColumnas));                   
        }
        }catch( Exception a ){}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProfesores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        tableProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profesor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProfesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProfesores);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 50, 340, 300);

        jLabel1.setText("Profesores");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 20, 70, 20);

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
        jButton1.setBounds(10, 470, 70, 70);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar3.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar4.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar3.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(280, 350, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar1.png"))); // NOI18N
        jButton3.setToolTipText("Eliminar");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar2.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 350, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar1.png"))); // NOI18N
        jButton2.setToolTipText("Editar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar2.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 350, 60, 50);

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
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProfesor agregarProfesor = new agregarProfesor();
        agregarProfesor.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tableProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProfesoresMouseClicked
        int seleccion = tableProfesores.rowAtPoint(evt.getPoint());
        seleccionado = String.valueOf(tableProfesores.getValueAt(seleccion, 0));
                
    }//GEN-LAST:event_tableProfesoresMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if (seleccionado.compareTo("") == 0 || seleccionado.compareTo("null") == 0 ){
            JOptionPane.showMessageDialog(null, "Seleccione un profesor");        
          }else{
              for (int i = 0; i < listaProfesores.size(); i++) {
                   if (listaProfesores.get(i).getNombre().compareTo(seleccionado) == 0){
                     listaProfesores.remove(i);
                     if (listaProfesores.size() == 0){
                     Profesores  Profesores = new  Profesores ();
                      Profesores.setVisible(true);
                     dispose(); 
                     }
                   }
              }
              
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
                
                     JOptionPane.showMessageDialog(null, "Eliminado Exitosamente");
                     seleccionado = "";
                     Profesores Profesores = new Profesores();
                     Profesores.setVisible(true);
                     dispose(); 
              
       
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if (seleccionado.compareTo("") == 0 || seleccionado == null ){
            JOptionPane.showMessageDialog(null, "Seleccione un profesor");        
          }else{
                     editarProfesor editarProfesor  = new editarProfesor ();
                     editarProfesor .setVisible(true);
                     dispose();  
          }
        
 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProfesores;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import static Inicio.CrearHorario.diaSelect;
import static Inicio.CrearHorario.guardado;
import static Inicio.CrearHorario.noSelect;
import static Inicio.elegirAnio.anioActual;
import static Inicio.elegirAnio.gradoSelect;
import static Inicio.elegirAnio.seccionSelect;
import static Inicio.inicio.listaHorarios;
import static Inicio.inicio.listaMaterias;
import static Inicio.inicio.listaProfesores;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class AsignarMateria extends javax.swing.JFrame {
     public  String mat = "";
     public  String prof = "";
    private JLabel elegido;
   
    public AsignarMateria(JLabel elegido) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.elegido = elegido;       
         for (int i = 0; i < listaMaterias.size(); i++) {
            cbxMaterias.addItem(listaMaterias.get(i).getNombre());
        }
                
    }

    private AsignarMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMaterias = new javax.swing.JComboBox();
        cbxProfesores = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        jLabel1.setText("Asignar materia y profesor");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 160, 14);

        jLabel2.setText("Porfesor:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 160, 60, 14);

        jLabel3.setText("Materia: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 70, 60, 14);

        cbxMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMateriasItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxMaterias);
        cbxMaterias.setBounds(140, 70, 170, 20);

        jPanel1.add(cbxProfesores);
        cbxProfesores.setBounds(140, 160, 170, 20);

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
        jButton1.setBounds(0, 230, 80, 70);

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 220, 100, 30);

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
         try{
             
          mat = cbxMaterias.getSelectedItem().toString();
          prof = cbxProfesores.getSelectedItem().toString();
             System.out.println("materia: "+mat);
             System.out.println("profe: "+prof);
        if (mat.compareTo("") == 0 ||mat.compareTo("null") == 0 || mat == null ||prof.compareTo("") == 0 ||prof.compareTo("null") == 0 || prof == null){
            JOptionPane.showMessageDialog(null, "Seleccione una materia y un profesor");
         }else{           
           
               
             boolean repetida = false;
             String gradrepetido = "";
             String seccionrep = "";
        
         for (int i = 0; i < listaHorarios.size(); i++) {
            if(listaHorarios.get(i).getAnio().compareTo(anioActual) == 0){
                String gradselect =listaHorarios.get(i).getGrado();
                String secselect = listaHorarios.get(i).getSeccion();
               
                if((gradselect.compareTo(gradoSelect) == 0) && (secselect.compareTo(seccionSelect) == 0)){
                }else{
                
                    for (int j = 0; j < listaHorarios.get(i).getPeriodos().size(); j++) {
                       String numPeriodo = listaHorarios.get(i).getPeriodos().get(j).getNo();
                  
                     for (int k = 0; k < listaHorarios.get(i).getPeriodos().get(j).getDias().size(); k++) {
                         String dia = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getNombre();
                         String materia = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getMateria();
                         String profesor = listaHorarios.get(i).getPeriodos().get(j).getDias().get(k).getProfesor();
                         
                         if ((dia.compareTo(diaSelect) == 0) && (numPeriodo.compareTo(noSelect) == 0)){ // aqui esta el error
                            
                             System.out.println("entro aqui pero no se");
                             if(prof.compareTo(profesor) == 0){
                                 repetida = true;
                                 gradrepetido = gradselect;
                                 seccionrep = secselect;
                                 break;
                             }
                             
                         }                        
                     }
                     if(repetida){
                       break;
                     }
                 }
              }               
            }
            if(repetida){
               break;
             }
         }
            
            
            if(repetida){
                prof = "";
                mat = "";      
                JOptionPane.showMessageDialog(null, "La profesora ya esta asignada en este mismo horario\n"
                        + "en: " + gradrepetido + " " + seccionrep);
            }else{               
                elegido.setText("<html>#"+mat+"# <p> #"+prof+"# <html>");       
                elegido.setHorizontalAlignment(SwingConstants.CENTER);
                elegido.setVerticalAlignment(SwingConstants.CENTER);
                elegido.setBackground(Color.WHITE);
                
                prof = "";
                mat = "";
                guardado = false;
                dispose();
            
            }
            
            
         }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Seleccione una materia y un profesor");
         } 
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          dispose();         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMateriasItemStateChanged
        cbxProfesores.removeAllItems();
        String query = cbxMaterias.getSelectedItem().toString();
               
        if(query.compareTo("") == 0 || query == null){        
          JOptionPane.showMessageDialog(null, "Seleccione una materia");  
        }else{
            for (int i = 0; i < listaProfesores.size(); i++) {
                for (int j = 0; j < listaProfesores.get(i).getMaterias().size(); j++) {
                      if (listaProfesores.get(i).getMaterias().get(j).getNombre().equalsIgnoreCase(query)){
                          cbxProfesores.addItem(listaProfesores.get(i).getNombre());
                      }
                }
            }
        }
                
    }//GEN-LAST:event_cbxMateriasItemStateChanged

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
            java.util.logging.Logger.getLogger(AsignarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxMaterias;
    private javax.swing.JComboBox cbxProfesores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

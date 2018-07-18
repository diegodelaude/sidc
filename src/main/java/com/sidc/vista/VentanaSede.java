/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidc.vista;

import com.sidc.clases.Persona;
import com.sidc.clases.Sede;
import com.sidc.clases.Vacuna;
import static com.sidc.controllers.ControllerPersona.getPersonaByDni;
import static com.sidc.controllers.ControllerVacuna.getVacunaByNombre;
import static com.sidc.controllers.ControllerVacuna.listarVacunas;
import static com.sidc.controllers.ControllerVacuna.listarVacunasByPersona;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author julian
 */
public class VentanaSede extends javax.swing.JFrame {
       private Sede sede;
       DefaultComboBoxModel dcb;
    /**
     * Creates new form VentanaSede
     */
    public VentanaSede() {
        initComponents();
        setSize(800,600);
        this.setLocationRelativeTo(null);
        
    }
    
    @Override
     public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/SIDC (1).png"));
        return retValue;
    }
    //for(Vacuna v:sede.getVacunas()){
      //  listaVacunasSede.addItem(v.getNombre());    
        //}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        resNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        resAgregar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vacunas = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 153, 153));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 70, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Por favor ingrese el DNI de la persona");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 310, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        btnVerificar.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificar.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(0, 153, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        resNombre.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        resNombre.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(resNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 210, 30));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Seleccione vacuna");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, 30));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 153, 153));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setFocusTraversalPolicyProvider(true);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        resAgregar.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        resAgregar.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(resAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 40));

        jScrollPane1.setViewportView(vacunas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 240));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cintaaaaa.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed
   
    
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        DefaultListModel cosas=new DefaultListModel();
        Persona p;
        vacunas.setModel(cosas);
        try{  
         int numDni=Integer.parseInt(txtUsuario.getText());
         p=getPersonaByDni(numDni);
         resNombre.setText(p.getNombre()+" "+p.getApellido());
         List<Vacuna> vacunas = listarVacunas();
            for(Vacuna v : vacunas){
                cosas.addElement(v.getNombre());         
            }
            //String valor = v.getNombre();
            //cosas.addElement(valor);
       } 
        catch(NumberFormatException e){
           resNombre.setForeground(Color.red);
           resNombre.setText("NO HAY REGiSTROS");
       }   
    }//GEN-LAST:event_btnVerificarActionPerformed

    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        VentanaSede vs= new VentanaSede();
        this.dispose();
        vs.setVisible(true);
        vs.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnActualizarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaSede().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resAgregar;
    private javax.swing.JLabel resNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JList<String> vacunas;
    // End of variables declaration//GEN-END:variables

    

}

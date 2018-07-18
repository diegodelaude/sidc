/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidc.vista;

import com.sidc.clases.Sede;
import com.sidc.clases.Vacuna;
import com.sidc.controllers.ControllerSede;
import static com.sidc.controllers.ControllerSede.getSedeById;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;

/**
 *
 * @author julian
 */
public class IngresoSede extends javax.swing.JFrame {

    /**
     * Creates new form IngresoSede
     */
    public IngresoSede() {
        initComponents();
        this.setLocationRelativeTo(null);
         setSize(800,600);
    }
     public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/SIDC (1).png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlUsuario = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtContrase�a = new javax.swing.JPasswordField();
        IdSede = new javax.swing.JTextField();
        mensajeError = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUsuario.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(0, 153, 153));
        jlUsuario.setText("Id Sede");
        getContentPane().add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 107, -1));

        jlPassword.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(0, 153, 153));
        jlPassword.setText("Contrase�a");
        getContentPane().add(jlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 107, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 153, 153));
        btnAtras.setText("Atras");
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 153, 153));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 153, 153));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        txtContrase�a.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtContrase�a, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 180, 30));

        IdSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdSedeActionPerformed(evt);
            }
        });
        getContentPane().add(IdSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 180, 30));

        mensajeError.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(mensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 180, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dnarelo.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdSedeActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       TestMainAUsar t=new TestMainAUsar();
       t.setVisible(true);
       t.setLocationRelativeTo(null);
       //t.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       SeleccionIngreso t=new SeleccionIngreso();
       t.setVisible(true);
       t.setLocationRelativeTo(null);
      // t.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed
    
   // DefaultListModel vacunas = new DefaultListModel();
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        Sede s;
        VentanaSede vs=new VentanaSede();
       int idSede = Integer.parseInt(IdSede.getText());
       s = getSedeById(idSede);
       if (ControllerSede.verificar(idSede,txtContrase�a.getText()))
             vs.setLocationRelativeTo(null);
             vs.setVisible(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoSede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdSede;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JPasswordField txtContrase�a;
    // End of variables declaration//GEN-END:variables
}

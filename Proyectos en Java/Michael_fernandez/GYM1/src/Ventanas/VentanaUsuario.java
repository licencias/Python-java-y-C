
package Ventanas;

import gym.GYM;


public class VentanaUsuario extends javax.swing.JFrame {

    public VentanaUsuario() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Usuario"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIMC = new javax.swing.JButton();
        jButtonPesoIdeal = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIMC.setBackground(new java.awt.Color(204, 204, 204));
        jButtonIMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonIMC.setText("Calcula IMC");
        jButtonIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIMCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 40));

        jButtonPesoIdeal.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPesoIdeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonPesoIdeal.setText("Peso Ideal");
        jButtonPesoIdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesoIdealActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesoIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, 40));

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Cerrar sesión");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIMCActionPerformed
        VentanaImc obj = new VentanaImc();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonIMCActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Interfaz obj = new Interfaz();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonPesoIdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesoIdealActionPerformed
        VentanaPesoIdeal obj = new VentanaPesoIdeal ();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPesoIdealActionPerformed


    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonIMC;
    private javax.swing.JButton jButtonPesoIdeal;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}


package Ventanas;

import gym.GYM;


public class VentanaAdministrarMaquinas extends javax.swing.JFrame {
    private GYM gym;

    public VentanaAdministrarMaquinas(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrar Maquinas");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMostrarMaquinas = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMostrarMaquinas.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMostrarMaquinas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMostrarMaquinas.setText("Mostrar Maquinas");
        jButtonMostrarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarMaquinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMostrarMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 180, 40));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Admistrador de Maquinas");
        jLabelTitulo.setToolTipText("");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.setToolTipText("");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 40));

        jButtonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar Maquina");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 180, 40));

        jButtonAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar Maquina");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 180, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarMaquinasActionPerformed
        VentanaMostrarMaquinas obj = new VentanaMostrarMaquinas(gym);
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonMostrarMaquinasActionPerformed

    
    
    
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        VentanaAdministrarSector obj = new VentanaAdministrarSector(gym);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        VentanaEliminnarMaquina obj = new VentanaEliminnarMaquina(gym);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        VentanaAgregarMaquina obj = new VentanaAgregarMaquina(gym);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAgregarActionPerformed


    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonMostrarMaquinas;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}


package Ventanas;

import gym.GYM;
import gym.Sector;
import java.util.ArrayList;


public class VentanaAdministrarSector extends javax.swing.JFrame {
   private GYM gym ;  
   

    public VentanaAdministrarSector(GYM gym) {
        this.gym = gym;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrar Sectores");
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaSectores = new javax.swing.JList<>();
        jButtonAgregarSector = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonEliminaSector = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAdministrarMaquinas = new javax.swing.JButton();
        jLabelGYM = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Administrar Sectores");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jButtonMostrar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMostrar.setText("Mostrar Sectores");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 40));

        jScrollPane1.setViewportView(jListaSectores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 410, 210));

        jButtonAgregarSector.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAgregarSector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregarSector.setText("Agregar Sector");
        jButtonAgregarSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarSectorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 160, 40));

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        jButtonEliminaSector.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEliminaSector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminaSector.setText("Eliminar Sector");
        jButtonEliminaSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminaSectorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminaSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 160, 40));

        jButtonModificar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 160, 40));

        jButtonAdministrarMaquinas.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdministrarMaquinas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdministrarMaquinas.setText("Administrar Maquinas");
        jButtonAdministrarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrarMaquinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdministrarMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 210, 40));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back-512.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 300, 480));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        jLabelFondo.setText(" ");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
            javax.swing.DefaultListModel modelo;
            
            ArrayList<Sector> arreglo = gym.getListaSector().getArraySector();
            
            modelo = new javax.swing.DefaultListModel<>();
            
            modelo.addElement("Nombre - Tipo - ID");
              for(int i=0; i<arreglo.size(); i++)
              {
                  modelo.addElement(arreglo.get(i) + " - " +  arreglo.get(i).getTipoEjercicio() + " - " + arreglo.get(i).getId());
              }
              
             
        jListaSectores.setModel(modelo);
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonAgregarSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarSectorActionPerformed
            VentanaAgregarSector obj = new VentanaAgregarSector(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonAgregarSectorActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
            VentanaPrincipal obj = new VentanaPrincipal(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonEliminaSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminaSectorActionPerformed
            VentanaEliminaSector obj = new VentanaEliminaSector(gym); 
            obj.setVisible(true);
            dispose();
         
    }//GEN-LAST:event_jButtonEliminaSectorActionPerformed

    private void jButtonAdministrarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarMaquinasActionPerformed
            VentanaAdministrarMaquinas obj = new VentanaAdministrarMaquinas(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonAdministrarMaquinasActionPerformed

  
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministrarMaquinas;
    private javax.swing.JButton jButtonAgregarSector;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminaSector;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListaSectores;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

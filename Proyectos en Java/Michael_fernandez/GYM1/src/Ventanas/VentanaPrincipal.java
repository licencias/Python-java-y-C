package Ventanas;
import gym.GYM;

public class VentanaPrincipal extends javax.swing.JFrame {
    private GYM gym;
   
    public VentanaPrincipal(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrador");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdministrarClientes = new javax.swing.JButton();
        jButtonAdministrarProductos = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGYM = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(21412, 21412));
        setMinimumSize(new java.awt.Dimension(450, 450));
        setPreferredSize(new java.awt.Dimension(1110, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdministrarClientes.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdministrarClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdministrarClientes.setText("Administrar Clientes");
        jButtonAdministrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 40));

        jButtonAdministrarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdministrarProductos.setText("Administrar Productos");
        jButtonAdministrarProductos.setToolTipText("");
        jButtonAdministrarProductos.setEnabled(false);
        jButtonAdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdministrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 210, 40));

        jButtonCerrar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCerrar.setText("Cerrar sesión");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 140, 40));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Administrador");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gfhdfghgdfh.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Administrar Sectores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 40));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(107021, 40021));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(1280, 600));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarClientesActionPerformed
            VentanaAdministrador obj = new VentanaAdministrador(gym);
            obj.setVisible(true);
            dispose();
            
    }//GEN-LAST:event_jButtonAdministrarClientesActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
            Interfaz obj = new Interfaz(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaAdministrarSector obj = new VentanaAdministrarSector(gym);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdministrarProductosActionPerformed


    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdministrarClientes;
    private javax.swing.JButton jButtonAdministrarProductos;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}


package Ventanas;

import gym.GYM;
import gym.Sector;
import javax.swing.JOptionPane;


public class VentanaEliminnarMaquina extends javax.swing.JFrame {
   private GYM gym;
   private int IDSector;
   private int IDMaquina;

    public VentanaEliminnarMaquina(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Elimina Maquina");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIDSector = new javax.swing.JLabel();
        jLabelIDMaquina = new javax.swing.JLabel();
        jTextFieldIDSector = new javax.swing.JTextField();
        jTextFieldIDMaquina = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 500));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIDSector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIDSector.setForeground(new java.awt.Color(204, 204, 204));
        jLabelIDSector.setText("ID Sector:");
        getContentPane().add(jLabelIDSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 30));

        jLabelIDMaquina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIDMaquina.setForeground(new java.awt.Color(204, 204, 204));
        jLabelIDMaquina.setText("ID Maquina:");
        getContentPane().add(jLabelIDMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextFieldIDSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDSectorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, 30));

        jTextFieldIDMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 30));

        jButtonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 150, 40));

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 150, 40));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Elimina Maquina");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDSectorActionPerformed
   
    }//GEN-LAST:event_jTextFieldIDSectorActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
         
        this.IDSector = Integer.parseInt(jTextFieldIDSector.getText());
        this.IDMaquina = Integer.parseInt(jTextFieldIDMaquina.getText());
        

        
         if(gym.getListaSector().verificaID(IDSector))
         {
            
             if(buscaMaquina(retornaSector(IDSector), IDMaquina))
             {
                 
                  if(gym.getArchivos().eliminarCarpetaMaquinasIDM(IDMaquina, IDSector))
                  {
                      if(retornaSector(IDSector).getListaMaquinas().EliminaMaquina(IDMaquina))
                      {
                          JOptionPane.showMessageDialog(null,"La maquina "+IDMaquina+" se elimino correctamente");
                      }else    
                      {
                          JOptionPane.showMessageDialog(null,"La maquina "+IDMaquina+" no se elimino");
                      }

                  }
                  
                  
             }else
             {
                 JOptionPane.showMessageDialog(null,"La Maquina "+IDMaquina+" no existe");
             }            
         }
         else
         {
             JOptionPane.showMessageDialog(null,"El sector "+IDSector+" no existe");
         }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldIDMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDMaquinaActionPerformed
       
    }//GEN-LAST:event_jTextFieldIDMaquinaActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        VentanaAdministrarMaquinas obj = new VentanaAdministrarMaquinas(gym);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    
    public Sector retornaSector(int IDSector)
    {
        return gym.getListaSector().retornaSector(IDSector);
    }

    
    public boolean buscaMaquina(Sector sector, int IDMaquina)
    {
        if(sector.getListaMaquinas().verificaMaquina(IDMaquina))
        {
            return true;
        } 
        
       return false;
    }
    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIDMaquina;
    private javax.swing.JLabel jLabelIDSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldIDMaquina;
    private javax.swing.JTextField jTextFieldIDSector;
    // End of variables declaration//GEN-END:variables
}

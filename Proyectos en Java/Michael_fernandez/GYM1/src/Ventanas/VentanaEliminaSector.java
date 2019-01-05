
package Ventanas;

import gym.Archivos;
import gym.GYM;
import gym.ListaSector;
import javax.swing.JOptionPane;


public class VentanaEliminaSector extends javax.swing.JFrame {
   int id;
   private GYM gym;

    public VentanaEliminaSector(GYM gym) 
    {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Elimina Sector");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setPreferredSize(new java.awt.Dimension(1110, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, 30));

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(204, 204, 204));
        jLabelID.setText("ID:");
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Elimina Cliente");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 40));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setText("Atras");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 140, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         this.id = Integer.parseInt(this.jTextFieldID.getText());
         jTextFieldID.setText("");   
      
         if(eliminaCarpeta(id))
         {
             if(gym.getListaSector().eliminarSector(id))
             {
                 JOptionPane.showMessageDialog(null,"El sector se elimino correctamente");
             }
         }else
         {
             JOptionPane.showMessageDialog(null,"El sector no existe");
         }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    
    public boolean eliminaCarpeta(int id)
    { 
        if(gym.getListaSector().verificaID(id))
        {
            
            if(gym.getArchivos().eliminarTxtSector(gym.getListaSector().retornaSector(id)))
            {   System.out.println("asdasdasdasdasd");
                return true;
            }  
        }
      return false;
    }
   
    
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
            VentanaAdministrarSector obj = new VentanaAdministrarSector(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}

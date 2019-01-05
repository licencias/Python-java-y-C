
package Ventanas;
import gym.Archivos;
import gym.GYM;
import gym.ListaCliente;
import javax.swing.JOptionPane;


public class VentanaEliminaCliente extends javax.swing.JFrame {
   ListaCliente lista = new ListaCliente(); 
   Archivos archivos = new Archivos();
   private GYM gym ;
   private String Rut;

    public VentanaEliminaCliente(GYM gym) {
        this.gym = gym;
        lista = gym.getListaCliente();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Elimina Cliente");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabelGYM = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Elimina Cliente");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        jLabelRut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(204, 204, 204));
        jLabelRut.setText("Ingrese Rut:");
        getContentPane().add(jLabelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, 20));
        getContentPane().add(jTextFieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, 40));

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 150, 40));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/374-runner-silhouette-vector-graphics.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelFondo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        jLabelFondo.setText("Elimina Cliente");
        jLabelFondo.setMaximumSize(new java.awt.Dimension(1840, 1006));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(1840, 1006));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        this.Rut = jTextFieldRut.getText();
        jTextFieldRut.setText("");
        
        if(!eliminaCarpeta(Rut))
        {
           JOptionPane.showMessageDialog(null,"El usuario nose pudo eliminar");
        }else
        {
            if(lista.eliminaCliente(Rut))
            {
            JOptionPane.showMessageDialog(null,"El usuario se elimino correctamente");
            }
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    public boolean eliminaCarpeta(String Rut)
    {
        if(!lista.verificaCliente(Rut))
        {
            if(archivos.eliminarTxtCliente(lista.buscaCliente(Rut)))
            {
                return true;
            }
        }
      return false;
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
            VentanaAdministrador obj = new VentanaAdministrador(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldRut;
    // End of variables declaration//GEN-END:variables
}

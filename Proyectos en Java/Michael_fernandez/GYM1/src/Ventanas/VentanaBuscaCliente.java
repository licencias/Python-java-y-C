
package Ventanas;

import gym.Cliente;
import gym.GYM;
import gym.ListaCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentanaBuscaCliente extends javax.swing.JFrame {
   private GYM gym ;
   private String Rut;
 
 
    public VentanaBuscaCliente(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Busca cliente");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituto = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaInformacion = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabelGYM = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituto.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTituto.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTituto.setText("Busca Cliente");
        getContentPane().add(jLabelTituto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabelRut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(204, 204, 204));
        jLabelRut.setText("Ingrese Rut: ");
        getContentPane().add(jLabelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));
        getContentPane().add(jTextFieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        jScrollPane1.setViewportView(jListaInformacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 410, 190));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, 40));

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 150, 40));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/-expander-fitness-trainer-fitness-room-gym-gymnastic-health-512-17.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 280, 590, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 583));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        this.Rut = jTextFieldRut.getText();
        
        jTextFieldRut.setText("");
        
        mostrarCliente(buscador());
 
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
            VentanaAdministrador obj = new VentanaAdministrador(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    public void mostrarCliente(Cliente Aux)
    {
            ArrayList<Cliente> lista = gym.getListaCliente().getArrayCliente();
            javax.swing.DefaultListModel modelo;
            modelo = new javax.swing.DefaultListModel<>();
            
           
                  modelo.addElement("Nombre: " + Aux.getNombre());
                  modelo.addElement("Rut: " + Aux.getRut());
                  modelo.addElement("Constraseña: " + Aux.getContraseña());
                  modelo.addElement("Direccion: " + Aux.getDireccion());
                  modelo.addElement("Telefono: " + Aux.getTelefono());
                  modelo.addElement("Plan: " + Aux.getPlan());
              
              jListaInformacion.setModel(modelo);
    }
    
    public Cliente buscador()
    {
         if(!gym.getListaCliente().verificaCliente(this.Rut))
         {
             return gym.getListaCliente().buscaCliente(this.Rut);
            
         }
        return null;
    }

    public static void main(String args[]) {


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTituto;
    private javax.swing.JList<String> jListaInformacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldRut;
    // End of variables declaration//GEN-END:variables
}


package Ventanas;
import gym.Cliente;
import gym.GYM;
import java.util.ArrayList;
import javax.swing.JFrame;



public class VentanaAdministrador extends javax.swing.JFrame
{

  private GYM gym; 

   
    public VentanaAdministrador(GYM gym) 
    {
            
        this.gym = gym;     
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrador de clientes");
    }
    
    public VentanaAdministrador()
    {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVentanaAgregar = new javax.swing.JButton();
        btnMostrarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaInformacion = new javax.swing.JList<>();
        btnBuscarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnModificaCliente = new javax.swing.JButton();
        jLabelGYM = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Administrador de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 550, 50));

        btnVentanaAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnVentanaAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVentanaAgregar.setText("Agregar Cliente");
        btnVentanaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentanaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 170, 40));

        btnMostrarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnMostrarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMostrarCliente.setText("Mostrar Clientes");
        btnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));

        jScrollPane1.setViewportView(jListaInformacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 470, 220));

        btnBuscarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 170, 40));

        btnEliminarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 170, 40));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrar.setText("Atras");
        btnCerrar.setToolTipText("");
        btnCerrar.setActionCommand("Cerrar seccion");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 40));

        btnModificaCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnModificaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificaCliente.setText("Modifica Cliente");
        getContentPane().add(btnModificaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 170, 40));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bar_sports_2985.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 420, 410));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(1290, 630));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(1100, 630));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(1100, 550));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentanaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaAgregarActionPerformed

            VentanaIngresaCliente obj = new VentanaIngresaCliente(gym);
            obj.setVisible(true);
            dispose();

    }//GEN-LAST:event_btnVentanaAgregarActionPerformed

    private void btnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClienteActionPerformed
            javax.swing.DefaultListModel modelo;
            
            ArrayList<Cliente> arreglo = gym.getListaCliente().getArrayCliente();
            
            modelo = new javax.swing.DefaultListModel<>();
              modelo.addElement("Nombre - Rut");
              modelo.addElement("\n");
              
              for(int i=0; i<arreglo.size(); i++)
              {
                  modelo.addElement(arreglo.get(i).getNombre()+ " - " +arreglo.get(i).getRut());
              }
              
              jListaInformacion.setModel(modelo);
    }//GEN-LAST:event_btnMostrarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
            VentanaBuscaCliente obj = new VentanaBuscaCliente(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
            VentanaEliminaCliente obj = new VentanaEliminaCliente(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
            VentanaPrincipal obj = new VentanaPrincipal(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificaCliente;
    private javax.swing.JButton btnMostrarCliente;
    private javax.swing.JButton btnVentanaAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JList<String> jListaInformacion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

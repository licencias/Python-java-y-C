
package Ventanas;

import gym.Archivos;
import gym.Cliente;
import gym.GYM;
import gym.ListaCliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaIngresaCliente extends javax.swing.JFrame {
   private GYM gym;
   private String Nombre;
   private String Rut;
   private String Contraseña;
   private String Direccion;
   private int Telefono;
   private String Plan;
   
  
    public VentanaIngresaCliente(GYM gym) 
    {
        this.gym = gym;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agrega Cliente");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelPlan = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldRut = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldPlan = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelImagenGYM = new javax.swing.JLabel();
        jLabeImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 450));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 40));

        jLabelRut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(204, 204, 204));
        jLabelRut.setText("Rut:");
        getContentPane().add(jLabelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDireccion.setText("Direccion:");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTelefono.setText("Telefono:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabelPlan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPlan.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPlan.setText("Plan:");
        getContentPane().add(jLabelPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 30));
        getContentPane().add(jTextFieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, 30));
        getContentPane().add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 30));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 190, 30));
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, 30));
        getContentPane().add(jTextFieldPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 190, 30));

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(63, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 140, 40));

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnSalir.setText("Atras");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 140, 40));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Agrega cliente");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 310, -1));

        jLabelImagenGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/exer.png"))); // NOI18N
        getContentPane().add(jLabelImagenGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        jLabeImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        jLabeImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabeImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       this.Nombre = this.jTextFieldNombre.getText();
       this.Rut = this.jTextFieldRut.getText();
       this.Contraseña = this.jTextFieldContraseña.getText();
       this.Direccion = this.jTextFieldDireccion.getText();
       this.Telefono = Integer.parseInt(this.jTextFieldTelefono.getText());
       this.Plan = this.jTextFieldPlan.getText();
       
       borraPalabras();
       try {
           agregaCarpetaCliente();
       } catch (IOException ex) {
           Logger.getLogger(VentanaIngresaCliente.class.getName()).log(Level.SEVERE, null, ex);
       }
       agregaCliente();
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            VentanaAdministrador obj = new VentanaAdministrador(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void borraPalabras()
    {
        jTextFieldContraseña.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldNombre.setText("");
        jTextFieldPlan.setText("");
        jTextFieldRut.setText("");
        jTextFieldTelefono.setText("");
        
    }
    
    
    public void agregaCliente()
    {
   
        
        if(gym.getListaCliente().agregaCliente(TraspasaDatos()))
        {
            JOptionPane.showMessageDialog(null,"El usuario "+this.Nombre+" se agrego correctamente");
        }else
        {
            JOptionPane.showMessageDialog(null,"El usuario "+this.Nombre+" no se pudo agregar");
        }
    }  
        
    public void agregaCarpetaCliente() throws IOException
    {
        gym.getArchivos().actualizarTxtCliente(TraspasaDatos());
    }
        
    public Cliente TraspasaDatos()
    {
        Cliente Nuevo = new Cliente(this.Nombre, this.Rut, this.Contraseña, this.Direccion, this.Telefono, this.Plan);
     
        return Nuevo;
    }
 
    public static void main(String args[]) {


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabeImagen;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelImagenGYM;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPlan;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPlan;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

}

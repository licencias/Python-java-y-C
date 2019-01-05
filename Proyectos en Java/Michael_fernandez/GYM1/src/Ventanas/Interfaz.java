
package Ventanas;


import gym.GYM;
import gym.ListaCliente;
import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame 
{
    private String Rut;
    private String Contraseña;
    private GYM gym;
   
   
    public Interfaz()
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Pricipal"); 
        
    }
    
    
    public Interfaz(GYM gym)
    {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Pricipal");  
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabelRut = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabelMancuerna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 160, 40));

        jLabelRut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(204, 204, 204));
        jLabelRut.setText("Cuenta:");
        jLabelRut.setToolTipText("");
        getContentPane().add(jLabelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 40));

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, 30));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTitulo.setText("UnLimited GYM");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 400, 50));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 30));

        btnIngresar.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(63, 25));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, 40));

        jLabelMancuerna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/asdasdas.png"))); // NOI18N
        jLabelMancuerna.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jLabelMancuerna, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -100, 620, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Captura21.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 190));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        this.Rut = this.jTextRut.getText();
        this.Contraseña = this.jPassword.getText();
         
        if(verificaAdmi(this.Rut,this.Contraseña))
        {
            VentanaPrincipal obj = new VentanaPrincipal(gym);
            obj.setVisible(true);
            dispose();
            
            jTextRut.setText("");
            jPassword.setText("");
            
        }else
        {
            if(gym.getListaCliente().verificaCliente(Rut, Contraseña))
            {
                VentanaUsuario obj = new VentanaUsuario();
                obj.setVisible(true);
                dispose();
            
               jTextRut.setText("");
               jPassword.setText("");
               
            }else
            {
               JOptionPane.showMessageDialog(null,"El Rut "+this.Rut+" no pudo iniciar sesión ");
            }
               jTextRut.setText("");
               jPassword.setText("");
            
        }
        

    }

    private boolean verificaAdmi(String Rut, String Contraseña)
    {
        if(Rut.equals("Admi") && Contraseña.equals("1234p"))
        {
            return true;
        }
      return false;
    }//GEN-LAST:event_btnIngresarActionPerformed
    
    
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
    }//GEN-LAST:event_btnIngresarMouseClicked


    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMancuerna;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextRut;
    // End of variables declaration//GEN-END:variables
}

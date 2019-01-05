package Ventanas;

import gym.GYM;
import gym.Maquinas;
import gym.Sector;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaAgregarMaquina extends javax.swing.JFrame {

    private int IDMaquina;
    private int IDSector;
    private String Nombre;
    private int Telefono;
    private String Marca;
    private GYM gym;
    

    public VentanaAgregarMaquina(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agregar Maquina");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIDMaquina = new javax.swing.JLabel();
        jLabelIDSector = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldIDMaquina = new javax.swing.JTextField();
        jTextFieldIDSector = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIDMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIDMaquina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIDMaquina.setForeground(new java.awt.Color(204, 204, 204));
        jLabelIDMaquina.setText("ID Maquina:");
        getContentPane().add(jLabelIDMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabelIDSector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIDSector.setForeground(new java.awt.Color(204, 204, 204));
        jLabelIDSector.setText("ID Sector:");
        getContentPane().add(jLabelIDSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMarca.setText("Marca:");
        getContentPane().add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTelefono.setText("Telefono:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        getContentPane().add(jTextFieldIDMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, 30));
        getContentPane().add(jTextFieldIDSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, 30));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 210, 30));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 210, 30));
        getContentPane().add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 210, 30));

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 160, 40));

        jButtonAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 160, 40));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Agregar Maquina");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        this.IDMaquina = Integer.parseInt(jTextFieldIDMaquina.getText());
        this.IDSector = Integer.parseInt(jTextFieldIDSector.getText());
        this.Nombre = jTextFieldNombre.getText();
        this.Telefono = Integer.parseInt(jTextFieldTelefono.getText());
        this.Marca = jTextFieldMarca.getText();
        
        Limpiar();
        
        
        if(verificaSector(IDSector))
        {
            if(!retornaSector(IDSector).getListaMaquinas().verificaMaquina(IDMaquina))
            {
               try {
                 gym.getArchivos().actualizarTxtMaquinas(creaMaquina());
                   if(retornaSector(IDSector).getListaMaquinas().agregarMaquina(creaMaquina()))
                   {
                       JOptionPane.showMessageDialog(null,"La maquina se agrego correctamente");
                   }
               } catch (IOException ex) {
                 Logger.getLogger(VentanaAgregarMaquina.class.getName()).log(Level.SEVERE, null, ex);
               }
            }else
            {
                JOptionPane.showMessageDialog(null,"La ID "+IDMaquina+" de la maquina ya existe");
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"El usuario sector "+IDSector+" no existe");
        }
        
           
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    public void Limpiar()
    {
        jTextFieldIDMaquina.setText("");
        jTextFieldIDSector.setText("");
        jTextFieldMarca.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTelefono.setText("");
    }
    
    
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        VentanaAdministrarMaquinas obj = new VentanaAdministrarMaquinas(gym);
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    
    public boolean verificaSector(int id)
    {
        if(gym.getListaSector().verificaID(id))
        {
            return true;
        }
      return false;
    }
    
    
    public Sector retornaSector(int id)
    {
        return gym.getListaSector().retornaSector(id);
    }
        
    
    public Maquinas creaMaquina()
    {
        Maquinas Nuevo = new Maquinas(IDMaquina,IDSector,Nombre,Telefono,Marca);
        return Nuevo;
    }

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIDMaquina;
    private javax.swing.JLabel jLabelIDSector;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldIDMaquina;
    private javax.swing.JTextField jTextFieldIDSector;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}

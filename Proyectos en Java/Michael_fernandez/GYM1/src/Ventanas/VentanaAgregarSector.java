
package Ventanas;

import gym.Archivos;
import gym.GYM;
import gym.ListaSector;
import gym.Sector;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaAgregarSector extends javax.swing.JFrame {
   private GYM gym;
   
   
    private String Nombre;
    private int ID;
    private String Tipo;
    
    public VentanaAgregarSector(GYM gym) {
        this.gym = gym;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agrega Sector");
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAgregaSector = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelGYM = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 450));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAgregaSector.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelAgregaSector.setForeground(new java.awt.Color(204, 204, 204));
        jLabelAgregaSector.setText("Agregar Sector");
        getContentPane().add(jLabelAgregaSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 40));

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(204, 204, 204));
        jLabelID.setText("ID:");
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Tipo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 30));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 170, 30));
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 170, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 140, 40));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gfhfgh.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Nombre = this.jTextFieldNombre.getText();
        this.ID = Integer.parseInt(this.jTextFieldID.getText());
        this.Tipo = this.jTextFieldTipo.getText();
        
        Limpiar();
        
        
            if(verificaSector(Nombre,ID,Tipo)){
                
                if(agregaSector(traspasaDatos()))
                {
                    try {
                        agregarCarpetaSector();
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaAgregarSector.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   JOptionPane.showMessageDialog(null,"El sector "+this.Nombre+" se agrego correctamente");
                    
                }else
                {
                    JOptionPane.showMessageDialog(null,"El sector "+this.Nombre+" no se pudo agregar");
                }
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void Limpiar()
    {
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTipo.setText("");
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            VentanaAdministrarSector obj = new VentanaAdministrarSector(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void agregarCarpetaSector() throws IOException
    {
        gym.getArchivos().actualizarTxtSector(traspasaDatos());
    }
    
    
    public boolean agregaSector(Sector sec)
    {
        if(gym.getListaSector().agregarSector(sec))
        {
            return true;
        }
      return false;
    }
    
    
    
    public Sector traspasaDatos()
    {
        Sector Nuevo = new Sector(this.Nombre, this.ID, this.Tipo);
        return Nuevo;
    }
    
    
    
    public boolean verificaMayuscula(String Nombre) //akjdhaskjdahskjdahd
    {
        String Mayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           
        for(int i=0; i<Mayuscula.length(); i++)
        {
            if(Mayuscula.contentEquals(Nombre))
            {
                return true;
            } 
        }
        return false;
    }
    
    
    
    
    
    
    
    public boolean verificaSector(String Nombre, int ID, String Tipo)
    {
        if(!gym.getListaSector().verificaNombre(Nombre))
        {
            if(!gym.getListaSector().verificaID(ID))
            {
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La ID "+this.ID+" ya existe");
                return false;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El sector "+this.Nombre+" ya existe ");           
        }
      return false;
    }
    
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgregaSector;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
}

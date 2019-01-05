
package Ventanas;

import gym.GYM;
import gym.ListaMaquinas;
import gym.Sector;
import javax.swing.JOptionPane;


public class VentanaMostrarMaquinas extends javax.swing.JFrame {
   private GYM gym;
   private int IDSector;

    public VentanaMostrarMaquinas(GYM gym) {
        this.gym = gym;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Mostrar Maquina");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaMostrarMaquinas = new javax.swing.JList<>();
        jLabelTitulo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(204, 204, 204));
        jLabelID.setText("Ingrese ID sector:");
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, 30));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, 40));

        jScrollPane1.setViewportView(jListaMostrarMaquinas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 190, 420, 240));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("Mostrar Maquinas");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 150, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1101, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.IDSector = Integer.parseInt(jTextFieldID.getText());
        jTextFieldID.setText("");
        

           
           if(gym.getListaSector().verificaID(IDSector))
           {
                if(retornaSector(IDSector)!=null)
                {
                  ListaMaquinas lista = retornaSector(IDSector).getListaMaquinas();
                  
                  javax.swing.DefaultListModel modelo;
                  modelo = new javax.swing.DefaultListModel<>();
                  modelo.addElement("ID - Nombre - Telefono - Marca");
                  
                      for(int i=0; i<lista.getArrayMaquinas().size(); i++)
                      {
                           modelo.addElement(lista.getArrayMaquinas().get(i).getIdMaquina()+ " - " + lista.getArrayMaquinas().get(i).getNombre()+" - "+lista.getArrayMaquinas().get(i).getTelefonoGarantia()+" - "+lista.getArrayMaquinas().get(i).getMarca());
                      }
              
             
                      jListaMostrarMaquinas.setModel(modelo);
                }
           }else
           {
               JOptionPane.showMessageDialog(null,"Sector no encontrado");
           }
          
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VentanaAdministrarMaquinas obj = new VentanaAdministrarMaquinas(gym);
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    
    
    public Sector retornaSector(int id)
    {
        return gym.getListaSector().retornaSector(id);
    }

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListaMostrarMaquinas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}

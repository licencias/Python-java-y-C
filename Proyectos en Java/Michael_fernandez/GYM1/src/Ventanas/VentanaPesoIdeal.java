package Ventanas;



public class VentanaPesoIdeal extends javax.swing.JFrame 
{
    
    public VentanaPesoIdeal() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Peso Ideal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALTURA (MTS)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 39, -1, 20));
        getContentPane().add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 41, 120, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 87, 100, 33));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 251, 100, 33));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 87, 100, 33));

        tfResultado.setEditable(false);
        tfResultado.setColumns(20);
        tfResultado.setRows(5);
        jScrollPane1.setViewportView(tfResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 497, 84));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaUsuario obj = new VentanaUsuario();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        tfAltura.setText("");
        tfResultado.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double altura;
        
        altura = Double.parseDouble(tfAltura.getText());
        
        double resultado = 0.75*(altura*100 - 150)+50;
           
 
        if(altura != 0)
        {   
           tfResultado.setText("Su peso ideal esta entre "+(resultado - 10)+" y "+(resultado+9));
        }
        else
        {
           tfResultado.setText("Oh no!, la altura debe ser distinta de 0");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[])
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextArea tfResultado;
    // End of variables declaration//GEN-END:variables
}

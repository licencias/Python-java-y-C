package Ventanas;




public class VentanaImc extends javax.swing.JFrame 
{

    public VentanaImc() 
    {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("IMC");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfResultado = new javax.swing.JTextArea();
        tfPeso = new javax.swing.JFormattedTextField();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("PESO (KG)");
        lblPeso.setToolTipText("");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 28, 77, 26));

        lblAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(255, 255, 255));
        lblAltura.setText("ALTURA (MTS)");
        lblAltura.setToolTipText("");
        getContentPane().add(lblAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 24));

        tfAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 72, 129, 27));

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 138, 100, 31));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 246, 119, 35));

        tfResultado.setEditable(false);
        tfResultado.setColumns(20);
        tfResultado.setRows(5);
        jScrollPane1.setViewportView(tfResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 175, 527, 65));

        tfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoActionPerformed(evt);
            }
        });
        getContentPane().add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 28, 129, 26));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 138, 104, 31));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Más sobre I.M.C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 246, 151, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gTvImpO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlturaActionPerformed
       
    }//GEN-LAST:event_tfAlturaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double peso;
        double altura;
        
        peso = Double.parseDouble(tfPeso.getText());
        altura = Double.parseDouble(tfAltura.getText());
        
        double resultado = (peso/(altura*altura));
           
 
        if(altura != 0)
        {   
            if(resultado < 18.5)
            {
                tfResultado.setText("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +"\n Se encuentra bajo peso, el riesgo es moderado");
            }
            else
            {
                if(resultado < 25)
                {
                    
                        tfResultado.setText(String.valueOf("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +" \nSe encuentra peso normal, su peso es sano"));
                }
                else
                {
                    if(resultado < 30)
                    {
                        tfResultado.setText(String.valueOf("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +" \nSe encuentra sobre peso, el riesgo es leve"));
                    }
                    else
                    {
                        if(resultado < 35)
                        {
                            tfResultado.setText(String.valueOf("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +" \nSe encuentra en obesidad grado 1, su riesgo es alto a largo plazo plazo"));
                        }
                        else
                        {
                            if(resultado < 40)
                            {
                                tfResultado.setText(String.valueOf("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +"\nSe encuentra en obesidad grado 2, su riesgo es alto a corto plazo"));
                            }
                            else
                            {
                                tfResultado.setText(String.valueOf("Su índice de masa corporal es : "+String.valueOf(resultado)
                                       +" \nSe encuentra en obesidad grado 3, su riesdo es alto a corto plazo, probabilidad de ser mortal"));
                            }
                        }
                    }      
                }
            }
        }
        else
        {
           tfResultado.setText("Oh no!, la altura debe ser distinta de 0");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaUsuario obj = new VentanaUsuario();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoActionPerformed

    }//GEN-LAST:event_tfPesoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        tfPeso.setText("");
        tfAltura.setText("");
        tfResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImagenImc obj = new ImagenImc();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) 
    {    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JFormattedTextField tfPeso;
    private javax.swing.JTextArea tfResultado;
    // End of variables declaration//GEN-END:variables
}

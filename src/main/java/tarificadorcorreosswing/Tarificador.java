package tarificadorcorreosswing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.text.DecimalFormat;

/**
 * @date 26 nov. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Tarificador extends javax.swing.JFrame {

    protected double total;
    DecimalFormat df = new DecimalFormat ("#0.00");
    
    public Tarificador() {
        centrarVentana(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarificador de Correos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 254, 254));
        jPanel1.setForeground(new java.awt.Color(242, 243, 244));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"Nacional"}));

        jSpinner2.setModel(new javax.swing.SpinnerListModel(new String[] {"Ordinaria", "Certificada", "Urgente", "Urgente Certificada"}));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jSpinner3.setModel(new javax.swing.SpinnerListModel(new String[] {"Cartas", "Tarjetas Postales"}));
        jSpinner3.setBorder(null);
        jSpinner3.setRequestFocusEnabled(false);
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jRadioButton1.setText("Acuse de Recibo");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Valor Declarado");
        jRadioButton2.setEnabled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tipo de envío");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Modalidad");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Destino");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField2.setBackground(new java.awt.Color(234, 237, 237));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Introduce el valor");
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Introduzca el peso del envío en gramos");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        Estos if() buscan que valor tiene selecionado el Spinner y dependiendo 
        del valor devuelto asignan un valor x a la variable int total
        */
        if (jSpinner2.getValue() == "Ordinaria" ) {
            if (Integer.parseInt(jTextField1.getText()) > 0 &&
                Integer.parseInt(jTextField1.getText()) <= 20) {
                total = total + 0.70;
            } else if ( Integer.parseInt(jTextField1.getText()) > 20 &&
                Integer.parseInt(jTextField1.getText()) <= 50) {
                total = total + 0.80;
            } else if ( Integer.parseInt(jTextField1.getText()) > 50 &&
                Integer.parseInt(jTextField1.getText()) <= 100) {
                total = total + 1.25;
            } else if ( Integer.parseInt(jTextField1.getText()) > 100 &&
                Integer.parseInt(jTextField1.getText()) <= 500) {
                total = total + 2.50;
            } else if ( Integer.parseInt(jTextField1.getText()) > 500 &&
                Integer.parseInt(jTextField1.getText()) <= 1000) {
                total = total + 5.15;
            } else if ( Integer.parseInt(jTextField1.getText()) > 1000 &&
                Integer.parseInt(jTextField1.getText()) <= 2000) {
                total = total + 5.60;
            } else if ( Integer.parseInt(jTextField1.getText()) > 2000) {
                jTextField1.setText("Máximo de 2000 gramos");
            }  
        } else if (jSpinner2.getValue() == "Certificada" ) {
            if (Integer.parseInt(jTextField1.getText()) > 0 &&
                Integer.parseInt(jTextField1.getText()) <= 20) {
                total = total + 4.15;
            } else if ( Integer.parseInt(jTextField1.getText()) > 20 &&
                Integer.parseInt(jTextField1.getText()) <= 50) {
                total = total + 4.25;
            } else if ( Integer.parseInt(jTextField1.getText()) > 50 &&
                Integer.parseInt(jTextField1.getText()) <= 100) {
                total = total + 4.70;
            } else if ( Integer.parseInt(jTextField1.getText()) > 100 &&
                Integer.parseInt(jTextField1.getText()) <= 500) {
                total = total + 5.95;
            } else if ( Integer.parseInt(jTextField1.getText()) > 500 &&
                Integer.parseInt(jTextField1.getText()) <= 1000) {
                total = total + 8.60;
            } else if ( Integer.parseInt(jTextField1.getText()) > 1000 &&
                Integer.parseInt(jTextField1.getText()) <= 2000) {
                total = total + 9.05;
            } else if ( Integer.parseInt(jTextField1.getText()) > 2000) {
                jTextField1.setText("Máximo de 2000 gramos");
            }  
        } else if (jSpinner2.getValue() == "Urgente Certificada" ) {
            if (Integer.parseInt(jTextField1.getText()) <= 20 &&
                    Integer.parseInt(jTextField1.getText()) > 0) {
                total = total + 8.28;
            } else if ( Integer.parseInt(jTextField1.getText()) > 20 &&
                Integer.parseInt(jTextField1.getText()) <= 50) {
                total = total + 8.40;
            } else if ( Integer.parseInt(jTextField1.getText()) > 50 &&
                Integer.parseInt(jTextField1.getText()) <= 100) {
                total = total + 8.92;
            } else if ( Integer.parseInt(jTextField1.getText()) > 100 &&
                Integer.parseInt(jTextField1.getText()) <= 500) {
                total = total + 10.55;
            } else if ( Integer.parseInt(jTextField1.getText()) > 500 &&
                Integer.parseInt(jTextField1.getText()) <= 1000) {
                total = total + 14.00;
            } else if ( Integer.parseInt(jTextField1.getText()) > 1000 &&
                Integer.parseInt(jTextField1.getText()) <= 2000) {
                total = total + 14.58;
            } else if ( Integer.parseInt(jTextField1.getText()) > 2000) {
                jTextField1.setText("Máximo de 2000 gramos");
            }  
        }  else if (jSpinner2.getValue() == "Urgente" ) {
            if (Integer.parseInt(jTextField1.getText()) > 0 &&
                Integer.parseInt(jTextField1.getText()) <= 20) {
                total = total + 4.10;
            } else if ( Integer.parseInt(jTextField1.getText()) > 20 &&
                Integer.parseInt(jTextField1.getText()) <= 50) {
                total = total + 4.22;
            } else if ( Integer.parseInt(jTextField1.getText()) > 50 &&
                Integer.parseInt(jTextField1.getText()) <= 100) {
                total = total + 4.74;
            } else if ( Integer.parseInt(jTextField1.getText()) > 100 &&
                Integer.parseInt(jTextField1.getText()) <= 500) {
                total = total + 6.38;
            } else if ( Integer.parseInt(jTextField1.getText()) > 500) {
                jTextField1.setText("Máximo de 500 gramos");
            } 
        } 
        
        /*
        Este if() mira si el jRadioButton2 está seleccionado, si es así cálcula
        el 10% del Valor Declarado y se lo suma a la variable int total
        */
        if (jRadioButton2.isSelected()) {
            total = total + (Integer.parseInt(jTextField2.getText()) * 10 / 100);   
        }
        
        /*
        Este if() mira si el jRadioButton1 está seleccionado, si es así 
        le suma 1 a la variable int total
        */
        if (jRadioButton1.isSelected()) {
            total = total + 1.00;
        } 
        
        /*
        Se imprime el valor de la variable int total en el jLabel4
        Se imprime texto informativo en la variable jLabel5
        Se pone la variable int total a cero
        */
        jLabel4.setText(df.format(total) + " €");
        jLabel5.setText("El precio de tu envío es");
        total = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        /*
        Este if() mira si el jRadioButton2 está seleccionado, si es así 
        le dice es editable y le vacia de texto el jTextField2, si no es así 
        imprime texto informativo en el jTextField2
        */
        if (jRadioButton2.isSelected()) {
            jTextField2.setEnabled(true);
            jTextField2.setText(null);
        } else {
            jTextField2.setEnabled(false);
            jTextField2.setText("Introduce el valor");   
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        /*
        Este if() mira el valor del jSpinner2 y dependiendo del valor
        le dice a jRadioButton1 y jRadioButton2 que son Enable o no
        */
        if ("Urgente".equals(jSpinner2.getValue())) {
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
        } else if ("Ordinaria".equals(jSpinner2.getValue())) {
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);  
        } else if ("Certificada".equals(jSpinner2.getValue())) {
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
        } else if ("Urgente Certificada".equals(jSpinner2.getValue())) {
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jSpinner2StateChanged

    /*
    Este metodo me centra la pantalla en la ventana
    */
    public static void centrarVentana(Window frame) {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;	
	int width = pantalla.width;
	frame.setSize(width/2, height/2);
        frame.setLocationRelativeTo(null);
    }
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    /*
    Este metodo me vacía de texto el jTextField1
    */
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tarificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Tarificador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

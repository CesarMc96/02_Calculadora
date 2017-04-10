package Pantalla;

import Objetos.Notaciones;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAC = new javax.swing.JButton();
        BtnParentesisAbre = new javax.swing.JButton();
        BtnParentesisCierra = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnPotencia = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnRestar = new javax.swing.JButton();
        LblResultado = new javax.swing.JLabel();
        LblShutingYard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAC.setText("AC");
        BtnAC.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnAC.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnACActionPerformed(evt);
            }
        });

        BtnParentesisAbre.setText("(");
        BtnParentesisAbre.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnParentesisAbre.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnParentesisAbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParentesisAbreActionPerformed(evt);
            }
        });

        BtnParentesisCierra.setText(")");
        BtnParentesisCierra.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnParentesisCierra.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnParentesisCierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParentesisCierraActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn7.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn4.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn1.setText("1");
        Btn1.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn1.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn0.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn8.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn2.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn5.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn9.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn6.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.setMaximumSize(new java.awt.Dimension(90, 90));
        Btn3.setMinimumSize(new java.awt.Dimension(90, 90));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        BtnPotencia.setText("^");
        BtnPotencia.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnPotencia.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPotenciaActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setText("x");
        BtnMultiplicacion.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnMultiplicacion.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnIgual.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnDivision.setText("/");
        BtnDivision.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnDivision.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnSuma.setText("+");
        BtnSuma.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnSuma.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnRestar.setText("-");
        BtnRestar.setMaximumSize(new java.awt.Dimension(90, 90));
        BtnRestar.setMinimumSize(new java.awt.Dimension(90, 90));
        BtnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestarActionPerformed(evt);
            }
        });

        LblResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnParentesisAbre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnParentesisCierra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblShutingYard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblShutingYard, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnParentesisAbre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnParentesisCierra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        LblResultado.setText(LblResultado.getText() + "0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        LblResultado.setText(LblResultado.getText() + "1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        LblResultado.setText(LblResultado.getText() + "2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        LblResultado.setText(LblResultado.getText() + "3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        LblResultado.setText(LblResultado.getText() + "4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        LblResultado.setText(LblResultado.getText() + "5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        LblResultado.setText(LblResultado.getText() + "6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        LblResultado.setText(LblResultado.getText() + "7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        LblResultado.setText(LblResultado.getText() + "8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        LblResultado.setText(LblResultado.getText() + "9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnACActionPerformed
        LblResultado.setText("");
    }//GEN-LAST:event_BtnACActionPerformed

    private void BtnParentesisAbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParentesisAbreActionPerformed
        LblResultado.setText(LblResultado.getText() + "(");
    }//GEN-LAST:event_BtnParentesisAbreActionPerformed

    private void BtnParentesisCierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParentesisCierraActionPerformed
        LblResultado.setText(LblResultado.getText() + ")");
    }//GEN-LAST:event_BtnParentesisCierraActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        LblResultado.setText(LblResultado.getText() + "/");
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
        LblResultado.setText(LblResultado.getText() + "*");
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    private void BtnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestarActionPerformed
        LblResultado.setText(LblResultado.getText() + "-");
    }//GEN-LAST:event_BtnRestarActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        LblResultado.setText(LblResultado.getText() + "+");
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        Notaciones notaciones = new Notaciones();
        try {
            System.out.println(notaciones.convertirPostfija(LblResultado.getText()));
            JOptionPane.showMessageDialog(Btn0, "El resultado del algoritmo en shunting yard sale en la consola.");
        } catch (Exception ex) {
            Logger.getLogger(Notaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPotenciaActionPerformed
        LblResultado.setText(LblResultado.getText() + "^");
    }//GEN-LAST:event_BtnPotenciaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnAC;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnParentesisAbre;
    private javax.swing.JButton BtnParentesisCierra;
    private javax.swing.JButton BtnPotencia;
    private javax.swing.JButton BtnRestar;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JLabel LblShutingYard;
    // End of variables declaration//GEN-END:variables
}

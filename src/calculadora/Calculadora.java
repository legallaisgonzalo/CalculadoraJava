/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author Gonzalo
 */
public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
   
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textResul = new javax.swing.JLabel();
        textOper = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPorc = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPnt = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textResul.setBackground(new java.awt.Color(255, 255, 255));
        textResul.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textResul.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textResul.setText("0");
        textResul.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 40));

        textOper.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        textOper.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textOper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPorc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnPorc.setText("%");
        btnPorc.setHideActionText(true);
        btnPorc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPorc.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, 50));

        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnC.setText("C");
        btnC.setHideActionText(true);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnC.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btnMult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMult.setText("*");
        btnMult.setHideActionText(true);
        btnMult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMult.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        jPanel2.add(btnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 50));

        btnPot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnPot.setText("^");
        btnPot.setHideActionText(true);
        btnPot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPot.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotActionPerformed(evt);
            }
        });
        jPanel2.add(btnPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        btnDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnDiv.setText("/");
        btnDiv.setHideActionText(true);
        btnDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnDiv.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel2.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 50));

        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnNueve.setText("9");
        btnNueve.setHideActionText(true);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnNueve.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, 50));

        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnOcho.setText("8");
        btnOcho.setHideActionText(true);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnOcho.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, 50));

        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSiete.setText("7");
        btnSiete.setHideActionText(true);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnSiete.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMas.setText("+");
        btnMas.setHideActionText(true);
        btnMas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel2.add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, 50));

        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnTres.setText("3");
        btnTres.setHideActionText(true);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnTres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 50));

        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnDos.setText("2");
        btnDos.setHideActionText(true);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnDos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, 50));

        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnUno.setText("1");
        btnUno.setHideActionText(true);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnUno.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setHideActionText(true);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnCuatro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCinco.setText("5");
        btnCinco.setHideActionText(true);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnCinco.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 50));

        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSeis.setText("6");
        btnSeis.setHideActionText(true);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnSeis.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 50));

        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMenos.setText("-");
        btnMenos.setHideActionText(true);
        btnMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMenos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 50, 50));

        btnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCero.setText("0");
        btnCero.setHideActionText(true);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnCero.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 50));

        btnPnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPnt.setText(".");
        btnPnt.setHideActionText(true);
        btnPnt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPnt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnPnt.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPntActionPerformed(evt);
            }
        });
        jPanel2.add(btnPnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 50));

        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setHideActionText(true);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1a.png"))); // NOI18N
        btnIgual.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 250, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btnPorcActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        textOper.setText(""); 
        textResul.setText("0");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        addNumber("*");
        
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotActionPerformed
        String texto = textOper.getText().substring(0,textOper.getText().length()-1);
        textOper.setText(texto);
    }//GEN-LAST:event_btnPotActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        addNumber("/");
        
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        addNumber("9");
        btnIgual.doClick();
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        addNumber("8");
        btnIgual.doClick();
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        addNumber("7");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        addNumber("3");
        btnIgual.doClick();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        addNumber("2");
        btnIgual.doClick();
        
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        addNumber("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        addNumber("4");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        addNumber("5");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        addNumber("6");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        addNumber("0");
        btnIgual.doClick();
        
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPntActionPerformed
        addNumber(".");
        
    }//GEN-LAST:event_btnPntActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try{
            String resultado = se.eval(textOper.getText()).toString();
            textResul.setText(resultado);
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumber (String digito){
        textOper.setText(textOper.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPnt;
    private javax.swing.JButton btnPorc;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textOper;
    private javax.swing.JLabel textResul;
    // End of variables declaration//GEN-END:variables
}

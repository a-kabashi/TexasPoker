/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.texaspoker;

/**
 *
 * @author tasni
 */
public class Game_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Game_Interface
     */
    public Game_Interface(String player1_name, int p1_buy_in_amount, String player2_name, int p2_buy_in_amount) {
        initComponents();
        Player1_Name.setText(player1_name);
        Player1_BuyInAmount.setText(p1_buy_in_amount + "");
        Player2_Name.setText(player2_name);
        Player2_BuyInAmount.setText(p2_buy_in_amount + "");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1_Exit = new javax.swing.JButton();
        jButton2_Restart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Raise_Player1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Player1_Name = new javax.swing.JLabel();
        Player1_BuyInAmount = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        Raise_Player2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Player2_Name = new javax.swing.JLabel();
        Player2_BuyInAmount = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Texas Poker Game");

        jLabel1.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Texas Poker");

        jButton1_Exit.setBackground(new java.awt.Color(255, 0, 0));
        jButton1_Exit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1_Exit.setForeground(new java.awt.Color(255, 255, 0));
        jButton1_Exit.setText("Exit");
        jButton1_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ExitActionPerformed(evt);
            }
        });

        jButton2_Restart.setBackground(new java.awt.Color(0, 153, 0));
        jButton2_Restart.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2_Restart.setForeground(new java.awt.Color(255, 255, 0));
        jButton2_Restart.setText("Restart");
        jButton2_Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_RestartActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Fold");

        jButton4.setBackground(new java.awt.Color(153, 0, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Call");

        Raise_Player1.setBackground(new java.awt.Color(153, 0, 204));
        Raise_Player1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Raise_Player1.setForeground(new java.awt.Color(255, 255, 0));
        Raise_Player1.setText("Raise");
        Raise_Player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raise_Player1_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player-1 Name   :");

        jLabel3.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buy-In Amount  :");

        Player1_Name.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Player1_Name.setForeground(new java.awt.Color(255, 255, 0));

        Player1_BuyInAmount.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Player1_BuyInAmount.setForeground(new java.awt.Color(255, 255, 0));

        jButton6.setBackground(new java.awt.Color(153, 0, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Call");

        Raise_Player2.setBackground(new java.awt.Color(153, 0, 204));
        Raise_Player2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Raise_Player2.setForeground(new java.awt.Color(255, 255, 0));
        Raise_Player2.setText("Raise");
        Raise_Player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raise_Player2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player-2 Name   :");

        jLabel7.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buy-In Amount  :");

        jButton8.setBackground(new java.awt.Color(153, 0, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Fold");

        Player2_Name.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Player2_Name.setForeground(new java.awt.Color(255, 255, 0));

        Player2_BuyInAmount.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Player2_BuyInAmount.setForeground(new java.awt.Color(255, 255, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Dealer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Raise_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Player1_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Player1_BuyInAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Raise_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Player2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Player2_BuyInAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jButton2_Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2_Restart)
                            .addComponent(jButton1_Exit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(Raise_Player1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(Raise_Player2)
                        .addComponent(jButton8)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Player1_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Player2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Player1_BuyInAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Player2_BuyInAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1_ExitActionPerformed

    private void jButton2_RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_RestartActionPerformed
        // TODO add your handling code here:
        this.dispose();
        //Settings_Interface2 frame = new Settings_Interface2();
        //frame.setVisible(true);
    }//GEN-LAST:event_jButton2_RestartActionPerformed

    private void Raise_Player1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raise_Player1_ActionPerformed
          // TODO add your handling code here:
          String Player1_BuyInAmount = this.Player1_BuyInAmount.getText();
          Player1_RaiseAction_InternalFrame internalFrame = new Player1_RaiseAction_InternalFrame();
          internalFrame.setVisible(true);
          
          
   
    }//GEN-LAST:event_Raise_Player1_ActionPerformed

    private void Raise_Player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raise_Player2ActionPerformed
        // TODO add your handling code here:
        Player2_RaiseAction_InternalFrame internalFrame = new Player2_RaiseAction_InternalFrame();
        //this.add(internalFrame);
        internalFrame.setVisible(true);
        //internalFrame.show();
    }//GEN-LAST:event_Raise_Player2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Game_Interface().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Player1_BuyInAmount;
    private javax.swing.JLabel Player1_Name;
    private javax.swing.JLabel Player2_BuyInAmount;
    private javax.swing.JLabel Player2_Name;
    private javax.swing.JButton Raise_Player1;
    private javax.swing.JButton Raise_Player2;
    private javax.swing.JButton jButton1_Exit;
    private javax.swing.JButton jButton2_Restart;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

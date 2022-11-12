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
    public Game_Interface(String player1_name, double p1_buy_in_amount, String player2_name, double p2_buy_in_amount) {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1_Exit = new javax.swing.JButton();
        jButton2_Restart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5_Raise = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Player1_Name = new javax.swing.JLabel();
        Player1_BuyInAmount = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
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

        jButton5_Raise.setBackground(new java.awt.Color(153, 0, 204));
        jButton5_Raise.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton5_Raise.setForeground(new java.awt.Color(255, 255, 0));
        jButton5_Raise.setText("Raise");
        jButton5_Raise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_Raise_ActionPerformed(evt);
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

        jButton7.setBackground(new java.awt.Color(153, 0, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Raise");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButton2_Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5_Raise, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Player1_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Player2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(Player1_BuyInAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Player2_BuyInAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(jButton2_Restart)
                    .addComponent(jButton1_Exit))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5_Raise)
                    .addComponent(jButton8)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
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
                .addContainerGap(50, Short.MAX_VALUE))
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
        Settings_Interface2 frame = new Settings_Interface2();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2_RestartActionPerformed

    private void jButton5_Raise_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_Raise_ActionPerformed
          // TODO add your handling code here:
          Player1_RaiseAction_InternalFrame internalFrame = new Player1_RaiseAction_InternalFrame();
          this.add(internalFrame);
          internalFrame.show();
   
    }//GEN-LAST:event_jButton5_Raise_ActionPerformed

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
    private javax.swing.JButton jButton1_Exit;
    private javax.swing.JButton jButton2_Restart;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5_Raise;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

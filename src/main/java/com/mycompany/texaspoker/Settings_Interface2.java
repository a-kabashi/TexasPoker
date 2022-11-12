/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.texaspoker;

import java.awt.Color;



/**
 *
 * @author tasni
 */
public class Settings_Interface2 extends javax.swing.JFrame {

    /**
     * Creates new form Settings_Interface2
     */
    public Settings_Interface2() {
        initComponents();
        //setDefaultCloseOperation(Settings_Interface2.EXIT_ON_CLOSE);
                 /*ImageIcon background=new ImageIcon("C:\\Users\\tasni\\OneDrive\\Desktop\\bg_image.JPG");
                 Image img=background.getImage();
                 Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
                 background=new ImageIcon(temp);
                 JLabel back=new JLabel(background);
                 //back.setLayout(null);
                 back.setBounds(0,0,500,600);*/
         
          
    }
    
    /*public void windowClosing(WindowEvent e) {    
    dispose();    
         }    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Texas Poker Setting Interface 2");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Player-1 Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 50, 130, 19);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Player-1 Buy-In Amount");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 90, 176, 19);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Player-2 Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 130, 130, 19);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Player-2 Buy-In Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 170, 180, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 50, 110, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(450, 90, 70, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(410, 130, 110, 22);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(450, 170, 70, 22);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 285, 100, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 285, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\tasni\\Downloads\\bg_image.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 560, 380);

        setSize(new java.awt.Dimension(554, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String player1_Name = jTextField1.getText();
        
        String player1_BuyInAmount = jTextField2.getText();
        double d_player1_BuyInAmount = Double.parseDouble(player1_BuyInAmount);
        
        String player2_Name = jTextField3.getText();
        
        String player2_BuyInAmount = jTextField4.getText();
        double d_player2_BuyInAmount = Double.parseDouble(player2_BuyInAmount);
        
        Game_Interface game = new Game_Interface(player1_Name,d_player1_BuyInAmount,player2_Name,d_player2_BuyInAmount);
        //Color color = new Color(180, 192 ,250);
        //Color color = new Color(84, 151 ,220);
        //Color color = new Color(35, 67 ,170);
        Color color = new Color(10, 14 ,147);
        game.getContentPane().setBackground(color);
        game.setVisible(true);
       
        //System.exit(0);
        //Settings_Interface2 frame = new Settings_Interface2();
        //frame.setDefaultCloseOperation(Settings_Interface2.DISPOSE_ON_CLOSE);
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:  
           System.exit(0);
                
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(Settings_Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Settings_Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Settings_Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Settings_Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Settings_Interface2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

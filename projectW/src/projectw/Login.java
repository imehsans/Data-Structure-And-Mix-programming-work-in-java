/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;

import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {
    Hostel_Mng_Sys obj;
    Login ob;
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unmlb = new javax.swing.JLabel();
        unm = new javax.swing.JTextField();
        paslbl = new javax.swing.JLabel();
        pas = new javax.swing.JPasswordField();
        lgnbtn = new javax.swing.JButton();
        bkbtn = new javax.swing.JButton();
        extbtn = new javax.swing.JButton();
        picback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("LOG IN  TO :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 19, 350, 60);

        jLabel5.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("HOSTEL  MANAGMENT ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 650, 60);

        jLabel6.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("SYSTEM");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 140, 260, 60);

        unmlb.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        unmlb.setForeground(new java.awt.Color(51, 0, 51));
        unmlb.setText("UserName");
        jPanel1.add(unmlb);
        unmlb.setBounds(70, 270, 120, 32);

        unm.setBackground(new java.awt.Color(204, 204, 255));
        unm.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        unm.setForeground(new java.awt.Color(51, 0, 51));
        unm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unm.setText("ehsan");
        unm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unmActionPerformed(evt);
            }
        });
        jPanel1.add(unm);
        unm.setBounds(200, 270, 180, 32);

        paslbl.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        paslbl.setForeground(new java.awt.Color(51, 0, 51));
        paslbl.setText("Pasword");
        jPanel1.add(paslbl);
        paslbl.setBounds(70, 330, 115, 28);

        pas.setBackground(new java.awt.Color(204, 204, 255));
        pas.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        pas.setForeground(new java.awt.Color(51, 0, 51));
        pas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pas.setText("khan");
        pas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasActionPerformed(evt);
            }
        });
        jPanel1.add(pas);
        pas.setBounds(200, 330, 180, 28);

        lgnbtn.setBackground(new java.awt.Color(0, 153, 204));
        lgnbtn.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lgnbtn.setForeground(new java.awt.Color(51, 0, 51));
        lgnbtn.setText("Log In");
        lgnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgnbtnMouseClicked(evt);
            }
        });
        lgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnbtnActionPerformed(evt);
            }
        });
        jPanel1.add(lgnbtn);
        lgnbtn.setBounds(260, 380, 120, 40);

        bkbtn.setBackground(new java.awt.Color(0, 153, 204));
        bkbtn.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        bkbtn.setForeground(new java.awt.Color(51, 0, 51));
        bkbtn.setText("BACK");
        bkbtn.setToolTipText("ENTER TO BACK MAIN MENU");
        bkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bkbtn);
        bkbtn.setBounds(70, 480, 100, 30);

        extbtn.setBackground(new java.awt.Color(0, 153, 204));
        extbtn.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        extbtn.setForeground(new java.awt.Color(51, 0, 51));
        extbtn.setText("EXIT");
        extbtn.setToolTipText("ENTER TO BACK MAIN MENU");
        extbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extbtnActionPerformed(evt);
            }
        });
        jPanel1.add(extbtn);
        extbtn.setBounds(550, 490, 80, 30);

        picback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectw/   (3).jpg"))); // NOI18N
        jPanel1.add(picback);
        picback.setBounds(-900, -220, 1990, 1160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmActionPerformed

    }//GEN-LAST:event_unmActionPerformed

    private void pasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasActionPerformed

    }//GEN-LAST:event_pasActionPerformed

    private void lgnbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnbtnMouseClicked
//        // TODO add your handling code here:
//        obj=new Hostel_Mng_Sys();
//        ob=new Login();
//        String user = unm.getText().trim();
//        String pass = pas.getText();
//        if (user.equalsIgnoreCase("ehsan") && pass.equals("khan")) {
//            this.dispose();
//            obj.setVisible(true);
//        }
//        else{
//            this.dispose();
//            ob.setVisible(true);
//            JOptionPane.showMessageDialog(rootPane, "Enter the Correct Password and user Name");
//        }
    }//GEN-LAST:event_lgnbtnMouseClicked

    private void lgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnbtnActionPerformed
        //         TODO add your handling code here:
        obj=new Hostel_Mng_Sys();
        ob=new Login();
        String user = unm.getText().trim();
        String pass = pas.getText();
        if (user.equalsIgnoreCase("ehsan") && pass.equals("khan")) {
            this.dispose();
            obj.setVisible(true);
        }
        else{
            this.dispose();
            ob.setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "Enter the Correct Password and user Name");
        }
    }//GEN-LAST:event_lgnbtnActionPerformed

    private void bkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkbtnActionPerformed
        // TODO add your handling code here:
        Front a;
        a=new Front();
        this.dispose();
        a.setVisible(true);

    }//GEN-LAST:event_bkbtnActionPerformed

    private void extbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_extbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkbtn;
    private javax.swing.JButton extbtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lgnbtn;
    private javax.swing.JPasswordField pas;
    private javax.swing.JLabel paslbl;
    private javax.swing.JLabel picback;
    private javax.swing.JTextField unm;
    private javax.swing.JLabel unmlb;
    // End of variables declaration//GEN-END:variables
}

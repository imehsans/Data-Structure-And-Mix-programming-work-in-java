/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Front extends javax.swing.JFrame {

    /**
     * Creates new form Front
     */
    public Front() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit_main = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit_main2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOSTEL MANAGMENT SYSTEM");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("MRT_Naskhi", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("HOSTEL MANAGMENT ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 70, 450, 54);

        jLabel4.setFont(new java.awt.Font("MRT_Naskhi", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("SYSTEM");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 130, 180, 54);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 0));
        jLabel2.setText("ENTER IN PROJECT");
        jLabel2.setToolTipText("Press the Button to Enter in Login menue");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 250, 260, 30);

        exit_main.setBackground(new java.awt.Color(0, 153, 204));
        exit_main.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        exit_main.setForeground(new java.awt.Color(153, 0, 0));
        exit_main.setText("ENTER");
        exit_main.setToolTipText("Press the Button to Enter in Login menue");
        exit_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_mainActionPerformed(evt);
            }
        });
        jPanel1.add(exit_main);
        exit_main.setBounds(360, 250, 100, 30);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("EXIT IN PROJECT");
        jLabel1.setToolTipText("Press the Button to Exit");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 330, 240, 30);

        exit_main2.setBackground(new java.awt.Color(0, 153, 204));
        exit_main2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        exit_main2.setForeground(new java.awt.Color(153, 0, 0));
        exit_main2.setText("Exit");
        exit_main2.setToolTipText("Press the Button to Exit");
        exit_main2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_main2ActionPerformed(evt);
            }
        });
        jPanel1.add(exit_main2);
        exit_main2.setBounds(400, 330, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectw/Awesome-media-gamescenes.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-20, -420, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void exit_mainActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Login a;
        
        try {
            this.dispose();
            a=new Login();
            a.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void exit_main2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
    }                                          

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton exit_main;
    private javax.swing.JButton exit_main2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
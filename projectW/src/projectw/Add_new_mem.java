/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;


import java.awt.event.KeyEvent;
import java.io.IOException;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class Add_new_mem extends javax.swing.JFrame {
    ArrayList <Member> mem;
    /**
     * Creates new form Add_new_mem
     */
    public Add_new_mem() {
        
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
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        piclb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD NEW MEMBER");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(51, 0, 51));
        jLabel14.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("ADD NEW MEMBER");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(170, 10, 530, 90);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setText("Member ID");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 140, 130, 30);

        t1.setBackground(new java.awt.Color(153, 204, 255));
        t1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(51, 51, 0));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(190, 140, 170, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 140, 70, 30);

        t2.setBackground(new java.awt.Color(153, 204, 255));
        t2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(51, 51, 0));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(560, 140, 170, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Fathar Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 150, 30);

        t3.setBackground(new java.awt.Color(153, 204, 255));
        t3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(51, 51, 0));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(190, 200, 170, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 51));
        jLabel17.setText("CNIC No.");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(420, 200, 110, 30);

        t4.setBackground(new java.awt.Color(153, 204, 255));
        t4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t4.setForeground(new java.awt.Color(51, 51, 0));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(560, 200, 170, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 260, 150, 30);

        t5.setBackground(new java.awt.Color(153, 204, 255));
        t5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t5.setForeground(new java.awt.Color(51, 51, 0));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(190, 260, 170, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Contant No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 260, 140, 30);

        t6.setBackground(new java.awt.Color(153, 204, 255));
        t6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t6.setForeground(new java.awt.Color(51, 51, 0));
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(560, 260, 170, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("E-Mail");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 320, 90, 30);

        t7.setBackground(new java.awt.Color(153, 204, 255));
        t7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t7.setForeground(new java.awt.Color(51, 51, 0));
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t7KeyTyped(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(190, 320, 170, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Room No.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 320, 120, 30);

        t8.setBackground(new java.awt.Color(153, 204, 255));
        t8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t8.setForeground(new java.awt.Color(51, 51, 0));
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        jPanel1.add(t8);
        t8.setBounds(560, 320, 170, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("Monthly Fee");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(240, 380, 150, 30);

        t9.setBackground(new java.awt.Color(153, 204, 255));
        t9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t9.setForeground(new java.awt.Color(51, 51, 0));
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        t9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t9KeyTyped(evt);
            }
        });
        jPanel1.add(t9);
        t9.setBounds(390, 380, 160, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Adress");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 410, 80, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("House No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 450, 120, 30);

        t10.setBackground(new java.awt.Color(153, 204, 255));
        t10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t10.setForeground(new java.awt.Color(51, 51, 0));
        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t10KeyTyped(evt);
            }
        });
        jPanel1.add(t10);
        t10.setBounds(210, 450, 130, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Street No.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 450, 110, 30);

        t11.setBackground(new java.awt.Color(153, 204, 255));
        t11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t11.setForeground(new java.awt.Color(51, 51, 0));
        t11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t11KeyTyped(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(580, 450, 130, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("City");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 510, 60, 30);

        t12.setBackground(new java.awt.Color(153, 204, 255));
        t12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t12.setForeground(new java.awt.Color(51, 51, 0));
        t12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t12KeyTyped(evt);
            }
        });
        jPanel1.add(t12);
        t12.setBounds(210, 510, 130, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setText("State");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 510, 60, 30);

        t13.setBackground(new java.awt.Color(153, 204, 255));
        t13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t13.setForeground(new java.awt.Color(51, 51, 0));
        t13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        t13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t13KeyTyped(evt);
            }
        });
        jPanel1.add(t13);
        t13.setBounds(580, 510, 130, 30);

        btn1.setBackground(new java.awt.Color(0, 153, 204));
        btn1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(153, 0, 0));
        btn1.setText("INSERT");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(360, 600, 140, 40);

        btn2.setBackground(new java.awt.Color(0, 153, 204));
        btn2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(153, 0, 0));
        btn2.setText("MAIN MENU");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(100, 610, 150, 31);

        btn3.setBackground(new java.awt.Color(0, 153, 204));
        btn3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(153, 0, 0));
        btn3.setText("EXIT");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(580, 610, 130, 31);

        piclb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectw/   (14).jpg"))); // NOI18N
        jPanel1.add(piclb);
        piclb.setBounds(-550, -400, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        Hostel_Mng_Sys hms;
        hms=new Hostel_Mng_Sys();
        this.dispose();
        hms.setVisible(true);
        hms.setAlwaysOnTop(true);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed
   
    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed
    
    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        try {
            MemClass c;
            
            c = new MemClass();
            String id=t1.getText();
            String name=t2.getText();
            String fnam=t3.getText();
            String cnic=t4.getText();
            String dob=t5.getText();
            String cnt=t6.getText();
            String eml=t7.getText();
            Integer rmnum=Integer.parseInt(t8.getText());
            Integer fee=Integer.parseInt(t9.getText());
            String hnm=t10.getText();
            String strnm=t11.getText();
            String ctnm=t12.getText();
            String statnm=t13.getText();
            
            c.setMemInfo(id, name, fnam, cnic,  dob,cnt, eml, rmnum, fee, hnm, strnm, ctnm, statnm);
            Hostel_Mng_Sys hms;
            hms=new Hostel_Mng_Sys();
            this.dispose();
            hms.setVisible(true);
        } catch (IOException  ex) {
            Logger.getLogger(Add_new_mem.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btn1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
        String str=t1.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=6))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        // TODO add your handling code here:
        String str=t2.getText();
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=20)){
            evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
        String str=t3.getText();
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=20)){
            evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void t8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyTyped
        // TODO add your handling code here:
        String str=t8.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=2)){
            evt.consume();
        }
    }//GEN-LAST:event_t8KeyTyped

    private void t9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyTyped
        // TODO add your handling code here:
        String str=t9.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=5)){
            evt.consume();
        }
    }//GEN-LAST:event_t9KeyTyped

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:
        String str=t4.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=13)){
            evt.consume();
        }
    }//GEN-LAST:event_t4KeyTyped

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
        String str=t5.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_SLASH)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=8)){
            evt.consume();
        }
    }//GEN-LAST:event_t5KeyTyped

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
        // TODO add your handling code here:
        String str=t6.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=11)){
            evt.consume();
        } 
    }//GEN-LAST:event_t6KeyTyped

    private void t7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyTyped
        // TODO add your handling code here:
        String str=t7.getText();
        char c=evt.getKeyChar();
        if((str.length()>=30)){
            evt.consume();
        }
    }//GEN-LAST:event_t7KeyTyped

    private void t10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyTyped
        // TODO add your handling code here:
        String str=t10.getText();
        char c=evt.getKeyChar();
        if((str.length()>=5)){
            evt.consume();
        }
    }//GEN-LAST:event_t10KeyTyped

    private void t11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyTyped
        // TODO add your handling code here:
        String str=t11.getText();
        char c=evt.getKeyChar();
        if((str.length()>=5)){
            evt.consume();
        }
    }//GEN-LAST:event_t11KeyTyped

    private void t12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t12KeyTyped
        // TODO add your handling code here:
        String str=t12.getText();
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=20)){
            evt.consume();
        }
    }//GEN-LAST:event_t12KeyTyped

    private void t13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t13KeyTyped
        // TODO add your handling code here:
        String str=t13.getText();
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=20)){
            evt.consume();
        }
    }//GEN-LAST:event_t13KeyTyped

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
            java.util.logging.Logger.getLogger(Add_new_mem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_new_mem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_new_mem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_new_mem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Add_new_mem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel piclb;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EditMem extends javax.swing.JFrame {
ArrayList <Member>  mem;
     /**
     * Creates new form EditMem
     */
    public EditMem() {
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
        lm1 = new javax.swing.JLabel();
        lm2 = new javax.swing.JLabel();
        ls1 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        ls2 = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        l7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        l8 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        l9 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        lh1 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        l11 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        l12 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        l13 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Front = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDIT MEMBER RECORD");
        setResizable(false);

        jPanel1.setLayout(null);

        lm1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        lm1.setForeground(new java.awt.Color(204, 204, 0));
        lm1.setText("EDIT");
        jPanel1.add(lm1);
        lm1.setBounds(130, 10, 160, 50);

        lm2.setBackground(new java.awt.Color(51, 0, 51));
        lm2.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        lm2.setForeground(new java.awt.Color(204, 204, 0));
        lm2.setText("MEMBER RECORD");
        jPanel1.add(lm2);
        lm2.setBounds(200, 50, 510, 60);

        ls1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ls1.setForeground(new java.awt.Color(255, 200, 0));
        ls1.setText("Member ID");
        jPanel1.add(ls1);
        ls1.setBounds(20, 120, 100, 30);

        tx1.setBackground(new java.awt.Color(204, 204, 255));
        tx1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tx1.setForeground(new java.awt.Color(51, 51, 0));
        tx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx1KeyTyped(evt);
            }
        });
        jPanel1.add(tx1);
        tx1.setBounds(150, 120, 190, 30);

        ls2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ls2.setForeground(new java.awt.Color(255, 200, 0));
        ls2.setText("Name");
        jPanel1.add(ls2);
        ls2.setBounds(20, 160, 70, 30);

        tx2.setBackground(new java.awt.Color(204, 204, 255));
        tx2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tx2.setForeground(new java.awt.Color(51, 51, 0));
        tx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx2KeyTyped(evt);
            }
        });
        jPanel1.add(tx2);
        tx2.setBounds(150, 160, 190, 30);

        searchbtn.setBackground(new java.awt.Color(0, 153, 204));
        searchbtn.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(153, 0, 0));
        searchbtn.setText("SEARCH");
        searchbtn.setToolTipText("ENTER TO SHOW LIST");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn);
        searchbtn.setBounds(400, 160, 120, 30);

        ta1.setBackground(new java.awt.Color(204, 204, 255));
        ta1.setColumns(25);
        ta1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        ta1.setForeground(new java.awt.Color(51, 51, 0));
        ta1.setRows(5);
        ta1.setToolTipText("LIST");
        ta1.setWrapStyleWord(true);
        ta1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ta1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ta1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 220, 400);

        l1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 200, 0));
        l1.setText("Member ID");
        jPanel1.add(l1);
        l1.setBounds(250, 200, 130, 30);

        t1.setBackground(new java.awt.Color(204, 204, 255));
        t1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        t1.setBounds(400, 200, 150, 30);

        l2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 200, 0));
        l2.setText("Name");
        jPanel1.add(l2);
        l2.setBounds(570, 200, 70, 30);

        t2.setBackground(new java.awt.Color(204, 204, 255));
        t2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        t2.setBounds(680, 200, 150, 30);

        l3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 200, 0));
        l3.setText("Fathar Name");
        jPanel1.add(l3);
        l3.setBounds(250, 260, 150, 30);

        t3.setBackground(new java.awt.Color(204, 204, 255));
        t3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        t3.setBounds(400, 260, 150, 30);

        l4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 200, 0));
        l4.setText("CNIC No.");
        jPanel1.add(l4);
        l4.setBounds(570, 260, 90, 30);

        t4.setBackground(new java.awt.Color(204, 204, 255));
        t4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(51, 51, 0));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(680, 260, 150, 30);

        l5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 200, 0));
        l5.setText("Date of birth");
        jPanel1.add(l5);
        l5.setBounds(250, 320, 150, 30);

        t5.setBackground(new java.awt.Color(204, 204, 255));
        t5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        t5.setBounds(400, 320, 150, 30);

        l6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 200, 0));
        l6.setText("Contant No.");
        jPanel1.add(l6);
        l6.setBounds(570, 320, 110, 30);

        t6.setBackground(new java.awt.Color(204, 204, 255));
        t6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t6.setForeground(new java.awt.Color(51, 51, 0));
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(680, 320, 150, 30);

        l7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 200, 0));
        l7.setText("E-Mail");
        jPanel1.add(l7);
        l7.setBounds(250, 380, 90, 30);

        t7.setBackground(new java.awt.Color(204, 204, 255));
        t7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t7.setForeground(new java.awt.Color(51, 51, 0));
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t7KeyTyped(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(400, 380, 150, 30);

        l8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 200, 0));
        l8.setText("Room No.");
        jPanel1.add(l8);
        l8.setBounds(570, 380, 90, 30);

        t8.setBackground(new java.awt.Color(204, 204, 255));
        t8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t8.setForeground(new java.awt.Color(51, 51, 0));
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        jPanel1.add(t8);
        t8.setBounds(680, 380, 150, 30);

        l9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 200, 0));
        l9.setText("Monthly Fee");
        jPanel1.add(l9);
        l9.setBounds(380, 440, 160, 30);

        t9.setBackground(new java.awt.Color(204, 204, 255));
        t9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        t9.setBounds(540, 440, 150, 30);

        lh1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lh1.setForeground(new java.awt.Color(255, 200, 0));
        lh1.setText("Adress");
        jPanel1.add(lh1);
        lh1.setBounds(250, 470, 90, 30);

        l10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 200, 0));
        l10.setText("House No.");
        jPanel1.add(l10);
        l10.setBounds(310, 510, 120, 30);

        t10.setBackground(new java.awt.Color(204, 204, 255));
        t10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        t10.setForeground(new java.awt.Color(51, 51, 0));
        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t10KeyTyped(evt);
            }
        });
        jPanel1.add(t10);
        t10.setBounds(430, 510, 120, 30);

        l11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 200, 0));
        l11.setText("Street No.");
        jPanel1.add(l11);
        l11.setBounds(590, 510, 110, 30);

        t11.setBackground(new java.awt.Color(204, 204, 255));
        t11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        t11.setForeground(new java.awt.Color(51, 51, 0));
        t11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t11KeyTyped(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(710, 510, 120, 30);

        l12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        l12.setForeground(new java.awt.Color(255, 200, 0));
        l12.setText("City");
        jPanel1.add(l12);
        l12.setBounds(310, 570, 60, 30);

        t12.setBackground(new java.awt.Color(204, 204, 255));
        t12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        t12.setForeground(new java.awt.Color(51, 51, 0));
        t12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t12KeyTyped(evt);
            }
        });
        jPanel1.add(t12);
        t12.setBounds(430, 570, 120, 30);

        l13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        l13.setForeground(new java.awt.Color(255, 200, 0));
        l13.setText("State");
        jPanel1.add(l13);
        l13.setBounds(590, 570, 90, 30);

        t13.setBackground(new java.awt.Color(204, 204, 255));
        t13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        t13.setForeground(new java.awt.Color(51, 51, 0));
        t13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t13KeyTyped(evt);
            }
        });
        jPanel1.add(t13);
        t13.setBounds(710, 570, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("UPDATE");
        jButton3.setToolTipText("ENTER TO SHOW LIST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 640, 150, 40);

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("MAIN MENU");
        jButton4.setToolTipText("ENTER TO SHOW LIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 650, 150, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("EXIT");
        jButton1.setToolTipText("ENTER TO SHOW LIST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(690, 650, 140, 30);

        Front.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectw/   (2).jpg"))); // NOI18N
        jPanel1.add(Front);
        Front.setBounds(-100, -50, 1370, 850);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ta1AncestorAdded

    }//GEN-LAST:event_ta1AncestorAdded

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String id = tx1.getText();
        String n = tx2.getText();
        try (FileInputStream file = new FileInputStream("Record.csv"); ObjectInputStream in = new ObjectInputStream(file)) {
            mem = (ArrayList<Member>) in.readObject();
            int k=0;
            int i=-1;
            FileOutputStream fos=new FileOutputStream("Record.csv");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            for( Member c : mem){
                i++;
                if(c.getName().equals(n) && c.getId().equals(id)){
                    k=1;
                    ta1.append("   __________ \n<< __________ >>\n||ID         :||>> "+c.getId()+"\n||^^^^^^^^^^^^||\n||NAME       :||>> "+c.getName()+"\n||^^^^^^^^^^^^||\n||F-NAME     :||>> "+c.getFather_name()+"\n||^^^^^^^^^^^^||\n||CNIC-NO.   :||>> "+c.getCnic()+"\n||^^^^^^^^^^^^||\n||D-O-B      :||>> "+c.getDate_of_birth()+"\n||^^^^^^^^^^^^||\n||CONTACT NO.:||>> "+c.getContact()+"\n||^^^^^^^^^^^^||\n||E-MAIL     :||>> "+c.getE_mail()+"\n||^^^^^^^^^^^^||\n||ROOM NO.   :||>> "+c.getRoom_num()+"\n||^^^^^^^^^^^^||\n||Monthly Fee:||>> "+c.getMonthly_fee()+"\n||^^^^^^^^^^^^||\n||HOUSE NO.  :||>> "+c.getHouse_num()+"\n||^^^^^^^^^^^^||\n||STREET No. :||>> "+c.getStreet_num()+"\n||^^^^^^^^^^^^||\n||CITY NAME  :||>> "+c.getCity()+"\n||^^^^^^^^^^^^||\n||STATE NAME :||>> "+c.getState()+"\n  ^^^^^^^^^^^^\n");
                    ta1.append("\n  __________________________\n||                     _    ||\n||When You Want to     \\_\\  ||\n||Edit This Record  //||\\_\\ ||\n||Enter New Record ||||||>_>||\n||   in    the      \\\\||/_/ ||\n||  Given  Spaces      /_/  ||\n||__________________________||\n"); 
                    oos.writeObject(mem);
                    oos.close();
                    fos.close();
                    file.close();
                    in.close();
                }
            }
            if(k!=1){
                ta1.append(" NOT FOUND");
//                JOptionPane.showMessageDialog(rootPane," NOT FOUND");
                EditMem z;
                this.dispose();
                z=new EditMem();
                z.setVisible(true);
            }
        }
        catch(ConcurrentModificationException h){
            JOptionPane.showMessageDialog(rootPane, "ConcurrentModificationException");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "FileNotFoundException");
            Logger.getLogger(EditMem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "IOException | ClassNotFoundException");
            Logger.getLogger(EditMem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Hostel_Mng_Sys hms;
        hms=new Hostel_Mng_Sys();
        this.dispose();
        hms.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = tx1.getText();
        String n = tx2.getText();
        try (FileInputStream file = new FileInputStream("Record.csv"); ObjectInputStream in = new ObjectInputStream(file)) {
            mem = (ArrayList<Member>) in.readObject();
            int k=0;
            int i=-1;
            try (FileOutputStream fos = new FileOutputStream("Record.csv"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for( Member c : mem){
                    i++;
                    if(c.getName().equals(n) && c.getId().equals(id)){
                        k=1;
                        String n1 = t1.getText();
                        String n2 = t2.getText();
                        String n3 = t3.getText();
                        String n4 = t4.getText();
                        String n5 = t5.getText();
                        String n6 = t6.getText();
                        String n7 = t7.getText();
                        Integer n8=Integer.parseInt(t8.getText());
                        Integer n9=Integer.parseInt(t9.getText());
                        String n10 = t10.getText();
                        String n11 = t11.getText();
                        String n12 = t12.getText();
                        String n13 = t13.getText();
                
                        mem.get(i).setId(n1);
                        mem.get(i).setName(n2);
                        mem.get(i).setFather_name(n3);
                        mem.get(i).setCnic(n4);
                        mem.get(i).setDate_of_birth(n5);
                        mem.get(i).setE_mail(n7);
                        mem.get(i).setContact(n6);
                        mem.get(i).setRoom_num(n8);
                        mem.get(i).setMonthly_fee(n9);
                        mem.get(i).setHouse_num(n10);
                        mem.get(i).setStreet_num(n11);
                        mem.get(i).setCity(n12);
                        mem.get(i).setState(n13);
                        JOptionPane.showMessageDialog(rootPane,"EDITED");
                        oos.writeObject(mem);
                        oos.close();
                        fos.close();
                        file.close();
                        in.close();
                    }
                    EditMem z;
                    this.dispose();
                    z=new EditMem();
                    z.setVisible(true);
                }
                if(k!=1){
                    JOptionPane.showMessageDialog(rootPane," NOT FOUND");
                    EditMem z;
                    this.dispose();
                    z=new EditMem();
                    z.setVisible(true);
                }
            }   
            file.close();
        }catch(ConcurrentModificationException h){
            JOptionPane.showMessageDialog(rootPane, h);
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "1"+ex);
            Logger.getLogger(EditMem.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane,"2"+ ex);
            Logger.getLogger(EditMem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tx1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx1KeyTyped
        // TODO add your handling code here:
        String str=tx1.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=6)){
            evt.consume();
        }
    }//GEN-LAST:event_tx1KeyTyped

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
        String str=t1.getText();
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=6)){
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void tx2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx2KeyTyped
        // TODO add your handling code here:
        String str=tx2.getText();
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(str.length()>=20)){
            evt.consume();
        }
    }//GEN-LAST:event_tx2KeyTyped

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
        if((str.length()>=30)){
            evt.consume();
        }
    }//GEN-LAST:event_t7KeyTyped

    private void t10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyTyped
        // TODO add your handling code here:
        String str=t10.getText();
        if((str.length()>=5)){
            evt.consume();
        }
    }//GEN-LAST:event_t10KeyTyped

    private void t11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyTyped
        // TODO add your handling code here:
        String str=t11.getText();
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

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

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
            java.util.logging.Logger.getLogger(EditMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Front;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel lh1;
    private javax.swing.JLabel lm1;
    private javax.swing.JLabel lm2;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JButton searchbtn;
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
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    // End of variables declaration//GEN-END:variables
}
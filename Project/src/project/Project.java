/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Project implements ActionListener {

    public JButton b1,b2,b3;
    public JLabel l,l1,l2,l3;
    public JTextField tf1;
    public JPasswordField tf2;
    public JFrame f;
    public JPanel p,p1,p2,p3,p4,p5;
    
    public Project(){
        f=new JFrame("Login Form");
        l1=new JLabel("Please Enter Username and Password");
        l=new JLabel("WELCOME");
        l.setForeground(Color.BLUE);
        l1.setFont(new Font("ARIAL",Font.BOLD,25));
        l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));
        l1.setForeground(Color.RED);
        l2=new JLabel("UserName :");
        l3=new JLabel("PassWord :");
        l2.setFont(new Font("",Font.BOLD,17));
        l3.setFont(new Font("",Font.BOLD,17));
        tf1=new JTextField(10);
        tf2=new JPasswordField(10); 
        b1=new JButton("Login");
        b2=new JButton("Reset");
        b3=new JButton("Exit");
        p=new JPanel();
        p1=new JPanel();
        p2=new JPanel();    
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
        p1.add(l2);
        p1.add(tf1);
        p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
        p2.add(l3);
        p2.add(tf2);
        p3.add(b1);
        p3.add(b2);
        p4.setLayout(new FlowLayout());
        p4.add(l);
        p5.setLayout(new FlowLayout());
        p5.add(l1);
        p3.add(b3);
        f.setLayout(new FlowLayout());
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)d.getWidth();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        p.add(p4);
        p.add(Box.createRigidArea(new Dimension(width,75)));
        p.add(p5);
        f.add(p);
        f.add(Box.createRigidArea(new Dimension(width,50)));

        f.add(p1);
        f.add(Box.createRigidArea(new Dimension(width,15)));
        f.add(p2);
        f.add(Box.createRigidArea(new Dimension(width,30)));
        f.add(p3);
        f.setVisible(true);
        f.setSize(d);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener) this);
}

    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1){
        try{
            String username = tf1.getText();
            String password=String.copyValueOf(tf2.getPassword());
            
            if(username.equals("") && password.equals("")){
                JOptionPane.showMessageDialog(f,"Requir");
//                f.dispose();
            }
            else{
                if(login(username,password)){
                    Main1 m1=new Main1();
                    f.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(f, password);
                    tf2.setText("");
                }
            }
        }
        catch(HeadlessException e){
        }
    
    if(ae.getSource()==b2){
        try{tf1.setText("");
        tf2.setText("");
        }
        catch(Exception e){
        }
    
    if(ae.getSource()==b3){
        System.exit(0);
    }
    }
    }
    }
    private class rs {

        private  void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public rs() {
        }
    }
    public boolean login(String username,String password){
    try{
       
        rs r=new rs();
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection(username);
        try  {
            MydStatement s=(MydStatement) con.createStatement();
            String rs = null;
            String sq1=("Select username, password from admin where useResultSet rs=s.executeQuery(sq1)");
                    if(r.next()){
                        return true;
                    } else {
                    }
                    r.close();
                    s.close();
        }
        catch(SQLException k){
//            System.out.println(k);
        }
    }
    catch(Exception x){
        System.out.println(x.toString());
    }
    return false;
    }

    
    


    class Main1 {
        JButton b1,b2,b3,b4;
        JLabel l;
        JFrame f1;
        JPanel p;
        public Main1(){
            l=new JLabel("Click on any one of the required buttons");
            l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
            l.setForeground(Color.RED);b1=new JButton("Student");
            b2=new JButton("Accounts");
            b3=new JButton("Exit");
            b1.setFont(new Font("ARIAL",Font.PLAIN,20));
            b2.setFont(new Font("ARIAL",Font.PLAIN,20));
            b3.setFont(new Font("ARIAL",Font.PLAIN,20));
            p=new JPanel();
            Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
            int width=(int)d.getWidth();
            f1=new JFrame("Main page");
            f1.setLayout(new FlowLayout());
            f1.setBackground(Color.YELLOW);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f1.setSize(d);f1.setVisible(true);
            p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
            p.add(b1);
            p.add(Box.createHorizontalStrut(30));
            p.add(b2);
            f1.add(Box.createRigidArea(new Dimension(width,25)));
            f1.add(l);
            f1.add(Box.createRigidArea(new Dimension(width,100)));
            f1.add(p);
            f1.add(Box.createRigidArea(new Dimension(width,25)));
            f1.add(b3);
        }
    }
//        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    
    public static void main(String args[])throws Exception{
        Project l=new Project(); 
    }
}

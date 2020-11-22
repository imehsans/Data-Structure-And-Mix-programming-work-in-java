/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;
import java.awt.Color;                                      //C. represent class
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import student_managment_system.Project.admin.login;
/**
 *
 * @author Ehsan Jadoon
 */
public class ADMIN implements ActionListener{               //C.3
		    	public void actionPerformed(ActionEvent e){
		    	
		    
		    			if(e.getSource()==admin){
		    				
		    				JFrame ADMIN=new JFrame();
		    				ADMIN.setVisible(true);
		    				Student_Admin.setVisible(false);
		    				ADMIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    				ADMIN.setBounds(100,50,900,600);
		    				ADMIN.setLayout(null);
		    				ADMIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    				admin_pic=new JLabel();ADMIN.add(admin_pic);admin_pic.setBounds(0,0,900,600);admin_pic.setIcon(new ImageIcon("E:\\image\\admin.jpg"));
		    				admin_login_pic=new JLabel();admin_pic.add(admin_login_pic);admin_login_pic.setBounds(580,-80,400,700);admin_login_pic.setIcon(new ImageIcon("E:\\image\\admin.png"));
		    				 Welcome2=new JLabel("WELCOME");admin_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.red);
		    				 To2=new JLabel("TO");admin_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		    				 Admin=new JLabel("ADMIN");admin_pic.add( Admin); Admin.setBounds(300,110,150,50); Admin.setFont(f);  Admin.setForeground(Color.RED); Admin.setFont(f);
		    				 login=new JLabel("LOGIN");admin_pic.add(login);login.setBounds(430,110,150,50);login.setFont(f); login.setForeground(Color.RED);login.setFont(f);
		    				 username=new JLabel("USERNAME");admin_pic.add(username);username.setBounds(70,200,200,50);username.setFont(f); username.setForeground(Color.green);username.setFont(f);
		    				 password=new JLabel("PASSWORD");admin_pic.add(password);password.setBounds(70,290,200,50);password.setFont(f); password.setForeground(Color.green);
		    				 username_t=new JTextField();admin_pic.add(username_t);username_t.setBounds(270, 205, 200,40);Font f1=new Font("Serif", Font.BOLD, 20);username_t.setFont(f);username_t.setForeground(Color.darkGray);
		    				 Admin_pass=new JPasswordField();admin_pic.add(Admin_pass);Admin_pass.setBounds(270, 290, 200,40); Admin_pass.setFont(f1);Admin_pass.setForeground(Color.DARK_GRAY);
		    				 admin_login=new JButton("LOGIN");admin_pic.add(admin_login);admin_login.setBounds(330,400,100,40);admin_login.setFont(f1);admin_login.setForeground(Color.blue);
		    				 admin_back=new JButton("BACK");admin_pic.add(admin_back);admin_back.setBounds(0,520,100,40);admin_back.setFont(f1);admin_back.setForeground(Color.MAGENTA);
		    				admin_exit=new JButton("EXIT");admin_pic.add(admin_exit);admin_exit.setBounds(805,520,100,40);admin_exit.setFont(f1);admin_exit.setForeground(Color.MAGENTA);
		    				
		    				 admin_login.addActionListener(new admin_login());         //ACTONLISTENER FOR ADMIN LOGIN BUTTON
		    				 admin_back.addActionListener(new  back());                // ACTIONLISTENER FOR ADMIN BACK BUTTON
		    				 admin_exit.addActionListener(new back());                 // ACTIONLISTENER FOR ADMIN EXIT BUTTON
		    				}
		    				
		    			}
		    				}
		    /*******************************************************************************
		     *******************************************************************************
		     *                                                                             *
		     *                    ADMIN LOGIN BUTTON INNER CLASS                                *  
		     *                                                                             *
		     ******************************************************************************
		     *******************************************************************************/
		    
		                   

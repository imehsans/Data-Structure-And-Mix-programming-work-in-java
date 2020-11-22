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
public class admin_login implements ActionListener{         //C.4
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==admin_login){
		                			   String username=username_t.getText();
		                			   String passwor=Admin_pass.getText();
		                			   if(username.equals("qwerty") && passwor.equals("12345")){
		                			   JFrame admin_login=new JFrame();
		                			   admin_login.setVisible(true);
		                			   ADMIN.setVisible(false);
		                			   admin_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   admin_login.setBounds(100,50,900,600);
		                			   admin_login.setLayout(null);
		                			   Font f1=new Font("Serif", Font.BOLD, 20);
		                			   admin_window_pic=new JLabel(); admin_login.add(admin_window_pic);admin_window_pic.setBounds(0,0,900,600);admin_window_pic.setIcon(new ImageIcon("E:\\image\\8s.jpg"));
		                			   Welcome2=new JLabel("WELCOME");admin_window_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.RED);
		  		    				 To2=new JLabel("TO");admin_window_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		  		    				 Admin=new JLabel("ADMIN");admin_window_pic.add( Admin); Admin.setBounds(300,110,150,50); Admin.setFont(f);  Admin.setForeground(Color.RED); Admin.setFont(f);
		  		    				window=new JLabel("WINDOW");admin_window_pic.add(window);window.setBounds(430,110,150,50);window.setFont(f); window.setForeground(Color.RED);window.setFont(f);
		  		    				add_student=new JButton("ADD STUDENT"); admin_window_pic.add(add_student); add_student.setBounds(50,220,200,40); add_student.setForeground(Color.blue);add_student.setFont(f1);
		  		    				scholorship=new JButton("SCHOLOSHIP"); admin_window_pic.add(scholorship); scholorship.setBounds(320,220,200,40); scholorship.setForeground(Color.blue);scholorship.setFont(f1);
		  		    				student_fee_information=new JButton("REGISTERED COURSES"); admin_window_pic.add(student_fee_information); student_fee_information.setBounds(580,220,280,40); student_fee_information.setForeground(Color.blue);student_fee_information.setFont(f1);
		  		    				assignment=new JButton("ASSIGNMENT"); admin_window_pic.add(assignment); assignment.setBounds(50,350,200,40); assignment.setForeground(Color.blue);assignment.setFont(f1);
		  		    				quiz=new JButton("QUIZES"); admin_window_pic.add(quiz); quiz.setBounds(320,350,200,40); quiz.setForeground(Color.blue);quiz.setFont(f1);
		  		    		        marks=new JButton("MARKS"); admin_window_pic.add(marks); marks.setBounds(580,350,280,40); marks.setForeground(Color.blue);marks.setFont(f1);
		  		    		       result=new JButton("RESULT"); admin_window_pic.add( result);  result.setBounds(320,480,200,40);  result.setForeground(Color.blue); result.setFont(f1);
		  		    		     
		  		    		       add_student.addActionListener(new addstudent());   //ACTIONLISTENER FOR ADD STUDENT BUTTON
		  		    		       scholorship.addActionListener(new scholorship());  //ACTIONLISTENER FOR SCHOLORSHIP BUTTON
		  		    		       assignment.addActionListener(new assignment());      //ACTIONLISTENER FOR ASSIGNMENT BUTTON
		  		    		       marks.addActionListener(new mark());
		                			   
		                			   }
		                			   else
		                			   {
		                				   JFrame messagew=new JFrame();
		                				   messagew.setVisible(true);
		                				   messagew.setLayout(null);
		                				   messagew.setBounds(100,50,360,180);
		                				   Font f6=new Font("Serif", Font.BOLD, 15);
			    							JLabel pict=new JLabel(); messagew.add(pict);pict.setBounds(0, 0, 360, 180);pict.setIcon(new ImageIcon("E:\\image\7s.jpg"));
			    							JLabel submit3=new JLabel("WRONG ENTRY TRY AGAIN...");pict.add(submit3);submit3.setBounds(35,10,300,100);new Font("Serif", Font.BOLD, 25);submit3.setFont(f6);submit3.setForeground(Color.DARK_GRAY);    
		                				 
		                				   
		                			   }
		                		   }  
		                			   }
		                		   }
		                   
		                 /*******************************************************************************
		       		     *******************************************************************************
		       		     *                                                                             *
		       		     *                      ADMIN BACK AND EXIT BUTTON INNER CLASS                       *  
		       		     *                                                                             *
		       		     ******************************************************************************
		       		     *******************************************************************************/
		                  
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
public class student_login implements ActionListener{          //C.7
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==sign_in){
		                			   String session1=(String)session.getSelectedItem();
		                			   String depart=(String)department.getSelectedItem();
		                			   String rollno=roll_no.getText();
		                			  String passwrd= student_Password.getText();	                			   
		                			 if(session1.equals("FA16")&& depart.equals("BSE")&& rollno.equals("104")&&passwrd.equals("iqbal")||rollno.equals("189")&& passwrd.equals("shoaib") || rollno.equals("117")&& passwrd.equals("zia")|| rollno.equals("138")&& passwrd.equals("hamza")){
		                			  
		                			   student_login.setVisible(true);
		                			   student.setVisible(false);
		                			   student_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   student_login.setLayout(null);
		                			   student_login.setBounds(100,50,900,600);
		                			   Font f1=new Font("Serif", Font.BOLD, 20);
		                			   student_window_pic=new JLabel(); student_login.add(student_window_pic);student_window_pic.setBounds(0,0,900,600);student_window_pic.setIcon(new ImageIcon("E:\\image\\std.jpg"));
		                			   Welcome2=new JLabel("WELCOME");student_window_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.RED);
		  		    				 To2=new JLabel("TO");student_window_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		  		    				 student1=new JLabel("STUDENT");student_window_pic.add( student1); student1.setBounds(260,110,150,50); student1.setFont(f);  student1.setForeground(Color.RED);student1.setFont(f);
		  		    				window=new JLabel("WINDOW");student_window_pic.add(window);window.setBounds(440,110,150,50);window.setFont(f); window.setForeground(Color.RED);window.setFont(f);
		  		    				course_reg=new JButton("COURSE REGISTERATION"); student_window_pic.add(course_reg); course_reg.setBounds(10,220,300,40); course_reg.setForeground(Color.blue);course_reg.setFont(f1);
		  		    				disp_scholorship=new JButton(" DISPLAY SCHOLORSHIP"); student_window_pic.add(disp_scholorship); disp_scholorship.setBounds(350,220,265,40); disp_scholorship.setForeground(Color.blue);disp_scholorship.setFont(f1);
		  		    				disp_mark=new JButton("DISPLAY MARKS"); student_window_pic.add(disp_mark); disp_mark.setBounds(655,220,220,40); disp_mark.setForeground(Color.blue);disp_mark.setFont(f1);
		  		    				fee_information=new JButton("REGISTERED COURSES"); student_window_pic.add(fee_information); fee_information.setBounds(10,350,300,40); fee_information.setForeground(Color.blue);fee_information.setFont(f1);
		  		    				assignment2=new JButton("ASSIGNMENTS"); student_window_pic.add(assignment2); assignment2.setBounds(350,350,265,40); assignment2.setForeground(Color.blue);assignment2.setFont(f1);
		  		    		        quizes=new JButton("QUIZES"); student_window_pic.add(quizes); quizes.setBounds(655,350,220,40); quizes.setForeground(Color.blue);quizes.setFont(f1);
		  		    		       disp_result=new JButton("DISPALY RESULT"); student_window_pic.add(disp_result); disp_result.setBounds(350,480,265,40);  disp_result.setForeground(Color.blue); disp_result.setFont(f1);
		                			
		  		    		     course_reg.addActionListener(new course_reg());            //ACTIONLISTENER FOR COURSE REGISTERATION BUTTON.
		                		   
		                			 }
		                			   else
		                			   {
		                				  message1=new JLabel("WRONG ENTRY TRY AGAIN...."); student_pic.add(message1);message1.setBounds(270,500,300,50);Font f4=new Font("SansSerif", Font.BOLD, 20);message1.setFont(f4);message1.setForeground(Color.RED);
		                			   }
		                		   
		                		  }
		                	   
		                		   
		                	  }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT BACK AND EXIT BUTTON INNER CLASS               *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
			                  
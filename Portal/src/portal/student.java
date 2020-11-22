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
public class student implements ActionListener{             //C.6
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==student){
		                			   JFrame student=new JFrame();
		                			   student.setVisible(true);
		                			   Student_Admin.setVisible(false);
		                			   Student_Admin.setVisible(false);
		                			   student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   student.setLayout(null);
		                			   student.setBounds(100,50,900,600);
		                			   student_pic=new JLabel();student.add(student_pic); student_pic.setBounds(0,0,900,600);student_pic.setIcon(new ImageIcon("E:\\image\\3.jpg"));
		  		    				 Welcome2=new JLabel("WELCOME");student_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.red);
				    				 To2=new JLabel("TO");student_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
				    				 student_l=new JLabel("STUDENT");student_pic.add(student_l); student_l.setBounds(280,110,150,50);student_l.setFont(f);  student_l.setForeground(Color.RED); student_l.setFont(f);
				    				 login=new JLabel("LOGIN");student_pic.add(login);login.setBounds(450,110,150,50);login.setFont(f); login.setForeground(Color.RED);login.setFont(f);
				    				 student_rollno=new JLabel("ROLL  NO");student_pic.add(student_rollno);student_rollno.setBounds(20,210,200,40);student_rollno.setFont(f);student_rollno.setForeground(Color.green);
				    				 student_pass=new JLabel("PASSWORD");student_pic.add(student_pass);student_pass.setBounds(20,300,200,40);student_pass.setFont(f);student_pass.setForeground(Color.green); Font f3=new Font("Serif", Font.BOLD, 20);
				    				 String[] se={"FA01","FA02","FA03","FA04","FA05","FA06","FA07","FA08","FA09","FA10","FA11","FA12","FA13","FA14","FA15","FA16","SP01","SP02","SP03","SP04","SP05","SP06","SP07","SP08","SP09","SP10","SP11","SP12","SP13","SP14","SP15","SP16"};
				    					session=new JComboBox(se);student_pic.add(session);session.setBounds(230,210,100,40);session.setFont(f3);session.setForeground(Color.DARK_GRAY);
				    					String[] dep={"BCS","BTN","BTY","BSE","BBA","EEE","BES","ECE","CVE","BSS","BDS","BEE","BIT","BBA","MBA","MDS","MBO","MS(CE)","PCS","PDS","PEE",};
				    					department=new JComboBox(dep);department=new JComboBox(dep);student_pic.add(department);department.setBounds(350,210,100,40);department.setFont(f3);department.setForeground(Color.DARK_GRAY);
				    				    roll_no=new JTextField();student_pic.add(roll_no);roll_no.setBounds(470, 210, 180, 40);roll_no.setFont(f3);roll_no.setForeground(Color.DARK_GRAY);
		                		       student_Password=new JPasswordField();student_pic.add( student_Password); student_Password.setBounds(230,300,420,40); student_Password.setFont(f3); student_Password.setForeground(Color.DARK_GRAY);
		                		        student_icon2=new JLabel();student_pic.add(student_icon2);student_icon2.setBounds(640,0,600,380);student_icon2.setIcon(new ImageIcon("E:\\image\\Sa.png"));
		                		        sign_in=new JButton("LOGIN");student_pic.add(sign_in);sign_in.setBounds(350,400,110,40);sign_in.setFont(f3);sign_in.setForeground(Color.BLUE);
		                		      student_back=new JButton("BACK");student_pic.add(student_back);student_back.setBounds(0,520,100,40);student_back.setFont(f3);student_back.setForeground(Color.MAGENTA);
		   		    				  student_exit=new JButton("EXIT");student_pic.add(student_exit);student_exit.setBounds(805,520,100,40);student_exit.setFont(f3);student_exit.setForeground(Color.MAGENTA);
		                		      
		   		    				  sign_in.addActionListener(new student_login());          //ACTIONLISTENER FOR STUDENT SIGN IN BUTTON
		                		      student_back.addActionListener(new back1());            // ACTIONLISTENER FOR STUDENT BACK BUTTON
		                		      student_exit.addActionListener(new back1());           //ACTIONLISTENER FOR STUDENT EXIT BUTTON
		                		      
		                		      
		                		   }
		                		   
		                	   }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT SIGNIN BUTTON INNER CLASS                      *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                   

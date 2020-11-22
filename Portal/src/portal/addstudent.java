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
public class addstudent implements ActionListener{                        // C.9
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==add_student){
		                			   JFrame add_students=new JFrame();
		                			   add_students.setVisible(true);
		                			   student_login.setVisible(false);
		                			   add_students.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   add_students.setLayout(null);
		                			   add_students.setBounds(100,50,1400,680);
		                			   Font f5= new Font("Serif", Font.BOLD, 30);
		                			   student_reg_pic=new JLabel();add_students.add( student_reg_pic); student_reg_pic.setBounds(0,0,1400,680); student_reg_pic.setIcon(new ImageIcon("E:\\image\\7s.jpg"));
		                			   student_reg=new JLabel("STUDENT REGISTERATION"); student_reg_pic.add(student_reg);  student_reg.setBounds(240,-60,500,160);  new Font("Serif", Font.BOLD, 30); student_reg.setFont(f5); student_reg.setForeground(Color.RED);            			   
		                			   window2=new JLabel("WINDOW"); student_reg_pic.add(  window2); window2.setBounds(360,-10,500,160);   new Font("Serif", Font.BOLD, 30); window2.setFont(f5); window2.setForeground(Color.ORANGE);            			    
		                			  Font f7= new Font("Serif", Font.BOLD, 19); 
		                			   student_name=new JLabel("NAME");student_reg_pic.add(student_name);student_name.setBounds(90,120,140,20); new Font("Serif", Font.BOLD, 15);student_name.setFont(f7);student_name.setForeground(Color.YELLOW);
		    							std_father_name=new JLabel("FATHER NAME");student_reg_pic.add(std_father_name);std_father_name.setBounds(90,180,160,20);new Font("Serif", Font.BOLD, 15);std_father_name.setFont(f7);std_father_name.setForeground(Color.YELLOW);
		    							std_email=new JLabel("EMAIL");student_reg_pic.add(std_email);std_email.setBounds(90,240,140,20);new Font("Serif", Font.BOLD, 15);std_email.setFont(f7);std_email.setForeground(Color.YELLOW);
		    							std_DOB=new JLabel("DATE OF BIRTH");student_reg_pic.add(std_DOB);std_DOB.setBounds(90,360,170,20);new Font("Serif", Font.BOLD, 15);std_DOB.setFont(f7);std_DOB.setForeground(Color.YELLOW);
		    							
		    							String[] day=new String[31];
		    							for(int i=1;i<=31;i++){
		    								day[i-1]=Integer.toString(i);
		    							date=new JComboBox(day);
		    							}
		    							date.setBounds(285, 360,50, 22);student_reg_pic.add(date);new Font("Serif", Font.BOLD, 15);date.setFont(f7);date.setForeground(Color.DARK_GRAY);student_reg_pic.add(date);
		    								String[] mon={"january","february","march","april","may","june","july","august","september","october","november","december"};
		    								month=new JComboBox(mon);student_reg_pic.add(month);month.setBounds(355,360,120,22);new Font("Serif", Font.BOLD, 15);month.setFont(f7);month.setForeground(Color.DARK_GRAY);student_reg_pic.add(month);
		    							String [] years=new String[119];
		    								for(int i=0;i<=118;i++){
		    									years[i]=Integer.toString(y);
		    									y++;
		    									year=new JComboBox(years);
		    								}
		    								year.setBounds(500,360,70,22);student_reg_pic.add(year);new Font("Serif", Font.BOLD, 15);year.setFont(f7);year.setForeground(Color.DARK_GRAY);
		    								gender=new JLabel("GENDER");student_reg_pic.add(gender);gender.setBounds(90,420,140,22);new Font("Serif", Font.BOLD, 15);gender.setFont(f7);gender.setForeground(Color.YELLOW);
		    							std_cell_no=new JLabel("CELL NO");student_reg_pic.add(std_cell_no);std_cell_no.setBounds(90,300,140,22);new Font("Serif", Font.BOLD, 15);std_cell_no.setFont(f7);std_cell_no.setForeground(Color.YELLOW);
		    							std_cnic=new JLabel("CNIC");student_reg_pic.add(std_cnic);std_cnic.setBounds(90,480,140,22);new Font("Serif", Font.BOLD, 15);std_cnic.setFont(f7);std_cnic.setForeground(Color.YELLOW);
		    							std_res_address=new JLabel("RESIDENTIAL ADDRESS");student_reg_pic.add(std_res_address);std_res_address.setBounds(90,560, 250, 22);new Font("Serif", Font.BOLD, 15);std_res_address.setFont(f7);std_res_address.setForeground(Color.YELLOW);
		    							res_add_area=new JTextArea();student_reg_pic.add(res_add_area);res_add_area.setBounds(345,530,300,80);new Font("Serif", Font.BOLD, 15);res_add_area.setFont(f7);std_res_address.setForeground(Color.YELLOW);
		    							std_per_add=new JLabel("PERMANNET ADDRESS");student_reg_pic.add(std_per_add);std_per_add.setBounds(640,120,250,20);new Font("Serif", Font.BOLD, 15);std_per_add.setFont(f7);std_per_add.setForeground(Color.YELLOW);
		    						    per_add_area=new JTextArea();student_reg_pic.add(per_add_area);per_add_area.setBounds(880,100,300,80);new Font("Serif", Font.BOLD, 15);per_add_area.setFont(f7);per_add_area.setForeground(Color.DARK_GRAY);
		    							std_nationality=new JLabel("NATIONALITY");student_reg_pic.add(std_nationality);std_nationality.setBounds(640,220,160,22);new Font("Serif", Font.BOLD, 15);std_nationality.setFont(f7);std_nationality.setForeground(Color.YELLOW);
		    							String nationality1[]={"USA","Iran","Afghanistan","India","UK","UAE","Pakistan","Russia","Germani","Saudi Arabia","China","Japan","Turkey","England","Australia","Canda","Itly","Ireland","South Africa"};
		    							nationality=new JComboBox(nationality1);student_reg_pic.add(nationality);nationality.setBounds(880,220,150,22);new Font("Serif", Font.BOLD, 15);nationality.setFont(f7);nationality.setForeground(Color.DARK_GRAY);
		    							std_reg_chkbx=new JCheckBox("I AGREE THE ABOVE INFORMATION ARE CORRECT");student_reg_pic.add(std_reg_chkbx);std_reg_chkbx.setBounds(690,350,530,17);new Font("Serif", Font.BOLD, 15);std_reg_chkbx.setFont(f7);std_reg_chkbx.setForeground(Color.BLUE);
		    							add_btn=new JButton("ADD");student_reg_pic.add(add_btn);add_btn.setBounds(920,450,100,40);new Font("Serif", Font.BOLD, 15);add_btn.setFont(f7);add_btn.setForeground(Color.RED);
		    							name_txt=new JTextField();student_reg_pic.add(name_txt);name_txt.setBounds(285,120,180,30);name_txt.getText();new Font("Serif", Font.BOLD, 15);name_txt.setFont(f7);name_txt.setForeground(Color.DARK_GRAY);
		    							father_txt=new JTextField();student_reg_pic.add(father_txt);father_txt.setBounds(285, 180, 180, 30);father_txt.getText();new Font("Serif", Font.BOLD, 15);father_txt.setFont(f7);father_txt.setForeground(Color.DARK_GRAY);
		    							email=new JTextField();student_reg_pic.add(email);email.setBounds(285, 240, 180, 30);email.getText();;new Font("Serif", Font.BOLD, 15);email.setFont(f7);email.setForeground(Color.DARK_GRAY);
		    							cell_txt=new JTextField();student_reg_pic.add(cell_txt);cell_txt.setBounds(285, 300, 180, 30);cell_txt.getText();;new Font("Serif", Font.BOLD, 15);cell_txt.setFont(f7);cell_txt.setForeground(Color.DARK_GRAY);
		    							male_r=new JRadioButton("Male");student_reg_pic.add(male_r);male_r.setBounds(285,420,80,25);;
		    							female_r=new JRadioButton("Female");student_reg_pic.add(female_r); female_r.setBounds(380,420,80,25);
		    							cnic_txt=new JTextField();student_reg_pic.add(cnic_txt);cnic_txt.setBounds(285, 480, 180, 30);cnic_txt.getText();;new Font("Serif", Font.BOLD, 15);cnic_txt.setFont(f7);cnic_txt.setForeground(Color.DARK_GRAY);
		    							ButtonGroup gender=new ButtonGroup();
		    							gender.add(male_r);
		    							gender.add(female_r);
		    							
		    							add_btn.addActionListener(new Add());  //ACTIONLISTNER FOR SUBMIT BUTTON 
		    						}
		                	   }
		    					
		    				/*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                     ADD BUTTON INNER CLASS                          *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
                              

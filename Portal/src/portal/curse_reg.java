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
public class course_reg implements ActionListener{                                          // C.22
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame crs_reg=new JFrame();
		                        		crs_reg.setVisible(true);
		                        		crs_reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		crs_reg.setLayout(null);
		                        		crs_reg.setBounds(100,50,900,600);
		                        		Font f14=new Font("Serif", Font.BOLD, 20);
		                        		course_reg_pic=new JLabel();crs_reg.add(course_reg_pic);course_reg_pic.setBounds(0,0,900,600);course_reg_pic.setIcon(new ImageIcon("E:\\image\\b.jpg"));
		                        		 Welcome2=new JLabel("WELCOME");course_reg_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.CYAN);
		    		    				 To2=new JLabel("TO");course_reg_pic.add(To2);To2.setBounds(410,70,100,50);To2.setFont(f); To2.setForeground(Color.GREEN);To2.setFont(f);
		    		    				 course_reg_lbl=new JLabel("COURSE REGISTERATION WINDOW");course_reg_pic.add(course_reg_lbl);course_reg_lbl.setBounds(160,110,550,50); course_reg_lbl.setForeground(Color.YELLOW);course_reg_lbl.setFont(f);
		    		    				 oop_chkbx=new JCheckBox("OBJECT ORIENTED PROGRAMMING(OOP)");course_reg_pic.add(oop_chkbx);oop_chkbx.setBounds(40,180,440,20);oop_chkbx.setFont(f14);oop_chkbx.setForeground(Color.RED);
		    		    				 eca_chkbx=new JCheckBox("ELECTRIC CIRCUIT ANALYSIS (ECA)");course_reg_pic.add( eca_chkbx); eca_chkbx.setBounds(40,210,440,20); eca_chkbx.setFont(f14); eca_chkbx.setForeground(Color.RED); 
		    		    				 se_chkbx=new JCheckBox("SOFTWARE ENGINEERING (SE)");course_reg_pic.add(se_chkbx);se_chkbx.setBounds(40,240,440,20);se_chkbx.setFont(f14);se_chkbx.setForeground(Color.RED);
		    		    				 p_stdy_chkbx=new JCheckBox("PAKISTAN STUDY (PAK-STUDY)");course_reg_pic.add(p_stdy_chkbx);p_stdy_chkbx.setBounds(40,270,440,20);p_stdy_chkbx.setFont(f14);p_stdy_chkbx.setForeground(Color.RED);
		    		    				 cal1_chkbx=new JCheckBox("CALCULUS AND ANALYTICAL GEOMENTRY");course_reg_pic.add(cal1_chkbx);cal1_chkbx.setBounds(40,300,440,20);cal1_chkbx.setFont(f14);cal1_chkbx.setForeground(Color.RED);
		    		    				 cal2_chkbx=new JCheckBox("MULTIVARIABLE CALCULUS(CAL2)");course_reg_pic.add(cal2_chkbx);cal2_chkbx.setBounds(40,330,440,20);cal2_chkbx.setFont(f14);cal2_chkbx.setForeground(Color.RED);
		    		    				 r_w_chkbx=new JCheckBox("REPORT WRITING SKILL(R-WRITING)");course_reg_pic.add(r_w_chkbx);r_w_chkbx.setBounds(40,360,440,20);r_w_chkbx.setFont(f14);r_w_chkbx.setForeground(Color.RED);
		    		    				 mangmnet_chkbx=new JCheckBox("MAMAGMENT SCIENCE (M-SCIENCE)");course_reg_pic.add(mangmnet_chkbx); mangmnet_chkbx.setBounds(40,390,440,20); mangmnet_chkbx.setFont(f14); mangmnet_chkbx.setForeground(Color.RED);
		    		    				 itcp_chkbx=new JCheckBox("INTRO.. TO COMP.. AND PROG..(ITCP)");course_reg_pic.add(itcp_chkbx);itcp_chkbx.setBounds(40,420,440,20);itcp_chkbx.setFont(f14);itcp_chkbx.setForeground(Color.RED);
		                        	     reg_btn=new JButton("REGISTER");course_reg_pic.add(reg_btn);reg_btn.setBounds(400,500,140,40);reg_btn.setFont(f14);reg_btn.setForeground(Color.RED);setFont(f14);reg_btn.setForeground(Color.BLUE);
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *               MARKS BUTTON INNER CLASS                                      *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     ******************************************************************************/
		                        

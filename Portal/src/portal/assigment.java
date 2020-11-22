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
public class assignment implements ActionListener{                 //C.15
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame assgn=new JFrame();
		                        		assgn.setVisible(true);
		                        		assgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		assgn.setLayout(null);
		                        		assgn.setBounds(100,50,900,600);
		                        		Font f11=new Font("Serif", Font.BOLD, 25);
		                        	assign_pic=new JLabel();assgn.add(assign_pic);assign_pic.setBounds(0,0,900,600);assign_pic.setIcon(new ImageIcon("E:\\image\\b.jpg"));
		                        	oop_btn=new JButton("OOP");assign_pic.add(oop_btn);oop_btn.setBounds(240,200,100,40);oop_btn.setFont(f11);oop_btn.setForeground(Color.RED);
		                        	eca_btn=new JButton("ECA");assign_pic.add(eca_btn);eca_btn.setBounds(400,200,100,40);eca_btn.setFont(f11);eca_btn.setForeground(Color.RED);
		                        	se_btn=new JButton("SE");assign_pic.add(se_btn);se_btn.setBounds(560,200,100,40);se_btn.setFont(f11);se_btn.setForeground(Color.RED);
		                        	pakstdy_btn=new JButton("P-STUDY");assign_pic.add(pakstdy_btn);pakstdy_btn.setBounds(270,320,160,40);pakstdy_btn.setFont(f11);pakstdy_btn.setForeground(Color.BLUE);
		                        	rwriting_btn=new JButton("R-WRITING");assign_pic.add(rwriting_btn);rwriting_btn.setBounds(450,320,180,40);rwriting_btn.setFont(f11);rwriting_btn.setForeground(Color.BLUE);
		                        	cal2_btn=new JButton("CALCULUS-2");assign_pic.add(cal2_btn);cal2_btn.setBounds(350,440,200,40);cal2_btn.setFont(f11);cal2_btn.setForeground(Color.MAGENTA);
		                        	
		                        	oop_btn.addActionListener(new oop());                    // ACTIONLISTENER FOR OOP       BUTTON.
		                        	eca_btn.addActionListener(new eca());                   // ACTIONLISTENER  FOR ECA       BUTTON.
		                        	se_btn.addActionListener(new se());                    // ACTIONLISTENER   FOR SE        BUTTON.
		                        	pakstdy_btn.addActionListener(new p_study());         // ACTIONLISTENER    FOR P_STDY    BUTTON.
		                        	rwriting_btn.addActionListener(new r_wrtng());       // ACTIONLISTENER     FOR R_WRITING BUTTON.
		                        	cal2_btn.addActionListener(new cal2());             // ACTIONLISTENER      FOR CAL       BUTTON.
		                        	}
		                        }
		                        

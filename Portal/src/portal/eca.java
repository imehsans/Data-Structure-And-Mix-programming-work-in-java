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
public class eca implements ActionListener{                              //C.17
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame eca=new JFrame();
		                        		eca.setVisible(true);
		                        		eca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		eca.setLayout(null);
		                        		eca.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel();eca.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\r.jpg"));
		                                 oop_lbl=new JLabel("ELECTRIC CIRCUIT ANALYSIS(ECA)");	oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.CYAN);	
		                                 assignment();               //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }

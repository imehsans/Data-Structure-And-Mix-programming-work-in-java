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
public class hec_scholorship implements ActionListener{                       // C.12
		                	   public void actionPerformed(ActionEvent e){
		                		   JFrame hec=new JFrame();
		                		   hec.setVisible(true);
		                		   hec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   hec.setLayout(null);
		                		   hec.setBounds(100,50,900,600);
		                		  Font f9=new Font("Serif", Font.BOLD, 25);
		                		  Font f10=new Font("Serif", Font.BOLD, 17);
		                		   hec_sch_pic=new JLabel();hec.add(hec_sch_pic);hec_sch_pic.setBounds(0,0,900,600);hec_sch_pic.setIcon(new ImageIcon("E:\\image\\ee.jpeg"));
		                		  hec_label=new JLabel("HEC NEED BASE SCHOLORSHIP");hec_sch_pic.add(hec_label);hec_label.setBounds(260,30,400,40);hec_label.setFont(f9);hec_label.setForeground(Color.RED);
		                		  
		                		  scholorship();     //CALLING SCHOLORSHIP FUNCTION.      
		                	   }
		                   }
		                   
		                   /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                    USAID SCHOLORSHIP BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                   
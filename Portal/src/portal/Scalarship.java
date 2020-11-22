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
public class scholorship implements ActionListener{              //C.11
		                	   public void actionPerformed(ActionEvent e){
		                		   JFrame scholor=new JFrame();
		                		   scholor.setVisible(true);
		                		   scholor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   scholor.setLayout(null);
		                		   scholor.setBounds(100,50,900,600);
		                		   Font f8=new Font("Serif", Font.BOLD, 25);
		                		  
		                		   scholorship_pic=new JLabel(); scholor.add(scholorship_pic); scholorship_pic.setBounds(0,0,900,600);scholorship_pic.setIcon(new ImageIcon("E:\\image\\sch.jpg"));
		                		   hec_scholor=new JButton("HEC");scholorship_pic.add(hec_scholor);hec_scholor.setBounds(55,350,120,40);hec_scholor.setFont(f8);hec_scholor.setForeground(Color.RED);
		                		   usaid_scholor=new JButton("USAID");scholorship_pic.add(usaid_scholor);usaid_scholor.setBounds(55,420,120,40);usaid_scholor.setFont(f8);usaid_scholor.setForeground(Color.RED);
		                		   wwb_scholor=new JButton("WWB");scholorship_pic.add(wwb_scholor);wwb_scholor.setBounds(55,490,120,40);wwb_scholor.setFont(f8);wwb_scholor.setForeground(Color.RED);
		                	       
		                		   hec_scholor.addActionListener(new hec_scholorship());     //ACTIONLISTENER FOR HEC   SCHOLORSHIP BUTTON
		                	       usaid_scholor.addActionListener(new usaid());            //ACTIONLISTENER  FOR USAID SCHOLORSHIP BUTTON
		                	       wwb_scholor.addActionListener(new wwb());                //ACTIONLISTENER  FOR WWB   SCHOLORSHIP BUTTON
		                	   }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                    HEC SCHOLORSHIP BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                    

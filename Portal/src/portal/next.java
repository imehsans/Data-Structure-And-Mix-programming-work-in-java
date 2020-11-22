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
public class next implements ActionListener{         //C.2
		    public void actionPerformed(ActionEvent e){
		    	if(e.getSource()==next){
		    		//JFrame Student_Admin=new JFrame();
		    		Student_Admin.setVisible(true);
		    		setVisible(false);
		    		Student_Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    		Student_Admin.setBounds(100,50,900,600);
		    		Student_Admin.setLayout(null);
		    		A_S_picture2=new JLabel();Student_Admin.add(A_S_picture2);  A_S_picture2.setBounds(0,0,900,90); A_S_picture2.setIcon(new ImageIcon("E:\\image\\A_S.jpg"));
		    		A_S_picture3=new JLabel();Student_Admin.add(A_S_picture3);  A_S_picture3.setBounds(0,460,900,100); A_S_picture3.setIcon(new ImageIcon("E:\\image\\A_S2.jpg"));
		    		admin=new JButton("ADMIN");Student_Admin.add(admin);admin.setBounds(150,250,130,50);Font f2=new Font("Serif", Font.BOLD, 20);admin.setForeground(Color.blue);admin.setFont(f2);
		    		student=new JButton("STUDENT");Student_Admin.add(student);student.setBounds(580,250,130,50);new Font("Serif", Font.BOLD, 20);student.setForeground(Color.blue);student.setFont(f2);
		    		A_S_picture4=new JLabel();Student_Admin.add(A_S_picture4);A_S_picture4.setBounds(420,90,30,400);A_S_picture4.setIcon(new ImageIcon("E:\\image\\A_S4.jpg"));
		    		A_S_picture5=new JLabel();Student_Admin.add(A_S_picture5);A_S_picture5.setBounds(0,90,20,400);A_S_picture5.setIcon(new ImageIcon("E:\\image\\A_S5.jpg"));
		    		A_S_picture6=new JLabel();Student_Admin.add(A_S_picture6);A_S_picture6.setBounds(860,90,30,400);A_S_picture6.setIcon(new ImageIcon("E:\\image\\A_S6.jpg"));
		    		Container c=Student_Admin.getContentPane();
		    		c.setBackground(Color.red);
		    		admin.addActionListener(new ADMIN());           //ACTION LISTENER FOR ADMIN BUTTON
		    		student.addActionListener(new student());       //ACTIONLISTENER FOR STUDENT BUTTON
		    		
		    	}
		    }
		    }
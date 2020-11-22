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
public class Add implements ActionListener{             //C.10
                            	  public void actionPerformed(ActionEvent e){
                              
		    				if(e.getSource()==add_btn){
		    						if(std_reg_chkbx.isSelected()==true){
		    							String name=name_txt.getText();
		    							String father_name=father_txt.getText();
		    							String email1=email.getText();
		    							String day1=(String)date.getSelectedItem();
		    							String month1=(String)month.getSelectedItem();
		    							String year1=(String)year.getSelectedItem();
		    							String nation=(String)nationality.getSelectedItem();
		    							String gend="MALE";
		    							if(female_r.isSelected()==true){
		    								 gend="FEMALE";
		    							}
		    							String cell_no=cell_txt.getText();
		    							String r_add=res_add_area.getText();
		    							String p_add=per_add_area.getText();
		    							JFrame stor=new JFrame();
		    							stor.setBounds(100,50,900,600);
		    							stor.setLayout(null);
		    							stor.setVisible(true);
		    							JLabel set_pic;
		    							set_pic=new JLabel();
		    							stor.add(set_pic);set_pic.setBounds(0,0,900,600);set_pic.setIcon(new ImageIcon("E:\\image\\r.jpg"));
		    							JTextArea a;
		    							a=new JTextArea();set_pic.add(a);a.setBounds(0,0,900,600);Font f6=new Font("Serif", Font.BOLD, 20);a.setFont(f6);a.setForeground(Color.DARK_GRAY);    
		    							a.setText("STUDENT ARE REGISTERED SUCCESSFULLY\n\n"+"name:\t\t"+name+"\n\n father name:\t\t"+father_name+"\n\n email:\t\t"+email1+"\n\nDOB:\t\t"+day1+""+month1+""+year1+"\n\nGender:\t\t"+gend+"\n\nReidential address:\t"+r_add+"\n\nPermanent address:\t"+p_add+"\n\nNationality:\t\t"+nation);
		    						}
		    						else
		    						{
		    							JFrame chkbox=new JFrame();
		    							chkbox.setVisible(true);
		    							chkbox.setLayout(null);
		    							chkbox.setBounds(100,50,360,180);
		    							JLabel pic=new JLabel();chkbox.add(pic);pic.setBounds(0, 0, 360, 180);pic.setIcon(new ImageIcon("E:\\image\\7s.jpg"));
		    							JLabel submit2=new JLabel("FIRST CONFIRM THE INFORMATION");pic.add(submit2);submit2.setBounds(20,10,300,100);Font f6=new Font("Serif", Font.BOLD, 15);submit2.setFont(f6);submit2.setForeground(Color.DARK_GRAY);    
                            	  }
		    					}
                            	  }
                              }

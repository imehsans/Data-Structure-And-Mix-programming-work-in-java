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
public class back implements ActionListener{                    // C.5
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==admin_back){
		                				   Student_Admin.setVisible(true);
		                				   ADMIN.setVisible(false);
		                				   
		                	   }
		                			   if(e.getSource()==admin_exit){
		                				   ADMIN.setVisible(false);
		                				   
		                			   }
		                	   }
		                   }
		                     /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                  

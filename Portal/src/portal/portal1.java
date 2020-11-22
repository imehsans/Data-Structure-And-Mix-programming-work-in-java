/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import javax.swing.JFrame;
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
public class Portal extends JFrame {   //C.1
JFrame Student_Admin=new JFrame();
JFrame ADMIN=new JFrame();
JFrame student_login=new JFrame();
int y=1920;
int h=2000;
int g=2000;
		 JLabel uni_pic,CIIT_logo,Welcome,To,Student,student1,portal,A_S_picture2,
		 A_S_picture3,student_icon,admin_icon,uni_pic2,A_S_picture4,
		 A_S_picture5,A_S_picture6,admin_pic,Welcome2,To2,Admin,login,
		 username,password,admin_login_pic,message,admin_window_pic,window,student_pic,student_l,
		 student_rollno,student_pass,student_icon2,message1,
		 student_window_pic,student_reg,student_reg_pic,window2,student_name,std_father_name,
		 std_email,std_DOB,gender,std_cell_no,std_cnic,std_res_address,std_per_add,
		 std_nationality,scholorship_pic,scholor_pic,hec_sch_pic,hec_label,
		 strt_lbl,from_lbl,to_lbl,elg_lbl,inf_labl,Sch_pic2,
		 usaid_sch_pic,usaid_label,assign_pic,oop_pic, oop_lbl,assign_no
		 ,assign_topic,ques_no,upload_dte,last_dte,assign_pic2,
		 course_reg_pic,course_reg_lbl;
		 JButton next,admin,student,admin_login,admin_back,admin_exit
		 ,add_student,scholorship,student_fee_information,assignment,
		 quiz,marks,result,sign_in,student_back,student_exit,
		 course_reg,disp_scholorship,disp_mark,fee_information,assignment2,quizes,
		 disp_result,add_btn,hec_scholor,usaid_scholor,wwb_scholor,upload_btn,
		 oop_btn,cal2_btn,eca_btn,se_btn,pakstdy_btn,rwriting_btn,upld_btn,back_btn,reg_btn;
		    JTextField username_t,roll_no,name_txt,father_txt,cnic_txt,cell_txt,
		    email,assign_notxt,ques_no_txt;
		    JPasswordField Admin_pass,student_Password;
		    JComboBox department,session,date,month,year,nationality,date_combo,
		    month_combo,year_combo,date2_combo,month2_combo,year2_combo,date2,month2,year2;
		    JTextArea res_add_area,per_add_area,elg_txt_a,inf_txt_a, assign_topic_a;
		    JCheckBox std_reg_chkbx,oop_chkbx,eca_chkbx,se_chkbx,p_stdy_chkbx,cal1_chkbx,cal2_chkbx,r_w_chkbx,mangmnet_chkbx,itcp_chkbx;
		    JRadioButton male_r,female_r;
		    
		    public void scholorship(){                                      //SCHOLORSHIP FUNCTION.
			
		    	Font f9=new Font("Serif", Font.BOLD, 25);
  		   Font f10=new Font("Serif", Font.BOLD, 17);
			strt_lbl=new JLabel("START");hec_sch_pic.add(strt_lbl);strt_lbl.setBounds(395,75,100,40);strt_lbl.setFont(f9);strt_lbl.setForeground(Color.orange);
				from_lbl=new JLabel("FROM");hec_sch_pic.add(from_lbl);from_lbl.setBounds(40,130,100,40);from_lbl.setFont(f9);from_lbl.setForeground(Color.GREEN);
				String[] d=new String[31];
				for(int i=1;i<=31;i++){
					d[i-1]=Integer.toString(i);
					date_combo=new JComboBox(d);	
				}
				hec_sch_pic.add(date_combo);date_combo.setBounds(130,135,65,30);date_combo.setFont(f9);date_combo.setForeground(Color.DARK_GRAY);
				String date=(String)date_combo.getSelectedItem();
				
				String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
				month_combo=new JComboBox(month);hec_sch_pic.add(month_combo);month_combo.setBounds(210,135,130,30);month_combo.setFont(f9);month_combo.setForeground(Color.DARK_GRAY);
				String months=(String)month_combo.getSelectedItem();
				String y[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
			/*	for(int i=0;i<20;i++){
					y[i]=Integer.toString(h);
					h++;
					year_combo=new JComboBox(y);
				}*/
				
				year_combo=new JComboBox(y);hec_sch_pic.add(year_combo);year_combo.setBounds(350,135,90,30);year_combo.setFont(f9);year_combo.setForeground(Color.DARK_GRAY);
				String year=(String)year_combo.getSelectedItem();
				to_lbl=new JLabel("TO");hec_sch_pic.add(to_lbl);to_lbl.setBounds(475,130,60,40);to_lbl.setFont(f9);to_lbl.setForeground(Color.GREEN);
				String[] D=new String[31];
				for(int i=1;i<=31;i++){
					D[i-1]=Integer.toString(i);
					date2_combo=new JComboBox(D);	
				}
				hec_sch_pic.add(date2_combo);date2_combo.setBounds(540, 135, 65, 30);date2_combo.setFont(f9);date2_combo.setForeground(Color.DARK_GRAY);
				String date2=(String)date2_combo.getSelectedItem();
				String m[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
				month2_combo=new JComboBox(m);hec_sch_pic.add(month2_combo);month2_combo.setBounds(620,135,130,30);month2_combo.setFont(f9);month2_combo.setForeground(Color.DARK_GRAY);
				String months2=(String)month2_combo.getSelectedItem();
			String years[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};//=new String[20];
			/*for(int i=0;i<20;i++){
				years[i]=Integer.toString(g);
				g++;
				year2_combo=new JComboBox(years);
			}*/
			year2_combo=new JComboBox(years);hec_sch_pic.add(year2_combo);year2_combo.setBounds(760,135,90,30);year2_combo.setFont(f9);year2_combo.setForeground(Color.DARK_GRAY);        
			String year2=(String)year2_combo.getSelectedItem();
			elg_lbl=new JLabel("ELIGIBILITY CRITERIA");hec_sch_pic.add(elg_lbl);elg_lbl.setBounds(40,230,300,40);elg_lbl.setFont(f9);elg_lbl.setForeground(Color.YELLOW);
			elg_txt_a=new JTextArea();hec_sch_pic.add(elg_txt_a);elg_txt_a.setBounds(40,270,500,100);elg_txt_a.setFont(f10);elg_txt_a.setForeground(Color.DARK_GRAY);
			inf_labl=new JLabel("INFORMATION");hec_sch_pic.add(inf_labl);inf_labl.setBounds(40,375,200,40);inf_labl.setFont(f9);inf_labl.setForeground(Color.YELLOW);
			inf_txt_a=new JTextArea();hec_sch_pic.add(inf_txt_a);inf_txt_a.setBounds(40,420,500,100);inf_txt_a.setFont(f10);inf_txt_a.setForeground(Color.DARK_GRAY);
			upload_btn=new JButton("UPLOAD");	hec_sch_pic.add(upload_btn);upload_btn.setBounds(720,520,150,40);upload_btn.setFont(f9);upload_btn.setForeground(Color.RED);
		   Sch_pic2=new JLabel();hec_sch_pic.add(Sch_pic2);Sch_pic2.setBounds(550,267,330,250);Sch_pic2.setIcon(new ImageIcon("E:\\image\\schh2.jpg"));
		   back_btn=new JButton("BACK");hec_sch_pic.add(back_btn);back_btn.setBounds(0,560,100,40);back_btn.setFont(f9);back_btn.setForeground(Color.RED);
    	   
		}
		        public void assignment(){                              //ASSIGNEMENT FUNCTION.
		        	
		        	Font f12=new Font("Serif", Font.BOLD, 25);
            		 Font f13=new Font("Serif", Font.BOLD, 20);
            		 assign_pic2=new JLabel();oop_pic.add(assign_pic2);assign_pic2.setBounds(500, 50, 400, 300);assign_pic2.setIcon(new ImageIcon("E:\\image\\12.png"));
		    	     assign_no=new JLabel("ASSIGNMENT NO #");oop_pic.add( assign_no); assign_no.setBounds(50,100,300,40); assign_no.setFont(f12); assign_no.setForeground(Color.RED);
                    assign_notxt=new JTextField();oop_pic.add(assign_notxt);assign_notxt.setBounds(300, 105, 150, 30); assign_notxt.setFont(f12); assign_notxt.setForeground(Color.DARK_GRAY);
                	String assignment_no=assign_notxt.getText();
                	 assign_topic=new JLabel("TOPIC");oop_pic.add(assign_topic);assign_topic.setBounds(50,160,300,40);assign_topic.setFont(f12);assign_topic.setForeground(Color.RED);
                	 assign_topic_a=new JTextArea();oop_pic.add( assign_topic_a); assign_topic_a.setBounds(145,150,305,100); assign_topic_a.setFont(f13); assign_topic_a.setForeground(Color.DARK_GRAY);
                	 ques_no=new JLabel("QUESTION NO #");oop_pic.add(ques_no);ques_no.setBounds(50,270,300,40);ques_no.setFont(f12); ques_no.setForeground(Color.RED);
                	 ques_no_txt=new JTextField();oop_pic.add( ques_no_txt); ques_no_txt.setBounds(300,265,150,30);ques_no_txt.setFont(f13); ques_no_txt.setForeground(Color.DARK_GRAY);
                	upload_dte=new JLabel("UPLOADED DATE");oop_pic.add(upload_dte);upload_dte.setBounds(50,330,300,40);upload_dte.setFont(f12); upload_dte.setForeground(Color.RED);
                	String[] day=new String[31];
					for(int i=1;i<=31;i++){
						day[i-1]=Integer.toString(i);
					date=new JComboBox(day);
					}
					date.setBounds(300, 335,60, 25);oop_pic.add(date);date.setFont(f13);date.setForeground(Color.DARK_GRAY);
						String[] mon={"january","february","march","april","may","june","july","august","september","october","november","december"};
						month=new JComboBox(mon);oop_pic.add(month);month.setBounds(380,335,120,25);month.setFont(f13);month.setForeground(Color.DARK_GRAY);
						String years[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
						/*for(int i=0;i<=118;i++){
							years[i]=Integer.toString(y);
							y++;
							year=new JComboBox(years);
						}*/
						year=new JComboBox(years);year.setBounds(520,335,70,25);oop_pic.add(year);year.setFont(f13);year.setForeground(Color.DARK_GRAY);
                	    last_dte=new JLabel("SUBMISSION DATE");oop_pic.add(last_dte);last_dte.setBounds(50,390,300,40);last_dte.setFont(f12);last_dte.setForeground(Color.RED);
                	
                	    String[] day2=new String[31];
						for(int i=1;i<=31;i++){
							day2[i-1]=Integer.toString(i);
						date2=new JComboBox(day2);
						}
						date2.setBounds(300, 395,60, 25);oop_pic.add(date2);date2.setFont(f13);date2.setForeground(Color.DARK_GRAY);
							String[] mon2={"january","february","march","april","may","june","july","august","september","october","november","december"};
							month2=new JComboBox(mon2);oop_pic.add(month2);month2.setBounds(380,395,120,25);month2.setFont(f13);month2.setForeground(Color.DARK_GRAY);
							String years2[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
							/*for(int i=0;i<=118;i++){
								years[i]=Integer.toString(h);
								h++;
								year2=new JComboBox(years2);
							}*/
							
							year2=new JComboBox(years2);year2.setBounds(520,395,70,25);oop_pic.add(year2);year2.setFont(f13);year2.setForeground(Color.DARK_GRAY);
                	          
		                       upld_btn=new JButton("UPLOAD");oop_pic.add(upld_btn);upld_btn.setBounds(380,485,130,40);upld_btn.setFont(f13);upld_btn.setForeground(Color.BLUE);
                	
                	
		    }
		    Portal(){          //constractor of Portal class 
		    	
		        uni_pic=new JLabel();add(uni_pic);uni_pic.setBounds(0,130,900,600); uni_pic.setIcon(new ImageIcon("E:\\image\\schools.jpg"));
		        uni_pic2=new JLabel();add(uni_pic2);uni_pic2.setBounds(0,120,900,10); uni_pic2.setIcon(new ImageIcon("E:\\image\\3.jpg"));
		        CIIT_logo=new JLabel();add(CIIT_logo);CIIT_logo.setBounds(20,0,480,100); CIIT_logo.setIcon(new ImageIcon("E:\\image\\logo.png")); 
		        Welcome=new JLabel("WELCOME");add(Welcome);Welcome.setBounds(640,10,300,50); Font f=new Font("Serif", Font.BOLD, 30);
		        new Font("SansSerif", Font.BOLD, 30); Welcome.setFont(f); Welcome.setForeground(Color.MAGENTA);
		        To=new JLabel("TO");add(To);To.setBounds(705,40,100,50);To.setFont(f); To.setForeground(Color.RED);
		        Student=new JLabel("STUDENT");add(Student);Student.setBounds(570,70,300,50);new Font("Serif", Font.BOLD, 30);Student.setForeground(Color.GREEN); Student.setFont(f);
		        portal=new JLabel("PORTAL");add(portal);portal.setBounds(730,70,300,50);Font f1=new Font("Serif", Font.BOLD, 30);portal.setFont(f1);portal.setForeground(Color.GREEN);
		        next=new JButton("NEXT"); add(next);next.setBounds(770,560,120,50);new Font("Serif", Font.BOLD, 20);next.setForeground(Color.MAGENTA);next.setFont(f);
		          JLabel l; l=new JLabel("ABC"); l.setBounds(100,0,100,30);  add(l);//this label is used to add a button.
		          
		       next.addActionListener(new next());     //ACTIONLISTENER FOR NEXT BUTTON
		      }
		    
		    /*******************************************************************************
		     *******************************************************************************
		     *                                                                             *
		     *                      NEXT BUTTON INNER CLASS                                *  
		     *                                                                             *
		     ******************************************************************************
		     *******************************************************************************/


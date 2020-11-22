/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProjectW {
    MemClass c;

    public ProjectW()  throws IOException{
        this.c = new MemClass();
    }
    public void set(String id, String name, String father_name, String cnic, String contact, String date_of_birth, String e_mail, Integer room_num, Integer monthly_fee, String hNo, String street, String city, String state) throws Exception{
    c.setMemInfo( id, name, father_name, cnic, contact, date_of_birth, e_mail, room_num, monthly_fee, hNo, street, city, state);
    }
    
    
    
    /**
     * @param args the command line arguments-
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
    
    Front fnt=new Front();
    fnt.setVisible(true);
    Scanner scan=new Scanner(System.in);
    
    MemClass c=new MemClass();
    int choice;
    
    do
        {
            System.out.println("      ENTER YOUR CHOICE     ");
            System.out.println("____________________________");
            System.out.println("|||[1] ADD NEW MEMBER    |||");
            System.out.println("|||______________________|||");
            System.out.println("|||[2] SEARCH MEMBER     |||");
            System.out.println("|||______________________|||");
            System.out.println("|||[3] DELETE MEMBER     |||");
            System.out.println("|||______________________|||");
            System.out.println("|||[4] SHOW LIST         |||");
            System.out.println("|||______________________|||");
            System.out.println("|||[5] EDIT MEMBER RECORD|||");
            System.out.println("|||______________________|||");
            System.out.println("|||[6] SHOW GROUP MEMBER |||");
            System.out.println("|||______________________|||");
            System.out.println("|||-------[7] EXIT-------|||");
            System.out.println("____________________________");
            System.out.print("Enter your Choice: ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.print("ENTER ID             :");
                    String  id=scan.next();
                    System.out.print("\nENTER Name         :");
                    String nm=scan.next();
                    System.out.print("\nENTER Father Name  :");
                    String fnm=scan.next();
                    System.out.print("\nENTER CNIC         :");
                    String cnic=scan.next();
                    System.out.print("\nENTER Contact      :");
                    String cnt=scan.next();
                    System.out.print("\nENTER date of birth:");
                    String  dob=scan.next();
                    System.out.print("\nENTER Email        :");
                    String eml=scan.next();
                    System.out.print("\nENTER Room Number  :");
                    Integer rmnm=scan.nextInt();
                    System.out.print("\nENTER Monthly Fee  :");
                    Integer fee=scan.nextInt();
                    System.out.print("\nENTER House Num    :");
                    String husnm=scan.next();
                    System.out.print("\nENTER Streat Number:");
                    String strtnm=scan.next();
                    System.out.print("\nENTER City Name    :");
                    String ctnam=scan.next();
                    System.out.print("\nENTER State        :");
                    String stat=scan.next();
                    System.out.println("\n");
                    c.setMemInfo(id, nm, fnm, cnic,cnt, dob, eml, rmnm, fee,husnm , strtnm, ctnam, stat);
                    
                    break;
                case 2:
                    System.out.print("ENTER ID             :");
                    id=scan.next();
                    System.out.print("\nENTER Name         :");
                    nm=scan.next();
                    System.out.println("\n");
                    c.search(id,nm);
                    
                    break;
                case 3:
                    System.out.print("ENTER ID             :");
                    id=scan.next();
                    System.out.print("\nENTER Name         :");
                    nm=scan.next();
                    System.out.println("\n");
                    c.remove(id, nm);
                    
                    break;
                case 4:
                    c.print();
                    
                    break;
                case 5:
                    System.out.print("ENTER ID             :");
                    id=scan.next();
                    System.out.print("\nENTER Name         :");
                    nm=scan.next();
                    System.out.println("\n");
                    c.Edit_Mem(id, nm);
                    break;
                case 6:
                    c.showMem();
                    break;
                default:
                    System.out.println("");
            }
        }while(choice!=7);
    }    
}    
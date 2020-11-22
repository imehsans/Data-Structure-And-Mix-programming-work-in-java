/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;


import java.awt.Component;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MemClass {
    protected ArrayList <Member> newmem;
    private Component rootPane;
    
    public MemClass() throws FileNotFoundException, IOException{
        newmem=new ArrayList<>();
    }
    
    Scanner scan=new Scanner(System.in);

    void setMemInfo(String id, String name, String fnm, String cnic, String cnt, String dob, String eml,Integer rmnm,Integer fee,String husnm,String strtnm,String ctnam,String stat)throws IOException{
        newmem.add(new Member(id,name, fnm,cnic,cnt,dob,eml,rmnm,fee,husnm,strtnm,ctnam,stat));
        try{
            try ( FileOutputStream fle_otpt_strm = new FileOutputStream("Record.java");
            ObjectOutputStream obj_otpt_strm=new ObjectOutputStream(fle_otpt_strm);){
        
                obj_otpt_strm.writeObject(newmem);
                System.out.println("Done");
                JOptionPane.showMessageDialog(rootPane, "Done");
            }
        }catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Problem");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    void print() throws IOException, ClassNotFoundException{
        // Deserialization
        try
        {
            try(// Reading the object from a file
                FileInputStream file = new FileInputStream("Record.java");
                ObjectInputStream o_i_s  =new ObjectInputStream(file)) {// Method for deserialization of object
                newmem = (ArrayList<Member>) o_i_s.readObject();
            }
            // Method for deserialization of object
            newmem.forEach((n) -> {
                System.out.println(n);
            }); //  System.out.println("a = " + newmem.toString()); 
        }catch(EOFException e){
            
	}
    } 
    
    void search(String id, String name) throws ClassNotFoundException, FileNotFoundException, IOException{     
        int k=0;
        try (FileInputStream file = new FileInputStream("Record.java");
                ObjectInputStream in = new ObjectInputStream(file)) {
            newmem= (ArrayList<Member>) in.readObject();
            int i=-1;
            for(Member c :newmem){
                i++;
                if( (c.getId().equals(id)) || (c.getName().equals(name))){
                    k=1;
                    System.out.println(newmem.get(i));
                    JOptionPane.showConfirmDialog(rootPane, "FOUND");
                    
                }
            }
            if(k!=1){
                System.out.println("not found");
            }
            in.close(); 
            file.close(); 
        }catch(IOException e){   
        }
    }
     
    void remove(String id, String name) throws FileNotFoundException, IOException, ClassNotFoundException{     
        try (FileInputStream file = new FileInputStream("Record.java"); ObjectInputStream in = new ObjectInputStream(file)) {
            newmem = (ArrayList<Member>) in.readObject();
            int k=0;
            int i=-1;
            FileOutputStream fos=new FileOutputStream("Record.java");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for(Member c :newmem){
                    i++;
                    if((c.getId().equals(id)) && (c.getName().equals(name))){
                        k=1;
                        newmem.remove(i);
                        oos.writeObject(newmem);
                        System.out.println("done");
                        oos.close();
                        fos.close();
                        file.close();
                        in.close();
                    }
                }
                if(k!=1){
                System.out.println("not found");
                }
            }
        } catch ( ConcurrentModificationException h){
        }
    }

     
    @SuppressWarnings("unchecked")
    void Edit_Mem(String id, String name) throws IOException, ClassNotFoundException{
        try (FileInputStream file = new FileInputStream("Record.java"); ObjectInputStream in = new ObjectInputStream(file)){
            newmem = (ArrayList<Member>) in.readObject();
            int k=0;
            int i=-1;
            FileOutputStream fos=new FileOutputStream("Record.java");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            for (Member c : newmem) {
                i++;
                if((c.getId().equals(id)) && (c.getName().equals(name))){
                    k=1;
                    
                    System.out.print("Edit ID");
                    String  eid=scan.next();
                    System.out.print("\nEdit Name");
                    String enm=scan.next();
                    System.out.print("\nEdit Father Name");
                    String efnm=scan.next();
                    System.out.print("\nEdit CNIC");
                    String ecnic=scan.next();
                    System.out.print("\nEdit Contact");
                    String ecnt=scan.next();
                    System.out.print("\nEdit date of birth");
                    String  edob=scan.next();
                    System.out.print("\nEdit Email");
                    String eeml=scan.next();
                    System.out.print("\nEdit Room Number");
                    java.lang.Long  ermnm=scan.nextLong();
                    System.out.print("\nEdit Monthly Fee");
                    java.lang.Long  efee=scan.nextLong();
                    System.out.print("\nEdit House Num");
                    String ehusnm=scan.next();
                    System.out.print("\nEdit Streat Number");
                    String estrtnm=scan.next();
                    System.out.print("\nEdit City Name");
                    String ectnam=scan.next();
                    System.out.print("\nEdit State");
                    String estat=scan.next();
                    System.out.println("\n");
                    newmem.get(i).setId(eid);
                    newmem.get(i).setName(enm);
                    newmem.get(i).setFather_name(efnm);
                    newmem.get(i).setCnic(ecnic);
                    newmem.get(i).setContact(ecnt);
                    newmem.get(i).setDate_of_birth(edob);
                    newmem.get(i).setE_mail(eeml);
                    newmem.get(i).setRoom_num(ermnm);
                    newmem.get(i).setMonthly_fee(efee);
                    newmem.get(i).setHouse_num(ehusnm);
                    newmem.get(i).setStreet_num(estrtnm);
                    newmem.get(i).setCity(ectnam);
                    newmem.get(i).setState(estat);
                    
                    oos.writeObject(newmem);
                    System.out.println("EDIT SUCCSESSFULLY");
                    oos.close();
                    fos.close();
                    file.close();
                    in.close();
                }
            }
             if(k!=1){
                System.out.println("not found");
            }
        } catch ( ConcurrentModificationException h){
        
        }    
    
    }
    
    void showMem(){
            System.out.println("_______________________________________");
            System.out.println("||| NAME          || REG# NO.       |||");
            System.out.println("|||_______________||________________|||");
            System.out.println("||| EHSANULLAH    || FA17-BSE-024   |||");
            System.out.println("|||_______________||________________|||");
            System.out.println("||| ALI HASSAN    || FA17-BSE-024   |||");
            System.out.println("|||_______________||________________|||");
            System.out.println("||| M UZAIR KHAN  || FA17-BSE-156   |||");
            System.out.println("_______________________________________");
    }
}




import java.io.Serializable;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Member extends Address implements Serializable{
    private String id;
    private String name;
    private String father_name;
    private String cnic;
    private String contact;
    private String date_of_birth;
    private String e_mail;
    private Integer room_num;
    private  Integer monthly_fee;
    
    
    Scanner scan=new Scanner(System.in);

    public Member( String id, String name, String father_name, String cnic, String contact,  String date_of_birth, String e_mail,  Integer room_num,  Integer monthly_fee, String hNo, String street, String city, String state) {
        super(hNo, street, city, state);
        
        this.id = id;
        this.name = name;
        this.father_name = father_name;
        this.cnic = cnic;
        this.contact = contact;
        this.date_of_birth = date_of_birth;
        this.e_mail = e_mail;
        this.room_num = room_num;
        this.monthly_fee = monthly_fee;
    }

    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Integer getRoom_num() {
        return room_num;
    }

    public void setRoom_num(Integer room_num) {
        this.room_num = room_num;
    }

    public Integer getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(Integer monthly_fee) {
        this.monthly_fee = monthly_fee;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", father_name=" + father_name + ", cnic=" + cnic + ", contact=" + contact + ", date_of_birth=" + date_of_birth + ", e_mail=" + e_mail + ", room_num=" + room_num + ", monthly_fee=" + monthly_fee + ", scan=" + scan + '}';
    }

    void setMonthly_fee(Long efee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRoom_num(Long ermnm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String setMonthly_fee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String setState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectw;

import  java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Member/* extends Address*/ implements Serializable{

    private String id;
    private String name;
    private String father_name;
    private String cnic;
    private String date_of_birth;
    private String contact;
    private String e_mail;
    private Integer room_num; 
    private  Integer monthly_fee;
    private  String house_num;
    private  String street_num;
    private  String city;
    private  String state;
    

    public Member( String id, String name, String father_name, String cnic,String date_of_birth,String contact,String e_mail,Integer room_num,Integer monthly_fee,String hNo,String street,String city,String state){
//        super(hNo, street, city, state);
        this.id = id;
        this.name = name;
        this.father_name = father_name;
        this.cnic = cnic;
        this.date_of_birth = date_of_birth;
        this.contact = contact;
        this.e_mail = e_mail;
        this.room_num = room_num;
        this.monthly_fee = monthly_fee;
        this.house_num = hNo;
        this.street_num = street;
        this.city = city;
        this.state = state;
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
    
    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getHouse_num() {
        return house_num;
    }

    public void setHouse_num(String house_num) {
        this.house_num = house_num;
    }

    public String getStreet_num() {
        return street_num;
    }

    public void setStreet_num(String street_num) {
        this.street_num = street_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "Member{" + ", id=" + id + ", name=" + name + ", father_name=" + father_name + ", cnic=" + cnic + ", date_of_birth=" + date_of_birth + ", contact=" + contact + ", e_mail=" + e_mail + ", room_num=" + room_num + ", monthly_fee=" + monthly_fee + ", house_num=" + house_num + ", street_num=" + street_num + ", city=" + city + ", state=" + state + '}';
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Address {
    private  String house_num, street_num, city, state;

    public Address(String hNo, String street, String city, String state){
        this.house_num = hNo;
        this.street_num = street;
        this.city = city;
        this.state = state;
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
    public String toString(){
  return ("House Number: "+ this.house_num + ", Street No: "+ this.street_num+ " ,City: "+ this.city+" ,State/Province"+this.state);
  }
}


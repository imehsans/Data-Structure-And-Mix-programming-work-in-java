/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

class DishData{
    String ID,dishName,prize,quality;
    int IDno;
    public DishData(String ID,String dishName,String prize,String quality, int IDno) {
        this.ID = ID;
        this.dishName=dishName;
        this.prize=prize;
        this.quality=quality;
        this.IDno = IDno;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class SortTextFile{
    public boolean sort(){
        File file;
        boolean check = false;
        try{
            file=new File("MenuList.txt");
            BufferedWriter writer;
            //Creating ArrayList to hold DishData objects
            try( //Creating BufferedReader object to read the input text file
                BufferedReader reader = new BufferedReader(new FileReader(file))) {
                //Creating ArrayList to hold DishData objects
                ArrayList<DishData> dishRecords = new ArrayList<DishData>();
                //Reading DishData records one by one
                String currentLine = reader.readLine();
                while (currentLine != null){
                    String[] dishDetail = currentLine.split(",");
                    
                    String ID = dishDetail[0];
                    String dishName = dishDetail[1];
                    String prize = dishDetail[2];
                    String quality = dishDetail[3];
                    
                    int IDno = Integer.valueOf(dishDetail[4]);
                    //Creating DishData object for every DishData record and adding it to ArrayList
                    dishRecords.add(new DishData(ID,dishName,prize,quality,IDno));
                    
                    currentLine = reader.readLine();
                }   //Sorting ArrayList dishRecords based on marks
                Collections.sort(dishRecords, new idNoCompare());
                //Creating BufferedWriter object to write into output text file
                writer = new BufferedWriter(new FileWriter(file));
                //Writing every dishRecords into output text file
                for (DishData dishData : dishRecords) {
                    writer.write(dishData.ID);
                    writer.write(","+dishData.dishName);
                    writer.write(","+dishData.prize);
                    writer.write(","+dishData.quality);
                    
                    writer.write(","+dishData.IDno);
                    
                    writer.newLine();
                }
                //Closing the resources
            }
            writer.close();
        }catch(Exception ex){
            System.out.println("Exception msg: "+ex);
        }
        return true;
    }
}
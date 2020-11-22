/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
//idNoCompare Class to compare the marks
class idNoCompare implements Comparator<DishData>{
    @Override
    public int compare(DishData s1, DishData s2){
        return s1.IDno - s2.IDno;
    }
}
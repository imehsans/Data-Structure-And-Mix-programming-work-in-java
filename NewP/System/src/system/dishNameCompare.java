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

//dishNameCompare Class to compare the names
class dishNameCompare implements Comparator<DishData>{
    @Override
    public int compare(DishData s1, DishData s2){
        return s2.dishName.compareTo(s1.dishName);
    }
}
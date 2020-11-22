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
//qualityCompare Class to compare the names
class qualityCompare implements Comparator<DishData>{
    @Override
    public int compare(DishData s1, DishData s2){
        return s2.quality.compareTo(s1.quality);
    }
}
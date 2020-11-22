/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.awt.Component;

/**
 *
 * @author Farriah D
 */
public interface MediatorInterface {
    public void registerComponent(Component component);
    public void addToScreen(String value);
    public void addOperation(int value);
    public void addDot();
    public void replaceOnScreen(String value);
    public void clearOne();
    public void clearScreen();
    public void clearAll();
    public void calculate();
    
}

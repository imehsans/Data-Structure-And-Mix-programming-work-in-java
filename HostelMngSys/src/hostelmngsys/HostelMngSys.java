/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmngsys;

import java.awt.Button;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author Admin
 */
public class HostelMngSys {

    public HostelMngSys() {
    JFrame frame=new JFrame("Practice");
    frame.setSize(400,300);
    JPanel panel=new JPanel();
    Button btn =new Button("Button");
    Label lble=new Label("I am Lable");
    JList lst=new JList();
    panel.add(btn);
    panel.add(lst);
    panel.add(lble);
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
    HostelMngSys obj=new HostelMngSys();
    
    }
    
}

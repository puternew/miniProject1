/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author INT105
 */
public class ConvertListener implements ActionListener{
    private JTextField usTxt;
    private JTextField bathTxt;
    
    public ConvertListener (JTextField usTxt,JTextField bathTxt){
        this.usTxt=usTxt;
        this.bathTxt=bathTxt;
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());   
        double usCurr = Double.parseDouble(usTxt.getText());
        double bathCurr = usCurr*31.5;
        bathTxt.setText(bathCurr+"");
    
    }
    
    
    
}

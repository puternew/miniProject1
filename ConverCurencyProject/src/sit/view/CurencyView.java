package sit.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import sit.controller.ConvertListener;

public class CurencyView {

    private JFrame currFrame;
    private JLabel usLabel;
    private JLabel bahtLabel;
    private JTextField usTxtField;
    private JTextField bahtTxtField;
    private JButton converBtn;
    
     
    
    public CurencyView() {
        initgui();
       
        
    }
    
    public void initgui() {
        currFrame = new JFrame("US to Baht Currency Convert");
        usLabel = new JLabel("US Dollar ($)");
        bahtLabel = new JLabel("Baht");
        usTxtField = new JTextField("1");//number of column
        bahtTxtField = new JTextField("31.50");
        converBtn = new JButton("Convert");
    }
    
    public void loadCurrencyForm() {
        JPanel topPanel = new JPanel(new GridLayout(2,2));
        JPanel midPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        GridLayout grid = new GridLayout(2, 2);//(row, column)
        currFrame.setLayout(grid);
        //1st row --------------------------
        topPanel.add(usLabel);
        topPanel.add(usTxtField);
        //2nd row --------------------------
        topPanel.add(bahtLabel);
        topPanel.add(bahtTxtField);
        //2nd row --------------------------
        midPanel.add(converBtn);
        currFrame.add(topPanel);
        currFrame.add(midPanel);
        //บังคับ set
        
        ConvertListener cvtListener = new ConvertListener(usTxtField,bahtTxtField);
        converBtn.addActionListener(cvtListener);
      
        
        currFrame.setSize(200, 200);
        currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currFrame.pack();
        currFrame.setVisible(true);
        
        
    }
    
}

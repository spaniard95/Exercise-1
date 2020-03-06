package com.mycompany.exericise1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Window extends JFrame{
   JTextField text;
   private String userAnswer;
    public Window(String str) {
        super();
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel answer1 = new JLabel();		
	answer1.setText(str);
	answer1.setBounds(10, 10, 100, 100);
        
        JButton textField = new JButton();
        //textField.setBounds(10, 110, 200, 100);
        
        
        add(answer1);
        add(textField);
        
        textField.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
			     userAnswer=String.format(userAnswer, event.getActionCommand());
			}  
                        
	      });
       
       
  }
    public String getUserAnswer(){
        return userAnswer;
    }
}

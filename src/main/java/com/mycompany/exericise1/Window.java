package com.mycompany.exericise1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Window {
   private JTextField text;
   private String userAnswer;
    
   public Window(String str) {
       JFrame frame=new JFrame("Guess");
       frame.setVisible(true);
       frame.setSize(200,200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JLabel label=new JLabel();
       JPanel panel=new JPanel();
       
       frame.add(panel);
       panel.add(label);
       
       text=new JTextField(str);
       panel.add(text);
        frame.setVisible(true);
       
       
        text.addActionListener(new ActionListener() {
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
                


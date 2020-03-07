package com.mycompany.exericise1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Window extends JFrame {
   private JTextField text=new JTextField(10);
   private String userAnswer;
   private JButton playButton=new JButton("Play");
    
   public Window() {
       JPanel panel=new JPanel();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(600,200);
       panel.add(text);
       panel.add(playButton);
       this.add(panel);
       
    }
    
   public void setMessege(String messege){
       text.setText(messege);
   }
   void addGuessListener(ActionListener listenForPlayButton){
       playButton.addActionListener(listenForPlayButton);
   } 
   public int getUserNum(){
    return Integer.parseInt(text.getText());

}
}
                


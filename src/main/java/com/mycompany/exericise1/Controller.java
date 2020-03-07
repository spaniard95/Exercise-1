
package com.mycompany.exericise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    
    private Window theView;
    private Game game;
    
    
    
    //contructor
    public Controller(Window theView,Game game){
        this.theView=theView;
        this.game=game;
        this.theView.addGuessListener(new GuessListener());
    }
    
    class GuessListener implements ActionListener{
        int userNum;
        
        public void actionPerformed(ActionEvent e){
            try{
                userNum=theView.getUserNum();
                game.testMatch(userNum);
                theView.setMessege(game.messege());
            }
            catch(NumberFormatException ex){
                
            }
                
          
        }
    }
    
    
    
}

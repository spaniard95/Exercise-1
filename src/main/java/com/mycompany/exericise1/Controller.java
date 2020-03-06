
package com.mycompany.exericise1;


public class Controller {
    
    Window window;
    Game game;
    String userAnswer;
    
    
    //contructor
    public Controller(){
        this.window=new Window("Dose arithmo metaksi 0 kai 100");
        window.setVisible(true);
        this.game=new Game();
        
    }
    
    public void playGame(){
        game.testMatch(Integer.parseInt(window.getUserAnswer()));
        window=new Window(game.messege());
    }
    
    
    
}

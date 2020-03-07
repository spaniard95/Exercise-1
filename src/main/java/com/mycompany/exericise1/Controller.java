
package com.mycompany.exericise1;


public class Controller {
    
    Window window;
    Game game;
    String userAnswer;
    
    
    //contructor
    public Controller(){
        this.window=new Window("Dose arithmo metaksi 0 kai 100");
        
        this.game=new Game();
        
    }
    public int onSubmitNum(){
        return Integer.parseInt(window.getUserAnswer());     

    }
    public void playGame(){
        game.testMatch(onSubmitNum());
        window=new Window(game.messege());
    }
    
    
    
}

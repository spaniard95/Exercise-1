
package com.mycompany.exericise1;
import java.util.Random;
import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Game game=new Game();
        Window window=new Window();
        new Controller(window,game);
        window.setVisible(true);
      }
   }


 



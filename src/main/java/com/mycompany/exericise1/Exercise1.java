
package com.mycompany.exericise1;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        GameData game;
        try (Scanner scan = new Scanner(System.in)) {
            do{
            game=new GameData(random.nextInt(101)+1);
            do{
                
            }while(game.found());
            
           }while(game.getGameEnd());
            }

        }
    }


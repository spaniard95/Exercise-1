
package com.mycompany.exericise1;
import java.util.Random;
import java.util.Scanner;


public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        GameData game=new GameData();
        String userAnswer;
       try (Scanner scan = new Scanner(System.in)){
         do{
          do{
             game.messege();
             if (game.getSituation().equals("epitixia")||game.getSituation().equals("")) {
              game=new GameData(85);
             }
              userAnswer=scan.next(); //τρυ εδω
             }while(!game.numError(userAnswer));    //οταν η εισοδος ειναι αποδεκτη δηλ ειναι ιντ και αναμεσα στα ορια θα βγει απο το λοοπ
             
          game.playGame();
           
         }while(!game.isGameEnd());
       System.out.println("kali sinexia");
        }
    }
}

 



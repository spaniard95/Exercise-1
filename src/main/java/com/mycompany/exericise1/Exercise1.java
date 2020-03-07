
package com.mycompany.exericise1;
import java.util.Random;
import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Random random = new Random();
        GameData game=new GameData();
        String userAnswer;
       try (Scanner scan = new Scanner(System.in)){
         do{
          do{
             
             if (game.getSituation().equals("")){
                 game=new GameData(85);
             }
             game.messege();
             userAnswer=scan.next();
            }while(!game.answerError(userAnswer));    //οταν η εισοδος ειναι αποδεκτη δηλ ειναι ιντ και αναμεσα στα ορια θα βγει απο το λοοπ
             if(userAnswer.equals("oxi")) break;
             else if(userAnswer.equals("nai")) continue;
          game.playGame();
           
         }while(!game.isGameEnd());
       System.out.println("kali sinexia");
        }
    }
}

 




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
        String userAnswer;
        Scanner scan = new Scanner(System.in); 
            do{
            game=new GameData(random.nextInt(101)+1);
             do{
                 do{
                 game.messege();
                 userAnswer=scan.next(); //τρυ εδω
                 }while(game.answerNumError(userAnswer));    //οταν η εισοδος ειναι αποδεκτη δηλ ειναι ιντ και αναμεσα στα ορια θα βγει απο το λοοπ
                 
                 game.playGame();
                 
            }while(game.getSituation().equals("επιτυχια"));
            do{
               game.messege(); 
               userAnswer=scan.next();
           }while(game.answerError(userAnswer));
            
          }while(game.isGameEnd());
            

        }
    }
 



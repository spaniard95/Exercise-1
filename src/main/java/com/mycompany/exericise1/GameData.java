
package com.mycompany.exericise1;


public class GameData {
   
    
    private int randomNum;
    private int userNum,round,inf,sup;
    private boolean gameEnd;
    private String situation;
   
   
    //constructor
    public GameData(int randomNum){
        this.randomNum=randomNum;
        inf=0;
        sup=100;
        round=0;
        situation="";
        gameEnd=false;
      }
    public GameData(){
        inf=0;
        sup=100;
        round=0;
        situation="";
        gameEnd=false;
    }

      
    public void playGame(){
            round=round+1;
            testMatch(); 
            
    }
    public void testMatch(){
        if(userNum==randomNum){
            situation="epitixia";
      }
        else{
            if (userNum>=randomNum){
                situation="ipsilo";
                sup=userNum-1;
               }
            else{
                situation="xamilo";
                inf=userNum+1;
            }
    }
   }
    public boolean answerError( String userAnswer){
       if(situation.equals("epitixia")||situation.equals("error")){
           return (!questionError(userAnswer));
       }
       else{
        if (containsChar(userAnswer)&&Integer.parseInt(userAnswer)>=inf && Integer.parseInt(userAnswer)<=sup) {                   
            userNum=Integer.parseInt(userAnswer);      
            return true;            //δλδ σταματαει το !λοοπ δεν υπαρχει καποιο ερρορ           
            
        }
        else 
            situation="sfalma";
            return false;           //δλδ το loop συνεχιζεται  αφου η απαντηση δεν ειναι αποδεκτη
        }
    }
    
     //ελεγχει αν ενα string περιεχει ενα char
    private boolean containsChar(String str){
         boolean containsError=false;
          if (str != null && !str.isEmpty()) {
           for (char c : str.toCharArray()) {
            if (containsError = Character.isLetter(c)) {     //προσοχη υπαρχει = οχι ==
                break;
             }
         }
       }
          return (!containsError);
     }
    
    public boolean questionError(String str){
       switch (str) {
            case "oxi":
                gameEnd=true;
                return false;
            case "nai":
                situation="";
                return false;
                
            default:
                situation="error";
                return true;
                
                
        }
    }
     
   
    
    public void messege()
  {
      switch (situation)
    {
      case "xamilo":
      case "ipsilo":
          System.out.println(userNum+" einai "+situation+" ksanad ose metaksi  "+inf+" kkaai "+sup);
          break;
      case "epitixia":
          System.out.println("sinxaritiria brikes meta apo "+round+" prosp me skor: "+(10-round)+" sinexia ne i oxi");
          break;
      case "error":
          System.out.println(" mi apodekti apantisi sinexia ne i oxi");
           break;
      
      case "sfalma":
          System.out.println(" mi apodekti apantisi ");
      
      default:
          System.out.println("dose metaksi  "+inf+" kkaai "+sup);
          break;
     }
    }

    public boolean isGameEnd() {
        return gameEnd;
    }

    public String getSituation() {
        return situation;
    }
    
}
    


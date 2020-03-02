
package com.mycompany.exericise1;


public class GameData {
   
    private String userAnswer;
    private final int randomNum;
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
    
    
    
    public void playGame(){
            round=round+1;
            testMatch(userNum); 
            
    }
    public void testMatch(int userNum){
        if(userNum==randomNum){
            situation="επιτυχια";
      }
        else{
            if (userNum>=randomNum){
                situation="υψηλο";
                sup=userNum-1;
               }
            else{
                situation="χαμηλο";
                inf=userNum+1;
            }
    }
   }
    public boolean answerNumError(String userAnswer){
        
        if (containsChar(userAnswer)) {                   //αν δεν περιεχει  char ειμαστε ενταξη να το μετατρεωουμε σε ιντ
            this.userNum=Integer.parseInt(userAnswer);      
            return (numBetweenLimits());                  //αν επιπλεον ο αριθμος ειναι αναμεσα στα ορια
            
        }
        else return false;
    
    }
    
    
       private boolean numBetweenLimits(){
        
        return (userNum>=inf && userNum<=sup);
        
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
          return (containsError);
     }
    
    public boolean answerError(String str){
        if (str.equals("ο")){
            this.gameEnd=true;
            return true;
          }
        else return str.equals("ν");
    }
     
   
    
    public String messege()
  {
      switch (situation)
    {
      case "χαμηλο":
      case "υψηλο":
          return(userNum+"είναι"+situation+"Ξαναπροσπάθησε!Δώσε έναν αριθμό μεταξύ "+inf+"και"+sup);
      case "επιτυχια":
          return("Συγχαρητήρια! Βρήκες τον αριθμό μετά από"+round+"προσπάθειες! Σκορ:"+(10-round)+"Θα ήθελες να ξαναπαίξεις (ν/ο)?");
      case "σφαλμα":
          return ("Μη αποδεκτη απαντηση");
      
      default:
          return("Δώσε έναν αριθμό μεταξυ 0και 100");
     }
    }

    public boolean isGameEnd() {
        return gameEnd;
    }

    public String getSituation() {
        return situation;
    }
    
}
    


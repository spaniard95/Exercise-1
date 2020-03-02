
package com.mycompany.exericise1;


public class GameData {
    private String userNum;
    private int randomNum,round,inf,sup;
    private boolean gameEnd;
    private String situation;
    //constructor
    public GameData(int randomNum){
        this.userNum=userNum;
        inf=0;
        sup=100;
        round=0;
        situation="";
      }
    
    //ελεγχει αν ενα string περιεχει ενα char
    private boolean containsNoChar(String str){
         boolean containsError=false;
          if (str != null && !str.isEmpty()) {
           for (char c : str.toCharArray()) {
            if (containsError = Character.isLetter(c)) {
                break;
             }
         }
       }
          return containsError;
     }
     
   
    
    private String messege(String situation)
  {
      switch (situation)
    {
      case "χαμηλο":
      case "υψηλο":
      return(userNum+"είναι"+situation+"Ξαναπροσπάθησε!Δώσε έναν αριθμό μεταξύ "+inf+"και"+sup);
      
      case "επιτυχια":
       return("Συγχαρητήρια! Βρήκες τον αριθμό μετά από"+round+"προσπάθειες! Σκορ:"+(10-round)+"Θα ήθελες να ξαναπαίξεις (ν/ο)?");
      
      default:
          return("Δώσε έναν αριθμό μεταξυ 0και 100");
     }
    }
}
    


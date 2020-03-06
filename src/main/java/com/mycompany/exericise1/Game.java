/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exericise1;

public class Game {
    private int random,sup,inf,round,userNum;
    private String situation;
    public Game(){
        random=85;//edo tha ftiaxnete enas random
        round=0;
        inf=0;
        sup=100;
    }
    public void testMatch(int userNum){
        if(userNum==random){
            situation="epitixia";
      }
        else{
            if (userNum>=random){
                situation="ipsilo";
                sup=userNum-1;
               }
            else{
                situation="xamilo";
                inf=userNum+1;
            }
    }
   }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getRandom() {
        return random;
        
    }

    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
    
    public String messege(){
      switch (situation)
    {
      case "xamilo":
      case "ipsilo":
          return(userNum +" einai "+situation+" ksanad ose metaksi  "+inf+" kkaai "+sup);
          
      case "epitixia":
          return("sinxaritiria brikes meta apo "+round+" prosp me skor: "+(10-round)+" sinexia ne i oxi");
          
      case "error":
          return(" mi apodekti apantisi sinexia ne i oxi");
           
      
      case "sfalma":
          return(" mi apodekti apantisi ");
      
      default:
          return("dose metaksi  "+inf+" kkaai "+sup);
          
     }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.texaspoker;
import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author User
 */
class Dealer {
    
 private ArrayList<Integer> deck;   
 private int[] communityCards; 
 private int[] player1Cards;
 private int[] player2Cards;
 
  Dealer()
  {
    this.communityCards = new int[5];
    this.player1Cards = new int[2];
    this.player2Cards = new int[2];
    this.deck = new ArrayList<Integer>(51);
  }
   
 
 public int getOneCard(int[] cardNumber) 
 {  
     int[] card = cardNumber;
     int oneCard = card[new Random().nextInt(card.length)];
     return oneCard;
 } 
 
 public int[] getCommunityCards()
{ 
    return this.communityCards;
}
 
public int[] getPlayer1TowCards()
{
 return this.player1Cards; 
}

public int[] getPlayer2TowCards()
{
 return this.player2Cards; 
}

public String identifyWinner(int player1Hand, int player2Hand){
        if(player1Hand < player2Hand){
            return "Player1";
        }
        if(player1Hand > player2Hand){
            return "Player2";
        }
        return "TIE";
    
    }


}

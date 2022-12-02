/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * created By Farazana.
 */
package com.mycompany.texaspoker;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;



/**
 *
 * @author User
 */
class DealerCopy {
    
 private ArrayList<Integer> deck;   
 private int[] communityCards; 
 private int[] playerCards;//PLAYER 1
 private int[] player1Cards;//PLAYER 1
 private int[] player2Cards;// PLAYER 2

 
  DealerCopy()
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
 
public int[] getPlayerTowCards()
{
 return this.playerCards; 
}
    
    
    // added part for the Dealer.   
 
    public String identifyWinner(int player1Hand, int player2Hand){
        if(player1Hand < player2Hand){
            return "Player1";
        }
        if(player1Hand > player2Hand){
            return "Player2";
        }
        return "TIE";
    
    }
    
    public void dealCards(){
        for(int i = 0; i <= 4; i++) communityCards[i] = deck.get(i);
        for(int i = 0; i <= 1; i++) player1Cards[i] = deck.get(i+5);
        for(int i = 0; i <= 1; i++) player2Cards[i] = deck.get(i+7);
    }
    
    
       public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }
    
    
    
    
    

}

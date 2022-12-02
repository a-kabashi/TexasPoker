/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * created By Farazana.
 */
package com.mycompany.texaspoker;
import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author User
 */
class Dealer1 {
    
 private ArrayList<Integer> deck;   
 private int[] communityCards; 
 private int[] playerCards;
 
  Dealer()
  {
    this.communityCards = new int[5];
    this.playerCards = new int[2];
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
 
    public String identifyWinner(int playerHand, int ComputerHand){
        if(playerHand < ComputerHand){
            return "Player";
        }
        if(playerHand > ComputerHand){
            return "Computer";
        }
        return "Draw";
    
    }
    
    public void dealCards(){
        for(int i = 0; i <= 4; i++) communityCards[i] = deck.get(i);
        for(int i = 0; i <= 1; i++) playerCards[i] = deck.get(i+5);
        for(int i = 0; i <= 1; i++) computerCards[i] = deck.get(i+7);
    }
    
    
       public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }
    
    
    
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.texaspoker;
import java.util.Random;
import java.util.Collections;


/**
 *
 * @author User
 */
class Dealer {
    
 private int[] communityCards; 
 
  Dealer()
  {
    this.communityCards = new int[5];
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
 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.texaspoker;

/**
 *
 * @author User
 */
class GameLogic {
    public String identifyHand(int[] hand){
        
        int[] fourOrFullHouse = new int[5];
        int fullHouse = 0;
        int count = 10;
        boolean straight = true;
        boolean straightFlush = true;
        boolean threeOfKind = false;
        
        for (int i = 0, j = 0; i < hand.length - 1; i++) {
            if (!(hand[i] == (hand[i + 1] - 1)))
                straightFlush = false;

            if (!(hand[i] % 13 == ((hand[i + 1] % 13) - 1)))
                straight = false;

            if (hand[i] % 13 == hand[i + 1] % 13) {
                fullHouse++;
                fourOrFullHouse[j++] = hand[i];
            } else
            count = i;
        } 

        if (straightFlush || (isSameKind(hand) && isItStraigthAceTop(hand))) {
            if (Royal_Flush(hand)) {
                return "Royal Flush";
            }
            return "Striaght Flush";
        }
        else if (fullHouse == 3) {
            if (count == 0 || count == 3)
                return "Four of a kind";
            else
                return "Full House";
        }
        else if (isSameKind(hand))
            return "Flush";
        else if (straight || isItStraigthAceTop(hand))
            return "Straight";
        else {
            boolean co = false;
            int forTwo = 0;
            int ofSuit[] = new int[2];
            for (int i = 0, j = 0; i < hand.length - 1; i++) {
                if (hand[i] % 13 == hand[i + 1] % 13) {
                if (co)
                    threeOfKind = true;

                ofSuit[j++] = hand[i];
                co = true;
                forTwo++;
                } 
                else
                    co = false;
            } 
            if (threeOfKind)
                return "Three of kind";
            else if (forTwo == 2)
                return "Two Pairs";
            else if (forTwo == 1)
                return "One Pair";
            else
                return "High Card";

        }

    }

    private boolean isItStraigthAceTop(int[] hand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isSameKind(int[] hand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean Royal_Flush(int[] hand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

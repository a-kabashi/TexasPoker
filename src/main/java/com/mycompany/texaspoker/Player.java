package com.mycompany.texaspoker;
/**
 *
 * @author Abubakar Kabashi
 */

public class Player {
    private String name;
    private int buyInAmount;
    private int bet;
    private int decision;
    private boolean win;
    
    public Player(){
        this.name = "";
        this.buyInAmount = 0;
        this.bet = 0;
        this.decision = 0;
        this.win = false;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setBuyInAmount(int buyInAmount){
        this.buyInAmount = buyInAmount;
    }
    
    public int getBuyInAmount(){
        return this.buyInAmount;
    }
    
    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getBet(){
        return this.bet;
    }
    
    public void setDecision(int decision){
        this.decision = decision;
    }
    
    public int getDecision(){
        return this.decision;
    }
    
    public void setWin(boolean win){
        this.win = win;
    }
    
    public boolean getWin(){
        return this.win;
    }

}

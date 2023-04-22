package WarCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {



    private List<Card> hand = new ArrayList<Card>();
    private int score; //player score
    private String name = ""; //player name


    /*public void drawHand(Class Deck){ --- incorrect way to implement this method
        Deck gameDeck = new Deck(); <--- this will be instantiated in the main App class
        //draw a card from the deck passed into this method and add it to the player's hand.
        this.hand.add(gameDeck.drawCards());
    }*/

    //this method is correct. It takes a generic deck as an argument. The named deck will be passed in from App.
    public void drawHand(Deck deck1){
        //draw a card from the deck passed into this method and add it to the player's hand.
        this.hand.add(deck1.drawCards());
    }

    public void describe(){
        //print the player's name
        System.out.println("Player " + this.name);
        System.out.println();
        //print out the player's hand
        for(Card card : hand) {
            card.describe();
        }
    }

    public Card flip(){
        //show the top card in the player's hand
        return hand.remove(0);
    }

    public void incrementScore(){
        //add one to the player's score
        this.score += 1;
    }

    public int getScore() {
        return score;
    }

    /*public void setScore(int score) {
        this.score = score;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

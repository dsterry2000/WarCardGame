package WarCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<Card>();

        public Deck(){

            List<String> cardSuit = new ArrayList<>();
            //add the suit names to the cardSuit ArrayList
            cardSuit.add("Hearts");
            cardSuit.add("Diamonds");
            cardSuit.add("Spades");
            cardSuit.add("Clubs");


            List<String> numCard = new ArrayList<>();
            //add numCard names to the numCard Arraylist
            numCard.add("2");
            numCard.add("3");
            numCard.add("4");
            numCard.add("5");
            numCard.add("6");
            numCard.add("7");
            numCard.add("8");
            numCard.add("9");
            numCard.add("10");
            numCard.add("Jack");
            numCard.add("Queen");
            numCard.add("King");
            numCard.add("Ace");

            //add hearts suit to the cards ArrayList
            for(int hearts=0;hearts<numCard.size();hearts++) {
                cards.add(new Card(numCard.get(hearts), cardSuit.get(0), hearts+2));
            }
            //add diamonds suit to the cards ArrayList
            for(int diamonds=0;diamonds< numCard.size();diamonds++) {
                cards.add(new Card(numCard.get(diamonds), cardSuit.get(1), diamonds+2));
            }
            //add spades suit to the cards ArrayList
            for(int spades=0;spades< numCard.size();spades++) {
                cards.add(new Card(numCard.get(spades), cardSuit.get(2), spades+2));
            }
            //add clubs suit to the cards ArrayList
            for(int clubs=0;clubs< numCard.size();clubs++) {
                cards.add(new Card(numCard.get(clubs), cardSuit.get(3), clubs+2));
            }

        }

        public void describe(){
            for(Card card : this.cards) {
                card.describe();
            }

        }
        public void shuffleDeck(){
            Collections.shuffle(cards);
        }

        public Card drawCards(){ //previous attempt - public void drawCards(int start, int stop)

            return cards.remove(0);
        }

    }

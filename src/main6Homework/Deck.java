package main6Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>();  // list is a collection of cards
	
	public Deck() {
		String [] rank = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
							"Jack", "Queen", "King", "Ace"};
		String [] suit = { "Heart", "Spade", "Club", "Diamond"};
		
		for (int i=0; i<4; i++) { //this adds the suit (heart/spade/club/diamond)
			for (int j=2; j<15; j++) { //this adds the value (2-14 representing cards 2-Ace)
				cards.add(new Card(j, rank[j - 2] + " of " + suit[i]));
	// on line 17 you are adding a new instance of card to the field "cards" on line 9
	// every time you make a card, the value of the card is the "j" and the name of the card is "rank + suit"
			}
		}
	}//end of Deck method
	
	//this method shuffles the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//this method gets and removes the first card from your deck of 52 cards
	public Card drawCardFromDeck() {
		Card drawnCard = cards.get(0); //gets the card
		cards.remove(drawnCard); //removes the card
		return drawnCard; //returns card to the deck
		
	}//end of drawCardFromDeck method
	
	
	
}//end of Deck class
	

package main6Homework;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String name;
	int score;
	List<Card> hand = new ArrayList<>(); //field for hand (List of Card)
	
	public Player(String name) { //constructors
		this.score = 0;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name; //this fixed the issue of random numbers being printed for the players name
						//learned this fix from Dr. Rob
	}

	public void describePlayer() {
		System.out.println("Player's name: " + name);
		for(Card card : hand) { //enhanced for loop
			card.describeCard();
		}
	}
	
	//removes and returns the top card of the Hand
	public Card flipTopCard() {
		Card card = hand.get(0);
		hand.remove(0);
		return card;
		//need players to flip card 
	}
	
	//this method below draws, and then adds that drawn card into a player's hand
	public void drawCardIntoHand(Deck deck) {
		hand.add(deck.drawCardFromDeck());
		
	}
	
	//this method increments the score by one
	public void incrementScore() {
		this.score++;
	}
	
	
	//getters and setters
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public List<Card> getHand(){
		return hand;
	}
	public void setHand(List<Card> hand){
		this.hand = hand;
	}
	public Card getCard() {
		return getCard();
	}
	
}//end of Player class

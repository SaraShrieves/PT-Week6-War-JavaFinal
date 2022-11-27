
/*
package main6Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeCodeWarGame {
	private final List<String> members = 
			List.of("Bryce", "Christian", "Thomas", "Ramon", "Steve", "Cade",
					"Haskell", "Darya", "Gersen", "Brandon", "Elyi");
	
	private Random random = new Random ();
	
	public static void main(String[] args) {
		new PracticeCodeWarGame().playGame();
	}
	
	private void playGame() {
		List<String>names = new ArrayList<>(members);
		Player player1 = findPlayer(members);
		Player player2 = findPlayer(members);
		
		System.out.println(player1 + " is playing " + player2 + "!!");
		
		Deck deck = new Deck();
	}

	private Player findPlayer(List<String> names) {
		int position = random.nextInt(names.size());
		String name = names.get(position);
		names.remove(position);
		
		return new Player(name);
	}
	
}

/*
private List<Card>createSuits(int value , String suit){
	List<Card> suitList = new ArrayList<Card>();
	for(int i=0;i<4;i++) {
		Card newCard = new Card();
	newCard.setValue(value);	
	if(i==0) {
		newCard.setName(suit+"of Diamonds");
	suitList.add(newCard);	
		}
	elseif(i==1) {
		newCard.setName(suit+"of Hearts");
	suitList.add(newCard);	
		}
	elseif(i==2) {
		newCard.setName(suit+"of Spades");
	suitList.add(newCard);	
		}
	elseif(i==3) {
		newCard.setName(suit+"of Clubs");
	suitList.add(newCard);	
		}
	}
	*/



/*

List <Card> card = new ArrayList <Card> ():
	
public List<Card> getCard (){
	return card;
}

public void setCard(List<Card> card) {
	this.card = card;
	
}

Deck(){
	
}

private List<Card> buildSuite(int value, String suit){
	List<Card> newList = new ArrayList <>();
	for (int i=0; i<4; i++) 
	Card newCard = new Card ();
	new Card.setValue(value);
	{	
		
		if (i==0) {
			newCard.setName(suite + "of Diamonds");
			newList.add(newCard);
		}
	*/

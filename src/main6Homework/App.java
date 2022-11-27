package main6Homework;

public class App {

	public static void main(String[] args) {
		
		Deck deckOfCards = new Deck();
	
		
		Player player1 = new Player("Kirk");
		Player player2 = new Player("Sara");
	
	
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.drawCardIntoHand(deckOfCards);
			}else {
				player2.drawCardIntoHand(deckOfCards);
			}
		}
		
		player1.describePlayer();
		player2.describePlayer();
		
		for (int i=0; i<26; i++) {
			Card player1Card = player1.flipTopCard();
			Card player2Card = player2.flipTopCard();
				if (player1Card.getValue() < player2Card.getValue()) {
					player2.incrementScore();
				}else if (player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
				}else {
					System.out.println("Draw");
				}
		}
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1 + " Wins!!!");
		}else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2 + " Wins!!!");
		}else {
			System.out.println("No one wins this round");
		}
		
		
		
		
		
		//this is where the player flip method goes - traditional for loop 
			//nested for loop with calling the get card value
	}

}




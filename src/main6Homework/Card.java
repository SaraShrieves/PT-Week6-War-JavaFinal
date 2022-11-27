package main6Homework;

public class Card {

	private String name;
	private int value;
	
	public Card (int value, String name) {  //constructors
		this.value = value;
		this.name = name;
	}
	public void describeCard() {  //prints out information about a card
		System.out.println("Card name: " + name + ", Card Value: " + value);
	}
	
	
	//getters and setters
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		
	}
}

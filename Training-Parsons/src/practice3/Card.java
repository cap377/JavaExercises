package practice3;

// Class that represents a playing card and holds a rank and suit

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public Suit getSuit() {
		return this.suit;
	}
	public Rank getRank() {
		return this.rank;
	}
}

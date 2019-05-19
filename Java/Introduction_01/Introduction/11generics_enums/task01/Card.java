package enumgeneric.task02;

public class Card implements Comparable<Card>{
	private CardRank rank;
	private CardSuit suit;

	
	public Card(CardRank rank, CardSuit suit) {
		this.rank = rank;
		this.suit = suit;
	}


	@Override
	public int compareTo(Card t) {
		return this.rank.compareTo(t.rank);
	}
	
	
	@Override
	public String toString() {
		return rank +" of "+suit;
	}
}

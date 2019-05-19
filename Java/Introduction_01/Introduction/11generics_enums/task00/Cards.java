package enumgeneric.task01;

public class Cards {

	enum CardSuit {
		Clubs("Clubs"),
		Diamonds("Diamonds"), 
		Hearts("Hearts"),
		Spades("Spades");


		private final String suit;//make reference to have acces to fields of enum 

		private CardSuit(String value) {
			this.suit = value;
		}

		/*
		public String cardSuit(){//get suit value
			return suit;
		}
		*/
	}

	enum CardRank{
		
		Two,
		Three,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Ten,
		Jack,
		Queen,
		King,
		Ace;
		
	}
	
	
	public static void main(String[] args) {
			// use method name() to get values of constants
		//		System.out.println(CardSuit.Diamonds.name());
		//	System.out.println(CardRank.Ace.name());
		
		
		for (CardSuit suit : CardSuit.values()) {
			if(suit.equals(CardSuit.valueOf("Spades"))){
			System.out.println(suit);
			}else{
				System.out.print(suit+",");
			}
			
		}
		
		for (CardRank rank : CardRank.values()) {
			if(rank.equals(CardRank.valueOf("Ace"))){
				System.out.println(rank);
			}else{
				System.out.print(rank+",");
			}
		}
		
	}

}

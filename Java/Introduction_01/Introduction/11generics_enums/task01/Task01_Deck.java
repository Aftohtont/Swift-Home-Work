package enumgeneric.task02;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task01_Deck {

	public static void main(String[] args) {

		int sizeDeck=52;
		int fill=0;
		
		Card[] deck=new Card[sizeDeck];
		for (int i = 0; i < CardSuit.values().length; i++) {//fill deck of cards
			for (int j = 0; j <CardRank.values().length; j++) {
				
				 deck[fill++]=new Card(CardRank.values()[j], CardSuit.values()[i]);
			}
		}
		
		for (Card card : deck) {
			System.out.println(card);
		}
	        
	}

}

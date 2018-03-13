import java.util.Collections;

import pkgEnum.*;

public class Deck {

	private ArryList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck(int numOfDecks) throws Exception {
		
		if (numOfDecks < 1) {
			
			throw new Exception("Number of Decks < 1");
			
			for (int a = 0; a < numOfDecks; a++) {
				
				for (eSuit eSuit: eSuit.values()) {
					
					for (eRank eRank: eRank.values()) {
					
						DeckCards.add(new Card(eRank, eSuit))
					}
				}
			}
			
			Collections.shuffle(DeckCards);
	
	for (Card c: DeckCards) {
		System.out.print(c.geteSuit););
		System.out.print(c);
		}
	}
	
	
	public Card Draw() throws Exception {
	
		if (DeckCards.size()==0) {
			throw new Exception("Empty Deck");
		}
		
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;	
	}
	
	public int getRemaining(Object eNum){
		int remaining = 0;
		
		if(eNum instanceof eRank){
			for(Card c : cards)
			{
				if(c.getERank() == eNum)
					remaining += 1;
			}
		}
		else if(eNum instanceof eSuit){
			for(Card c : cards)
			{
				if(c.getESuit() == eNum)
					remaining += 1;
			}
		}
		return remaining;		
	}

}
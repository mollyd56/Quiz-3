import java.util.ArrayList;
public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	//this doesn't capture all possible scores... it only captures scores that we care about!
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		boolean bAce = false;
		
		Collections.sort(cards);
		
		for (Card c: cards)
		{	
			iScore[0] += c.geteRank().getiCardValueMin();
			if (c.geteRank() == eRank.ACE)
				bAce = true;
			}
		iScore[1] = (bAce) ? iScore[0] + 10 : iScore[0];
		
		SetHandScore(iScore);
		return iScore;
	}
	
	public void Draw(Deck d){
		cards.add(d.draw());
	}
	
	private void AddCard(Card c){
		cards.add(c);
	}
	
	public boolean bCanDealerHit() {
		boolean bDraw = false;
		
		for (int iScore : ScoreHand()) {
			if (iScore >= 17)
				return false;
		}
		return true;	
	}
	
	public boolean bCanPlayerDraw() {
		for (int iScore: ScoreHand()) {
			if (iScore < 21)
				return true;
		}
		return false;
		}
	
	public boolean isBlackJack() {
		int[ ] iScores = ScoreHand();
		if ((iScore[0] == 21) && (HandCards.size()== 2))
			return true;
		return false;
	}
	
	public void setHandScore(int[ ] Scores) {
		
		this.iScore = Scores[0];
		if (Scores[1] <= 21)
			iScore = Scores[1];
	}
	
}

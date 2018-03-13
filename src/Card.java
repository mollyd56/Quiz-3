package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private int eRank;
	private int eSuit;
	
	public Card(int erank, int suit) {

		this.eRank = erank;
		this.eSuit = suit;
		}
	
	public int geteRank() {

		return this.eRank;
		}
	
	public int geteSuit() {

		return this.eSuit;
		}
	
	private void seteRank(int eRank) {
		this.eRank = eRank;
		}
	
	private void seteSuit(int eSuit) {

		this.eSuit = eSuit;
		}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
		}
	}
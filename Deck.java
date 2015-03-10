package Elevens;
import java.util.ArrayList;


public class Deck {

	
	private ArrayList<Card> cards;
	private int size;

	
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card> ();
		for(int x = 0; x < suits.length; x++) {
			for(int y = 0; y < ranks.length;y++) {
				cards.add(new Card(ranks[y], suits[x], values[y]));
			}
			
		}
		size = cards.size();
		shuffle();
	}


	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}


	public int size() {
		return size;
	}


	public void shuffle() {
		Shuffler.selectionShuffle(cards);
		size = cards.size();
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		size--;
		return cards.get(size);
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}

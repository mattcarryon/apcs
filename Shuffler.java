package Elevens;

import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	/**
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3,4,5};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3,4,5};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}
	**/


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int midpoint = values.length / 2;
		int i = 0, j = midpoint, x = 0;
		int[] temp = new int[values.length];
		
		while(i < midpoint) {
			temp[x] = values[i];
			x++;
			i++;
			temp[x] = values[j];
			x++;
			j++;
		}
		while(j < values.length){
			temp[x] = values[j];
			x++;
			j++;
		}
		
		for(int y = 0; y < values.length; y++) {
			values[y] = temp[y];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(ArrayList<Card> deck) {
		Card temp;
		for(int k = deck.size()-1; k >= 1; k--) {
			int r = (int)(Math.random()*(deck.size()-1));
			temp = deck.get(k);
			deck.set(k,deck.get(r));
			deck.set(r,temp);
		}
	}
}
/** Question 1
public static String flip() {
	int r = (int) (Math.random()*3);
	if(r%2 == 0) return "Heads";
	return "Tails";
}

**/

/** Question 2
public static boolean isPermutation(int[] a, int[] b) {
	boolean isFound = false;
	for(int x = 0; x < a.length; x++) {
		for(int y = 0; y < b.length; y++) {
			if(a[x] == b[y]) isFound = true;
		}
		if(!isFound) return false;
	}
	return true;
}

Question 3:
	0 then 1;
**/

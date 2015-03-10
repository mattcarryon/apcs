package Elevens;


public class DeckTester2 {

	public static void main(String[] args) {
		String[] ranks1 = {"A", "B", "C"};
		String[] suits1 = {"Giraffes", "Lions"};
		int[] values1 = {2,1,6};
		Deck testDeck = new Deck(ranks1, suits1, values1);
		System.out.println(testDeck);
		testDeck.deal();
		System.out.println(testDeck);
		
		
		}
	}

/**
 * Questions:
 * 
 * 		1) A deck is an object that holds an ArrayList of initialized cards.
 * 		2) 6 cards
 *		3) String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
 *		   String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};
 *         int[] values = {11,1,2,3,4,5,6,7,8,9,10,10,10};
 *         
 *      4)The order does not matter only values and ranks are changed the same way.
 *
 */

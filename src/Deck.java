
import java.util.*;

class SortByValue implements Comparator<Card>{

	@Override
	public int compare(Card o1,Card o2) {
		Card c1=(Card)o1;
		Card c2=(Card)o2;
		return Integer.compare((c1.getSuites().ordinal()*100)+c1.getValue(),(c2.getSuites().ordinal()*100)+c2.getValue() );	
	}
	
}
public class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		for (Suite suite : Suite.values()) {
			for (int value : values) {
				cards.add(new Card(suite, value));
			}

		}
		System.out.println(cards);
	}
}
	
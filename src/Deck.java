
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
	
	public void sortDeck() {
		Collections.sort(cards, new SortByValue());
	}

	public Deck(ArrayList<Card> cards) {
		cards = new ArrayList<>();
		cards.addAll(cards);
	}
	

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public ArrayList<Card> getDeck() {
		return cards;
	}

	public void setDeck(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card deal() {
		Card dealCard = null;
		if (cards.size() != 0) {
			dealCard = cards.get(0);
			cards.remove(0);
		}
		return dealCard;
	}
	
//	@Override
//	public int compare(Object o1,Object o2) {
//		Card c1=(Card)o1;
//		Card c2=(Card)o2;
//		return Integer.compare((c1.getSuites().ordinal()*100)+c1.getValue(),(c2.getSuites().ordinal()*100)+c2.getValue() );	
//	}
	
//	public static void main(String[] args)
//	{
//		SortByValue s=new SortByValue();
//		s.display();
//	}
	


	
}

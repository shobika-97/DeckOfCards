public class Card {

	private Suite suite;
	private int value;

	public Card() {

	}

	public Card(Suite suite, int value) {
		this.suite = suite;
		this.value = value;
	}

	public Suite getSuites() {
		return suite;
	}

	public void setSuites(Suite suite) {
		this.suite = suite;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		if (suite.equals(Suite.SPADE))
			return value + " " + (char) '\u2660';
		else if (suite.equals(Suite.DIAMOND))
			return value + " " + (char) '\u2666';
		else if (suite.equals(Suite.CLUB))
			return value + " " + (char) '\u2663';
		else if (suite.equals(Suite.HEART))
			return value + " " + (char) '\u2764';
		return value + " " + suite;
	}
}

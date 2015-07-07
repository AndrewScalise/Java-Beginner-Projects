package chapter9;

/**
 * Essay class Chapter 9, Programming Challenge 4
 */

public class Essay extends GradedActivity {
	private double grammar; // Points for grammar
	private double spelling; // Points for spelling
	private double correctLength; // Points for length
	private double content; // Points for content

	/**
	 * setScore method Overloads the base class method. Note that the other
	 * "set" methods are private. Those methods are for validating points before
	 * they are assigned.
	 */

	public void setScore(double gr, double sp, double len, double cnt) {
		// Set the individual scores.
		setGrammar(gr);
		setSpelling(sp);
		setCorrectLength(len);
		setContent(cnt);

		// Set the total score.
		super.setScore(grammar + spelling + correctLength + content);
	}

	/**
	 * setGrammar method This method validates that the grammar points before
	 * they are set.
	 */

	private void setGrammar(double g) {
		if (g <= 30.0)
			grammar = g;
		else
			// Invalid points
			grammar = 0.0;
	}

	/**
	 * setSpelling method This method validates that the spelling points before
	 * they are set.
	 */

	private void setSpelling(double s) {
		if (s <= 20.0)
			spelling = s;
		else
			// Invalid points
			spelling = 0.0;
	}

	/**
	 * setCorrectLength method This method validates that the length points
	 * before they are set.
	 */

	private void setCorrectLength(double c) {
		if (c <= 20.0)
			correctLength = c;
		else
			// Invalid points
			correctLength = 0.0;
	}

	/**
	 * setContent method This method validates that the content points before
	 * they are set.
	 */

	private void setContent(double c) {
		if (c <= 30)
			content = c;
		else
			// Invalid points
			content = 0.0;
	}

	/**
	 * getGrammar method
	 */

	public double getGrammar() {
		return grammar;
	}

	/**
	 * getSpelling method
	 */

	public double getSpelling() {
		return spelling;
	}

	/**
	 * getCorrectLength method
	 */

	public double getCorrectLength() {
		return correctLength;
	}

	/**
	 * getContent method
	 */

	public double getContent() {
		return content;
	}

	/**
	 * The getScore method returns the overall numeric score. Overrides the base
	 * class method.
	 */

	public double getScore() {
		return grammar + spelling + correctLength + content;
	}
}

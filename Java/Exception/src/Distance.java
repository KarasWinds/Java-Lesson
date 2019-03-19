
public class Distance {
	private int feet;
	private int inch;

	Distance(int feet, int inch) throws OverInchException {
		if (inch > 12)
			throw new OverInchException(inch);
		this.feet = feet;
		this.inch = inch;
	}

	public int getFeet() {
		return feet;
	}

	public int getInch() {
		return inch;
	}

}

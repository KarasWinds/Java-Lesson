
@SuppressWarnings("serial")
public class OverInchException extends Exception {
	private String msg = "ERROR, Inch Input Over";
	private int inch;

	OverInchException(int inch) {
		this.inch = inch;
	}

	public String getMsg() {
		return msg;
	}

	public int getInch() {
		return inch;
	}

}

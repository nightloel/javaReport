
public class Lap6_4 {
	private int year;
	private String month;
	private int day;
	
	public Lap6_4() {
		this(1900, "1¿ù", 1);
	}
	
	public Lap6_4(int year) {
		this(year, "1¿ù", 1);
	}

	public Lap6_4(int year, String month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Lap6_4 [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}

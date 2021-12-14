
public class Lap6_5 {
	private int hour;
	private int minute;
	private int second;
	
	public Lap6_5() {
		this(0,0,0);
	}
	
	public Lap6_5(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
}

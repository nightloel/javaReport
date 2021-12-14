
public class Lap6_9 {
	private String name;
	private double salary;
	private static int count = 0;
	
	public Lap6_9(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}
}


public class Lap6_7Test {
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		Lap6_7 obj = new Lap6_7();
		obj.getValues(scores);;
		System.out.println("∆Ú±’¿∫ = " + obj.getAverage(scores));
	}
}

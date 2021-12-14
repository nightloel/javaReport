
public class Lap6_9Test {
	public static void main(String[] args) {
		Lap6_9 e1, e2, e3;
		e1 = new Lap6_9("±èÃ¶¼ö", 35000);
		e2 = new Lap6_9("ÃÖ¼öÃ¶", 50000);
		e3 = new Lap6_9("±èÃ¶È£", 20000);
		
		int n = Lap6_9.getCount();
		System.out.println("ÇöÀçÀÇ Á÷¿ø¼ö=" + n);
	}
}

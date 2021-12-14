
public class Lap6_1Test {
	public static void main(String[] args) {
		Lap6_1 array = new Lap6_1(3);
		
		for(int i = 0; i<(array.length + 1); i++) {
			array.put(i, i * 10);
		}
	}
}

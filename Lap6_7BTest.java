
public class Lap6_7BTest {
	public static void main(String[] args) {
		Lap6_7B obj1 = new Lap6_7B(10,20,50);
		Lap6_7B obj2 = new Lap6_7B(10,20,50);
		
		Lap6_7B largest = obj1.whosLargest(obj1, obj2);
		System.out.println("(" + largest.width + "," + largest.length
				+"," + largest.height + ")");
	}
}

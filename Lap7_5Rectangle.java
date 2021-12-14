
public class Lap7_5Rectangle extends Lap7_5{
	private int width;
	private int height;
	
	public Lap7_5Rectangle(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("Rectangle()");
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width * height;
	}
}

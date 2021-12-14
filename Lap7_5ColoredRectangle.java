
public class Lap7_5ColoredRectangle extends Lap7_5Rectangle{
	String color;
	
	public Lap7_5ColoredRectangle(int x, int y, int width, int height,String color) {
		super(x,y,width,height);
		System.out.println("ColoredRectangle()");
		this.color = color;
	}
	
	public static void main(String[] args) {
		Lap7_5ColoredRectangle obj = new Lap7_5ColoredRectangle(10, 10, 20, 20, "red");
	}
}
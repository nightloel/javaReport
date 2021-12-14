
public class Lap6_6Circle {
	private int radius;
	private Lap6_6 center;
	
	public Lap6_6Circle(Lap6_6 p, int r) {
		center = p;
		radius = r;
	}

	@Override
	public String toString() {
		return "Lap6_6Circle [radius=" + radius + ", center=" + center + "]";
	}
	
}

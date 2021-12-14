
public class Lap5_2 {
	String color;
	int speed;
	int gear;
	@Override
	public String toString() {
		return "Lap5_2 [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
}

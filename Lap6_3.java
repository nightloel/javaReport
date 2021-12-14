
public class Lap6_3 {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public int getVolume() {
		return volume;
	}
	
	Lap6_3(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		volume = width*length*height;
	}
}

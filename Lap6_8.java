
public class Lap6_8 {
	private int width, length, height;
	
	Lap6_8(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Lap6_8 obj) {
		if((obj.width == width) & (obj.length == length)
				& (obj.height == height))
			return true;
		else
			return false;
	}
}

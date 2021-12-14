
public class Lap6_7B {
	int width, length, height;
	int volume;
	
	Lap6_7B(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		volume = w*l*h;
	}
	Lap6_7B whosLargest(Lap6_7B box1, Lap6_7B box2) {
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
}

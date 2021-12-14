
public class Lap6_5Test {
	public static void main(String[] args) {
		Lap6_5 time = new Lap6_5();
		System.out.println("기본 생성자 호출 후 시간: "+time.toString());
		Lap6_5 time2 = new Lap6_5(13, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간: "+time2.toString());
		Lap6_5 time3 = new Lap6_5(99,66,77);
		System.out.println("올바르지 않은 시간 설정 후 시간: "+time3.toString());
	}
}

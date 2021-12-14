
public class Lap7_3Manager extends Lap7_3{
	private int bonus;
	
	public Lap7_3Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	
	void test() {
		System.out.println("name="+name);
		System.out.println("address"+address);
		System.out.println("salary="+salary);
	}
}

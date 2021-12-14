
public class Lap7_3 {
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	public Lap7_3(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	@Override
	public String toString() {
		return "Lap7_3 [name=" + name + ", address=" + address + ", "
				+ "salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}

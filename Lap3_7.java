import java.util.Scanner;

public class Lap3_7 {
	public static void main(String[] args) {
		int answer = 59;
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess >answer)
				System.out.println("������ ������ �����ϴ�.");
			if(guess <answer)
				System.out.println("������ ������ �����ϴ�.");
		}while(guess !=answer);
		System.out.println("�����մϴ�. �õ�Ƚ��=" + tries);
	}
}

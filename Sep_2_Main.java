package september;

import java.util.Scanner;

class Sum {
	
	int sum(Scanner sc) {
		
		int[] price = new int[100];
		
		for (int i = 0; i < 100; i++) {
			price[i] = sc.nextInt();
			if (price[i] == 0)
				break;
		}
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += price[i];
		}
		
		return sum;
	}
}

public class Sep_2_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("상품의 가격을 입력해주세요. 가격 입력 종료는 0을 눌러주세요.");
		Sum u = new Sum();
		int sum1 = u.sum(sc);

		System.out.println("합계: " + sum1 + "원");

		System.out.println("받은 돈을 입력해 주세요.");
		int receive = sc.nextInt();
		int extra = receive - sum1;
		System.out.println("거스름돈: " + extra + "원");

		// **************************************************************************************

		int choice = 3;
		do {
			
			System.out.println("계산 종료. 다른 상품들을 계산하기 원하시면 1을, 원하지 않으시면 0을 눌러 주세요.");
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("상품의 가격을 입력해주세요. 가격 입력 종료는 0을 눌러주세요.");
				int sum2 = u.sum(sc);
				System.out.println("합게: " + sum2 + "원");

				System.out.println("받은 돈을 입력해 주세요.");
				receive = sc.nextInt();
				extra = receive - sum2;
				System.out.println("거스름돈: " + extra + "원");
			} else if (choice == 0)
				return;

		} while (choice == 1);

	}

}

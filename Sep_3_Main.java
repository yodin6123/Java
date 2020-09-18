package september;

import java.util.Scanner;

public class Sep_3_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int want=0, wantWin=0, bat=0;
		
		Sep_3 s = new Sep_3();
		
		System.out.println("카드게임 시작");
		loop:while(true) {
			System.out.println("몇 판 하시겠습니까?");
			want = sc.nextInt();
			
			if(want%2==0) {
				System.out.println("홀수만 입력해주세요.");
			} else {
				wantWin = (want/2)+1;
				System.out.println(want+"판"+wantWin+"승제");
				break;
			}
		}
		
		for(int i=0; i<want; i++) {
			if(s.win == wantWin || s.lose == (want-wantWin)+1) {
				break;
			} else {
				s.draw();
				System.out.println("나의 카드: " + s.you);
				System.out.println("배팅하시겠습니까?\t1. 콜\t2. 다이");
				bat=sc.nextInt();
				
				switch (bat) {
					case 1:
						s.game();
						i -= s.getCount();
						s.setCount(0);
						break;
					
					case 2:
						System.out.println("다이하셨습니다.");
						System.out.println("카드를 다시 나눠드립니다.");
						i--;
						break;
						
				}
			}
		}
		
		System.out.println("----------------------------------------");
		System.out.println("총"+want+"판"+s.win+"승"+s.lose+"패");
		
		sc.close();

	}

}

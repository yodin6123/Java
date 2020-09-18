package september;

import java.util.Random;

public class Sep_3 {
	
	Random r = new Random();
	
	int you=0, com=0, win=0, lose=0, count=0;
	
	public void draw() {
		
		this.you = r.nextInt(10)+1;
		this.com = r.nextInt(10)+1;
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void game() {
		
		if(you==1) {
			
			if(com==10) {
				System.out.println("이겼습니다!");
				win++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			} else if(com==1) {
				System.out.println("비겼습니다.");
				count++;
			} else {
				System.out.println("졌습니다.");
				lose++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			}
			
		} else if(you==10) {
			
			if(com==1) {
				System.out.println("졌습니다.");
				lose++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			} else if(com==1) {
				System.out.println("비겼습니다.");
				count++;
			} else {
				System.out.println("이겼습니다!");
				win++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			}
			
		} else {
			
			if(you==com) {
				System.out.println("비겼습니다.");
				count++;
			} else if(you>com) {
				System.out.println("이겼습니다!");
				win++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			} else {
				System.out.println("졌습니다.");
				lose++;
				System.out.println(win+"승"+lose+"패를 기록중입니다.");
			}
			
		}
	}

}

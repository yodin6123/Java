package september;

import java.util.*;

public class Sep_4_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int y, sum = 0;

		for(int i=0; i<1; i++){
			
			int num = r.nextInt(100);
	
			do {
				
			    System.out.println("정답을 추측해 보시오");
			    y = sc.nextInt();
			    sum+=1;
	
			    if(num > y) {
			    	System.out.println("제시한 정수가 낮습니다");
			    	System.out.println();
			    }
	
			    else if(num < y) {
			    	System.out.println("제시한 정수가 높습니다");
			    	System.out.println();
			    }
			    
			} while(num != y);
			
			System.out.print("축하합니다." + "시도횟수=" + sum);

		}
		
		sc.close();

	}

}

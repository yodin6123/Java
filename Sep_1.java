package september;

public class Sep_1 {

	public static void main(String[] args) {
		
		// 숫자 삼각형 만들기
		
		for(int i=0; i<7; i++) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(j);
				
			}// end of for----------
			
			for(int k=i; k>-1; k--) {
				
				System.out.print(k);
				
			}// end of for----------
			
			System.out.println();
			
		}

	}

}

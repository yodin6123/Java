package september;

import java.util.*;

public class Sep_7_Main {
	
	static String[] name = {"홍길동", "정철", "홍마담", "김돌쇠"};
	static String[] num = {"110-122-759480", "102-356-454812", "30-502-654321", "110-855-548154"};
	static int[] pass = {1234, 2345, 5384, 0256};
	static int[] change ={5000, 70000, 6000, 45000};
	static String[] bank = {"신한", "우리", "기업" ,"국민"};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		  
		int i=(Math.abs(r.nextInt()%4))-1;
		  
		System.out.println("안녕하십니까  "+name[i]+"고객님, 비밀번호를 입력해주세요.");
		int password = sc.nextInt();
		
		if(password == pass[i]){
		    
			System.out.println("안녕하십니까 "+name[i]+"고객님, ");
		    System.out.println("계좌번호: " +  num[i]);
		    System.out.print("얼마출력하시겠습니까?\n");
		    int money = sc.nextInt();
		      
		    if(money>change[i]){
		       
		    	System.out.println("현재 잔액은 "+change[i]+"이므로 출금불가합니다.");
		        System.out.println("행복과 함께하는 은행 "+ bank[i] +"은행");
		    
		    } else {
		       
		        int rs=(change[i]-money);
		       
		        System.out.println("잔액: "+rs+"\t" +
		        bank[i]+"은행 "+name[i]+"고객님 좋은하루 되세여 ~");
		        System.out.println("행복과 함께하는 은행 "+ bank[i] +"은행");
		    
		    }
		      
		} else {
		     
			System.out.println("비밀번호가 틀렸습니다.");

		}
	
	}
}

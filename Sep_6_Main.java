package september;

import java.util.Scanner;

public class Sep_6_Main {

	static String station[] = { "천안", "평택", "서정리", "수원", "영등포", "용산", "서울" };

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
		String start = "";
		String end = "";
		  
		int num1=0;
		int num2=0;
		  
		System.out.println("서울행 기차");
		  
		for(int i=0; i<station.length; i++){
		   
		   System.out.print(station[i]+"\t");
		   
		}
		  
		System.out.println();
		  
		System.out.print("출발지 입력: ");
		String s = sc.next();
		System.out.print("도착지 입력: ");
		String e = sc.next();
		  
		for(int i=0; i<station.length; i++){
		   
			if(s.equals(station[i])){
		    
			    start = station[i];
			    num1 = i;
		   
		    }
		  
		  
		}
		
		for(int i=0; i<station.length; i++){
		   
			if(e.equals(station[i])){
		    
			    end = station[i];
			    num2 = i;
		   
			}
		  
		}
		  
		int n = num2-num1;
		  
		switch(n) {
		  
		case 1 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 2000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		     
		case 2 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 4000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		     
		case 3 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 6000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		     
		case 4 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 8000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		     
		case 5 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 10000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		     
		case 6 : 
			System.out.println("출발역: "+start);
		    System.out.println("도착역: "+end);
		    System.out.println("요금은 12000원 입니다.");
		    System.out.println("이용해주셔서 감사합니다. -코라일");
		    break;
		}

	}

}

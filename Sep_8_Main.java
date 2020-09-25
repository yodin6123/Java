package september;

import java.util.Calendar;

public class Sep_8_Main {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);

		String imsi=year+"년"+(month+1)+"월"+day+"일";
		System.out.println("금월 달력 프린트");

		cal.set(year, month,1);
		int weekconst=cal.get(Calendar.DAY_OF_WEEK);

		String space="";//첫 라인 띄워쓰기
		for(int i=1; i<weekconst; i++){
			space+="\t";
		}
		
		System.out.print(space);

		int lastday=cal.getActualMaximum(Calendar.DATE);

		for(int i=1; i<=lastday; i++){
			
			System.out.print(i+"\t");
			
			if((i+weekconst-1) %7 == 0){
				System.out.println();
			}
			
		}

	}

}

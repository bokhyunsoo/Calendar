import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			System.out.println("월을 입력하세요.");
			int month = sc.nextInt();

//			int[] day = new int[12];
//			day[0] = 31;
//			day[1] = 28;
//			day[2] = 31;
//			day[3] = 30;
//			day[4] = 31;
//			day[5] = 30;
//			day[6] = 31;
//			day[7] = 31;
//			day[8] = 30;
//			day[9] = 31;
//			day[10] = 30;
//			day[11] = 31;
			
			String weekday;
			
			switch (month){
			
			case 1: 
				System.out.println("1일은 무슨 요일인가요?");
				
				weekday = sc.next();
				
				if(weekday.equals("일")){
				System.out.println("SU MO TU WE TH FR SA");
				System.out.println("--------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9 10 11 12 13  14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
			case 2:
				System.out.println("1일은 무슨 요일인가요?");
				
				weekday = sc.next();
				
				if(weekday.equals("일")){
					
					System.out.println("SU MO TU WE TH FR SA");
					System.out.println("--------------------");
					System.out.println("1  2  3  4  5  6  7");
					System.out.println("8  9 10 11 12 13  14");
					System.out.println("15 16 17 18 19 20 21");
					System.out.println("22 23 24 25 26 27 28");
					System.out.println("29 30 31");
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				
			case 3:
				System.out.println("1일은 무슨 요일인가요?");
				
				weekday = sc.next();
				
				if(weekday.equals("일")){
					System.out.println("SU MO TU WE TH FR SA");
					System.out.println("--------------------");
					System.out.println("1  2  3  4  5  6  7");
					System.out.println("8  9 10 11 12 13  14");
					System.out.println("15 16 17 18 19 20 21");
					System.out.println("22 23 24 25 26 27 28");
					System.out.println("29 30 31");
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
			}
	}

}

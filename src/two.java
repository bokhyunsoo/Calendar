import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			System.out.println("년도를 입력하세요.");
			int year = sc.nextInt();

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
			
			int month;
			
			switch (year){
			
			case 2016: 
				System.out.println("월을 입력하세요.");
				
				month = sc.nextInt();
				
			if (month == 1) {
				System.out.println("2016년 1월");
				System.out.println("SU MO TU WE TH FR SA");
				System.out.println("--------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9 10 11 12 13  14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				break;
			} else if (month == 2) {
				System.out.println("2016년 2월");
				System.out.println("SU MO TU WE TH FR SA");
				System.out.println("--------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9 10 11 12 13  14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
				
			case 2017:
				System.out.println("월을 입력하세요.");
				
				month = sc.nextInt();
				
			if (month == 1) {
				System.out.println("2017년 1월");
				System.out.println("SU MO TU WE TH FR SA");
				System.out.println("--------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9 10 11 12 13  14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				break;
			} else if (month == 2) {
				System.out.println("2017년 2월");
				System.out.println("SU MO TU WE TH FR SA");
				System.out.println("--------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9 10 11 12 13  14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
				
			case 2018:
				System.out.println("월을 입력하세요.");
				
				month = sc.nextInt();
				
				if (month == 1) {
					System.out.println("2018년 1월");
					System.out.println("SU MO TU WE TH FR SA");
					System.out.println("--------------------");
					System.out.println("1  2  3  4  5  6  7");
					System.out.println("8  9 10 11 12 13  14");
					System.out.println("15 16 17 18 19 20 21");
					System.out.println("22 23 24 25 26 27 28");
					System.out.println("29 30 31");
					break;
				} else if (month == 2) {
					System.out.println("2018년 2월");
					System.out.println("SU MO TU WE TH FR SA");
					System.out.println("--------------------");
					System.out.println("1  2  3  4  5  6  7");
					System.out.println("8  9 10 11 12 13  14");
					System.out.println("15 16 17 18 19 20 21");
					System.out.println("22 23 24 25 26 27 28");
					System.out.println("29 30 31");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
	}

}

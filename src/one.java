import java.util.Scanner;

public class one {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		
		String value = sc.nextLine();
		String[] values = value.split(" ");
		
		
		int first = Integer.parseInt(values[0]);
		
		int second = Integer.parseInt(values[1]);
		
		System.out.println(first+second);
		
	}
}

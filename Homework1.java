import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args){
		int a, total = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요 :");
			a = sc.nextInt();
			total = total + a;
			System.out.println("현재까지 입력된 정수의 합은 " + total + "입니다");
		}
	}
}

package ex13.io.control6.continue_break;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 sp로 구분해서 5개 이상 입력하세요:");

		// 3 Enter, 34 5 6 234 345 54 45 Enter
		while(sc.hasNext()) {
			n = sc.nextInt();
			if(n<10) {
				continue;
			}else if(n>300) {
				break;
			}else { 
				System.out.println(n);
			}
		}
	}
}

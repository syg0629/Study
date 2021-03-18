package ex5.io.scanner;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner sc = new Scanner(System.in);

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		// 성적 입력 부분
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 입력          │\n");
		System.out.print("└────────────────────────────┘\n");
		System.out.print("국어1 성적을 입력하세요 >> ");
		kor1 = sc.nextInt();
		System.out.print("국어2 성적을 입력하세요 >> ");
		kor2 = sc.nextInt();
		System.out.print("국어3 성적을 입력하세요 >> ");
		kor3 = sc.nextInt();
		

		// 성적 출력 부분
		total = kor1 + kor2 + kor3;
		avg = total/3.0f;

		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.2f\n", avg); // 전체 길이 6개 확보 000.00해서 총 6개
		System.out.println("──────────────────────────────");

		// 인덱스를 넣으면 순서를 내가 정할 수 있음
		System.out.printf("%2$d %3$d %1$d \n", 1, 2, 3);
		
		// 지정자에 맞게 수가 와야하는데 인덱스를 넣으면 그렇지 않아도 됨.
		System.out.printf("%1$d %1$d %1$d \n", 1);
		
	}
}

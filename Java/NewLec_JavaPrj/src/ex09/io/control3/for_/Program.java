package ex09.io.control3.for_;

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

		while(true) {

			// 성적 입력 부분
			System.out.print("┌────────────────────────────┐\n");
			System.out.print("│           성적 입력          │\n");
			System.out.print("└────────────────────────────┘\n");
			System.out.print("국어1 성적을 입력하세요 >> ");
			kor1 = sc.nextInt();
			
			while(kor1<0 || 100<kor1) {
				System.out.println("성적범위(0~100)를 벗어났습니다.");
				System.out.print("국어1 성적을 입력하세요 >> ");
				kor1 = sc.nextInt();
				}
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

			for(int i = 0; i<3 ; i++) {
			System.out.printf("\t국어%d : %3d\n", i+1, kor1);
			}
			System.out.printf("\t총점 : %3d\n", total);
			System.out.printf("\t평균 : %6.2f\n", avg); // 전체 길이 6개 확보 000.00해서 총 6개
			System.out.println("──────────────────────────────");

		}
	}
}

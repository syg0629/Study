package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int [] kors = new int[3];
		int total = 0;
		float avg;
		int menu;
		boolean keepLoop = true;

		Scanner sc = new Scanner(System.in);

		while (keepLoop) {
			// 메인 메뉴 부분
			System.out.print("┌────────────────────────────┐\n");
			System.out.print("│           메인 메뉴          │\n");
			System.out.print("└────────────────────────────┘\n");
			System.out.println("\t1. 성적 입력");
			System.out.println("\t2. 성적 출력");
			System.out.println("\t3. 종료");
			System.out.print("\t선택 > ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				// 성적 입력 부분
				System.out.print("┌────────────────────────────┐\n");
				System.out.print("│           성적 입력          │\n");
				System.out.print("└────────────────────────────┘\n");

				for(int i = 0; i < 3; i++) {
					do {
						System.out.printf("국어%d 성적을 입력하세요 >> ", i+1);
						kors[i] = sc.nextInt();

						if (kors[i] < 0 || 100 < kors[i]) {
							System.out.println("성적범위(0~100)를 벗어났습니다.");
						}
					} while (kors[i] < 0 || 100 < kors[i]);
				}
				break;

			case 2:
				// 성적 출력 부분
				System.out.print("┌────────────────────────────┐\n");
				System.out.print("│           성적 출력          │\n");
				System.out.print("└────────────────────────────┘\n");

				for(int i = 0; i<3; i++) {
					System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
					total += kors[i];
				}
				avg = total / 3.0f;
				System.out.printf("\t총점 : %3d\n", total);
				System.out.printf("\t평균 : %6.2f\n", avg);

				break;

			case 3:
				System.out.println("──────────────────────────────");
				System.out.println("종료합니댜~*_*");
				
				keepLoop = false;
				break;

			default:
				System.out.println("입력 오류입니다. 1~3번만 입력해주세요.");
			}
		}
	}
}

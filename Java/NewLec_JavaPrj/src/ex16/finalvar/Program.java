package ex16.finalvar;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		final int SIZE = 3;
		int[] kors = new int[SIZE];
		int total = 0;
		float avg;
		int menu;
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < SIZE; i++) {
			kors[i] = 0;
		}

		종료: // break 라벨문
			while (true) {
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
				case MENU_INPUT:
					// 성적 입력 부분
					System.out.print("┌────────────────────────────┐\n");
					System.out.print("│           성적 입력          │\n");
					System.out.print("└────────────────────────────┘\n");

					for (int i = 0; i < SIZE; i++) {
						do {
							System.out.printf("\t국어%d 성적을 입력하세요 >> ", i + 1);
							kors[i] = sc.nextInt();
							if (kors[i] < 0 || 100 < kors[i]) {
								System.out.println("성적범위(0~100)를 벗어났습니다.");
							}
						} while (kors[i] < 0 || 100 < kors[i]);
					}
					break;

				case MENU_PRINT:
					// 성적 출력 부분
					for (int i = 0; i < SIZE; i++)
						total += kors[i];
					
					avg = total / 3.0f;

					System.out.print("┌────────────────────────────┐\n");
					System.out.print("│           성적 출력          │\n");
					System.out.print("└────────────────────────────┘\n");

					for (int i = 0; i < SIZE; i++) {
						System.out.printf("\t국어%d : %3d\n", i + 1, kors[i]);
					}
					System.out.printf("\t총점 : %3d\n", total);
					System.out.printf("\t평균 : %6.2f\n", avg); // 전체 길이 6개 확보 000.00해서 총 6개

					break;

				case MENU_EXIT:
					System.out.println("──────────────────────────────");
					System.out.println("종료합니댜~*_*");

					break 종료; // 그냥 break는 switch만 벗어나고 while까지 벗어나지 못함. 이렇게 break 라벨문을 쓰면 해당 지점까지 벗어나게됨!

				default:
					System.out.println("입력 오류입니다. 1~3번만 입력해주세요.");
				}

			}
	}
}

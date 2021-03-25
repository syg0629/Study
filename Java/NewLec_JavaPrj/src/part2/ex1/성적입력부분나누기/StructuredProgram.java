package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {


	public static void main(String[] args) {
		int [] korList = new int[3];

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:

				inputKors(korList); // 이걸 참조로 받음

				break;

			case 2:

				printKors(korList);

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

	static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		// 메인 메뉴 부분
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           메인 메뉴          │\n");
		System.out.print("└────────────────────────────┘\n");
		System.out.println("\t1. 성적 입력");
		System.out.println("\t2. 성적 출력");
		System.out.println("\t3. 종료");
		System.out.print("\t선택 > ");
		int menu = sc.nextInt();
		return menu;
	}

	static void inputKors(int[] kors) { // 이 지역내에서 어떤 이름으로 쓸지는 상관없음. 그래서 여기서는 kors
		Scanner sc = new Scanner(System.in);
		int kor;

		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 입력          │\n");
		System.out.print("└────────────────────────────┘\n");

		for(int i = 0; i < 3; i++) {
			do {
				System.out.printf("국어%d 성적을 입력하세요 >> ", i+1);
				kor = sc.nextInt();

				if (kor < 0 || 100 < kor) {
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			} while (kor < 0 || 100 < kor);
			kors[i] = kor;
		}
	}

	static void printKors(int[] kors) {
		int total = 0;
		float avg;

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

	}
}
// 자바 구조적인 프로그래밍 강의 2강 - 코드 구조화 Bottom Up 방식 연습 #1

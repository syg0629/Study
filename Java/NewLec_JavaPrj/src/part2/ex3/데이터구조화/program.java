package part2.ex3.데이터구조화;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Exam [] exams = new Exam[3];
		int current = 0;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				inputList(exams, current); 
				break;

			case 2:
				printList(exams, current); // inputList에서 값을 하나를 입력받지만 실제 값은 하나일 수도 있고 둘일 수도 있음. exams에 들어있는 갯수 만큼 출력해야 함.
				// 현재 들어가 있는 exams의 갯수는 어떻게 알까? -> current 
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
	private static void printList(Exam[] exams, int size) { // 이름이 current로 같기도 하고 그 사이즈만큼 돈다는 뜻으로 size로 !
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		for(int i = 0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor; // 이건 연산이 아님. 그래서 for문 안에 있어도 괜찮음
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("\t국어 : %3d\n", kor);
			System.out.printf("\t영어 : %3d\n", eng);
			System.out.printf("\t수학 : %3d\n", math);

			System.out.printf("\t총점 : %3d\n", total);
			System.out.printf("\t평균 : %6.2f\n", avg);
		}
	}

	private static void inputList(Exam[] exams, int current) { // current가 main함수에 있기 떄문에 매개변수로 넣어줘야함
		Scanner sc = new Scanner(System.in);

		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 입력          │\n");
		System.out.print("└────────────────────────────┘\n");

		int kor, eng, math;

		do {
			System.out.printf("국어 성적을 입력하세요 >> ");
			kor = sc.nextInt();

			if (kor < 0 || 100 < kor) {
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			}
		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 성적을 입력하세요 >> ");
			eng = sc.nextInt();

			if (eng < 0 || 100 < eng) {
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			}
		} while (eng < 0 || 100 < eng);
		do {
			System.out.printf("수학 성적을 입력하세요 >> ");
			math = sc.nextInt();

			if (math < 0 || 100 < math) {
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			}
		} while (math < 0 || 100 < math);

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		exams[current] = exam;
		current++;

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
}

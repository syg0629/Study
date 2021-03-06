package part2.ex3.데이터구조화;

import java.util.Scanner;

public class Listprogram {
	public static void main(String[] args) {
		ExamList list = new ExamList(); // ExamList 안에 있는 exams에 객체를 만듬.
		list.exams = new Exam[3]; // .을 통해 접근
		list.current = 0;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				inputList(list); 
				break;

			case 2:
				printList(list, 2); // 2만 출력해달라고 함.
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
	private static void printList(ExamList list) { // 이름이 current로 같기도 하고 그 사이즈만큼 돈다는 뜻으로 size로 !
		printList(list, list.current); // printList(list)를 하게되면 자기가 지신을 호출하는거라 무한 loop에 빠지게 됨. 
		// 이렇게 해야 코드 집중화가 되는 것
	}
	private static void printList(ExamList list, int size) { // 이름이 current로 같기도 하고 그 사이즈만큼 돈다는 뜻으로 size로 !
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		// int size = list.current;
		Exam[] exams = list.exams;

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
			System.out.println("──────────────────────────────");
		}
	}


	private static void inputList(ExamList list) { // current가 main함수에 있기 떄문에 매개변수로 넣어줘야함
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

		Exam[] exams = list.exams;
		int size = list.current;

		if(exams.length == size) {
			// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			// 3. exams = temp;(X) 
			// list.exams가 새로 만든 temp 배열을 참조하도록 한다.
			list.exams = temp;
		}

		list.exams[list.current] = exam;
		list.current++; // list를 붙이면 아까와 달리 공유가 되는 것임. list안에 있는 것을 가져오기 때문에

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

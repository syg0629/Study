package part3.ex1.캡슐화;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		ExamList list = new ExamList(); // ExamList 안에 있는 exams에 객체를 만듬.
		ExamList.init(list);

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				ExamList.inputList(list); 
				break;

			case 2:
				ExamList.printList(list); // 2만 출력해달라고 함.
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
}

package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam(); // Exam이라는 사용자가 정의한 구조형식의 데이터. 참조형태.

		input(exam);
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		int kor = exam.kor;
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

	private static void input(Exam exam) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;

		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 입력          │\n");
		System.out.print("└────────────────────────────┘\n");

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
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}

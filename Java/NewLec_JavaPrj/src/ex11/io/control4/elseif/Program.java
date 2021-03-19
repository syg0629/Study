package ex11.io.control4.elseif;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int menu;
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner sc = new Scanner(System.in);

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		while(true) {
			// 메인 메뉴 부분
			System.out.print("┌────────────────────────────┐\n");
			System.out.print("│           메인 메뉴          │\n");
			System.out.print("└────────────────────────────┘\n");
			System.out.println("\t1. 성적 입력");
			System.out.println("\t2. 성적 출력");
			System.out.println("\t3. 종료");
			System.out.print("\t선택 > ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				
			
			// 성적 입력 부분
			System.out.print("┌────────────────────────────┐\n");
			System.out.print("│           성적 입력          │\n");
			System.out.print("└────────────────────────────┘\n");
			
			do {
				System.out.print("\t국어1 성적을 입력하세요 >> ");
				kor1 = sc.nextInt();
				if(kor1<0 || 100<kor1) {
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			}
			while(kor1<0 || 100<kor1);

			do {
				System.out.print("\t국어2 성적을 입력하세요 >> ");
				kor2 = sc.nextInt();
				if(kor2<0 || 100<kor2) {
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			}
			while(kor2<0 || 100<kor2);
			
			do {
				System.out.print("\t국어3 성적을 입력하세요 >> ");
				kor3 = sc.nextInt();
				if(kor3<0 || 100<kor3) {
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			}
			while(kor3<0 || 100<kor3);
			
			} else if(menu == 2) {
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
			
			} else if(menu == 3){
				System.out.println("──────────────────────────────");
				System.out.println("종료합니댜~*_*");
				break;
			} else {
				System.out.println("입력 오류입니다. 1~3번만 입력해주세요.");
			}
			
		}
	}
}

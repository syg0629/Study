package part2.ex2.탑다운예제;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int menu;
		boolean keeploop = true;

		while(keeploop) {
			Scanner sc = new Scanner(System.in);
			System.out.println("┌───────────────────────┐");
			System.out.println("│    Lotto 관리 프로그램   │");
			System.out.println("└───────────────────────┘");
			System.out.println("1. 번호 자동 생성");
			System.out.println("2. 번호 수동 생성");
			System.out.println("3. 내 로또 번호 보기");
			System.out.println("4. 종료");
			System.out.print("> ");
			menu = sc.nextInt();

			switch(menu) {
			case 1: 
				System.out.println("┌───────────────────────┐");
				System.out.println("│     1. 번호 자동 생성    │");
				System.out.println("└───────────────────────┘");
				System.out.print("생성할 개수 : ");
				int count = sc.nextInt();
				System.out.println();
				
				System.out.println("┌───────────────────────┐");
				System.out.println("│     1. 번호 자동 생성    │");
				System.out.println("└───────────────────────┘");
				Random rand = new Random();
				int [] lottos = new int[6];
				
				for (int i = 0; i < lottos.length; i++) {
					int lotto = (rand.nextInt(45))+1;
					System.out.print(lotto+" ");
				}
				System.out.println();
				System.out.println("1. 저장하기");
				System.out.println("2. 상위메뉴로 가기");
				System.out.print("> ");
				menu = sc.nextInt();

			}
		}
	}

}
// 혼자 만들다 말아버림,,
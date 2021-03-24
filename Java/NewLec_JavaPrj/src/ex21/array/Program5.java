package ex21.array;

import java.util.Random;

public class Program5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1;
			System.out.print(lotto[i]+" ");
		}
	}
}
// 자바 코드 연습 기초 #13 - 배열에 랜덤 값 채우기

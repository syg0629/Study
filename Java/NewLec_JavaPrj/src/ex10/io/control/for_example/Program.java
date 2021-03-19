package ex10.io.control.for_example;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// 1~10까지 더하기
		int total = 0;
		for(int i = 0; i<11; i++) {
			total += i;
		}
		System.out.println(total);
		
		// 3~7까지 더하기. 절대 밑에 처럼 하기 말래
		total = 0;
		for(int i = 3; i<8; i++) {
			total += i;
		}
		System.out.println(total);
		
		// 3~7까지 더하기. 이렇게 하래
		total = 0;
		for(int i = 0; i<5; i++) {
			total += i+3;
		}
		System.out.println(total);
	}		
}

package ex01.io;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.write(3); // 아무것도 안뜸. 출력버퍼에 3을 추가한 것 뿐. 출력하라고 한 것은 아님
		System.out.flush(); // 출력은 되는데 이상한 기호가 뜸
		System.out.println();
		// 3을 출력해달라고 하려면 ''안에 넣어야함
		System.out.write('3');
		System.out.flush();
		System.out.println();

		// ''을 빼면 숫자가 출력되고, 이 숫자는 코드 값으로 인식이 됨 
		// 3이라는 코드 값을 가지고 있는 문자를 출력해달라고 요청하게 되는 것
		
		
		System.out.write(51); // 코드 값으로 인식이 되니까 그 코드 값인 3이 나옴
		System.out.flush();
		System.out.println();

		System.out.write('3'+1); // '3'+1이면 51 다음의 문자가 나오게 됨
		System.out.flush();
		System.out.println();

		System.out.write('3'+0);
		System.out.write('3'+1);
		System.out.write('3'+2);
		System.out.write('3'+3);
		System.out.flush();
		System.out.println();
		
		System.out.write('A'+0);
		System.out.write('A'+1);
		System.out.write('A'+2);
		System.out.write('A'+3);
		System.out.flush();
	}
}

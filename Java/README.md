# JAVA
> 뉴렉처 자바 프로그래밍 Study : 2021.03.17 ~ 2021.03.

- 프로그래밍이란?
  - 프로그래밍 : 컴퓨터에게 일을 하도록 명령어를 만드는 것
  - 컴파일 : 프로그램 언어를 컴퓨터가 알 수 있는 언어로 바꿔 주는 일
  - 컴파일러 : 기계어로 번역해주는 프로그램. 자바를 설치하면 자바 컴파일러도 설치 됨

- Java
  - 패키지는 소문자
  - 클래스는 대문자
  - Ctrl + N : Select a wizard
  - Ctrl + D : 한 줄 지우기
  - 환경변수 path에 javac가 있는 디렉토리 경로를 추가해줘서 어디서든 오류 없이 실행 가능하게 해줌
  - 자바에서는 ;로 내려쓰기를 함
  - 변수 선언을 먼저 해주고 변수를 써야함.
  - int : 정수 변수
  - float : 실수 변수
  - Open perspective -> Java

</br>
</br>

## 6강. 자바 언어의 특징
- C/C++언어와 비교했을 때 Java언어의 특징
  - 간결성
  - 언어에 컬렉션 포함
  - 완전한 객체지향 언어

</br>
</br>

## 7강. 자바 플랫폼의 특징
- 새로운 WORA API의 탄생
  - Write Once Run Anywhere 한번 작성되면 어디서든 실행될 수 있다 -> 운영체제가 달라도 자바플랫폼만 설치되면 실행할 수 있음.

</br>
</br>

## 9강. 값의 종류와 표현방법
1. 정수값
   - 26(10진수), 0x1a(16진수), 032(8진수), 0b11010(2진수), 26L,  0x1aL
   - 정수는 진법에 따라서 필기법이 달라지는데 표현방법 4가지에, 크기를 달리할 때 또다른 방법(L)이 있다.
2. 실수값
   - 123.4, 123.4f, 123.4d, 1.234e2, 1.234e2f, 1.234e2d
3. 문자값
   - 'A', '\u0065'
4. 진리값
   - true, false

</br>
</br>

## 11강. 값의 형식명칭과 형식 변환
- byte : 1byte
- short : 2bytes
- int : 4bytes
- long : 8bytes


**작은게 큰걸로 들어오는건 문제가 되지않음. But 큰게 작은걸로 들어오면 문제가 됨**
  ex) long x = 30; 묵시적으로 형식이 변환</br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  byte x = 30; 변환되지 않음 -> byte x = (byte)30; 변환됨

|형식명|값의 크기|기본값|
|:--:|:--:|:--:|
|byte|1바이트|0|
|short|2바이트|0|
|int|4바이트|0|
|long|8바이트|0L|
|float|4바이트|0.0g|
|double|8바이트|0.0d|
|boolean|가변|false|
|char|2바이트|'\u000'|

</br>
</br>

## 14강. 자바 변수 선언
- 모든 키워드는 선언하고 사용해야만 한다.
- 변수 : 값을 담는 그릇
- 선언할 때 물리적으로 값을 한정해야함. ex) byte, int, float
- 값을 담으면서 선언 -> 변수 초기화
- 변수 명명 규칙
  - 반드시 영문자로 시작해야함. 숫자로 시작 못함
  - 사이에 공백이 있으면 안됨
  - 특수기호 들어가면 안됨
  - 여러 변수를 한번에 선언 가능 ex) int kor1, kor2, kor3;
  - 각각 선언 가능 ex) int kor1; int kor2;

</br>
</br>

## 15강. 출력 스트림 객체와 API
- 출력버퍼의 개체명은 OutputStream
- 실제 사용하는 객체명은 out
- 입력버퍼의 개체명은 InputStream
- 실제 사용하는 객체명은 in

</br>
</br>

## 16강. 콘솔 출력과 문자코드
```java
package ex1.io;

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

		System.out.write('3'+1); // '3'+1이면 51 다음의 문자가 나오게 됨 => 4
		System.out.flush();
		System.out.println();

		System.out.write('3'+0);
		System.out.write('3'+1);
		System.out.write('3'+2);
		System.out.write('3'+3);
		System.out.flush();
		System.out.println(); // 3456
		
		System.out.write('A'+0);
		System.out.write('A'+1);
		System.out.write('A'+2);
		System.out.write('A'+3);
		System.out.flush(); // ABCD
	}
}

```

</br>
</br>

## 17강. 콘솔 문자열 출력 - PrintStream
이스케이프 문자 : 문자열 사이에 꽂아 넣을 수 있는 명령어

|이스케이프 문자|설명|
|:--:|:--:|
|\b|백스페이스(backspace)|
|\t|수평 탭(horizontal tab) 삽입|
|\n|새 행(new line)삽입|
|\f|폼피드(form feed - 다음 페이지로)|
|\r|캐리지리턴(carriage return - 제일 왼쪽 위치로)|
|\'|홑 따옴표 삽입|
|\"|이중 따옴표 삽입|
|\\\ |역슬래쉬 삽입|


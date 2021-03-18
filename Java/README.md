# JAVA
> 뉴렉처 자바 프로그래밍 Study : 2021.03.17 ~ 2021.03.

## 목차
- [JAVA](#java)
  - [목차](#목차)
  - [프로그래밍이란?](#프로그래밍이란)
  - [6강. 자바 언어의 특징](#6강-자바-언어의-특징)
  - [7강. 자바 플랫폼의 특징](#7강-자바-플랫폼의-특징)
  - [9강. 값의 종류와 표현방법](#9강-값의-종류와-표현방법)
  - [11강. 값의 형식명칭과 형식 변환](#11강-값의-형식명칭과-형식-변환)
  - [14강. 자바 변수 선언](#14강-자바-변수-선언)
  - [15강. 출력 스트림 객체와 API](#15강-출력-스트림-객체와-api)
  - [16강. 콘솔 출력과 문자코드](#16강-콘솔-출력과-문자코드)
  - [17강. 콘솔 문자열 출력 - PrintStream](#17강-콘솔-문자열-출력---printstream)
  - [19강. 출력 문자열 format과 숫자 출력 - printf](#19강-출력-문자열-format과-숫자-출력---printf)
  - [20강. 형식지정자 옵션](#20강-형식지정자-옵션)
  - [21강. 콘솔 입력하기(System.in, Scanner)](#21강-콘솔-입력하기systemin-scanner)
  - [22강. 산술, 대입 연산자](#22강-산술-대입-연산자)
  - [23강. 비교,관계 연산자](#23강-비교관계-연산자)
  - [24강. 비트 연산자](#24강-비트-연산자)
<br>

---
<br>

## 프로그래밍이란?
  - 프로그래밍 : 컴퓨터에게 일을 하도록 명령어를 만드는 것
  - 컴파일 : 프로그램 언어를 컴퓨터가 알 수 있는 언어로 바꿔 주는 일
  - 컴파일러 : 기계어로 번역해주는 프로그램. 자바를 설치하면 자바 컴파일러도 설치 됨
  - Java
    - 패키지는 소문자
    - 클래스는 대문자
    - Ctrl + N : Select a wizard
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

</br>
</br>

## 19강. 출력 문자열 format과 숫자 출력 - printf
- print할 때 포맷을 먼저 만들고 출력을 해줌
- 2013-07-23 = `System.out.prinf("%d-%d-%d", 2013,07,23);`
- 2013/07/23 = `System.out.prinf("%d/%d/%d", 2013,07,23);`
- 2013년 07월 23일 = `System.out.prinf("%d년%월%일", 2013,07,23);`
- `printf("%s %d %f %c", "hello", 3, 5.6, 'a');`

|코드|데이터 형식|사용 예제|출력 결과|
|:--:|:--:|:--:|:--:|
|d|정수(10진수)|("%5d",29)|29
|x|정수(16진수)|("%x%x",29,32)|1D 20
|o|정수(8진수)|("%o",29)|35
|f|실수|("%5.2f",87.98953231)|87.99
|e|지수형 실수|("%e",874.9163)|8.749163e+02
|c|문자|("%c",'Y')|Y
|s|문자열|("%10s","Hi")|Hi
- "%10s","Hi"는 전체 길이가 10개인 문자열 공간에서 Hi를 오른쪽으로 정렬하고 나머지는 공백으로 남겨둔다는 뜻
- "%-10s","Hi"면 Hi를 왼쪽으로 정렬하고 나머지를 공백으로 한것
- "%5.2f",87.98953231는 전체의 길이는 5개로 고정(.도 포함)하고 소수점은 2개.
  5는 미니멈으로 넘어가게되면 공간이 밀리게 됨.

</br>
</br>

## 20강. 형식지정자 옵션
```java
// 인덱스를 넣으면 순서를 내가 정할 수 있음
System.out.printf("%2$d %3$d %1$d \n", 1, 2, 3);
// 2 3 1 

// 지정자에 맞게 수가 와야하는데 인덱스를 넣으면 그렇지 않아도 됨.
System.out.printf("%1$d %1$d %1$d \n", 1);
// 1 1 1 
```

```java
package ex4.io.printf;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total/3;


		// 성적 출력 부분
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.2f\n", avg); // 전체 길이 6개 확보 000.00해서 총 6개
		System.out.println("──────────────────────────────");

	}
}
/* console
┌────────────────────────────┐
│         성적 출력          │
└────────────────────────────┘
	국어1 :  50
	국어2 :  60
	국어3 :  80
	총점 : 190
	평균 :  63.00
──────────────────────────────
*/

```

> 🎈계산을 하면 63.33이 나와야하는데 이클립스에서는 63.00이 나옴 <br> 
> => 정수를 정수로 나누면 값은 정수만 나옴 </br>
> => 실수를 실수로 나눠야함</br>
> 
>>// double보다 float이 작으니까 작은 공간에 큰것을 넣으면 오류가 남</br>
>> 1. &nbsp; 명시적 형변환 `avg = (float)(total/3.0);` </br>
>> 2. &nbsp; 묵시적 형변환 `avg = total/3.0f;` </br>
> 두가지 방법이 있단다~

<br>
<br>

## 21강. 콘솔 입력하기(System.in, Scanner)
- 키보드로부터 값을 입력받음
- nextLine() : 한번에 문자 형태로 읽어들이는 함수
- next() : 단어 단위로 끊어서 읽어들이는 함수
- nextInt() : 단어 하나 읽어서 정수 형태로 변환
- nextFloat() : 단어 하나 읽어서 실수 형태로 변환
- nextDouble() : 단어 하나 읽어서 실수 형태로 변환

<br>
<br>

## 22강. 산술, 대입 연산자
- 연산할 때 자료형이 같아야함. 묵시적 형변환, 명시적 형변환
- 몫 : 10/3 = 3(소수점 없다)
- 나머지 : 10%3 = 1

|단항 연산자|||
|:--:|:--:|:--:|
|+|양수 연산자|int result = +1;
|-|음수 연산자|result = -result;|
|++|증가 연산자|result++;|
|--|감소 연산자|result--;|
|!|부정 연산자|!success|

<br>

```java
package ex5.io.scanner;

public class PrePostDemo {
	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); // 4
		
		++i;
		System.out.println(i); // 5
		
		System.out.println(++i); // 6 증가시키고 증가시킨 결과가 출력
		System.out.println(i++); // 6 i를 먼저 출력하고 증가(다음에 반영)
		System.out.println(i); // 7
	}
}
```

<br>
<br>

## 23강. 비교,관계 연산자
|비교 연산자|||
|:--:|:--:|:--:|
|==|같다|value1 == value2|
|!=|같지 않다|value1 != value2|
|>|~보다 크다|value1 > value2|
|>=|~보다 크거나 같다|value1 >= value2|
|<|~보다 작다|value1 < value2|
|<=|~보다 작거나 같다|value1 <= value2|

<br>

|논리 연산자|||
|:--:|:--:|:--:|
|&&|교집합|(value1 == 1) && (value == 2)|
|\|\||합집합|(value1 == 1) \|\| (value2 == 2)|

<br>
<br>

## 24강. 비트 연산자
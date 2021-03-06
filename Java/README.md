# JAVA
<b>출처 : https://www.youtube.com/channel/UC5-ixpj8DioZqmrasj6Ihpw</b>
> 뉴렉처 자바 프로그래밍 Study : 2021.03.17 ~ 2021.03.23 <br>
> 뉴렉처 자바 코드연습 Study : 2021.03.23 ~ 2021.03.24<br>
> 뉴렉처 자바 구조적인 프로그래밍 Study : 2021.03.24 ~ 2021.03.29<br>
> 뉴렉처 자바 객체지향 프로그래밍 Study : 2021.03.30 ~ 2021.04.<br>
---
>> <b><u>✨Check✨</u></b><br>
>> 1. 32강. break 라벨문<br>
>> 2. 33강. hasNext()<br>
>> 3. 37강. kors[3*j+i], total = kors[j][0]+kors[j][1]+kors[j][2];
>> 4. 자바 코드 연습 기초 #6. 범위가 좁은 조건문(특수한 조건문)을 제일 위에 놓아야한다. else에는 기본값이 들어가도록 한다.<br>
>> 5. 자바 코드 연습 기초 #11. 코드의 복잡도가 높아지면 인덱스 값을 저장할 임시변수가 있는 게 좋다. ex) int index = -1; <br>
>> 6. 자바 코드 연습 기초 #13. Random nextInt(int bound) <br> 
>> 7. F3을 누르면 관련된 코드로 이동<br>
>> 8. alt + ←,→ 이것도 관련 코드 이동<br>
>> 9. 구조적인 프로그래밍 강의 7강 - 배열의 매개변수를 계속 헷갈려하넹,, 😥<br>
>> 10. 구조적인 프로그래밍 10~15강 까지는 반복해서 들어서 내것화 해야할 듯<br>
<br>
>> 목차 확장자 이용후 지워야할 듯..

---
## 목차
- [JAVA](#java)
	- [> 뉴렉처 자바 객체지향 프로그래밍 Study : 2021.03.30 ~ 2021.04.<br>](#-뉴렉처-자바-객체지향-프로그래밍-study--20210330--202104)
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
	- [25강. 복합 대입 연산자와 연산자 우선순위](#25강-복합-대입-연산자와-연산자-우선순위)
	- [28강. 제어구조 do while 문](#28강-제어구조-do-while-문)
	- [31강. 제어구조 else if, else](#31강-제어구조-else-if-else)
	- [32강. 제어구조 switch와 break 라벨문](#32강-제어구조-switch와-break-라벨문)
	- [33강. 제어구조 continue와 break문](#33강-제어구조-continue와-break문)
	- [34강. 배열이란?](#34강-배열이란)
	- [36강. 다차원 배열](#36강-다차원-배열)
	- [37강. 다차원 배열 표현식](#37강-다차원-배열-표현식)
	- [38강. 상수형 변수](#38강-상수형-변수)
	- [자바 코드 연습 #1 - 별찍기](#자바-코드-연습-1---별찍기)
	- [자바 코드 연습 기초 #3 - 반복문 중첩](#자바-코드-연습-기초-3---반복문-중첩)
	- [자바 코드 연습 기초 #6 - 오목판의 외곽선 꾸미기](#자바-코드-연습-기초-6---오목판의-외곽선-꾸미기)
	- [자바 코드 연습 기초 #7 - 배열 참조변수 선언과 초기화 방법 정하기](#자바-코드-연습-기초-7---배열-참조변수-선언과-초기화-방법-정하기)
	- [자바 코드 연습 기초 #8 - 자바에서 다차원 배열은 모두 톱니형 배열이다.](#자바-코드-연습-기초-8---자바에서-다차원-배열은-모두-톱니형-배열이다)
	- [자바 코드 연습 기초 #9 - 배열 값 이동하기](#자바-코드-연습-기초-9---배열-값-이동하기)
	- [자바 코드 연습 기초 #10 - 배열 합치기](#자바-코드-연습-기초-10---배열-합치기)
	- [자바 코드 연습 기초 #11 - 배열 항목 찾기](#자바-코드-연습-기초-11---배열-항목-찾기)
	- [자바 코드 연습 기초 #12 - 배열 값 교환하기](#자바-코드-연습-기초-12---배열-값-교환하기)
	- [자바 코드 연습 기초 #13 - 배열에 랜덤 값 채우기](#자바-코드-연습-기초-13---배열에-랜덤-값-채우기)
	- [자바 구조적인 프로그래밍 강의 2강 - 코드 구조화 Bottom Up 방식 연습 #1](#자바-구조적인-프로그래밍-강의-2강---코드-구조화-bottom-up-방식-연습-1)
	- [자바 구조적인 프로그래밍 강의 3강 - 코드 구조화 Bottom Up 방식 연습 #2](#자바-구조적인-프로그래밍-강의-3강---코드-구조화-bottom-up-방식-연습-2)
	- [자바 구조적인 프로그래밍 강의 4강 - 매개변수를 이용한 함수 고립화](#자바-구조적인-프로그래밍-강의-4강---매개변수를-이용한-함수-고립화)
	- [자바 구조적인 프로그래밍 강의 5강 - 함수 이름 짓기](#자바-구조적인-프로그래밍-강의-5강---함수-이름-짓기)
	- [자바 구조적인 프로그래밍 강의 9강 - 구조체를 이용한 코드 작성하기](#자바-구조적인-프로그래밍-강의-9강---구조체를-이용한-코드-작성하기)
	- [자바 구조적인 프로그래밍 강의 7강 - 함수의 매개변수](#자바-구조적인-프로그래밍-강의-7강---함수의-매개변수)
	- [자바 구조적인 프로그래밍 강의 8강 - 데이터 구조화](#자바-구조적인-프로그래밍-강의-8강---데이터-구조화)
	- [자바 구조적인 프로그래밍 강의 10강 - 구조체 배열 이용하기](#자바-구조적인-프로그래밍-강의-10강---구조체-배열-이용하기)
	- [자바 구조적인 프로그래밍 강의 11강 - 가변 길이 배열](#자바-구조적인-프로그래밍-강의-11강---가변-길이-배열)
	- [자바 구조적인 프로그래밍 강의 12강 - 가변 길이를 위한 구조체 생성](#자바-구조적인-프로그래밍-강의-12강---가변-길이를-위한-구조체-생성)
	- [자바 구조적인 프로그래밍 강의 13강 - 가변 길이 배열 구현하기](#자바-구조적인-프로그래밍-강의-13강---가변-길이-배열-구현하기)
	- [- 가변 List : `[] + current + capacity + amount`](#--가변-list----current--capacity--amount)
	- [자바 구조적인 프로그래밍 강의 14강 - 함수 오버로딩(overloading)](#자바-구조적인-프로그래밍-강의-14강---함수-오버로딩overloading)
	- [자바 구조적인 프로그래밍 강의 15강 - 코드 실행과 함수 호출 스택](#자바-구조적인-프로그래밍-강의-15강---코드-실행과-함수-호출-스택)
	- [자바 객체지향 강의 1강 - 객체지향 프로그래밍의 시작 캡슐화](#자바-객체지향-강의-1강---객체지향-프로그래밍의-시작-캡슐화)
	- [자바 객체지향 강의 2강 - 함수들을 캡슐화하기](#자바-객체지향-강의-2강---함수들을-캡슐화하기)
<br>


---
<br>

## 프로그래밍이란?
  - 프로그래밍 : 컴퓨터에게 일을 하도록 명령어를 만드는 것
  - 컴파일 : 프로그램 언어를 컴퓨터가 알 수 있는 언어로 바꿔 주는 일
  - 컴파일러 : 기계어로 번역해주는 프로그램. 자바를 설치하면 자바 컴파일러도 설치됨
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

[목차로 이동🚗](#목차)
</br></br>

## 6강. 자바 언어의 특징
- C/C++언어와 비교했을 때 Java언어의 특징
  - 간결성
  - 언어에 컬렉션 포함
  - 완전한 객체지향 언어

[목차로 이동🚗](#목차)
</br></br>

## 7강. 자바 플랫폼의 특징
- 새로운 WORA API의 탄생
  - Write Once Run Anywhere 한번 작성되면 어디서든 실행될 수 있다 -> 운영체제가 달라도 자바플랫폼만 설치되면 실행할 수 있음.

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

## 15강. 출력 스트림 객체와 API
- 출력버퍼의 개체명은 OutputStream
- 실제 사용하는 객체명은 out
- 입력버퍼의 개체명은 InputStream
- 실제 사용하는 객체명은 in

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
</br></br>

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

[목차로 이동🚗](#목차)
<br><br>

## 21강. 콘솔 입력하기(System.in, Scanner)
- 키보드로부터 값을 입력받음
- nextLine() : 한번에 문자 형태로 읽어들이는 함수
- next() : 단어 단위로 끊어서 읽어들이는 함수
- nextInt() : 단어 하나 읽어서 정수 형태로 변환
- nextFloat() : 단어 하나 읽어서 실수 형태로 변환
- nextDouble() : 단어 하나 읽어서 실수 형태로 변환

[목차로 이동🚗](#목차)
<br><br>

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

[목차로 이동🚗](#목차)
<br><br>

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

[목차로 이동🚗](#목차)
<br><br>

## 24강. 비트 연산자
|비트 논리 연산자|||
|:--:|:--:|:--:|
|&|비트 교집합 연산자|value1 & value2|
|\||비트 합집합 연산자|value1 \| value2|
|^|비트 차집합 연산자|value1 ^ value2|
|~|비트 부정 연산자|~value1|

|쉬프트 연산자|||
|:--:|:--:|:--:|
|<<|왼쪽 쉬프트 연산자|value << 2|
|>>|오른쪽 쉬프트 연산자|value >> 2|

- 3 << 2 -> 0011 << 2 -> 1100 -> 12
- 3 >> 2 -> 0011 >> 2 -> 0000 -> 0
  - 여기서 3은 비트, 2는 몇 칸을 shift할 것인지를 말함
- 11 >> 2 -> 1011 >> 2 -> 1110
<br><br>
> 선생님 이거 어디다 쓰려고 하는거져...?<br>
>> 옛날에는 메모리를 아끼려고 비트 연산자를 썼음.<br>
>> 비트를 마음대로 조작하기 위해서 쉬프트 연산자를 씀.<br>
>> 열악한 디바이스에서는 아직 이렇게 씀. <br>
>> 과거형 프로토콜은 헤드 정도를 이렇게 씀. <br>
>> 비트 정보 조금이라도 절약할 때는 이렇게 씀.

[목차로 이동🚗](#목차)
<br><br>

## 25강. 복합 대입 연산자와 연산자 우선순위
|복합 대입 연산자|||
|:--:|:--:|:--:|
|+=|덧셈 후에 대입|X=X+2을 X+=2으로 표현|
|-=|뺄셈 후에 대입|X=X-3을 X-=3으로 표현|
|*=|곱셈 후에 대입|X=X\*3을 X*=3으로 표현|
|/=|나눗셈 후에 대입|X=X/3을 X/=3으로 표현|
|%=|나머지 연산 후에 대입|X=X%3을 X%=3으로 표현|
|&=|비트 AND 후에 대입|X=X&3을 X&=3으로 표현|
|\|=|비트 OR 후에 대입|X=X\|3을 X\|=3으로 표현|
|>>=|오른쪽 쉬프트 후에 대입|X=X>>3을 X>>=3으로 표현|
|<<=|왼쪽 쉬프트 후에 대입|X=X<<3을 X<<=3으로 표현|

<br><br>
|삼항 연산자|||
|:--:|:--:|:--:|
|?:|비트 교집합 연산자|value3 = (3<1)? value1 : value2|
<br><br>

|객체 형식 비교 연산자||
|:--:|:--:|
|instanceof|~의 인스턴스 인지를 확인|
- 이건 객체지향을 배웠을 때 쓸 것이기 때문에 나중에 한다!

[목차로 이동🚗](#목차)
<br><br>

## 28강. 제어구조 do while 문
- 반복되는 문장은 문제가 있음

```java
    do{
        실행문;
    }while(조건문); 
    // 입력된 값이 옳지 않으면 위로 올라가서 다시 입력받음
```
[목차로 이동🚗](#목차)
<br><br>

## 31강. 제어구조 else if, else
- 변수 명을 지을 때도 의미가 있어야함. 그래야 가독성이 올라간다.
- System.exit(0); : 프로세스를 종료하는 함수이나 좋은 방법은 아님. 프로그램으로 종료시키는 것. 강제로 종료하는 것.
- break; 반복문을 벗어나게 됨.
- 사실 menu 구조는 else if 사용하기에 적절하지 않음.</br>
    -> 메뉴가 늘어나면 늘어날수록 흐름이 길어짐(비교문이 늘어남)</br>
	-> <u>메뉴는 내가 어떤 것을 선택했을 때 비교비교비교해서 들어가는 것이 아니라 그것으로 선택이 되어서 들어가져야함</u>

[목차로 이동🚗](#목차)
<br><br>

## 32강. 제어구조 switch와 break 라벨문
- switch는 해당 번호로 점프한다. 하지만 점프만 될 뿐, 그 위부터 아래까지 다 실행이 되기 때문에 break를 꼭 써줘야한다! 그래야 그 위치에서 멈춤!!
- switch에서는 {}가 필요없음.
```java
switch(menu) // 점프하는 근거 menu
case 1:
	break;
case 2:
	break;
case 3:
	break;
```

- 하지만 break는 딱 break 문이 들어있는 해당 조건?만 벗어나게 만들어줌<br>
	-> break 라벨문이 탄생
```java
라벨 :
while
	for
		switch
<-----------break 라벨; // 라벨을 만날때까지 벗어남
```

[목차로 이동🚗](#목차)
<br><br>

## 33강. 제어구조 continue와 break문
- continue : 건너뛰기
- break : 중단하기
- hasNext() : boolean 다음 값이 있는지 없는지 true와 false로 알려줌
  - 그것을 이용해 while문 안에 쓸 수 있다!!!

```java
package ex13.io.control6.continue_break;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 sp로 구분해서 5개 이상 입력하세요:");

		// 3 Enter, 34 5 6 234 345 54 45 Enter
		while(sc.hasNext()) {
			n = sc.nextInt();
			if(n<10) {
				continue;
			}else if(n>300) {
				break;
			}else { 
				System.out.println(n);
			}
		}
	}
}
```
[목차로 이동🚗](#목차)
<br><br>

## 34강. 배열이란?
- 배열을 쓴다는건 반복문을 쓸 수 있다는 것.
- 배열은 객체를 만들때 기본적인 값이 0임.

[목차로 이동🚗](#목차)
<br><br>

## 36강. 다차원 배열
- `int [][] kors = new int [3][3];` 
- 3개짜리가 3번 마련됨
- 총 9개의 integer를 만들고 두개로 나눠서 쓸 수 있도록 하겠다.
- `int[] kors = new int[9];`라고 쓰지 말고 `int[] kors = new int[3*3];` 이렇게 써야 계산은 CPU에게 맡기면서 우리는 저게 2개의 차원으로 나눠졌다는 것을 암

[목차로 이동🚗](#목차)
<br><br>

## 37강. 다차원 배열 표현식
- 3칸씩 이동할 수 있게끔 => kors[3*j+i] 하지만 이렇게 쓰는 것 보다 kors[j][i]이게 더 좋은 방법이다

[목차로 이동🚗](#목차)
<br><br>

## 38강. 상수형 변수
- 항상 같은 수를 담는 변수
- 일반적으로 상수를 담는 변수는 대문자로 쓴다. 코드의 가독성 증가
- 누적 `total += kors[i];`

[목차로 이동🚗](#목차)

<br>

---
<br>

## 자바 코드 연습 #1 - 별찍기
```java
package ex17.star;

public class Program {
	public static void main(String[] args) {
		for(int j = 0; j<10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("☆");
				if(i == 9) {
				System.out.println();
				}
			}
		}
	}
}
```
🎈 나는 이렇게 작성했는데 선생님이 작성하신 코드를 보니 정말 바보같이 작성한거더라..... 어휴.... 이제 잘하면 되니까!!! (˶╹̆ ▿╹̆˵)و✧

```java
package ex17.star;

public class Program2 {
	public static void main(String[] args) {
		for(int j = 0; j<10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
```
🎈이렇게 작성하시오오...⁽⁽◝( ˙ ꒳ ˙ )◜⁾⁾

[목차로 이동🚗](#목차)
<br><br>

## 자바 코드 연습 기초 #3 - 반복문 중첩
- for문 안에 if문을 쓰거나 격자로 해서 이중 for문을 쓰거나 2가지 방법이 있다.
```java
package ex19.test;

public class Program {

	public static void main(String[] args) {
		for(int i = 0; i<9; i++) {
			System.out.printf("%d ", i+1);
			if(i%3 == 2){
				System.out.println("");
			}
		}

	}
}
```
``` java
package ex19.test;

public class Program2 {

	public static void main(String[] args) {
		for (int j = 0; j<3; j++) {
			for(int i = 0; i<3; i++) {
				System.out.printf("%d ", 3*j+i+1);
			}
			System.out.println();
		}
	}
}
```
[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #6 - 오목판의 외곽선 꾸미기
- 범위가 좁은 조건문(특수한 조건문)을 제일 위에 놓아야한다
- else에는 기본값이 들어가도록 한다.

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #7 - 배열 참조변수 선언과 초기화 방법 정하기
- 배열을 참조하는 변수를 선언하는 방법
  - int nums[] = 
  - int [] nums = 
- 배열 초기화하는 방법
  - int [] nums = new int[]{1,2,3,4,5,6,7};
  - int [] nums = {1,2,3,4,5,6,7};

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #8 - 자바에서 다차원 배열은 모두 톱니형 배열이다.
- lotto 번호를 저장하기 위한 1차원 배열
  - int [] lotto = new int[6];
- lotto 번호 3개를 일괄처리 하려면 다차원 배열로
  - int [] lotto1  = new int[6];
  - int [] lotto2 = new int[6];
  - int [] lotto3 = new int[6];<br>
    => int [][] lottos = new int[3][6];
<br>	
- 동일한 격자 크기의 배열 생성
  - int [][] lottos = new int[3][6];
- 미루기 or 톱니형 격자 크기의 배열 생성 
  - int[][] lottos = new int[3][];
    - lottos[0] = new int[6];
    - lottos[1] = new int[3];
    - lottos[2] = new int[5];
<br>
- Q1: 다음 연산이 가능할까?
  - int[][] lottos = new int[3][6];
	- lottos[0] = new int[2]  -> OK
	- lottos[0][2] = 3; -> X
	- 인덱스가 0,1 밖에 안되는데 2가 나와서 안됨. 자바가 가지고 있는 태생적인 문제.

- Q2: 다음 배열의 객체 생성 방법은 오류는 없지만 잘못된 코드이다. 어떤 부분이 그런가?
  - int[][] lottos = new int [3][6];
    - lottos[0] = new int[2];
    - lottos[1] = new int[5];
    - lottos[2] = new int[3]; <br>
    => A2: int[][] lottos = new int [3][]; 이렇게 해야함

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #9 - 배열 값 이동하기
- package ex21.array; Program1

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #10 - 배열 합치기
- package ex21.array; Program2

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #11 - 배열 항목 찾기
- nums 배열에서 숫자 1을 찾고 그 위치 인덱스를 출력하시오.

```java
package ex21.array;

public class Program3 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				System.out.println(i+1);
			}
		}
	}
}
// 자바 코드 연습 기초 #11 - 배열 항목 찾기
// 이건 내가 작성한 코드. 코드의 복잡도가 높아지면 인덱스 값을 저장할 임시변수가 있는 게 좋음
```
```java
package ex21.array;

public class Program3_1 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};

		int index = -1; // 찾지 못했다는 의미. -1으로 쓰는게 바람직. 0도 인덱스 값이 있기 때문

		for (int i = 0; i < 7; i++) {
			if(nums[i]== 1) {
				index = i+1;
				break; // 값을 찾았으면 바로 빠져나오게끔
			}
		}
		System.out.println(index);
	}
}
// 자바 코드 연습 기초 #11 - 배열 항목 찾기
// 선생님 코드
```

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #12 - 배열 값 교환하기
- temp를 넣어서 임시적으로 변수 값을 저장한 다음 교환
```java
package ex21.array;

public class Program4 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};
		int temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
```

[목차로 이동🚗](#목차)

<br><br>

## 자바 코드 연습 기초 #13 - 배열에 랜덤 값 채우기
- Random 값을 주는 도구 java.util.Random
- Random nextInt(int bound) : 값을 입력 받음. 만약 100을 입력했다면 0 ~ 99까지의 값을 랜덤으로 보여줌. pseudorandom 값을 반환함. 가짜 랜덤(무작위로 보이는 알고리즘에 의한 랜덤). 
```java
Random rand = new Random();
rand.nextInt(45); -> 0~44
```
- scanner와 비슷하지만 scanner는 스트림에서 얻어온 것.
- Random은 램덤 알고리즘에 의해서 다음 값을 얻어옴.

```java
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
```
<br>

[목차로 이동🚗](#목차)

---
<br>

## 자바 구조적인 프로그래밍 강의 2강 - 코드 구조화 Bottom Up 방식 연습 #1

- 함수를 정의해서 떼어냄.
- 한글 함수 쓸 수는 있으나 바람직하진 않음.
- 함수 밖에 있는 함수. 전역변수가 되기 위해서는 static을 붙임.
- void 반환값 없음.
- Scanner은 꼭 공유할 필요가 없음.
```
 성적입력을 위한 코드를 새로운 함수에 담기
  - 기존 main() 함수
    - 메뉴입력 코드
    - 성적입력 코드
    - 성적출력 코드

  - 바뀐 main() 함수
    - 메뉴입력 코드
    - 성적출력 코드
  - 성적입력() 함수
    - 성적입력 코드
```

[목차로 이동🚗](#목차)

<br><br>

## 자바 구조적인 프로그래밍 강의 3강 - 코드 구조화 Bottom Up 방식 연습 #2
- 코드에서 F3을 누르면 관련된 코드로 이동
- alt + ←,→ 이것도 된다
- 매개변수는 값이 바뀌었다고 오류가 나는 것이 아니라 값을 받는 변수명에 따라서 달라는 것
- 이미 만들어진 코드를 구조화 : Bottom Up 방식
- 처음부터 만들어 나가는 방식. 이 방법을 더 많이 쓴다 : Top Down 방식


[목차로 이동🚗](#목차)

<br><br>

## 자바 구조적인 프로그래밍 강의 4강 - 매개변수를 이용한 함수 고립화
- 함수가 매개 변수를 가지고 있지 않으면(전역변수를 사용하게 되면) 외부의 영향을 받게 됨. 자립도가 굉장히 떨어짐.
- 전역변수를 사용하지 않고, main에 그 함수를 집어 넣은 다음 매개변수를 사용하면 됨.

[목차로 이동🚗](#목차)

<br><br>

## 자바 구조적인 프로그래밍 강의 5강 - 함수 이름 짓기
- 함수 이름을 지을때 '기능 + 재료'로 쓸 것
- 카멜 형식
- ex) 로또번호생성 -> 생성로또번호 -> genLotto()<br>
	  로또번호출력 -> 출력로또번호 -> printLotto()<br>
	  로또번호정렬 -> 정렬로또번호 -> sortLotto()

[목차로 이동🚗](#목차)

<br><br>

## 자바 구조적인 프로그래밍 강의 9강 - 구조체를 이용한 코드 작성하기
- `Exam exam = new Exam();` Exam이 실체화 하게됨.
- new를 통해서 만든 객체를 대입해야한다.
- 기본형식을 제외하고 new를 통해서 만든 것들은 다 객체라고 부름.
- 참조 변수 : 내부적으로 주소를 저장하긴 하지만 주소가 공간을 가지고 있지 않음. 객체를 식별하는 이름일 뿐 => 여기서는 exam

[목차로 이동🚗](#목차)

<br><br>


## 자바 구조적인 프로그래밍 강의 7강 - 함수의 매개변수
```java
// 1번 문제
print(2, 3.0f, 'a');

static void print(???, ???, ???){

}

// 2번 문제
int[] lotto = new int[3];
print(3, 5.3f, lotto);

void print(???, ???, ???){

}

// 3번 문제
char[][] names = new char[3][10];
??? cnt = print(true, 4.0, names);

??? print(???, ???, ???){

	return 2.2;
}
```

```java
// 1번 정답
print(2, 3.0f, 'a');

static void print(int a, float b, char c){

}

// 2번 정답
int[] lotto = new int[3];
print(3, 5.3f, lotto);
	// 배열 부분을 print할 때 여기서 lotto는 lotto를 참조하라는 것
	// print라는 함수는 lotto를 넘겨주니까 그걸 받을 수 있는 변수를 선언할 수 있음
void print(int a, float b, int[] lotto1){
	// 아까 위에서 lotto를 전달해 줬으니 new int[3];의 주소가 전달된 것. 그것을 받으려면 데이터 타입만 맞추어 주어야함. 그 데이터 타입을 맞춰주면 내가 지정해주는 이름으로(변수) 배열 값을 정할 수 있음.
	// 지역 내에서 어떤 이름을 쓸 까는 그 지역 내에서 결정하는 것.
	// 매개변수는 값이 바뀌었다고 오류가 나는게 아니라 값을 받는 변수명에 영향을 받아서 오류가 나는 것.
}

// 3번 정답
char[][] names = new char[3][10];
double cnt = print(true, 4.0, names);

double print(boolean a, double b, names){

	return 2.2;
}
```
[목차로 이동🚗](#목차)

<br><br>


## 자바 구조적인 프로그래밍 강의 8강 - 데이터 구조화
```java
// 1. 데이터 구조 정의
public class Exam{
	// 선언
	int kor;
	int eng;
	int math;
}

public class Program{
	public static void main(String[] args){
		Exam exam; // 참조변수. 현재 여기 값은 null
		exam = new Exam(); // 객체 생성. 국어, 영어, 수학이라는 방이 생김
		exam.kor = 30; // 값이 들어가게 됨
	}
}

```
[목차로 이동🚗](#목차)

<br><br>

## 자바 구조적인 프로그래밍 강의 10강 - 구조체 배열 이용하기
- 클래스 배열은 객체 배열이 아니라 객체 참조배열이다.
  - 배열을 이용해 여러 개의 성적을 입력 받기 위한 구조체 배열
```java
Exam exam = new Exam(); // 여기서 new는 실제 국어, 영어 수학을 받기 위한 공간이 만들어진 것

Exam[]exams = new Exam[3]; // 여기서 new는 Exam이라는 객체가 만들어 진게 아님!!! 이건 Exam 형식의 배열 3개가 만들어진 것. 참조변수가 세개라는 것
exams[0].kor = 30; // 고로 이건 안되는 것이다. 0번째라는 참조명은 만들어 졌지만, 0번째가 가리키는 참조는 없다. 코드를 입력하기 전까진 null임.
exams[0] = new Exam(); // 0번째에게 실제 객체에 참조시켜줘여함
```
- 우리가 배열을 만들었을 때 참조 형식의 배열을 만들게 되면 
`new Exam[3]` 참조형식의 이름표 3개를 만든 것. 각각의 공간들은 주소를 저장할 수 있는 형태 밖에 안됨.
- 실제로 우리가 그것을 이용하려면 객체의 배열을 참조하기 위해 변수를 `Exam[] exams = new Exam[3]` 만들지만 이건 배열을 참조하는 것. 
- `Exam[] exams = new Exam[3]` exams에 3개의 공간을 만듬. kor, eng, math이 아님. 그냥 공간이 나눠진 것
- `exams[0] = new Exam();` => kor, eng, math 이제 이렇게 됨. Exam객체 형태로 참조 걸어줌
- `exams[1] = new Exam();` => kor, eng, math
- `exams[2] = new Exam();` => kor, eng, math
- 배열이라는 것은 이름표 세개만 준비해 둔 것이다. 거기에 각각 실제 Exam을 대입해 주어야만 한다.

[목차로 이동🚗](#목차)

<br><br>


## 자바 구조적인 프로그래밍 강의 11강 - 가변 길이 배열
- 배열은 고정길이를 가지고 있음. 길이가 긴 배열을 원한다면 더 큰 배열을 만들어서 이주 시키고 기존 배열을 소거하는 방식으로 써야함.
- ArrayIndexOutOfBoundsException : 배열 길이 초과
```java
package part2.ex3.데이터구조화;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Exam [] exams = new Exam[3];
		int current = 0;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				inputList(exams, current); 
				break;

			case 2:
				printList(exams, current); // inputList에서 값을 하나를 입력받지만 실제 값은 하나일 수도 있고 둘일 수도 있음. exams에 들어있는 갯수 만큼 출력해야 함.
				// 현재 들어가 있는 exams의 갯수는 어떻게 알까? -> current로!! 
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
	private static void printList(Exam[] exams, int size) { // 이름이 current로 같기도 하고 그 사이즈만큼 돈다는 뜻으로 size로 !
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

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
		}
	}

	private static void inputList(Exam[] exams, int current) { // current가 main함수에 있기 떄문에 매개변수로 넣어줘야함
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

		exams[current] = exam;
		current++; // 자기가 있는 변수에 ++만 된 것. 즉, main함수의 current가 반영된게 아니라 inputList 내에서 만 반영. 그래서 출력될게 없음

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

```
=> 이렇게 하면 성적출력이 안됨.
=> 성적입력을 했을 때 current가 ++가 되어도 inputList내에서만 반영이 되지 main함수의 current까지는 반영이 안되기 때문

[목차로 이동🚗](#목차)
<br><br>

## 자바 구조적인 프로그래밍 강의 12강 - 가변 길이를 위한 구조체 생성
- 11강에서 발생했던 문제의 해결책을 알아보자
```java
Exam[] exams = new Exma[3]; // 공유될 아이
int current = 0;

inputList(exams, current); // 위에 아이들을 다 공유하고 있다.
printList(exmas, current); // But current는 공유되는게 아니라 값만 전달시키는 것.
```
- 정수형은 값 변수. 참조할 수 있는게 아님. 자바에서는 밑의 함수에 있는 내용을 다른 함수에 공유할 수 있는 방법이 없음. 자바에서는 주소라는 개념을 전달할 수 없음.
- 공유할 것이라면 기본 자료형을 쓰는게 아니다 -> int를 쓰면 안된다.
- 기본 자료형을 쓴다는 것은 지역변수 내에서 임시변수를 쓴다던가 제어변수를 위해서 쓰는 것이지
그게 관리되는 데이터로서는 X

```java
Exam[] exams = new Exam[3];
int current = 0;

inputList(exams, current);
printList(exams, current);

=> 여기서의 exams, current를 더 큰 단위로 묶어라 => list

class ExamList{
	Exams[] exams;
	int current;
}

ExamList list = new ExamList();
list.exams = new Exam[3];
list.current = 0;

inputList(list);
print List(list);
```

```java
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
				printList(list); // inputList에서 값을 하나를 입력받지만 실제 값은 하나일 수도 있고 둘일 수도 있음. exams에 들어있는 갯수 만큼 출력해야 함.
				// 현재 들어가 있는 exams의 갯수는 어떻게 알까? -> current 
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
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		int size = list.current;
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

		if(!exams의 공간이 있는지) {
			공간을 늘려주기
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

```
- 배열은 처음에 크기를 정해놓고 그 크기가 넘어가면 오류가 발생함.

[목차로 이동🚗](#목차)
<br><br>

## 자바 구조적인 프로그래밍 강의 13강 - 가변 길이 배열 구현하기
- 12강에서 발생했던 문제의 해결책을 알아보자
- 가변적으로 데이터를 수집하기 위해 배열을 이용하는 방법
- 동적인 공간을 관리하기 위해 필요한 capacity변수
- 용량(capcity)이 변하기 때문에 새로운 변수가 필요함
- 가변 List : `[] + current + capacity + amount`
---
1. 연습문제
	- 공간을 점진적으로 늘리는 위치와 방법
```java
// 만약에 공간이 모자라면
if(capacity == current){
	Exam[] temp = new Exam[capacity + amount];
	for(int i = 0; i<current; i++){	// list의 값을 이주시킴
		temp[i] = list[i];
	} 
	list = temp;
	capacity += amount;
}

1. amount개 확장한 새로운 배열 temp를 생성한다.
	Exam[] temp = new Exam[capacity + amount];
2. list에 있는 데이터를 temp 배열로 옮긴다.
	for(int i = 0; i<current; i++){	// list의 값을 이주시킴
		temp[i] = list[i];
3. temp가 참조하는 객체를 list가 참조하게 한다.
	list = temp;
4. 현재 capacity의 값을 +10 증가시킨다.
	capacity += amount; 
```

[목차로 이동🚗](#목차)
<br><br>


## 자바 구조적인 프로그래밍 강의 14강 - 함수 오버로딩(overloading)
- 함수를 선택적으로 사용할 수 있게 하기
- 같은 기능 하지만 다른 인자를 가지는 함수를 추가하기
- 오버로드를 구현하면 사용자가 골라쓸 수 있다.
- 오버로딩을 사용할 때 주의해야하는 점 : 함수명이 같다는 건 기능이 같다는 것. 기능이 인자에 따라 차이가 나긴하지만 기본 골격은 같음.
- 인자가 많은 쪽이 인자가 없는 쪽이 할 수 있는 일을 다 할 수 있음. 오히려 인자가 없는 쪽이 인자가 많은 쪽이 할 수 있는 일을 다 할 수 없음. 인자가 없는 쪽이 해당되는 구현을 하는게 아니다.  => <u> 공통의 기능을 가지고 있으면 코드의 집중화를 꼭 할 것</u>

[목차로 이동🚗](#목차)
<br><br>

## 자바 구조적인 프로그래밍 강의 15강 - 코드 실행과 함수 호출 스택
- 이건 필기보다 실제 강의의 그림을 보면서 설명 듣는게 더 나을듯!!!!
- 프로그램이 실행될 때 메모리를 쓰게 됨.
- 메모리는 2가지 용도로 나눠쓰게 됨.
  - 코드영역 or Text영역 : 코드가 올라오는 곳
  - Heap or Stack : 코드가 실행되는 과정에서 필요한 데이터가 있으면 마련되는 곳. 그 데이터를 보관
    - Heap : 동적으로 생성되는 메모리를 마련하는 공간, 참조가 사라져도 메모리에 남아있는 특징이 있음 -> 메모리를 잡아먹는 아이가 될 수 있음. 하지만 자바는 주기적으로 이런 아이를 찾아서 수거함.
    - Stack : 함수의 지역변수를 마련하는 공간, main함수 위에 다른 함수들 내용이 적재되어 있다가 다 쓰게되면 사라짐 -> main함수도 끝나게 되면 main 함수 Stack도 사라짐
- 코드가 제일 먼저 실행 : main 함수
- 공간은 미리 마련되어야함.
- main 함수에서 선언했던 내용들 int total = 0; 이런 것들은 stack에 저장이 됨.

[목차로 이동🚗](#목차)
<br><br>

---
<br>

## 자바 객체지향 강의 1강 - 객체지향 프로그래밍의 시작 캡슐화
- 구조화된 데이터를 사용하는 함수 모듈의 독립성을 침해하는 문제를 해결할 수 있기 때문에 데이터를 위주로 수납한 방식이 바람직하다.
- 함수 모듈의 독립성 -> 함수는 외부의 수정에 절대 영향을 받아서는 안된다.
- 구조화된 객체를 사용하는 함수는 객체의 구조 변경에 아주 취약하다.
  -> 변경에 취약한 애들을 한 곳에 모아둠
- 캡슐화를 하면 데이터 구조에 따른 코드의 수정범위를 캡슐 범위로 한정할 수 있다. 
- 캡슐화 정리 : 데이터 구조와 함수를 하나의 영역에 함께 정의하는 것.


[목차로 이동🚗](#목차)

<br><br>

## 자바 객체지향 강의 2강 - 함수들을 캡슐화하기
- 캡슐화 : 데이터 구조와 함수를 하나의 영역에 함께 모아 놓는 작업


[목차로 이동🚗](#목차)

<br><br>
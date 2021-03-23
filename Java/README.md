# JAVA
> 뉴렉처 자바 프로그래밍 Study : 2021.03.17 ~ 2021.03.23 <br>
> 뉴렉처 자바 코드연습 Study : 2021.03.23 ~ 2021.03.<br>
---
>> <b><u>✨Check✨</u></b><br>
>> 1. 32강. break 라벨문<br>
>> 2. 33강. hasNext()<br>
>> 3. 37강. kors[3*j+i], total = kors[j][0]+kors[j][1]+kors[j][2];
>> 4. 자바 코드 연습 기초 #6. 범위가 좁은 조건문(특수한 조건문)을 제일 위에 놓아야한다. else에는 기본값이 들어가도록 한다.<br>  
>> 목차 확장자 이용후 지워야할 듯
---
## 목차
- [JAVA](#java)
	- [> 뉴렉처 자바 코드연습 Study : 2021.03.23 ~ 2021.03.<br>](#-뉴렉처-자바-코드연습-study--20210323--202103)
	- [>> 목차 확장자 이용후 지워야할 듯](#-목차-확장자-이용후-지워야할-듯)
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
	- [자바 코드 연습 별찍기 #1](#자바-코드-연습-별찍기-1)
	- [자바 코드 연습 기초 #3 - 반복문 중첩](#자바-코드-연습-기초-3---반복문-중첩)
	- [자바 코드 연습 기초 #6 - 오목판의 외곽선 꾸미기](#자바-코드-연습-기초-6---오목판의-외곽선-꾸미기)
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

</></br>

## 6강. 자바 언어의 특징
- C/C++언어와 비교했을 때 Java언어의 특징
  - 간결성
  - 언어에 컬렉션 포함
  - 완전한 객체지향 언어

</br></br>

## 7강. 자바 플랫폼의 특징
- 새로운 WORA API의 탄생
  - Write Once Run Anywhere 한번 작성되면 어디서든 실행될 수 있다 -> 운영체제가 달라도 자바플랫폼만 설치되면 실행할 수 있음.

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

</br></br>

## 15강. 출력 스트림 객체와 API
- 출력버퍼의 개체명은 OutputStream
- 실제 사용하는 객체명은 out
- 입력버퍼의 개체명은 InputStream
- 실제 사용하는 객체명은 in

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

<br><br>

## 21강. 콘솔 입력하기(System.in, Scanner)
- 키보드로부터 값을 입력받음
- nextLine() : 한번에 문자 형태로 읽어들이는 함수
- next() : 단어 단위로 끊어서 읽어들이는 함수
- nextInt() : 단어 하나 읽어서 정수 형태로 변환
- nextFloat() : 단어 하나 읽어서 실수 형태로 변환
- nextDouble() : 단어 하나 읽어서 실수 형태로 변환

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

<br><br>

## 28강. 제어구조 do while 문
- 반복되는 문장은 문제가 있음

```java
    do{
        실행문;
    }while(조건문); 
    // 입력된 값이 옳지 않으면 위로 올라가서 다시 입력받음
```
<br><br>

## 31강. 제어구조 else if, else
- 변수 명을 지을 때도 의미가 있어야함. 그래야 가독성이 올라간다.
- System.exit(0); : 프로세스를 종료하는 함수이나 좋은 방법은 아님. 프로그램으로 종료시키는 것. 강제로 종료하는 것.
- break; 반복문을 벗어나게 됨.
- 사실 menu 구조는 else if 사용하기에 적절하지 않음.</br>
    -> 메뉴가 늘어나면 늘어날수록 흐름이 길어짐(비교문이 늘어남)</br>
	-> <u>메뉴는 내가 어떤 것을 선택했을 때 비교비교비교해서 들어가는 것이 아니라 그것으로 선택이 되어서 들어가져야함</u>

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
<br><br>

## 34강. 배열이란?
- 배열을 쓴다는건 반복문을 쓸 수 있다는 것.
- 배열은 객체를 만들때 기본적인 값이 0임.

<br><br>

## 36강. 다차원 배열
- `int [][] kors = new int [3][3];` 
- 3개짜리가 3번 마련됨
- 총 9개의 integer를 만들고 두개로 나눠서 쓸 수 있도록 하겠다.
- `int[] kors = new int[9];`라고 쓰지 말고 `int[] kors = new int[3*3];` 이렇게 써야 계산은 CPU에게 맡기면서 우리는 저게 2개의 차원으로 나눠졌다는 것을 암

<br><br>

## 37강. 다차원 배열 표현식
- 3칸씩 이동할 수 있게끔 => kors[3*j+i] 하지만 이렇게 쓰는 것 보다 kors[j][i]이게 더 좋은 방법이다

<br><br>

## 38강. 상수형 변수
- 항상 같은 수를 담는 변수
- 일반적으로 상수를 담는 변수는 대문자로 쓴다. 코드의 가독성 증가
- 누적 `total += kors[i];`


<br><br>

## 자바 코드 연습 별찍기 #1
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
<br><br>

## 자바 코드 연습 기초 #6 - 오목판의 외곽선 꾸미기
- 범위가 좁은 조건문(특수한 조건문)을 제일 위에 놓아야한다
- else에는 기본값이 들어가도록 한다.
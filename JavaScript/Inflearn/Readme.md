# JavaScript
> 윤재성의 처음시작하는 JavaScript Study <br>

---
>> <b><u>✨Check✨</u></b><br>
>> 1. JS는 대소문자를 엄격히 구분한다
>> 2. JS의 모든 요소는 클라이언트에서 실행되기 때문에 모든 요소들은 클라이언트에게 전달된다 -> 사용자에게 보여진다. 중요한 정보는 주석으로 작성되어지면 안된다!!
>> 3. JS는 변수 선언시 자료형을 명시하지 않고 var를 사용 
>> 4. undefined : 변수를 선언하고 값을 대입하지 않으면 undifined 값이 자동으로 대입. 타입이자 값을 나타냄
>> 5. 한 번 정의된 문자열은 변하지 않는다.
>> 6. null 타입 변수인지 확인할 때 typeof연산자를 사용 X, 일치 연산자를 ===를 사용해서 변수 값을 직접 확인해야함. typeof 연산자를 사용하면 null이 아닌 object가 나옴.
>> 7. == vs ===<br>
`== : 타입을 무시하고 값이 같은지. 숫자 1과 문자 1이 같다.`<br>
`=== : 값의 타입을 구분해서 같은지. 숫자 1과 문자 1은 다르다.`
>> 8. 익명함수 : 매개 변수로 함수를 넘길 때 주로 사용.
>> 9. 자바스크립트가 다른 언어와 다른 점 : <u>함수 호출 시 넘겨주는 값의 개수와 정의된 매개 변수의 개수와는 무관하다.</u>

---
<br><br>

## 목차
[JavaScript](#javascript)
    - [목차](#목차)
- [[1강] JavaScript 개요](#1강-javascript-개요)
    - [JavaScript 개요](#javascript-개요)
    - [사용자 측면에서의 Javascript](#사용자-측면에서의-javascript)
    - [서버 측면에서의 Javascript](#서버-측면에서의-javascript)
- [[4강] 작성 위치](#4강-작성-위치)
- [[5강] 출력문](#5강-출력문)
    - [JavaScript 출력문](#javascript-출력문)
- [[6강] 기본 문법](#6강-기본-문법)
- [[7강] 변수와 자료형](#7강-변수와-자료형)
    - [undefined](#undefined)
    - [null](#null)
- [[8강] 연산자](#8강-연산자)
- [[9강] 분기문](#9강-분기문)
    - [제어문](#제어문)
    - [if문](#if문)
    - [else문](#else문)
    - [else if문](#else-if문)
    - [switch 문](#switch-문)
- [[10강] 반복문](#10강-반복문)
    - [for문](#for문)
    - [while문](#while문)
    - [do while문](#do-while문)
- [[11강] 배열](#11강-배열)
    - [for in](#for-in)
- [[12강] 함수](#12강-함수)
    - [익명함수](#익명함수)
    - [매개변수](#매개변수)
    - [arguments 배열](#arguments-배열)
    - [호출 시 함수 넘기기](#호출-시-함수-넘기기)
    - [객체](#객체)
---
<br></></br>

# [1강] JavaScript 개요
## JavaScript 개요
- Javascript는 굉장히 가벼운 프로그래밍 언어
- 웹 애플리케이션 개발 시 많이 사용
- 클라이언트 프로그래밍을 위해 사용
- 객체 지향 프로그래밍 언어
- 국제 표준 규격을 가지고 있음
- 모든 웹 브라우저에서 채택하고 지원하고 있음.
- javascript는 사용자 측면과 서버 측면 두가지 면에서 봐야함

## 사용자 측면에서의 Javascript
- 브라우저가 해석하고 실행하는 코드가 HTML 문서에 포함된다.
- 웹 브라우저에서 발생되는 각종 이벤트나 입력 데이터에 대한 처리 등 클라이언트에서 이루어지는 다양한 작업들을 처리할 수 있다.

## 서버 측면에서의 Javascript
- Javascript는 웹 브라우저에서 동작하는 클라이언트 측 프로그래밍 언어로 사용되어 왔다.
- 최근에는 다양한 분야에서 Javascript 언어를 활용하려고 하고 있다.
- Node.js 같은 프로그래밍 분야를 활용하면 Javascript를 통해 서버 애플리케이션을 개발 할 수 있다.

</br></br>

# [4강] 작성 위치
1. inline 방식
```html
<button onclick="alert('버튼을 눌렀습니다.')">버튼</button>
```
2. internal방식
   - HTML 문서 내부에 JavaScript 코드를 작성하며 script 태그 사이에 작성
   - 코드는 위에서 아래 방향으로 동작
```html
<script>
    javascript code here...
</script>
```
3. external방식
   - javascript 파일을 js파일에 작성하고 이를 HTML 문서에 삽입하는 방식
   - 여러 파일에서 공톡적으로 사용하는 코드가 있을 떄 사용
```html
<script src="test.js"></script>
```
   - script 태그에 외부 파일을 넣어주면(external방식) internal방식은 external방식으로 덮어씌어진다.
```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>External</title>
</head>
<body>
	<script src = "test.js"> /* test.js를 이 자리에서 사용하겠다. */
		document.write("여기가 실행될까요?"); /* 이 내용은 출력되지 않음. 외부 파일을 덮어씌우는 형태 */
	</script>
</body>
</html>
```

</br></br>

# [5강] 출력문
## JavaScript 출력문
1. innerHTML
   - div와 같이 내부에 HTML 코드를 넣을 수 있는 태그에 HTML코드를 삽입하는 방식
   - dom을 배울 때 더 자세하게 배우게 됨.
   - 주의 해야하는 것은 태그가 위에서 아래로 흘러가기 때문에 해당 태그를 만난 다음에 동작되도록 해야한다.
   - 원하는 태그 안에 삽입
```html
<div id="test">여기에 HTML 태그를 삽입하는 것!!</div>
	<script>
		document.getElementById("test").innerHTML = "HTML 코드 삽입"
	</script>
```

2. document.write() 함수
   - 지정한 문자열을 HTML 코드로 출력하는 함수
   - 그냥 출력하는 것
```html
	<script>
		document.write("HTML 코드 출력");
	</script>
```

3. alert() 함수
   - 웹 브라우저에 경고창을 띄우는 함수
```html
	<script>
		alert("안녕!");
	</script>
```

4. console.log() 함수
   - 웹 브라우저에서 제공하는 콘솔에 출력하는 함수
   - 개발자 도구의 콘솔에서 볼 수 있음
```html
	<script>
		console.log("로그 메세지 출력");
	</script>
```

</br></br>

# [6강] 기본 문법
- Javascript는 문장의 마지막 세미콜론은 필수는 아니지만 권장
- 여러 라인의 코드를 한번에 작성할 경우에는 세미콜론을 반드시 붙혀줄 것!
- Javascript는 대소문자를 엄격하게 구분한다.
- 소문자로 만들어진 요소를 대문자로 작성하면 오류, 그 반대도 오류가 발생한다.
- 주석 : `//`: 한줄 주석, `/* */`: 여러줄 주석
  - 🎈주의 : 자바스크립트의 모든 요소는 클라이언트에서 실행되기 때문에 모든 요소들은 클라이언트에게 전달된다 -> 사용자에게 보여진다. 중요한 정보는 주석으로 작성되어지면 안된다!!

</br></br>

# [7강] 변수와 자료형
- 자료형 : 정수, 실수, "문자열", '문자열', true, false
- 변수 : 데이터를 담는 기억장소
- Javascript는 변수 선언시 자료형을 명시하지 않고 var라는 키워드를 사용
- 변수에 담는 값의 자료형에 따라 값을 관리하는 방법으로 자동으로 선택
- 한 번 정의된 문자열은 변하지 않는다.
```javascript
var str = 'test';
console.log(str[0], str[1], str[2], str[3]); // 출력값 : test

str[0] = 'T';
console.log(str); // 출력값 : test
```

## undefined
- 변수를 선언하고 값을 대입하지 않으면 undifined 값이 자동으로 대입된다.
- 타입이자, 값을 나타냄

## null
- null 타입 변수인지 확인할 때 typeof연산자를 사용 X, 일치 연산자를 ===를 사용해서 변수 값을 직접 확인해야함. typeof 연산자를 사용하면 null이 아닌 object가 나옴.
```javascript
var nullvalue = null; 
console.log(typeof nullvalue); // 출력값 : object
console.log(nullvalue === null); // 출력값 : true
console.log(typeof nullvalue === null); // 출력값 : false
```

</br></br>

# [8강] 연산자
1. 산술연산자
   - +, -, *, /, %, ++, --
2. 대입연산자
   - =, +=, -=, *=, /=, %=
3. 비교연산자(
   - == 타입을 무시하고 값이 같은지. 숫자 1과 문자 1이 같다.
   - === 값의 타입을 구분해서 같은지. 숫자 1과 문자 1은 다르다.
   - != 타입을 무시하고 값이 다른지.
   - !== 값의 타입을 구분해서 다른지.
   - `>`, `<`, `>=`, `<=`, `?`)
4. 논리연산자
   - &&, ||, !
5. 타입연산자
   - typeof : 타입이 뭔지 비교
   - instanceof : 어떤 개체 타입인지
6. 비트연산자
   - 2진수에 대한 작업을 하는 연산자
   - &, |, ~, ^, <<, >>, >>>

</br></br>

# [9강] 분기문
## 제어문
- 코드는 위에서 아래로 실행되는데 이러한 흐름을 변경할 떄 사용하는 것을 제어문
- 제어문은 2가지로 구분
  - 분기문 : if, switch
  - 반복문 : for, while, do while

## if문
- 주어진 조건에 만족하면 실행하고 만족하지 않으면 실행되지 않는다.

## else문
- if문의 조건이 만족하지 않을 경우 실행될 부분

## else if문
- 다중 조건을 가졌을 때 사용
- 조건 중 참에 해당하는 부분만 실행. 위에서부터 조건 검사.
- 만약 모든 조건에 만족하지 않을 경우도 필요하다면 마지막에 else문을 넣어준다.

## switch 문
- 변수나 수식에 해당하는 값 부분으로 이동하여 코드가 실행되는 분기문.
- 모든 조건을 검사하면서 내려오는 if문과 달리 바로 이동하여 실행하므로 if문보다 빠르다.
- break를 사용하면 해당하는 값을 실행하고 빠져나온다. break를 사용하지 않으면 일치하는 값은 다 나오게 됨.

</br></br>

# [10강] 반복문
## for문
- 주어진 조건에 만족할 경우 코드를 반복
- 주로 <u>반복 횟수</u>가 결정되어 있을 때 사용

## while문
- 주어진 조건에 만족할 경우 코드를 반복
- <u>반복할 조건</u>이 결정되어 있을 때 사용
- 조건이 처음부터 거짓이면 단 한번도 수행 X

## do while문
- 주어진 조건에 만족할 경우 코드를 반복
- <u>반복할 조건</u>이 결정되어 있을 때 사용
- 조건이 처음부터 거짓이면 한번 수행된다.
```javascript
do{
   a++;
   document.write("while문 실행<br/>");
} while(a < 10);
```

</br></br>

# [11강] 배열
- 여러 기억공간을 하나의 이름으로 관리할 때 사용
- JavaScript는 []로 배열을 표현한다.
- 배열이 관리하는 기억장소의 개수는 `length`를 이용해 파악할 수 있다.
- 배열이름[인덱스] 형태로 작성하면 배열 요소에 접근할 수 있다.
- 인덱스는 0부터 시작한다.
```javascript
var array = [10, 20, 30, 40];

document.write(array[0]+"<br/>"); => 10
```
## for in
- 배열이 관리하는 기억장소를 처음부터 끝까지 순회할 경우 for문을 사용
- for in은 배열 순회를 목적으로 for문을 사용할 때보다 편하게 사용할 수 있도록 지원하는 개념
```javascript
var array = [10, 20, 30, 40, 50];

for(var i = 0; i < array.length; i++){
   document.write("array : " + array[i] + "<br/>");
}

for(var idx in array){
   document.write("array : " + array[idx] + "<br/>");
}
```

</br></br>

# [12강] 함수
- 개발자가 필요할 때 동작시킬 수 있도록 만들어 놓은 코드블럭
- 브라우저는 함수의 존재만 파악하고 있다가 개발자가 원할 때 함수 내부에 작성해 놓은 코드를 실행한다.
- 자바 스크립트는 함수의 이름이 함수가 존재하는 메모리의 주소 값을 담은 변수로 취급
- 함수의 주소 값을 다른 변수에 담는 것이 가능하다

```javascript
function f1(){
   document.write("함수가 호출되었습니다<br/>");
}

var f2 = f1; // f1()하면 함수 호출, f1이라고 하면 변수와 동일한 개념
f2();
```

## 익명함수
- 이름이 없는 함수.
- 이름이 없는 함수이므로 호출을 위해 변수에 담아야 함.
- 매개 변수로 함수를 넘길 때 주로 사용.

```javascript
var f3 = function(){
   document.write("익명함수 호출<br/>");
}

f3();
```

## 매개변수
- 함수를 호출할 때 값을 넘겨줄 수 있으며 이 값은 매개 변수로 받을 수 있다.
- 🎈자바스크립트가 다른 언어와 다른 점 : <u>함수 호출 시 넘겨주는 값의 개수와 정의된 매개 변수의 개수와는 무관하다.</u>
```javascript
function f4(a,b){
   document.write("f4호출 <br/>");
   document.write("a : " + a + "<br/>")
   document.write("b : " + b + "<br/>")
}

f4(); // a,b = undefined
f4(10); // a = 10, b = undefined
f4(10, 20); // a = 10, b = 20
f4(10, 20, 30, 40, 50); // a = 10, b = 20

매개변수 2개가 정의되어 있지만(자바스크립트는 변수를 선언할 때 자료형을 명시하지 않기 때문에 매개변수를 정의할 때도 이름만 작성) 자바스크립트에서는 함수 호출 시 넘겨주는 값의 개수와 정의된 매개 변수의 개수와는 무관하므로 밑에 함수 4개가 정상적으로 작동하게 됨!.. 신기(⊙ｏ⊙）
```

## arguments 배열
- 함수를 호출할 때 넘겨주는 값은 모두 매개 변수로 받을 수 있다.
- 그 외에 자바스크립트의 모든 함수들은 arguments라는 배열이 자동으로 만들어지는데 여기에도 호출 시 넘겨주는 값들이 들어 있다.
```javascript
function f4(a,b){
   document.write("f4호출 <br/>");
   document.write("a : " + a + "<br/>")
   document.write("b : " + b + "<br/>")
}

f4(); // a,b = undefined
f4(10); // a = 10, b = undefined
f4(10, 20); // a = 10, b = 20
f4(10, 20, 30, 40, 50); // a = 10, b = 20

마지막의 f4(10, 20, 30, 40, 50);이 값도 다 받아줄 수 있대
```
```javascript
function f5(){
   for(var idx in arguments){
      document.write(arguments[idx] + "<br/>");
   }
}

f5(); // arguments 배열이 0개
f5(10); // arguments 배열이 1개
f5(10, 20); // arguments 배열이 2개
f5(10, 20, 30, 40, 50); // arguments 배열이 5개

이 배열의 이름은 정해져 있는 것이기 때문에 다른 것으로 사용 불가능하다.
```

## 호출 시 함수 넘기기
- 함수를 호출할 때 함수를 넘길 수 있으며 매개 변수로 받아 호출할 수 있다.
```javascript

```

## 객체
- 프로그램에서 매개체 하나에 대한 값과 기능을 관리하는 단위
- 자바스크립트는 객체를 다음 두가지 방법으로 생성할 수 있다
  - 리터럴을 이용한 방법
  - 생성자 함수를 이용한 방법

</br></br>
# JavaScript
> 윤재성의 처음시작하는 JavaScript Study : 2021.06.04 ~ <br>

---
>> <b><u>✨Check✨</u></b><br>
>> 1. 

---
<br><br><br>
## 목차

---
<br></br></br>

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

# [6강] 기본 문법
- Javascript는 문장의 마지막 세미콜론은 필수는 아니지만 권장
- 여러 라인의 코드를 한번에 작성할 경우에는 세미콜론을 반드시 붙혀줄 것!
- Javascript는 대소문자를 엄격하게 구분한다.
- 소문자로 만들어진 요소를 대문자로 작성하면 오류, 그 반대도 오류가 발생한다.
- 주석 : `//`: 한줄 주석, `/* */`: 여러줄 주석
  - 🎈주의 : 자바스크립트의 모든 요소는 클라이언트에서 실행되기 때문에 모든 요소들은 클라이언트에게 전달된다 -> 사용자에게 보여진다. 중요한 정보는 주석으로 작성되어지면 안된다!!
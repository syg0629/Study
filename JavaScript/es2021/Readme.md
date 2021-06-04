# JavaScript
> 제로초 JavaScript Study : 2021.06.04 ~ <br>

---
>> <b><u>✨Check✨</u></b><br>
>> 1. 

---
<br><br><br>
# 목차

---
<br></br></br>
# 1강
## 1-2. VS Code와 크롬 설치하기
- node.js를 설치하면 브라우저가 없어도 javascript 코드를 실행할 수 있다.
- 웹 사이트를 만들 때는 보통 브라우저를 깐다.

## 1-3. 첫 자바스크립트 코드 실행하기
- 프롬프트 : 컴퓨터가 입력을 받아들일 준비가 되었다는 것을 사용자에게 나타내어 주기 위해 컴퓨터 단말기 화면에 나타나는 신호. | 이런게 깜박깜박 거리는 것.
- javascript는 코드를 한 줄씩 읽는다!

### 흔하게 발생하는 에러
- 빨갛게 나오는 메세지는 외워라!
- `Uncaught ReferenceError: consle is not defined console`
  - 입력한 내용 중 오타(console)가 있으면 발생하는 에러
  - 대소문자도 구분하므로 모든 글자는 소문자로 적어라
-  `Uncaught TypeError: console.lg is not a function console`
  - 입력한 내용 중 오타(log)가 있으면 발생하는 에러
  - 마침표는 자바스크립트에서 특수한 역할, 객체를 배울때 나옴
- `Uncaught SyntaxError: missing ) after argument list`
  - ) or 따옴표를 사용하지 않았을 때 발생하는 에러
- `Uncaught SyntaxError: Invalid or unexpected token`
  - 광범위한 에러
  - 따옴표의 짝을 맞추지 않았을 때 발생하는 에러

### 소중대 괄호 영어 외워라!
- () : parentheses
- {} : braces
- [] : brackets

### REPL
- 브라우저의 큰솔은 
- 코드를 한 줄씩 입력받고(Read)
- 받은 입력을 평가(Eval)한 후,
- 결과를 출력(Print)
- 그 후 다시 프롬프트가 나타나 새로운 입력을 기다림(Loop)
- 이러한 특성 때문에 콘솔을 PEPL(Read-Eval-Print-Loop)이라고 함.

<br></br></br>

# 2강
## 2-1. 세미콜론, 주석, 들여쓰기
- 세미콜론(;) : 자바스크립트에서는 세미콜론을 붙여도 되고 붙이지 않아도 되지만 그래도 붙이기를 권장!
- 주석(//, /**/) : 내 코드에 대한 설명
- 들여쓰기(2칸 or 4칸 or Tab)

## 2-2. 문자열 기본(따옴표, 백틱, typeof, escape)
- 자바스크립트는 문자열을 나타낼때 꼭 작은따옴표나 큰따옴표를 써줘야함. 최신 자바스크립트는 백틱도 가능함.
- 백틱은 문자열에서 줄바꿈이 가능.
- \n : 줄바꿈
- `typeof '문자열'` : 내가 '안에' 입력한 값이 문자열이 맞나 check
  - `typeof ''` : string
  - `'' == ' '` : false
- escape(/) : 그 뒤 문자열을 감춰줌
- 콘솔창에서 줄바꿈하기 : Shift + enter

## 2-4. 숫자 기본(parseInt, NaN)
- NaN : Not a Number
  - `typeof NaN` : number. Nan의 뜻은 숫자가 아니라는 건데 typeof는 숫자가 맞대... 뭐야..
  - 

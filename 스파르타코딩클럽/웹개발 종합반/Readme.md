# 웹개발 종합반 1주차
## 수업목표
1. 서버와 클라이언트의 역할에 대해 이해한다.
2. HTML, CSS의 기초 지식을 이해한다. 부트스트랩을 가져다 쓸 줄 안다!
3. Javascript 기초 문법을 익힌다.

## PyCharm
- 파이썬을 쓰기에 가장 편한 툴

## Javascript
- 브라우저가 알아들을 수 있는 언어
- 파이썬이나 Java 같은 언어도 불가능한 건 아니지만 모든 브라우저는 기본적으로 Javascript를 알아듣게 설계되어있고, 모든 웹서버는 HTML + CSS + Javascript를 주게 되어 있다.

### Javascript 변수, 자료형, 함수, 조건문, 반복문
- 변수 : 값을 담음<br/>
  - `let a = 2`
  - `let a_list=['수박', '참외']`
    - 추가 : `a_list.push('감')`
- 자료형 : 
  - `let a_dict = {'name':'bob', 'age':'24'}`
    - `a_dict['name']` => `"bob"`
  - 순서 안 중요함.
  - key:value, key:value 형식
  - 추가 : `a_dict['height'] = 180`
  - 자료형에 아까 만든 list 넣기
    - `a_dict['fruits'] = a_list`
    ```javascript
    a_dict
    {name: "bob", age: "24", height: 180, fruits: Array(4)}
    age: "24"
    fruits: (4) ["수박", "참외", "오렌지", "딸기"]
    height: 180
    name: "bob"
    __proto__: Object

    자료형과 list가 서로서로의 요소로 쓰일 수 있다!
    ```
  - split도 가능함.
    ```javascript
    let myemail = 'sss@gmail.com'
    myemail.split('@') => (2) ["sss", "gmail.com"]
    myemail.split('@')[1] => "gmail.com"
    myemail.split('@')[1].split('.') => (2) ["gmail", "com"]
    myemail.split('@')[1].split('.')[0] => "gmail"
    도메인이 무엇인지 판단할 때 쓰임.
    ```
- 함수 : 프로그래밍에서 함수란 부르면 정해진 값을 한다는 뜻
  ```javascript
    for(let i=0; i<scores.length; i++){
        let name = scores[i]['name']
        let score = scores[i]['score']
        console.log(name, score)
    }
  ```
<br/>

  ## ✨1주차 숙제 Reminder✨
- `background-image`를 쓸 때 아래 3개는 세트!!
```css
  background-image: url("https://cdn.pixabay.com/photo/2018/02/23/11/38/bouquet-3175315_960_720.jpg");
  background-position: center;
  background-size: cover;
```
- `background-image`를 쓸 때 이미지가 나타나지 않는다면? => width와 height를 확인할 것.
```css
  width: 500px;
  height: 300px;
```
- `button` CSS
```css
  display: block; /* button이 움직이지 않는다면 이거! */
  width: 100px; /* button이 움직이지 않는다면 이거! */
  margin: auto; /* button 가운데 정렬 */
```
- 변수 이름은 명시적으로 작성할 것!<br/>
  ex) item-image, item-desc

<br/><br/>
# 웹개발 종합반 2주차
## 수업목표
1. Javascript 문법에 익숙해진다.
2. jQuery로 간단한 HTML을 조작할 수 있다.
3. Ajax로 서버 API(약속)에 데이터를 주고, 결과를 받아온다.

## Javascript 복습
- 짝수 번 눌렀을 때는 "짝짝짝👏", 홀수 번 눌렀을 때는 "홀홀홀🎅" 얼럿을 띄우는 버튼을 만들어보기
  - click이 예약어인지 click()으로 함수를 만들었더니 안먹더라!
  - hey()로 바꾸니까 잘 됨!

## JQuery
- HTML의 요소들을 조작하는, 편리한 Javascript를 미리 작성해둔 것 => 라이브러리
- 미리 작성된 Javascript 코드 그렇기 때문에 import 해야함!(jQuery CDN)
- jQuery 사용하기 -> jQuery CDN을 `<head>`와 `</head>` 사이에 넣으면 끝!
- JQuery도 CSS 선택자(id, class)처럼 선택해서 작성.

## 참고
- 참고 : 부트스트랩 템플릿을 사용하면 JQery CDN이 들어가 있다.
- JavaScript와 JQuery를 쓸 때는 중간중간 alert이나 console.log을 많이 써서 잘 돌아가는지 확인!
- 나는 JQeury hide로 포스팅박스 숨기기를 했는데 강의에서는 CSS에서 display:none으로 설정하더라! 이게 더 간단한 듯(⊙o⊙),,

## AJAX
- JavaScript로 페이지 전환없이 서버에서 값을 받아올 수 있는 방법
- <u>Ajax는 jQuery를 임포트한 페이지에서만 동작 가능</u>
- Ajax 기본 골격. 외우지 말고 복사해서 쓰래요!
```javascript
$.ajax({
  type: "GET",
  url: "여기에URL을입력",
  data: {}, /* 이건 post 방식에서 쓰는 것! */
  success: function(response){
    console.log(response)
  }
})
```
- url을 입력하면 값이 response에 들어가고 console에도 찍히게 됨.


## JSON
- 서버 → 클라이언트: JSON 이해하기
- Key:Value로 이루어져 있다. 
- 자료형 Dictionary와 아주 유사
- list 안에 dictionary가 여러개 들어 있는 것.

## GET / POST 요청
- 클라이언트 → 서버: GET 요청 이해하기
- GET : 통상적으로! 데이터 조회(Read)를 요청할 때
  예) 영화 목록 조회
- POST : 통상적으로! 데이터 생성(Create), 변경(Update), 삭제(Delete) 요청 할 때
  예) 회원가입, 회원탈퇴, 비밀번호 수정
- 이 중에서 오늘은 GET 방식에 대해 배워보겠습니다. (POST는 4주차에 배웁니다)

### GET 방식으로 데이터를 전달하는 방법
- ?  : 여기서부터 전달할 데이터가 작성된다는 의미
- & : 전달할 데이터가 더 있다는 뜻입니다.
ex) google.com/search?q=아이폰&sourceid=chrome&ie=UTF-8
  위 주소는 google.com의 search 창구에 다음 정보를 전달합니다!
  q=아이폰                        (검색어)
  sourceid=chrome        (브라우저 정보)
  ie=UTF-8                      (인코딩 정보)




<br/>

## ✨2주차 Reminder✨
- 입력한 값을 읽어드릴 때 백틱을 넣어야하는데 작은 따옴표를 넣어서 오류가 났다ㅠㅠㅠ 주의!!!
- .empty()는 선택한 요소의 내용을 지움. 내용만 지울 뿐 태그는 남아있다!!
- 태그 포함 요소 전체를 제거할 때는 .remove()를 사용
- split을 하면 요소가 나뉨. 그걸 배열식으로 표현하니까 0번째를 가져오고 싶다하면 `txt.split('@')[0]` 이렇게 표현!!
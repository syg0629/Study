# HTML & CSS
<b> 출처 : https://edu.goorm.io/learn/lecture/20583/%EA%B9%80%EB%B2%84%EA%B7%B8%EC%9D%98-html-css%EB%8A%94-%EC%9E%AC%EB%B0%8C%EB%8B%A4<br></b>
> 김버그의 HTML&CSS는 재밋다 Study : 2021.03.30 ~ <br>
---
>> <b><u>✨Check✨</u></b><br>
>> 1. nav 태그를 아껴쓰자(1페이지 당 보통 1개) / 다른 페이지로 이동할 수 있는 링크를 모아둔 네비게이션 메뉴에만 제한해서 쓰쟈!<br>
>> 2. input type="submit"과 button의 차이<br>
>> 3. <br>
>> 4. <br>

## 목차
<!-- TOC -->autoauto- [HTML & CSS](#html--css)auto    - [목차](#목차)auto    - [[시작하기에 앞서] HTML이 왜 중요한가요?](#시작하기에-앞서-html이-왜-중요한가요)auto    - [[HTML 기초] 태그 해부학](#html-기초-태그-해부학)auto    - [[HTML 기초] 제목과 문단 Headings & Paragraph](#html-기초-제목과-문단-headings--paragraph)auto    - [[HTML 기초] 강조 Emphasis](#html-기초-강조-emphasis)autoauto<!-- /TOC -->
<br>


---
<br>

## [시작하기에 앞서] HTML이 왜 중요한가요?
- 개발자모드(F12) -> Network -> Doc => 이게 HTML
- 웹 페이지의 모든 것의 시작은 HTML에서 비롯된다.
- 웹 페이지에 보이는 모든 것들(pdf, img 등등)은 기승전 HTML 태그의 결과물
- 웹 브라우저 환경의 베이스가 되는 HTML
- 문서의 구조와 정보 위계가 명확하게 보이는 아름다운 HTML코드를 작성하자!
- Semantic Markup : 의미구조에 맞게 잘 작성하는 것
- 의미에 맞게 잘 작성을 하게 되면 브라우저의 Search Engine Optimization(검색 엔진 최적화)에도 굉장히 큰 도움을 줌.
- 김버그 님의 경우 nav 태그를 소중하게 아껴씀(1페이지 당 보통 1개) / 다른 페이지로 이동할 수 있는 링크를 모아둔 네비게이션 메뉴에만 제한해서 씀
- 보여주고자 하는 정보의 의미에 집중!!

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 태그 해부학
- 꺽쇠에서 시작해서 꺽쇠에서 끝나는 <태그>
- 열린 태그(Opening tag)
- 닫힌 태그(Closing tag)

```html
<p lang="ru"> // language가 러시어어라는 뜻
    Здравствуйте.
</p>

<p attr="value"></p>
```
- attr : 태그 하나만으로 표현이 부족한 경우 부가적으로 설명하기 위한 것
- 속성 attribute을 통해 추가적인 정보를 제공한다.
- 다양한 태그와 웹 표준에 맞는 올바른 사용법을 익힌다.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 제목과 문단 Headings & Paragraph
```html
<h1>제목</h1>
<h2>제목</h2>
<h3>제목</h3>
<h4>제목</h4>
<h5>제목</h5>
<h6>제목</h6>

<p>문단</p>
```
- h태그는 총 6까지 있다.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 강조 Emphasis
- em, strong : 강조할 때 태그
- 차이 없음 그냥 내가 쓰고싶은 것 쓰면 됩니당 :)!
```html
<em>강조</em>
<strong>강조</strong>
<br/> 한칸을 띄우기 위한 태그. 남용하면 안됩니당. 다음에 배운다! 
```

</br>

[목차로 이동🚗](#목차)
</br></br>


## [HTML 기초] 링크 Ancor
- 현 위치에서 다른 위치로 이동

```html
<a href="주소">링크</a>
```
- href : hypertext(html문서, 웹 페이지) reference(주소값)
- href 주소값 표기 방법
    1. 웹 URL 갖다 붙이기
        - `<a href="http://edu.goorm.io">구름EDU</a>`
    2. 내가 사용할 문서의 상대경로
       - `<a href="./about.html">이 파일로 이동</a>`
    3. 페이지 내 이동(id 값을 적어주면 됨. 책갈피 기능)
        - `<a href="#hello">hello 섹션으로 이동</a>`
    4. 메일쓰기
        - `<a href="mailto:~~~@gmail.com" class="mail">메일쓰기</a>`
    5. 전화걸기
        - `<a href="tel:01012345678">전화걸기</a>` 모바일에서 확인하면 바로 전화가 걸려진다.
    6. 링크를 누르면 내가 있던 페이지에서 이동하게되는데 target을 이용하면 다른 탭에서 열림
        - `<a href="http://edu.goorm.io" target = "_black">구름EDU</a>`

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 이미지 Image
```html
<img src="" alt=""/>
```
- src : source
- alt : alternative text 대체 텍스트. 네트워크가 느린 사용자들을 위해 여기에는 원래 어떤 이미지가 있다고 알려주는 것. 사용자 경험 개선을 위함. 또한 screen reader(스크린 리더)와 같이 앞을 보지 못하는 분들 위해 이미지를 설명하기 위한 것.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 리스트 Lists
- 목록을 작성하고 싶을 때 사용
- ol : ordered list 순서가 중요한 목록
- ul : unordered list 순서가 중요하지 않은 목록
- li : list item 항목


```html
ul>li*2 이렇게 치면
<ul>
    <li></li>
    <li></li>
</ul> 

ol>li*2 이렇게 치면
<ol>
    <li></li>
    <li></li>
</ol>
```
- 🎈Syntax Alert 문법주의
  - <b><u>ul과 ol의 자식요소는 무조건 li만 가능</u></b>
    - ul과 ol 안에 div나 a태그, p태그 등 다른 태그가 들어가면 안된다는 뜻 -> 표준에 어긋남
    - li안에 a태그, div태그 이렇게 들어가야함. <br/>
        `<li><a href="#">김버그</a></li>`

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 정의 리스트 Description List
- 용어를 정의할 때 사용
- key-value로 정보를 제공할 때 사용 {key:value}
- dl : description list. 이제 정의리스트를 쓸 것이다 라고 알림.
  - 이 안에는 꼭 dt, dd태그가 들어가야함. But, ul,ol과는 다르게 div로 묶고 그 안에 dt, dd태그가 있어도 괜찮음.
  - dt : description term. key값에 해당됨.
  - dd : description data. ke에 대한 설명.
  - dfn : 의미를 dt보다 좀 더 사전적으로, 구체적으로 정의내리고 싶을 때 사용
```html
🎈Syntax Alert 문법주의
- dt가 연속적으로 나와도 되지만 dt, dd, dt 이렇게는 불가능함.
- dl의 자식요소는 오직 div, dt, dd만 가능하다.
- dt와 dd는 반드시 dl의 자식요소로 존재해야 한다.
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 인용 Quotations
- 인용에는 blockquote, q 두개가 있음
- blockquote을 더 많이 씀
- blockquote 말 그대로 block 인용문
- q는 문장 내에 살짝 들어가는 인용문. q태그를 쓰게 되면 ""이 붙게 됨.
- p와 blockquote은 indentation의 차이
```html
<blockquote>인용 내용</blockquote>
<cite>출처</cite>

인터넷에서 이 인용문을 가져왔다면
<blockquote cite="사이트">인용 내용</blockquote>
<cite>출처</cite>
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 흑마법 Div & Span
- 아무런 의미가 없음(단호)
- css할 때 요소를 묶어야할 때 유용하게 쓰이는 아이들
- div : 정말 아무 곳이나 다 쓰임
- span : text level. 작은 텍스트의 일부분을 그룹핑 해주고 싶을 때 사용.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (1) - 기본구조
- 사용자로부터 정보를 받고 싶을 때 사용(사용자로부터 인풋Input을 받기 위한 태그)

```html
<form action="" method=""></form>

🎈Syntax Alert 문법주의
- action="API주소" 
    - 서버에게 접근 가능한 URL, 백엔드개발자가 있으면 그 분께 써달라고 하면 된다고 합니댜.
- method="GET|POST"
    - 정보 양이 적을 때 Get, 정보 노출
    - 정보 양이 많을 때 Post, 보안
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (2) - Input
- 사용자의 정보를 받을 때 입력창. Input field
```html
<input type="text"/>

🎈Syntax Alert 문법주의
- input은 type을 꼭 적어야함.
- type의 종류 : number, text, email, password, tel, file, radio, url, date 등
- 이것을 입력해주면 그에 맞는 type이 설정됨.
```
- placeholder : Input 안에서 아무 정보가 없을 때 보여주는 text
- maxlength : 최대 길이 제한
- minlength : 최소 길이 제한(조건에 충족하지 않으면 제출 버튼 클릭시 경고 문구가 나옴)
  - type이 number일 경우에는 max(최댓값)와 min(최솟값)이 가능
- required : 무조건 입력을 해야한다는 뜻
- disabled : 사용자가 사용할 수 없게 막아둠
- value : 값을 미리 입력해둠
- type이 file일 경우 `<input type="file" accept=".png, .jpg"/>` 허용하는 파일의 확장자 지정 가능
```html
🎈input type="submit"과 button의 차이
  - 기능적인 면에서는 차이가 없음. 
  - But, button이 더 풍부한 렌더링을 할 수 있음. 

<button type="submit">
<img src="/assets/images/icon-confirm" alt="" />
제출하기
</button>

위 코드처럼 손쉽게 이미지 요소를 포함한 다른 요소를 넣을 수 있기에 더 풍부한 렌더링 옵션을 제공한다고 말할 수 있습니다.

덧붙여 기능상 완전히 동일하다면 의미가 더 명확한 <button>을 쓰는게 더 낫지 않을까라는게 제 개인적인 생각이라 저는 <button>을 사용하는 걸 선호합니다.
by. 김버그
```
</br>

[목차로 이동🚗](#목차)
</br></br>

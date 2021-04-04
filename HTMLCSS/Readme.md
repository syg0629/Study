# HTML & CSS
<b> 출처 : https://edu.goorm.io/learn/lecture/20583/%EA%B9%80%EB%B2%84%EA%B7%B8%EC%9D%98-html-css%EB%8A%94-%EC%9E%AC%EB%B0%8C%EB%8B%A4<br></b>
> 김버그의 HTML&CSS는 재밋다 Study : 2021.03.30 ~ <br>
---
>> <b><u>✨Check✨</u></b><br>
>> 1. nav 태그를 아껴쓰자(1페이지 당 보통 1개) / 다른 페이지로 이동할 수 있는 링크를 모아둔 네비게이션 메뉴에만 제한해서 쓰쟈!<br>
>> 2. <br>
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
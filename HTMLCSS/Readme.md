# HTML & CSS
<b> 출처 : https://edu.goorm.io/learn/lecture/20583/%EA%B9%80%EB%B2%84%EA%B7%B8%EC%9D%98-html-css%EB%8A%94-%EC%9E%AC%EB%B0%8C%EB%8B%A4<br></b>
> 김버그의 HTML은 재밌다 Study : 2021.03.30 ~ 2021.04.15<br>
> 김버그의 CSS는 재밌다 Study : 2021.04.15 ~ <br>
---
>> <b><u>✨Check✨</u></b><br>
>> 1. nav 태그를 아껴쓰자(1페이지 당 보통 1개) / 다른 페이지로 이동할 수 있는 링크를 모아둔 네비게이션 메뉴에만 제한해서 쓰쟈!<br>
>> 2. select 태그 자식 요소로 option외 optgroup도 있다.(option을 그룹핑할 때 사용)<br>
>> 3. `&amp;` 이스케이프코드<br>
>> 4. th로 할당된 칸 수를 컴퓨터는 알고 있음. 또 rowspan, colspan을 쓰면 그 칸의 수도 컴퓨터가 기억하고 있기 때문에 그 칸의 내용은 빼고 작성해도 괜찮음.<br>
>> 5. `scope="row|col"` 테이블 헤더한테만 쓸 수 있음. 테이블 헤더가 가로줄의 헤더인지 세로줄의 헤더인지 알려줌. 우리 눈에는 똑같지만 브라우저에게는 정확한 정보를 제공함. 일반 스크린 리더나 다른 도구를 이용해 웹을 이용하는 사용자들에게도 물론 도움을 줌. table 내 정보들의 관계성을 더 명확하게 파악할 수 있음.<br>
>> 6. [HTML 기초] 기타 Etc 확인<br>
>> 7. [HTML 훈련] <br>
>> 8. Sectioning Elements(총 4개) : section, article, nav, aside<br>
>> 9. Selectioning element 내에는 반드시 heading 태그를 작성해야한다`<h1> ~ <h6>`.<br>
>> 10. `box-sizing: border-box;`을 하지 않고 CSS를 작업하면 기본값인 `box-sizing: content-box`가 되어서 margin과 padding 때문에 내가 원하는 width와 height 값이 나오지 않을 수 있음.<br>
>> 11. `margin`, `padding` 쓸 때 `~top`이나 `~bottom` 중 하나, `~left`이나 `~right`중 하나만 골라 쓸 것. 그렇지 않으면 코드를 볼 때 중구난방으로 되어 헷갈림. 기준을 잡으면 유지보수할 때도 좋음.<br>
>> 12. `image`.. `inline`이다......근데 width랑 height가 먹힌다. 반전..（⊙ｏ⊙）... 이미지 태그만 그렇대! 그래도 `display: block`을 주는게 좋대!!<br>
>> 13. a태그 inline<br>
>> 14. `position: fixed` 요소에게 직접 먹임<br>


## 목차
<!-- TOC -->
- [HTML & CSS](#html--css)
  - [> 김버그의 CSS는 재밌다 Study : 2021.04.15 ~ <br>](#-김버그의-css는-재밌다-study--20210415--)
  - [목차](#목차)
- [HTML](#html)
  - [[시작하기에 앞서] HTML이 왜 중요한가요?](#시작하기에-앞서-html이-왜-중요한가요)
  - [[HTML 기초] 태그 해부학](#html-기초-태그-해부학)
  - [[HTML 기초] 제목과 문단 Headings & Paragraph](#html-기초-제목과-문단-headings--paragraph)
  - [[HTML 기초] 강조 Emphasis](#html-기초-강조-emphasis)
  - [[HTML 기초] 링크 Ancor](#html-기초-링크-ancor)
  - [[HTML 기초] 이미지 Image](#html-기초-이미지-image)
  - [[HTML 기초] 리스트 Lists](#html-기초-리스트-lists)
  - [[HTML 기초] 정의 리스트 Description List](#html-기초-정의-리스트-description-list)
  - [[HTML 기초] 인용 Quotations](#html-기초-인용-quotations)
  - [[HTML 기초] 흑마법 Div & Span](#html-기초-흑마법-div--span)
  - [[HTML 기초] Form (1) - 기본구조](#html-기초-form-1---기본구조)
  - [[HTML 기초] Form (2) - Input](#html-기초-form-2---input)
  - [[HTML 기초] Form (3) - Label](#html-기초-form-3---label)
  - [[HTML 기초] Form (4) - Radio & Checkbox](#html-기초-form-4---radio--checkbox)
  - [[HTML 기초] Form (5) - Select & Option](#html-기초-form-5---select--option)
  - [[HTML 기초] Form (6) - Textarea](#html-기초-form-6---textarea)
  - [[HTML 기초] Form (7) - Buttons](#html-기초-form-7---buttons)
  - [[HTML 기초] 표 Table (1) - 기본 구조](#html-기초-표-table-1---기본-구조)
  - [[HTML 기초] 표 Table (2) - 심화](#html-기초-표-table-2---심화)
  - [[HTML 기초] 미디어 파일 Media](#html-기초-미디어-파일-media)
  - [[HTML 기초] 기타 Etc](#html-기초-기타-etc)
  - [[HTML 기초] Doctype & Document Structure](#html-기초-doctype--document-structure)
  - [[HTML 기초] Title, Link, Style & Script](#html-기초-title-link-style--script)
  - [[HTML 기초] Meta 메타 데이터](#html-기초-meta-메타-데이터)
  - [[HTML 기초] Q & A](#html-기초-q--a)
  - [[HTML 훈련]](#html-훈련)
  - [[트위터 마크업 챌린지] 구조적인 웹 문서 설계](#트위터-마크업-챌린지-구조적인-웹-문서-설계)
  - [[트위터 마크업 챌린지] 올바른 Sectioning Elements 사용 방법](#트위터-마크업-챌린지-올바른-sectioning-elements-사용-방법)
  - [[트위터 마크업 챌린지] 페이지 구조 설계](#트위터-마크업-챌린지-페이지-구조-설계)
  - [[트위터 마크업 챌린지] Header](#트위터-마크업-챌린지-header)
  - [[트위터 마크업 챌린지] Global Navigation](#트위터-마크업-챌린지-global-navigation)
  - [[트위터 마크업 챌린지] Main](#트위터-마크업-챌린지-main)
  - [[트위터 마크업 챌린지] Section(Tweet Form, Timeline)](#트위터-마크업-챌린지-sectiontweet-form-timeline)
  - [[트위터 마크업 챌린지] Article(Tweet)](#트위터-마크업-챌린지-articletweet)
  - [[트위터 마크업 챌린지] Aside](#트위터-마크업-챌린지-aside)
  - [[트위터 마크업 챌린지] Footer](#트위터-마크업-챌린지-footer)
- [CSS](#css)
  - [[CSS 기초] CSS 소개 & 기본 형태](#css-기초-css-소개--기본-형태)
  - [[CSS 기초] CSS 사용 방법](#css-기초-css-사용-방법)
  - [[CSS 기초] Selectors - 요소, 클래스, ID 선택자 (Type, Class & ID Selector)](#css-기초-selectors---요소-클래스-id-선택자-type-class--id-selector)
  - [[CSS 기초] Selectors - 자식, 자손, 형제 선택자 (Child, Descendant & Sibling Combinators)](#css-기초-selectors---자식-자손-형제-선택자-child-descendant--sibling-combinators)
  - [[CSS 기초] Selectors - 구조적 가상 클래스 선택자 (Structural Pseudo-classes)](#css-기초-selectors---구조적-가상-클래스-선택자-structural-pseudo-classes)
  - [[CSS 기초] Selectors - 동적 가상 클래스 선택자 (User Action Pseudo-classes)](#css-기초-selectors---동적-가상-클래스-선택자-user-action-pseudo-classes)
  - [[CSS 기초] Selectors - CSS 선택자 올림픽](#css-기초-selectors---css-선택자-올림픽)
  - [[CSS 기초] Box - Box Model](#css-기초-box---box-model)
  - [[CSS 기초] Box - Box Sizing](#css-기초-box---box-sizing)
  - [[CSS 기초] Box - Box](#css-기초-box---box)
  - [[CSS 기초] Box - Block](#css-기초-box---block)
  - [[CSS 기초] Box - Inline](#css-기초-box---inline)
  - [[CSS 기초] Box - Inline Block](#css-기초-box---inline-block)
  - [[CSS 기초] Float - Float1](#css-기초-float---float1)
  - [[CSS 기초] Float - Float2](#css-기초-float---float2)
  - [[실습] Float 훈련1](#실습-float-훈련1)
  - [[실습] Float 훈련2](#실습-float-훈련2)
  - [[CSS 기초] Position - Position 1 & 2](#css-기초-position---position-1--2)
    - [static](#static)
    - [relative](#relative)
    - [absolute](#absolute)
    - [fixed](#fixed)
    - [z-index](#z-index)
    - [image](#image)
    - [`width: 100%;` & `height: auto;`](#width-100--height-auto)
    - [transform](#transform)
  - [[CSS 기초] Flexbox 1](#css-기초-flexbox-1)
  - [[CSS 기초] Flexbox 2 (justify-content / align-items / align-content / order)](#css-기초-flexbox-2-justify-content--align-items--align-content--order)
    - [order](#order)
    - [기본값](#기본값)
  - [[CSS 기초] Media Query](#css-기초-media-query)
    - [viewport height & viewport width](#viewport-height--viewport-width)
  - [[CSS 기초] Typography 1 & 2](#css-기초-typography-1--2)
    - [1. font-size : 글자 크기](#1-font-size--글자-크기)
    - [2. line-height : 줄 간격](#2-line-height--줄-간격)
    - [3. letter-spacing : 글자와 글자사이의 간격. 글자간](#3-letter-spacing--글자와-글자사이의-간격-글자간)
    - [4. font-family : 폰트. 서체](#4-font-family--폰트-서체)
    - [5. font-weight : 굵기](#5-font-weight--굵기)
    - [6. color : 글자 색](#6-color--글자-색)
    - [7. text-align : 텍스트를 정렬](#7-text-align--텍스트를-정렬)
    - [8. text-indent : 들여쓰기](#8-text-indent--들여쓰기)
    - [9. text-transform : 텍스트 변형](#9-text-transform--텍스트-변형)
    - [10. text-decoration](#10-text-decoration)
    - [11. font-style](#11-font-style)
  - [[CSS 기초] Webfont](#css-기초-webfont)
  - [[CSS 기초] Background](#css-기초-background)
    - [background-color](#background-color)
    - [background-image](#background-image)
    - [background-repeat](#background-repeat)
    - [background-size](#background-size)
    - [background-position](#background-position)
  - [[CSS 기초] 실습 Background 훈련 part 1](#css-기초-실습-background-훈련-part-1)
  - [[CSS 기초] Q & A](#css-기초-q--a)
<br>


---
<br></br></br>

# HTML
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
  - dd : description data. key에 대한 설명.
  - dfn : 의미를 dt보다 좀 더 사전적으로, 구체적으로 정의내리고 싶을 때 사용
```html
🎈Syntax Alert 문법주의
- dt가 연속적으로 나와도 되지만 dt, dd, dt 이렇게는 불가능함.
- dl의 자식요소는 오직 div, dt, dd만 가능하다.
- dt와 dd는 반드시 dl의 자식요소로 존재해야 한다.

<dl>
    <dt>학습 學習 [학씁]</dt>
    <dd>
        1. noun 배워서 익힘.
    </dd>
    <dd>
        2. noun 심리 경험의 결과로 나타나는, 비교적 지속적인 행동의 변화나 그 잠재력의 변화. 또는 지식을 습득하는 과정
    </dd>
</dl>

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

## [HTML 기초] Form (3) - Label
- 반드시 사용하진 않아도 된다.
- 폼 양식에 이름을 붙이는 태그

```html
🎈Syntax Alert 문법주의
<label for="인풋id">라벨</label>
<input id="인풋id" type="text"/>
- 인풋id를 클릭하면 텍스트가 focus됨.
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (4) - Radio & Checkbox
- Radio : 둘 중에 하나만 선택
- Checkbox : 중복 선택 가능

```html
<input type="radio" id="subscribed" name="subscription" value="subscribed">
<label for="subscribed">구독중</label>
<input type="radio" id="unsubscribed" name="subscription" value="unsubscribed">
<label for="unsubscribed">미구독</label>
- radio도 label을 붙일 수 있다. 
- name을 적어 놓아야 radio 중복이 안됨. 하나만 선택 가능. 서로 연관이 되어 있음을 알림.
- value 값을 적어줘야 서버로 넘어갈 때 해당 값이 넘어가게 됨.
- input type="radio"에 필수로 들어가야하는 attr name과 value
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (5) - Select & Option
- select의 자식요소 option
- select에 name값을 넣어주면 되고, option에 value값을 넣어주면 된다.
- `<select multiple>`은 Ctrl 누르고 선택시 다중 선택이 가능하다.
- 🎈추가로!! select 태그 자식 요소로 option외 optgroup도 있다.
- option이 가장 기본이 되는 자식 요소
- optgroup는 option을 그룹핑할 때 사용
```html
<select  name="city">
  <optgroup label="경기도">
    <option value="0">고양</option>
    <option value="1">과천</option>
    <!-- ... -->
  </optgroup>
  <optgroup label="경상도">
    <option value="2">김해</option>
    <option value="3">창원</option>
    <!-- ... -->
  </optgroup>
  <option value="4">서울</option>
</select>

이런식으로 관련있는 option끼리는 optgroup으로 그룹핑을 하고 label을 적어주면 된다.
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (6) - Textarea
- `<textarea></textarea>`
- <u>여러 줄에</u> 걸쳐서 많은 양의 글을 받을 때 사용
- `<textarea rows="40">세로로 40줄 길어짐</textarea>`
- `<textarea cols="50">가로로 50칸 길어짐</textarea>`
- 위 rows와 cols는 css로 조절 가능하기에 외우지 않아도 괜찮움!

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Form (7) - Buttons
```html
🎈Syntax Alert 문법주의
button type 3가지 : button, submit, reset
<button type="button">그냥 버튼</button>
<button type="submit">제출하기</button>
<button type="reset">다시 쓰기</button>
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 표 Table (1) - 기본 구조
- 데이터를 담은 표를 만들 떄 사용
```html
<table> 테이블을 작성한다는 시작을 알림
  <tr> 가로줄을 만듬
    <th>테이블 헤더</th>
    <td>테이블 데이터</td>
  </tr>
</table>
- th를 어떻게 정의하느냐에 따라서 뒤에도 영향을 받음.
- th의 갯수와 td의 갯수는 맞춰줘야함
- 테이블의 구조를 쫌 더 명확하게 보여주기 위해 <thead></thead>, <tbody></tbody>
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 표 Table (2) - 심화
- `표Table2.html` 참조할 것
- 먼저 한 줄에 몇 개의 칸이 들어가는지 알아야 함.
- 줄에 대한 테이블 헤더 : th
- `&amp;` 이스케이프코드
- th로 할당된 칸 수를 컴퓨터는 알고 있음. 또 rowspan, colspan을 쓰면 그 칸의 수도 컴퓨터가 기억하고 있기 때문에 그 칸의 내용은 빼고 작성해도 괜찮음.
- `scope="row|col"` 테이블 헤더한테만 쓸 수 있음. 테이블 헤더가 가로줄의 헤더인지 세로줄의 헤더인지 알려줌. 우리 눈에는 똑같지만 브라우저에게는 정확한 정보를 제공함. 일반 스크린 리더나 다른 도구를 이용해 웹을 이용하는 사용자들에게도 물론 도움을 줌. table 내 정보들의 관계성을 더 명확하게 파악할 수 있음.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 미디어 파일 Media
- html 문서 안에 text가 아닌 어떤 형태에 데이터를 집어 넣는 경우를 미디어 파일이라고 함.
- `<img src="" alt="">` 이미지
- `<audio src=""></audio>` 음성파일
  `<audio src="./assets/audios/kimbug.mp3"></audio>`
    - controls을 넣어주면 사용자가 컨트롤 가능함.
    - autoplay 음성 자동재생. 브라우저 정책상 요즘은 막혀있음. autoplay를 하려면 muted속성도 함께 적어줘야함.
    - loop autoplay 무한 자동재생.
```html
<audio controls>
    <source src="assets/audios/kimbug.wav" type="audio/wav"/>
    <source src="assets/audios/kimbug.mp3" type="audio/mpeg"/>
    <source src="assets/audios/kimbug.ogg" type="audio/ogg"/>
</audio>
    <p>
        당신의 브라우저를 버리시고 크롬을 사용하시는게 어떨까요?
        라고 위에 음성파일을 재생할 수 없는 사용자에게 알려주는게 User friendly함
    </p>

이렇게 작성해도 브라우저에서는 하나만 나옴. 한번만 재생이 됨.
내가 만약 wav로 하나만 작성을 했다면 익스플로어 사용자는 음성파일을 들을 수 없음. 그런 사용자를 위해 위처럼 작성하게 됨.
https://caniuse.com/
이 브라우저별 사용가능한지 아닌지는 위 사이트에서 확인 가능.
```
- `<video src=""></video>`비디오
    - audio와 attr가 동일하다.
- `<iframe src="" frameborder="0"></iframe>` html 안에 또다른 html이나 컨텐츠를 임베드 하고 싶을 때 사용하는 태그
    - 직접 iframe을 작성하는 경우는 별로 없을 것임.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] 기타 Etc
1.  `<abbr title="풀네임">약어</abbr>`
    - abbreviation 약자, 약어
    - 마우스를 가져다 놓으면 풀 네임이 나온다. 
```html
<p>
    너 혹시 <abbr title="Attention Deficit Hyperactivity Disorder">ADHD</abbr>니?
</p>
```
2. `<address>연락처</address>`
    - (물리적)주소, url, 전화번호, 이메일, SNS
```html
<address>
    <h1>
        김버그
    </h1>
    <a
href="https://youtube.com/c/kimbug">https://youtube.com/c/kimbug</a>
</address>
```
3. `<pre>내가 작성한 그대로 나옴</pre>`
- preformatted text, code
- 그래서 보통 code를 작성할 때 `<pre>` 안에 쓰게 됨.
- 하지만 이 둘을 항상 같이 묶어 놓을 필요는 없음.
- 여러줄로 작성하고 들여쓰기로 작성하려면 `<pre><code>코드</code></pre>`
```html
<pre>
    <code>
        console.log('hello syg0629');
            var syg0629 = 'syg0629';
    </code>
</pre>
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Doctype & Document Structure
- Document Type Declaration
  = DTD 선언
  = 문서 형식 선언
`<!DOCTYPE html>` : 브라우저야, 이 문서는 HTML5 버전으로 작성된 문서야. 그에 맞춰 잘 렌더링해줘 라는 뜻..
- `<html></html>`안에는 `<head></head>`,`<body></body>`가 들어감.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Title, Link, Style & Script
- `<title>문서의 대제목</title>` : 검색 최적화에 매우 중요
  - title 잘 쓰는 방법
    - 키워드 단순 나열은 비추
    - 페이지마다 그에 맞게 변경
    - 무엇에 관한 내용인지 센스있게 작성
    - Search Engine Optimization
- `<link rel="stylesheet" href="style.css">` : CSS 스타일시트를 첨부하는 태그
    - link:css + 엔터 = 자동완성
    - 웹 폰트를 쓸 때도 작성. CSS 파일에도 물론 적용되어야함. 
- `<style>//CSS 코드</style>` : HTML 문서 내에 CSS코드를 작성할 때 사용하나 따로 CSS파일을 만드는게 훨씬 좋음.
- `<script src="경로"></script>` : HTML 문서 내에 JavaScript파일을 첨부할 때 사용
    - script:src + 엔터 = 자동완성
- `<script>//자바스크립트 코드</script>`
    - 왜 script는 head 안에 안 쓰나요?
      - 브라우저가 어떤 식으로 태그를 렌더링하는지 알아야함.
      - 링크랑 스크립트의 차이
        - 링크는 우리가 가지고 있는게 아니라서 요청을 하고 받아오는 시간이 있음. 근데 기다리지 않고 skip하고 다른 것으로 넘어감. 하지만 script 태그는 다 안 받아오면 거기에서 멈춰버림. 그래서 이 태그를 head에 적어버리면 head에서 body를 렌더링하지 못하고 멈쳐서 다 로드될 때까지 기다림. 그래서 body안에서 모든 컨텐츠들이 다 로드가 된 다음 작성이 되어야 좋음. body 내에서도 가장 마지막에 작성되는 것이 좋다!!

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Meta 메타 데이터
- head 안에 작성
- attr : name, content
- name="메타데이터 종류(author, description, keywords)"
- content="메타데이터 값" 
- `<meta name="viewport" content="width=device-width, initial-scale=1.0">` : viewport 화면 사이즈, 디바이스 사이즈에 맞춰 알아서 사이즈가 조절됨. 반응형 사이트. CSS를 아무리 만져도 여기에서 viewport를 작성하지 않으면 먹히지 않음.
- meta:vp + 엔터 = 자동완성
- `<meta name="keywords" content="공부, 공부해야지, html, css">` : 여기에 있는 키워드를 누군가 검색하면 내것이 보여주게 해줘
- meta태그는 종류가 많음.


</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 기초] Q & A
1. GET과 POST
- GET 요청은 캐시가 된다는 장점이 있습니다 (=한번 본 페이지는 빠르게 로딩이 가능하다는 거죠)
- GET과 POST 각각의 특성을 알기 전에 각 method를 사용 목적을 먼저 생각하는 게 더 좋을 것 같아요!
  - GET: 단순히 정보를 '읽고(read)' 싶을 때
  - POST: 사용자가 입력한 값을 '저장'하고 싶을 때
- GET 요청은 서버에게 "야! 나 이거 보고 싶은데 보여줘"라는 식의 요청이 대부분이라
서버나 DB를 변형시킬 일이 없습니다. (=무해하다)
- POST 요청은 주로 "새로운 데이터를 저장하고 싶을 때" 사용하는 요청이라
요청 후에는 데이터베이스에 새로운 변경사항이 추가가 되게 됩니다.
그렇다는 것은 즉, 이상한 데이터를 보내거나 POST 요청을 보내는 도중
해커(!)가 개입해서 이상한 짓을 해버리면!! 큰일이 발생하기도 하죠 (보통 그럴 일은 없지만...)

2. `<input type="file" accept="image/*, audio/*, video/*">`
- accept=".png, .jpg"는 png, jpg파일만 허용하겠다
- accept="image/*, audio/*, video/*"는 모든 이미지 파일, 모든 오디오 파일, 모든 비디오 파일을 허용하겠다.
- *는 프로그래밍 세계에서 모두라는 뜻
- 그렇기 때문에 /*을 사용하는 게 좀더 포괄적인 범위를 나타냅니다!

3. 전화번호 작성시 자릿수에 맞춰 -가 삽입되는 것
- HTML pattern 속성으로는 패턴에 맞게 작성했는지 정도만 체크해줍니다!
말씀하신 경우에는 javascript가 관여를 해야하는 부분인데요~
사용자가 새로운 값을 입력하면, javascript가 입력값을 확인을 합니다.
확인하다 -가 필요한 자리에 샥 -를 끼워 넣어버리는 것

</br>

[목차로 이동🚗](#목차)
</br></br>

## [HTML 훈련]
- 마크업할 때 가장 먼저 진행되어야 하는 것은 최선을 다해서 요소를 짜는 것.
- HTML escape code(https://www.freeformatter.com/html-entities.html)
- img가 정보로 가치가 없을 때는 이미지를 안 넣어도 된다. 그 역할을 CSS로 넘겨버려도 된다.
  - `<img/>`를 사용: 해당 이미지는 정보 콘텐츠로서 가치가 있다!
  - `background-image`를 사용: 그냥 꾸미기 용이다!
- `<img alt="">`의 활용도
  - text 자체와 alt를 동시에 적어야할 때는 text를 생략하고 이미지의 alt 값으로 대체할 수 있다.
  - alt 값을 무엇을 둬야할지 모르겠을 때 `alt=""`하고 비워두어야한다. alt를 없애면 올바른 마크업이 아님.
- `&`의 경우는 브라우저가 렌더링할 때 헷갈려할 수도 있으니 HTML escape code인 `&amp;`를 사용해야한다.
- WAI-ARIA 인터넷의 접근성을 높이는데 사용
  - `<a href="#" aria-label="Go to previous page" class="disabled">Previous</a>` 
  - `aria-label=""` : 눈에 보이지는 않지만 브라우저에게 전달되면 좋은 정보, 스크린 리더를 통해 웹을 사용하는 사용자들에게 전달해야하는 정보를 제공
  - `aria-hidden="true"` : 스크린리더로 읽을 때 감추는 것.
- ~는 ~고 ~는 ~다. key와 value의 형태 
- 제출을 하려면 form태그 필요
  - form태그 위에서부터 감쌀 필요 없고, 딱 전달할 내용만 감싸면 된다. form 태그에도 class 가능..
```html
Input Group
<form action="" method="GET" class="input-group">
        <input type="email" name="email" placeholder="Your Email">
        <button type="submit" name="Subscriptions" value="Subscribe">Subscribe</button>
</form>
```
- `class="sr-only"` : Screen Reader only
- 테이블을 만들 때는 우리 눈에 보이지 않는다고 해서 thead를 작성하지 않으면 안됨!!! 만들고 CSS로 바꾸기
- `lang=ko`인지 `lang=en`인지 확인
- video source태그 쓰면 type 써주기
```html
<video controls autoplay muted>
    <source src="./kimbug-bjj.mp4" type="video/mp4">
    <source src="kimbug-bjj.mov" type="video/mp4">
</video>
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] 구조적인 웹 문서 설계
- 구조적으로 문서를 설계한다는 것은 글의 구조를 쉽게 파악할 수 있게 하는 것.
- 브라우저에도 글의 개요가 필요하다.
- Sectioning Elements
  - section, article, nav, aside, header, main, footer
  - 상황에 맞는 적절한 Sectioning 요소를 올바르게 사용해야함.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] 올바른 Sectioning Elements 사용 방법
- 🎈<u><b>Sectioning Elements(총 4개)
  - section, article, nav, aside</b></u>
  - 공통적으로 지켜야할 규칙
  - Sectioning elements = 단원이라고 생각하면 됨.
  - 단원에는 단원의 주제, 제목이 있음.
  - 🎈<u><b>selectioning element 내에는 반드시 heading 태그를 작성해야한다`<h1> ~ <h6>`.</b></u>
```html
<section>
  <h1>섹션의 제목</h1>
  <p></p>
</section>
```
```html
<nav>
  <h1>메뉴</h1>
  <ul>
    <li>
      <a href="#">링크</a>
    </li>
  </ul>
</nav>
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] 페이지 구조 설계
1. 전체 페이지를 마크업할 때, 구획 나누기 먼저 할 것.
  - 논리적으로 긴밀하게 관련된 집합체
2. 적절한 Sectioning elements 정해주기

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Header
- div와 비슷함.
- section의 상단부분, 도입부를 알려줌.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Global Navigation
- 🎈<u><b>Sectioning elements이기 때문에 heading 태그를 무조건 작성해줘야함.</b></u>
- 문서 간으로 이동을 할 수 있는 메뉴가 있는 경우 사용 -> nav

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Main
- 본문의 가장 핵심이 되는 부분을 묶어주는 역할.
- 하나의 html에는 단 한 개의 main을 가지고 있을 수 있음.
- section, article, nav, aside 안에 올 수 없음.
- Sectioning elements가 아니기 때문에 heading 태그가 반드시 필요하지 않다.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Section(Tweet Form, Timeline)
- 가장 만만한 Sectioning elements
- div도 괜찮지만 section을 쓸 때 뉘앙스가 더 배가 됨.
- 논리적으로 완결성 있는 집합체

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Article(Tweet)
- Sectioning elements로 heading 태그가 반드시 있어야한다.
- 뉴스 기사나 블로그처럼 컨텐츠로 완결성이 있는 경우 section 보다 더 뉘앙스를 살리기 위해 사용
- 독립적으로 존재해도 완결성이 있는 경우 사용
- footer 하단부의 도입부를 알림

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Aside
- Sectioning elements이기 때문에 heading 태그 필수
- 사이드 바 or 배너 광고때 이용
- 논리적으로 완결이 되었지만 본문 내용과 직접적으로 연관이 없는 것

</br>

[목차로 이동🚗](#목차)
</br></br>

## [트위터 마크업 챌린지] Footer
- Sectioning elements가 아니기 때문에 heading 태그가 반드시 필요하지 않다.

</br>

[목차로 이동🚗](#목차)
</br></br></br></br>

# CSS
## [CSS 기초] CSS 소개 & 기본 형태
- CSS : Cascading Style Sheet
- HTML에 디자인을 입히는 아이
```css
selector {
  property : value;
}
- 선택자(selector) : 누구를 꾸밀지 지목
- 🎈CSS를 끝낼때 `;`는 필수!!! 오류가 나도 CSS는 알려주지 않음.
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] CSS 사용 방법
1. link 태그를 이용해서 CSS 파일을 import
```html
<html>
  <title>How to use CSS</title>
  <link rel="stylesheet" href="./style.css"/>
```
2. html 내에 `<style></style>`태그를 이용해서 CSS를 쓸 수 있지만 권장하지 않는다.
3. inline style : 요소에 직접 style을 넣는 방법. 특별한 이유가 있지 않는 이상 이건 절대 사용하지 말 것 => 나중에 유지보수 관리 때 굉장히 굉장히 힘들댜ㅑㅑ(⊙o⊙)
  `<p style="font-size: 32px;">`

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Selectors - 요소, 클래스, ID 선택자 (Type, Class & ID Selector)
- Type Selector
  - html tag selector
```css
p {
  color : #212529;
}
```
- Class Selector : 
  - html에서 `class`라고 작성. CSS에서는 `.`으로 작성.
  - 모두 같은 스타일링 효과를 주려면 같은 `class 이름`을 사용
  - `class` 한 요소에 여러 개를 줄 수 있음.
```html
<div class="box-0 box-1 box-2" >
한 칸씩 띄어주어야 각각의 다른 클래스로 적용.
```
```css
.box-0.box1 {
  color : #212529;
}

이렇게 안떨어져 있으면 .box-0 이자 .box1 인 것을 말함.
떨어지면 다른 의미가 됨.
```
- ID Selector
  - 단 한개만 존재해야함
  - html에서 `id`라고 작성. CSS에서는 `#`으로 작성.
```html
<div id="syg0629">
```
```css
#syg0629 {
  font-style: italic;
}
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Selectors - 자식, 자손, 형제 선택자 (Child, Descendant & Sibling Combinators)
- 같은 계층에 있는지에 따라 생각하면 됨.
- 자식 선택자
  - parent > child
  - parent가 child를 감싸고 있음.
- 자손 선택자
  - parent child
  - 가운데 공백이 있어야함.
  - 물론 자식도 선택됨.
- 형제 선택자
  - parent + sibling
    - 선택한 아이 다음 1개만 효과를 주고싶을 때
  - parent ~ sibling
    - 선택한 아이 다음에 오는 모든 아이들에게 효과를 주고 싶을 때

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Selectors - 구조적 가상 클래스 선택자 (Structural Pseudo-classes)
- Pseudo : 가짜, 가상
- HTML class를 만들지 않고 css에서 사용할 수 있어 깔끔하다.
- element:first-child
- element:last-child
- element:nth-child(n)
```html
<ol>
    <li>Do something</li>
    <li>Do something else</li>
    <li>Create something</li>
    <li>Create something else</li>
    <li>Make something </li>
    <li>Make something else</li>
</ol>
```
```css
li:first-child {
  color: #0066ff;
}
li이자 fist-child 인 아이.
붙여서 사용해야함.

li:last-child {
  color: #ff4949;
}

li:nth-child(3) {
  color: #ffc82c
}
li에서 3번째 아이.

li:nth-child(2n) {
  color: #ffffff
}
li이자 짝수인 아이

li:nth-child(2n-1) {
  color: #ffffff
}
li이자 홀수인 아이
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Selectors - 동적 가상 클래스 선택자 (User Action Pseudo-classes)
- element:hover
  - 마우스를 가져가 놓았을 때
- element:focus
  - 해당 요소가 focus가 되었을 때
- element:action
  - 마우스로 클릭하는 찰나의 순간
=> 클릭이 되고 포커스가 된다. active가 먼저 먹고 그다음 focus이지만, CSS 작성할 때는 focus 상태일 때의 스타일을 기본으로 깔고, active 상태일 때 추가로 스타일을 추가해 "덮어주는 것"!!!
```css
input:focus {
}

input:active {
}
순서로 작성해야함. 반대로 하면 동작하지 않음.
```
</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Selectors - CSS 선택자 올림픽
- 선택자 우선순위
  - 동일한 CSS 코드가 2개 있고 value만 다르다면 나중에 선언된 태그가 동작.
  - 1 : !important `color: hotpink !important;` 가능하면 쓰지 말 것.
  - 2 : Inline Style 가능하면 쓰지 말 것.
  - 3 : ID Selector
  - 4 : Class, Pseudo-class(first-child, 
last-child, nth-child(n), hover, focus, active) Selector
  - 5 : Type Selector가 순위가 가장 낮음. html 태그 자체

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Box Model
- width : content의 가로
- height : content의 세로
- border : 테두리 &nbsp; `border: 1px(굵기) solid(스타일) #000(색상)`, `border : none(테두리 쓰고 싶지 않을 때)`, `border-radius: 4px(숫자가 높을 수록 둥글게둥글게🏐, 그냥 동그라미 : 50%)`
- padding : 안쪽 여백. 즉, content와 border 사이의 공간
  - 속기형 : 시계 방향(top, right, botoom, left)
  - `padding: 10px 20px 30px 40px`
- margin : 바깥 여백. 즉, 요소와 요소 사이의 간격
  - 속기형 : 시계 방향(top, right, botoom, left)
    - `magin: 10px 20px`

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Box Sizing
- `box-sizing: border-box;`를 하지 않고 CSS를 작업하면 기본값인 `box-sizing: content-box`가 되어서 margin과 padding 때문에 내가 원하는 width와 height 값이 나오지 않을 수 있음.
- 계산하면서 css를 작성하고 싶지 않으면 `box-sizing: border-box` css 시작시 꼭 작성
```css
* {
  box-sizing: border-box;
}
```


</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Box
- Box는 여러 종류가 있음.
- Box Type(Block, Inline, Inline Block, Flex)이 무엇이냐에 따라 Box Model(width, padding ...)의 작동 방식도 달라짐.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Block
- 모든 html 요소는 display 값이 있음. 
- display는 Box Type을 결정짓는 CSS 속성
- display 값이 무엇인가에 따라 Box Type이 달라짐
- Block : (지나가지 못하게) 막다, 차단하다 => 길막
- Block Type요소에 width를 선언하지 않은 경우, width = 부모의 content-box의 100%. 아래 따라오는 다른 요소는 위 요소를 침범하지 못 함.
- 따로 width를 선언한 경우, 남은 공간은 margin으로 자동으로 채움. 아래 요소가 위로 올라오지 못함.
- `margin-left: auto;` 자동으로 생기는 마진을 전부 왼쪽으로 보내겠다!(보통 오른쪽에 있음)
- `margin: 0 auto;` : margin-left와 right를 auto로 해서 가운데 정렬
- 따로 부모의 height를 선언하지 않을 경우, `자식 요소의 height의 합 = 부모의 height`
- 마음대로 사용 가능 : width, height, padding, border, margin

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Inline
- Inline : 라인 안에 있음.
- 기본적으로 옆으로 흐름
- 사용불가 : width, height, padding-top, padding-bottom, border-top, border-bottom, margin-top, margin-bottom
- Inline의 줄간격 흐름을 박살내는 아이들이기 때문.
- left/right는 사용 가능

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Box - Inline Block
- Inline의 좋은 점과 Block의 좋은 점을 모두 가진 아이.

```html
1. 인라인을 사용해야 하는 경우 텍스트와 같이 문단에서 줄 간격에 따라 흘러야 하는 경우 (사실 인라인으로 억지로 바꾸는 경우는 정말 극히 드물기에... 좋은 예시를 들기가 어렵네요)

2. 블록을 사용해야 하는 경우 공간의 영역을 차지해야 하는 경우 width나 height를 사용해야 하는 경우 (사실 display: block을 가장 많이 사용하는데요, 그 이유는 width나 height 사이즈를 잡을 수 없는 인라인 요소를 사이즈를 잡을 수 있게 만들기 위해서 자주 사용합니다)

3. 인라인 블록을 사용해야 하는 경우 width나 height 사이즈를 설정해야 하고 동시에 별도의 설정 없이(가령 float나 flex가 있습니다) 가로 배치도 자동으로 되게 하고 싶을 때!! (이 경우는 꽤나 명확하죠)
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Float - Float1
- 가로배치 + 레이아웃 와장창
- float : (물 위나 공중에서) 떠가다. (가라앉지 않고 물에) 뜨다.
- `opacity: 0;` 완전 투명.
- `opacity: 0.5;` 50%만 투명.
- `opacity: 1;` 완전 불투명.
1. 집 나간 내 새끼, 찾을 길 없네
   - float를 써서 위로 떠버리면 부모와 형제들은 집나간 아이의 행방을 모른다. 그래서 height도 집 나간 아이 제외한 값이 나오고, 레이아웃도 바뀌게 된다.
2. 블록으로 신분 상승
   - 기존 Inline, Inline Block, Block이 float를 쓰게되면 Block으로 된다. Block이 됨으로 width, height 등등 Block이 가지는 특징을 다 쓸 수 있음.
3. 길막을 못해 슬픈 블록아!
   - float을 쓰면 블록은 블록인데 길막을 하지 못하는 하자가 있는 블록이 됨.
   - 원래 Block은 width를 선언하지 않은 경우, width=부모의 content-box의 100%
       - float이 되면, 안에 있는 content 만큼만 가진다. 붕 뜨기 위해서는 가벼워야하므로!
   - 원래 Block은 따로 width를 선언한 경우, 남은 공간은 margin으로 자동으로 채운다
       - float이 되면, 자동으로 생기는 margin auto가 생기지 않는다. 밑에 있는 친구들이 위로 올라온다.
4. 플로트, 나만 볼 수 있어요(feat. 인라인)
- 자식들이 다 float을 쓰게 되면 집을 다 나가게 됨으로 parent의 height는 0이 되어버림. 가로배치는 성공. But 레이아웃 붕괴.
- height가 0가 되면 영역차지를 안하는 것

</br>

[목차로 이동🚗](#목차)
</br></br>
 
## [CSS 기초] Float - Float2
- Float로 부셔진 레이아웃 고치기
1. 쉬운 방법 : `overflow: hidden;`
   - 원래는 float를 쓰면 부모는 집나간 자식의 존재를 모름.
   - `overflow: hidden`을 쓰면 부모가 그 자식을 찾음.
2. 정석 : `clearfix`
   - `clear: left || right || both` 총 3가지 값을 가지고 있음.
   - `clear: left` float: left의 영향을 받지 않겠다.
   - `clear: right` float: right의 영향을 받지 않겠다.
   - `clear: both` 둘 다 영향을 받지 않겠다.
   - display가 block인 요소한테만 사용할 수 있음.
3. 가상요소를 만들어서 CSS로 레이아웃 해결
   - 가상요소는 각 요소당 2개씩 만들 수 있음.
   - `::before`, `::after`
```css
.pseudo::before {
  content: "";
  display: block;
}

가상요소를 만들려면 content가 필수인데 inline요소.
또 clear를 사용해주려면 block인 요소에만 작용되기 때문에 `display: block`을 해준다.
```

</br>

[목차로 이동🚗](#목차)
</br></br>
 
## [실습] Float 훈련1
```css
list-style-type: decimal;
리스트 스타일이 1.,2. 이런식으로 

ul {
  list-style-type: none;
  padding-left: 0;
}
ul 때문에 `padding-left: 40px`이 기본적으로 생김.
없애주어야함.

li 안에 a가 있을 때는 a 태그에 padding 을 주는게 좋음.
a에 padding을 주어야 li 영역 전체가 target 영역이 됨.
li에 padding을 주게 되면 고정된 a 영역, 글씨를 눌러야만 반응됨.
taget 영역 넓히기
```

</br>

[목차로 이동🚗](#목차)
</br></br>
 
## [실습] Float 훈련2
🎈Tip
1. `margin`, `padding` 쓸 때 `~top`이나 `~bottom` 중 하나, `~left`이나 `~right`중 하나만 골라 쓸 것. 그렇지 않으면 코드를 볼 때 중구난방으로 되어 헷갈림. 기준을 잡으면 유지보수할 때도 좋음.
2. `clearfix`를 자주 쓰게 되면
```css
.clearfix::after {
    content: "";
    display: block;
    clear: both;
}
``` 
을 미리 만들어 놓아서 html class clearfix 이용
3.  가로배치를 할 아이가 누구인지 생각할 것 -> 가로배치한 이후(float), 그 아이의 부모한테 clearfix를 해줄 것. 

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Position - Position 1 & 2
- 요소를 원하는 위치에 자유롭게 이동시키기 위해 사용하는 property
- 총 5가지 종류(static, relative, absolute, fixed, sticky)
  - But, sticky는 아직 지원하는 브라우저가 많이 없음.
- Position을 공부할 때 반드시 생각해야하는 것(2가지).
  1. 내가 어떤 종류의 Position을 사용하고 있는가?
  2. 내가 사용하는 Position은 무엇을 기준으로 요소를 위치시키는가?
- 기준이 각각의 Position Type에 따라서 많이 달라짐.
<br><br>

### static
- 모든 요소의 기본 Position 값

### relative
- 자신이 원래 있던 자리를 기준
- relative를 쓰면 float와 마찬가지로 부모를 떠나 붕 뜬다.
- 하지만 float와 반대로 레이아웃이 붕괴되거나, 다른 요소들에게 영향을 끼치진 않음. 

### absolute
- float를 사용했을 때의 현상과 동일한 것들이 많음.
  - 집 나간 내 새끼, 찾을 길 없네
  - 블록으로 신분 상승
  - 길막을 못해 슬픈 블록아!
  - ~~플로트, 나만 볼 수 있어요(feat.인라인)~~ (얘만 제외)
    - 천상천하 유아독존. 붕 떠서 사라짐
- 자신이 삼고싶은 기준점을 새로 정할 수 있음.
  - float는 자신을 감싸고 있는 부모에게 철저히 종속 되었음.
  - absolute는 자신을 감싸고 있는 여러 조상 중에서 자기가 기준으로 삼고 싶은 요소를 선택할 수 있음 => position이 static이 아닌 요소. 
  - 만약 부모가 static이면 부모 패스하고 할머니, 할아버지에게 감.
- position absolute를 사용할 때는 어떤 조상요소를 기준으로 움직일 것인지에 대한 기준점 설정이 반드시 필요함 -> 가장 만만하게 쓸 수 있는게 &nbsp; `position: relative`

### fixed
- absolute와 완전히 동일한 현상이 일어남.
  - 집 나간 내 새끼, 찾을 길 없네
  - 블록으로 신분 상승
  - 길막을 못해 슬픈 블록아!
- 차이점은 absolute와 달리 fixed는 자신의 기준점이 명확하게 정해져 있음 -> viewport 
- viewport 사이즈로 자신을 위치시키게 됨.
- viewport : 내가 보고 있는 브라우저 창의 전체 크기

### z-index
- position된 요소들이 수직 방향 되었을 때 위치를 알려줌.
- position에서 static을 제외한 모든 요소들은 다 수직방향으로 붕뜬다. 붕뜨면 z-index라는 레벨이 생김. 'z축으로 몇 번째 레벨에 위치시킬까?'라는 값을 설정해줄 때 사용. z-index 사용으로 살짝 덮어쓸 수 있음.

### image
- 사진 inline이다........근데 width랑 height가 먹힌다. 반전..（⊙ｏ⊙）... 이미지 태그만 그렇대! 그래도 `display: block`을 주는게 좋대!!

### `width: 100%;` & `height: auto;`
- `width: 100%;` : 자기 부모의 content box 길이에 100% 맞게 됨.
- `height: auto` : width 길이에 맞게 알맞은 비율로 해줌.
```css
.card {
  width: 400px;
}

.card-carousel img {
  width: 100%;
  height: auto;
}
이미지 사이즈 조절할 때 굉장히 많이 쓰는 조합
```
### transform
- position 태그로 위치를 이동시키긴 했으나 이동시킨 요소는 그 지점부터 시작이 됨. 그래서 내가 생각했던 위치가 아닐 수 도 있음.
그때 사용하는 태그가 transform.
- 변형하다. 어떤 요소의 모형을 변형시킬 때 사용.
- `transform: rotate()` : 요소를 내가 원하는 각도로 돌릴 수 있음.
- `transform: scale()` : 요소를 확대, 축소시킬 수 있음.
- `transform: translate(X, Y)` : X축, Y축으로 위치를 이동시킬 때 사용하는 함수.
- 자기 자신이 기준임

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Flexbox 1
- 정렬의 끝판왕
- 그동안 float 공부하느라 너무 수고많으셨고, 지금부터는 flex만 사용하면 되겠습니다...(쌤...（⊙ｏ⊙)
- 4가지만 생각하면 됨.


1. 나, 플렉스박스 쓸거임(단호)
```css
.flexbox {
  display: flex;
  /* flex | inline-flex */
- display: 박스의 타입을 정해주는 CSS property
- flex: block과 비슷한데 요소들을 쉽게 정렬할 수 있다는 차이가 있음. 
- 정렬 하고자하는 요소를 감싸는 부모한테 display: flex
}
```
2. 가로 정렬? 세로정렬?
```css
.flexbox {
  display: flex;
  flex-direction: row;
  /* row | row-reverse | column | column-reverse */
  /* 가로|  가로 반대  |  세로  | 세로 반대*/
- flex를 사용하면 우리 눈엔 안보이는 2개의 축이 생김(flex-direction에 따라 Main axis, 그의 수직으로 Cross axis)
- row-reverse, column-reverse는 main axis만 바뀌고 cross는 바뀌지 않음!
}
```
3. 무조건 한 줄 안에 다 정렬?
```css
.flexbox {
  display: flex;
  flex-direction: row;
  flex-wrap: nowrap;
  /* nowrap | wrap */
- nowrap: 기본값. 감싸지 않고(no warp) 자식의 사이즈를 줄여서라도 한줄로 정렬해버림
- wrap: 한 줄에 모두 정렬하기에 공간이 넉넉하지 않으면 여러 줄을 만들어버림(사이즈가 줄지 않음)
}

  ```
4. 씐나는 플레스박스 파티 타임

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Flexbox 2 (justify-content / align-items / align-content / order)
- Main axis 기준으로 정렬 : justify-content
```css
justify-content: center;
/* flex-start | flex-end | center | space-between | space-around*/

- 반면 float는 left | right만 가능했음. center, space-between, space-around 불가능.
```
- Cross axis 기준으로 정렬 : align-items | align-content
```css
align-items: center;
/* flex-start | flex-end | center */
- 하나의 flex 라인에 흐르는 Cross axis를 기준으로 정렬. 각각의 flex line이 기준. space-between | space-around는 불가능

align-content: center;
/* flex-start | flex-end | center | space-between | space-around*/
- 전체 흐름의 Cross axis

```
- 선 : align-items
- 후 : align-content 으로 작업하면 80% 된대

### order
- flexbox, order를 사용하면 mark up이 된 것과 상관 없이 마음대로 순서를 바꿀 수 있음.

### 기본값
- flex-direction: row;
- flex-wrap: nowrap;
- justify-content: flex-start;

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Media Query
- media query : 반응형 웹(Rsponsive Web)을 만들기 위해 반드시 필요한 CSS 언어
```css
@media screen and (min-width: 768px) {
}
- 내가 보고 있는 화면의 사이즈가 ~px 이상/이하일 때는 이런 스타일을 적용해줘!
- 바뀌는 부분만 넣어주면 됨.
```
- viewport meta : 반응형 웹(Rsponsive Web)을 만들기 위해 반드시 필요한 HTML 언어
```html
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=divice-width" />
    ...
  </head>
</html>
```
- media query를 활용해서 반응형 웹을 만들때 모바일 버전으로 먼저 작성하는게 좋음! 확장 공사를 해나가는게 작업을 할때 편함.
- 개발자 모드에서 iPhone 5/SE로 해서 하면 좋음(작아서 웬만하면 안깨짐)

### viewport height & viewport width
- `height: 100vh;` & `width: 100vw;`

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Typography 1 & 2
- 타이포그래피(typography)
  - 활판에 의한 인쇄술
  - 디자인에 있어 활자의 서체나 글자 배치 등의 구성 및 표현<br>
  => 텍스트를 예쁘게 디자인한다.
- 텍스트를 어떻게 배치하느냐에 따라 가독성이 달라짐. 사용자 경험도 달라짐.
</br></br>

### 1. font-size : 글자 크기
- 단위 : px(절대 단위), em(상대 단위), rem(상대 단위)
- font-size를 사용할 때는 px을 많이 쓴다.
  - em = equal to capital M(대문자 M사이즈를 기준으로 한다)
    - 실제로 적용된 폰트 사이즈를 1em으로 본다.
    - 불안정하기에 잘 쓰지 않는다.
  - rem = root em
    - root = html 자체를 의미
    - html에 적용된 폰트사이즈를 1em으로 본다


### 2. line-height : 줄 간격
- 단위 : px(절대 단위), em(상대 단위), rem(상대 단위)
- line-height를 사용할 때는 em을 많이 사용한다.
  - em : 적용된 폰트 사이즈에 비례해서 line-height를 적용
  - <u>line-height는 글이 가운데 배치된다.</u>
```css
.text {
  font-size: 16px;
  line-height: 1.5;
}
- px, rem은 단위를 명시해 주어야하지만 em은 단위를 생략하는게 관례
```

### 3. letter-spacing : 글자와 글자사이의 간격. 글자간
- 단위 : px(절대 단위), em(상대 단위)
  - em을 더 많이 씀.
  - 적용된 폰트 사이즈에 비례해서 글자간을 조정.
```css
.text {
  font-size: 16px;
  line-height: 1.5;
  letter-spacing: -0.3em;
}
- line-height와 반대로 반드시 명시해야함.
```

### 4. font-family : 폰트. 서체
- 참조 : serif(우리나라 명조체와 비슷), sans-serif(우리나라 돋음체와 비슷)
```css
.text {
  font-size: 16px;
  line-height: 1.5;
  letter-spacing: -0.3em;
  font-family: "Poppins", sans-serif;
}
- font-family : 폰트를 Poppins를 적용해줘! 없으면 sans-serif를 적용해줘. 없는 경우 대비
```

### 5. font-weight : 굵기
```css
.text {
  font-size: 16px;
  line-height: 1.5;
  letter-spacing: -0.3em;
  font-family: "Poppins", sans-serif;
  font-weight: 400;
  /* 100 | 200 | 300 | 400 | 500 | 600 | 700 | 800 | 900 */
}
- 일반 사이즈는 400,
- 굵은 사이즈는 700을 사용하는게 관례
```
### 6. color : 글자 색
- color : hex, rgb, rgba
  - hex : 문자로 사용 ex) #0066ff
  - rgb : ex) rgb(0, 102, 255)
  - rgba : a 알파, 투명도가 더해짐, 1이면 불투명, 0이면 투명 ex) rgba(0, 102, 255, 1)

### 7. text-align : 텍스트를 정렬
- text-aline : left | right | center

### 8. text-indent : 들여쓰기
- px
- `-` 값도 넣을 수 있다!

### 9. text-transform : 텍스트 변형
- text-transform : none | capitalize | uppercase | lowercase
- 한글 / 일본어 / 중국어는 안됨.
- 알파벳 베이스로 된 문자들만 가능
```html
none : Kim bug
capitalize : Kim Bug
uppercase : KIM BUG
lowercase : kim bug
```

### 10. text-decoration
- text-decoration : none | underline | line-through | overline

### 11. font-style
- font-style : normal | italic | oblique
- italic, oblique 비슷함.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Webfont
- 내가 지정한 font가 사용자 컴퓨터에 없다면 기본 서체로 돌아감.
- webfont를 쓰는 2가지 방법 : 갖다 쓴다 | 직접 제공한다
  - Google Fonts
- `body`에 `font-family`를 지정해놓으면 일일이 지정 안해도 됨.
- font가 제대로 적용이 됐는지 확인하기 위해서는 개발자도구로 Rendered Fonts 확인할 수 있다.
- 각각의 브라우저마다 지원하는 폰트의 확장자가 다름
  - https://css-tricks.com/snippets/css/using-font-face/<br>
    여기에 접속해서 아래 것 복사 붙여놓기. 외울 필요 없음.
```css
font.css : font만 따로 작성한 css를 따로 만들고
@font-face {
  font-family: 'MyWebFont';
  src: url('webfont.eot'); /* IE9 Compat Modes */
  src: url('webfont.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */
       url('webfont.woff2') format('woff2'), /* Super Modern Browsers */
       url('webfont.woff') format('woff'), /* Pretty Modern Browsers */
       url('webfont.ttf')  format('truetype'), /* Safari, Android, iOS */
       url('webfont.svg#svgFontName') format('svg'); /* Legacy iOS */
}

css에서 import 할 수 있다.
@import url('./fonts.css')
```
- 폰트가 제대로 따라오고 있는지 확인하기 위해서는 개발자도구 -> network -> font -> 새로고침
- 폰트 라이브러리를 만들때 따로 `font.css`를 만들고 각각의 크기나 굵기나 색상에 따라 지정 


```css
참조!!
.container {
  width: 100%;
  max-width: 736px;
  /* 최대 736px까지만 키우고 그 다음엔 키우지 말아라 */
  margin: 0 auto;
  /* 자동으로 생기는 margin은 왼쪽 오른쪽 나눠가짐. 가운데 정렬 */
  padding: 48px;
}
```

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Background

### background-color
- 배경의 색상을 정해주고 싶을 때(hex, rgb, rgba)

### background-image
- 배경으로 이미지를 넣어주고 싶을 때
- 이미지가 있는 경로를 말해줘야함 url()
  - unsplash : 무료 이미지

### background-repeat
- 이미지 반복
- repeat(기본값) | no-repeat

### background-size
- 이미지의 사이즈 설정
- contain | cover | custom
- contain : 이미지의 모든 면이 다 들어감
- cover :  빈 공간을 남기지 않고 꽉 채움. 짤림.
- custom : 자체적으로 사이즈 정하기
- center, %, px 다 가능

### background-position
- backgound-image를 어떻게 위치 시킬 것인가? x축, y축
- center, %, px 다 가능

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] 실습 Background 훈련 part 1
- `img`말고 `background-image`를 쓰는 이유?
  - 어떤 사진을 받게 될지 모를때 사용. 이미지 각각 설정하기 보다는 그냥 `background-image`로 받아서 설정하는게 훨씬 간편. 삽질을 줄일 수 있다..
  - But `background-image`보다 `img`가 검색최적화에는 더 좋음!
- `display: none`을 쓰면 css는 얘를 아예 없는 존재로 만들어버림.
```css
.sr-only {
  position: absolute; 
  /* 집을 나간 아이로 만들어버림 */
  z-index: -100; 
  /* 저 밑으로 사라져랏 = 눈에 안보이게 만듬 */
  width: 1px;
  height: 1px;
  /* 더 확실하게 처리. 만약 width와 height가 0이면 스크린 리더가 읽어주지 않음. */
  overflow: hidden;
  /* 얘보다 컨텐츠가 넓으면 안보이게 가려줄 수 있음. 그게 overflow: hidden. 1px에서 벗어나는 애들은 다 짤라버림.*/
    opacity: 0;
  /* 투명도 0으로 !! */

  이렇게 해야 스크린리더도 얘네를 인지함. 읽어줌. 우리 눈엔 사라져있음.
}
```
- ·은 정보로 의미가 없음. 고로 마크업을 더럽히지 않겠다는 의미로 css에서 처리.

</br>

[목차로 이동🚗](#목차)
</br></br>

## [CSS 기초] Q & A
1. active란 상태는 a, button, input, textarea 등과 같이 인터렉션 요소가 있는 요소에게만 적용되는 가상클래스입니다! 그래서 div나 li, span과 같은 친구들에게는 active 상태가 적용이 안 될 거예요!
   -  어째 li는 안먹고 a는 먹더라니..(⊙o⊙)

2. position과 float 중 어떤 것을 사용할 지 판단할 때 
   - 뭔가 특정 장소에 고정시켜 놓아야 한다 = position
   - 두 요소를 옆으로 배치시켜야 한다 = float

3. input과 button padding 처리시 좌우 padding만 설정하는 이유?
   - height를 설정하면 텍스트가 자동으로 가운데 배치가 된다.
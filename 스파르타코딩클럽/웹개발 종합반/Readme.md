# 웹개발 종합반 항해 2기
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
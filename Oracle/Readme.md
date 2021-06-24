# Oracle
> 윤재성의 Oracle SQL Database 11g PL/SQL Developer <br>

---
>> <b><u>✨Check✨</u></b><br>
>> 1. `NVL(COMM,0)` : 커미션에 null값이 들어가 있으면 0으로 바꿔준다.
>> 2. `SAL+NVL(COMM,0)` : 급여 + 커미션, NVL 사용
>> 3. CONCAT 연산자 : 문자열을 합치는 연산자 `문자열 || 컬럼 || 문자열 || 컬럼`
>> 4. `WHERE HIREDATE >= '1982/01/01';` 날짜 문자열임!
>> 5. 입사년도가 1981년인 사원 중에 급여가 1500이상인 사원의 사원번호, 이름, 급여, 입사일을 가져온다. (2가지 방법!)
>> 6. 급여가 2000보다 크거나 1000보다 작은 사원의 사원번호, 이름, 급여를 가져온다.
>> 7. 직무가 CLERK, SALESMAN, ANALYST인 사원의 사원번호, 이름, 직무를 가져온다.(IN사용)
>> 8. 이름이 F로 시작하는 사원의 이름과 사원 번호를 가져온다.
>> 9. - 특정 테이블의 함수를 가져오는게 아니라서 굳이 테이블 이름을 작성 X. 하지만 데이터베이스에서 FROM을 반드시 적어야함. 그럴때 사용하는게 `FROM DUAL;`
>> 10. 급여가 2천 이하인 사원들의 급여를 20%씩 인상한다. 단 10의 자리를 기준으로 반올림한다.
>> 11. 사원들의 이름을 첫 글자만 대문자, 나머지는 소문자로
>> 12. 문자열 잘라내기(SUBSTR)
>> 13. 문자열 찾기(INSTR)
>> 14. 문자열 변경(REPLACE)
>> 15. 공백 제거(TRIM)
>> 16. 특정 문자열로 채우기(LPAD, RPAD)
---

<br><br><br>
## 목차

<!-- TOC -->
- [Oracle](#oracle) 
  - [목차](#목차)
  - [[6강] DML - SELECT 기본](#6강-dml---select-기본)
  - [[7강] DML - 연산자 사용하기](#7강-dml---연산자-사용하기)
    - [CONCAT 연산자](#concat-연산자)
    - [DISTICT](#distict)
    - [조건절](#조건절)
  - [[9강] 논리 연산자 사용하기](#9강-논리-연산자-사용하기)
---

## [6강] DML - SELECT 기본
- SELECT가 가장 중요하다.

```sql
SELECT *
FROM EMP;

SELECT ENAME, SAL, SAL+1000, SAL-200, SAL*2, SAL/2
FROM EMP;

SELECT SAL, COMM, SAL+COMM
FROM EMP; -- NULL은 아무런 의마가 없는 값. 오라클에서는 무한대라는 의미. 보통 지금 당장 넣을 값이 없을때 씀

SELECT SAL, NVL(COMM, 0), SAL+NVL(COMM, 0)
FROM EMP; -- NVL(COMM, 0)이라는 건 COMM값에 NULL값이 들어가있으면 NULL값을 넣겠다라는 의미
```

## [7강] DML - 연산자 사용하기
### CONCAT 연산자
- 문자열을 합치는 연산자
- `문자열 || 컬럼 || 문자열 || 컬럼`

```sql
-- 사원들의 이름과 직무를 다음 양식으로 가져온다 : 000 사원의 담당 직무는 xxx 입니다.
SELECT ENAME || '사원의 담당 직무는 '|| JOB || '입니다.'
FROM EMP;
```

### DISTICT
- SELECT문을 통해 가져온 모든 로우 중에서 중복된 로우를 제거
- `SELECT DISTICT 컬럼명 FROM 테이블 명`


```SQL
-- 사원이 근무하고 있는 근무 부서의 번호를 가져온다.
SELECT DISTINCT DEPTNO
FROM EMP;
```

### 조건절
- 조건에 맞는 로우에 대해서만 작업하고 싶을 때 사용
- `SELECT 컬럼명 FROM 테이블 명 WHERE 조건절`
- SELECT ~ FROM으로 모든 로우를 가져오고 각 로우를 조건절과 비교하여 참 로우만 남겨주고 거짓 로우를 제거한다.
- 비교연산자 <,>,<=,>=,=, 다를 때 : <>,!=,^=
```SQL
-- 근무 부서가 10번인 사원들의 사원번호, 이름, 근무 부서를 가져온다.
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 10;
-- 근무 부서 번호가 10번이 아닌 사원들의 사원번호, 이름, 근무부서 번호를 가져온다.
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO != 10;
-- 급여가 1500이상인 사원들의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL >= 1500;
-- 이름이 SCOTT 사원의 사원번호, 이름, 직무, 급여를 가져온다.
SELECT EMPNO, ENAME, JOB, SAL
FROM EMP
WHERE ENAME = 'SCOTT';
-- 직무가 SALESMAN 인 사원의 사원번호, 이름, 직무를 가져온다.
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE JOB = 'SALESMAN';
-- 직무가 CLERK이 아닌 사원의 사원번호, 이름, 직무를 가져온다.
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE JOB != 'CLERK';
-- 1982년 1월 1일 이후 입사한 사원의 사원번호, 이름, 입사일을 가져온다.
SELECT EMPNO, ENAME, HIREDATE
FROM EMP
WHERE HIREDATE >= '1982/01/01'; --날짜... 문자열이구나...
```

## [9강] 논리 연산자 사용하기
- 논리 연산자를 사용하면 여러 조건식을 묶어 하나의 조건식으로 만들 수 있다. 
  - AND : 좌우 조건식이 모두 참일 경우 참
  - OR : 좌우 조건식이 모두 거짓일 경우 거짓
  - NOT : 조건식의 결과를 부정
  - BETWEEN AND : 범위조건
  - IN : 항목 조건

```SQL
-- 10번 부서에서 근무하고 있는 직무가 MANAGER인 사원의 사원번호, 이름, 근무부서, 직무를 가져온다.
SELECT EMPNO, ENAME, DEPTNO, JOB
FROM EMP
WHERE DEPTNO = 10
AND JOB = 'MANAGER';
-- 입사년도가 1981년인 사원 중에 급여가 1500이상인 사원의 사원번호, 이름, 급여, 입사일을 가져온다.
SELECT EMPNO, ENAME, SAL, HIREDATE
FROM EMP
WHERE HIREDATE >= '1981/01/01' AND HIREDATE <= '1981/12/31' AND SAL >= 1500;

SELECT EMPNO, ENAME, SAL, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '1981/01/01' AND '1981/12/31' AND SAL >= 1500;
-- 20번 부서에 근무하고 있는 사원 중에 급여가 1500이상인 사원의 사원번호, 이름, 부서번호, 급여를 가져온다.
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE DEPTNO = 20 AND SAL >= 1500;
-- 직속상관 사원 번호가 7698번인 사원 중에 직무가 CLERK 인 사원의 사원번호, 이름, 직속상관번호, 직무를 가져온다.
SELECT EMPNO, ENAME, MGR, JOB
FROM EMP
WHERE MGR = 7698 AND JOB = 'CLERK';
-- 급여가 2000보다 크거나 1000보다 작은 사원의 사원번호, 이름, 급여를 가져온다
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > 2000 OR SAL < 1000; -- 아직 OR은 적응이 안된건가 ¯\(°_o)/¯
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE NOT(SAL >= 1000 AND SAL <= 2000);

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE NOT(SAL BETWEEN 1000 AND 2000);
-- 부서번호가 20이거나 30인 사원의 사원번호, 이름, 부서번호를 가져온다.
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = '20' OR DEPTNO = '30';
-- 직무가 CLERK, SALESMAN, ANALYST인 사원의 사원번호, 이름, 직무를 가져온다.
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE JOB = 'CLERK' OR JOB = 'SALESMAN' OR JOB = 'ALAYST';

SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE JOB IN ('CLERK', 'SALESMAN', 'ALAYST'); -- 특정 컬럼의 값이 ~이거나 ~이거나 ~이면 IN을 써도 된다.
```

## [10강] Like 연산자
- 문자열 비교하기
- 조건문에서 문자열 컬럼도 =과 <>로 비교 가능
- 만약 문자열 컬럼에 저장되어 있는 값이 특정 문자열을 포함하고 있는지 파악하고 싶을 때 LIKE연산자를 사용한다.
    - select 컬럼명 from 테이블명
    - where 컬럼명 like '와일드카드'
      - 와일드카드
      - _: 글자 하나를 의미
      - %: 글자 0개 이상을 의미
```SQL
-- 이름이 F로 시작하는 사원의 이름과 사원 번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE ENAME LIKE 'F%'; --F 문자열이니까 ''를 넣어줘야지!!
-- 이름이 S로 끝나는 사원의 이름과 사원 번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE ENAME LIKE '%S';
-- 이름에 A가 포함되어 있는 사원의 이름과 사원 번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE ENAME LIKE '%A%';
-- 이름의 두번째 글자가 A인 사원의 이름, 사원 번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE ENAME LIKE '_A%';
-- 이름이 4글자인 사원의 사원 이름, 사원 번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE ENAME LIKE '____';
```

## [11강] NULL
- NULL은 정해져 있지 않은 값 혹은 무한대의 의미를 갖는 값이다.
- =이나 <>를 통해 컬럼의 값이 NULL인지 연산할 수 없다.
    - NULL은 비교 연산자를 사용할 수 없다.
    - WHERE A IS NULL 과 WHERE A = NULL은 다른 결과가 나온다.
- IS NULL, IS NOT NULL로 NULL 비교가 가능하다.

```SQL
-- 사원 중에 커미션을 받지 않는 사원의 사원번호, 이름, 커미션을 가져온다.
SELECT EMPNO, ENAME, COMM
FROM EMP
WHERE COMM IS NULL; -- COM = NULL 이라고 하면 값을 못 가져옴! NULL은 무한대를 의미하니까!
-- 사원 중에 커미션을 받는 사원의 사원번호, 이름, 커미션을 가져온다.
SELECT EMPNO, ENAME, COMM
FROM EMP
WHERE COMM IS NOT NULL;
-- 회사 대표(직속상관이 없는 사람)의 이름과 사원번호를 가져온다.
SELECT ENAME, EMPNO
FROM EMP
WHERE MGR IS NULL;
```

## [12강] 정렬
- SELECT 문을 통해 얻어온 결과를 특정컬럼을 기준으로 오름차순 혹은 내림차순으로 정렬할 수 있다.
- 숫자, 문자열, 날짜 등 모든 타입의 데이터를 정렬할 수 있다.
  - SELECT 컬럼명 FROM 테이블명
  - WHERE 조건
  - ORDER BY 컬럼명[ASC|DESC]
    - ASC : 오름차순, 생략가능
    - DESC : 내림차순
```SQL
-- 사원의 사원번호, 이름, 급여를 가져온다. 급여를 기준으로 오름차순 정렬한다.
SELECT EMPNO, ENAME, SAL
FROM EMP
ORDER BY SAL;

SELECT EMPNO, ENAME, SAL
FROM EMP
ORDER BY SAL ASC;
-- 사원의 사원번호, 이름, 급여를 가져온다. 사원번호를 기준으로 내림차순 정렬을 한다.
SELECT EMPNO, ENAME, SAL
FROM EMP
ORDER BY EMPNO DESC;
-- 사원의 사원번호, 이름을 가져온다, 사원의 이름을 기준으로 오름차순 정렬을 한다.
SELECT EMPNO, ENAME
FROM EMP
ORDER BY ENAME; -- 문자열도 정렬 가능하다.
-- 사원의 사원번호, 이름, 입사일을 가져온다. 입사일을 기준으로 내림차순 정렬을 한다.
SELECT EMPNO, ENAME, HIREDATE
FROM EMP
ORDER BY HIREDATE DESC;
-- 직무가 SALESMAN인 사원의 사원이름, 사원번호, 급여를 가져온다. 급여를 기준으로 오름차순 정렬을 한다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE JOB = 'SALESMAN'
ORDER BY SAL;
-- 1981년에 입사한 사원들의 사원번호, 사원이름, 입사일을 가져온다. 사원번호를 기준으로 내림차순 정렬을 한다.
SELECT EMPNO, ENAME, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '1981/01/01' AND '1981/12/31'
ORDER BY EMPNO DESC;
-- 사원의 이름, 급여, 커미션을 가져온다. 커미션을 기준으로 오름차순 정렬을 한다.
SELECT ENAME, SAL, COMM
FROM EMP
ORDER BY COMM ASC; --NULL이 무한대 의미라서
-- 사원의 이름, 급여, 커미션을 가져온다. 커미션을 기준으로 내림차순 정렬을 한다.
SELECT ENAME, SAL, COMM
FROM EMP
ORDER BY COMM DESC;
-- 사원의 이름, 사원번호, 급여를 가져온다. 급여를 기준으로 내림차순 정렬, 이름을 기준으로 오름차순 정렬
SELECT ENAME, EMPNO, SAL
FROM EMP
ORDER BY SAL DESC, ENAME;
```
## [13강] 숫자함수
- 컬럼에 저장되어 있는 숫자 값에 대해 처리를 하여 값을 가져올 수 있는 함수들을 의미한다.
- 특정 테이블의 함수를 가져오는게 아니라서 굳이 테이블 이름을 작성 X. 하지만 데이터베이스에서 FROM을 반드시 적어야함. 그럴때 사용하는게 `FROM DUAL;`
```SQL
-- 절대값 구하기
SELECT -10, ABS(-10)
FROM DUAL;
-- 전직원의 급여를 2000 삭감하고 삭감한 급여액의 절대값을 구한다.
SELECT SAL, SAL-2000, ABS(SAL-2000)
FROM EMP;

-- 소수점 이하 버리기
SELECT 12.3456, FLOOR(12.3456)
FROM DUAL;
-- 급여가 1500 이상인 사원의 급여를 15% 삭감한다. 단 소수점 이하는 버린다.
SELECT SAL, SAL*0.85, FLOOR(SAL*0.85)
FROM EMP
WHERE SAL >= 1500;

-- 반올림
SELECT 12.3456, ROUND(12.3456)
FROM DUAL;
SELECT 12.8888, ROUND(12.8888)
FROM DUAL;
SELECT 888.888, ROUND(888,888), ROUND(888.8888, 2), ROUND(888.888, -2)
FROM DUAL;
-- 급여가 2천 이하인 사원들의 급여를 20%씩 인상한다. 단 10의 자리를 기준으로 반올림한다.
SELECT SAL, SAL * 1.2, ROUND(SAL * 1.2, -2)
FROM EMP
WHERE SAL <= 2000;
```

## [14강] 문자열 함수
- 컬럼에 저장되어 있는 문자열에 대해 처리를 하여 값을 가져올 수 있는 함수들을 의미한다.

```SQL
-- 대문자 -> 소문자
SELECT 'ABcdEF', LOWER('ABcdEF')
FROM DUAL;
-- 사원들의 이름을 소문자로 가져온다.
SELECT ENAME, LOWER(ENAME)
FROM EMP;

-- 소문자 -> 대문자
SELECT 'ABcdEF', UPPER('ABcdEF')
FROM DUAL;
-- 사원들의 이름을 가져온다. 대문자 -> 소문자 -> 대문자
SELECT ENAME, LOWER(ENAME), UPPER(LOWER(ENAME))
FROM EMP;

-- 첫 글자만 대문자, 나머지는 소문자로
SELECT 'aBCDEF', INITCAP('aBCDEF')
FROM DUAL;
-- 사원들의 이름을 첫 글자만 대문자, 나머지는 소문자로
SELECT ENAME, INITCAP(ENAME)
FROM EMP;

--문자열 연결
SELECT CONCAT('ㅋㅋㅋㅋ', CONCAT('ABC', 'DEF'))
FROM DUAL;
-- 사원들의 이름과 직무를 다음과 같이 가져온다.
-- 사원의 이름은 ㅇㅇㅇ이고, 직무는 ㅇㅇㅇ입니다.
SELECT CONCAT(CONCAT(CONCAT(CONCAT('사원의 이름은 ', ENAME),'이고, 직무는 '), JOB), '입니다.')
FROM EMP;

SELECT '사원의 이름은 ' || ENAME || '이고, 직무는 ' || JOB || '입니다.'
FROM EMP;

-- 문자열의 길이
SELECT LENGTH('ABCD'), -- 문자열의 갯수
       LENGTHB('ABCD'), --문자열의 바이트 수
       LENGTH('안녕하세요'),
       LENGTHB('안녕하세요') -- 한글은 1글자를 2바이트로 씀
FROM DUAL;

-- 문자열 잘라내기
SELECT SUBSTR('ABCE',3,1), SUBSTRB('ABCD', 3), -- 오라클은 1부터 시작. 3번째부터 1자리 수를 가져오겠다.
       SUBSTR('안녕하세요', 3),
       SUBSTRB('안녕하세요', 3),
       SUBSTR('동해물과 백두산이',3,4) --띄어쓰기 포함 됨.
FROM DUAL;

-- 문자열 찾기
SELECT INSTR('ABCDABCDABCD', 'BC'), 
       INSTR('ABCDABCDABCD', 'BC', 3), -- 3번째 자리부터 BC 찾기
       INSTR('ABCDABCDABCD', 'BC', 3, 2) -- 3번째 자리부터 BC를 찾는데 2번째 BC 찾기
FROM DUAL;
SELECT INSTR('ABCEDFG', 'AAA') FROM DUAL; -- 없는 것을 찾으면 0이 나온다.
-- 사원의 이름 중에 A라는 글자가 두번째 이후에 나타나는 사원의 이름을 가져온다.
SELECT ENAME
FROM EMP
WHERE INSTR(ENAME, 'A') > 1; -- 2번째 글자 이후에 나옴
SELECT ENAME 
FROM EMP
WHERE ENAME LIKE '_A%'; -- 2번째 글자에 나옴. 고로 X

-- 특정 문자열로 채우기
SELECT '문자열', LPAD('문자열', 20) FROM DUAL; -- 20칸 만큼의 공간을 차지한 다음에 우측정렬해서 문자열이 출력됨.
SELECT '문자열', RPAD('문자열', 20) FROM DUAL; -- 20칸 만큼의 공간을 차지한 다음에 좌측정렬해서 문자열이 출력됨.
SELECT '문자열', LPAD('문자열', 20), RPAD('문자열', 20, '_') FROM DUAL; -- 20칸 만큼 _을 차지한 다음에 좌측정렬해서 문자열이 출력됨.

-- 공백 제거
SELECT '               문자열          ',
LTRIM('               문자열          '),
RTRIM('               문자열          '),
TRIM('               문자열          ')
FROM DUAL;

-- 문자열 변경
SELECT 'ABCDEFG', REPLACE('ABCTDTG', 'TDTG', 'DEFG')
FROM DUAL;
```

## [15강] 날짜 함수
- 오라클은 날짜 데이터를 제어할 수 있는 함수들을 제공 
  - sysdate : 현재 날짜와 시간을 반환한다.
  - months_between : 두 날짜간의 개월 수를 구한다.
  - add_months : 주어진 개월 수 만큼 더한다.
  - next_day : 돌아오는 지정된 요일의 날짜를 반환한다.
  - last_day :  지정된 달에 마지막 날을 반환한다.
  - round : 지정된 기준으로 반올림한다.
  - trunc : 지정된 기준으로 버린다.
```SQL
-- 현재 날짜 구하기
SELECT SYSDATE
FROM DUAL;

SELECT SYSDATE - 10000
FROM DUAL;
-- 각 사원이 입사한 날짜로부터 1000일 후가 되는 날짜
SELECT ENAME, HIREDATE, HIREDATE +1000
FROM EMP;
-- 직무가 SALESMAN인 사원의 입사일 100일전 날짜를 가져온다.
SELECT ENAME, JOB, HIREDATE - 100
FROM EMP
WHERE JOB = 'SALESMAN';
-- 전 사원의 근무 일을 가져온다.
SELECT TRUNC(SYSDATE- HIREDATE)
FROM EMP;
-- 반올림
SELECT SYSDATE,
       ROUND(SYSDATE, 'CC') AS  "년도두자리",
       ROUND(SYSDATE, 'YYYY') AS "월기준", -- 월을 기준으로 년도를 올리는지 내리는지
       ROUND(SYSDATE, 'DDD') AS "시기준",
       ROUND(SYSDATE, 'HH') AS "분기준",
       ROUND(SYSDATE, 'MM') AS "일기준",
       ROUND(SYSDATE, 'DAY') AS "주기준",
       ROUND(SYSDATE, 'MI') AS "초기준"
FROM EMP;
-- 각 사원의 입사일을 월 기준으로 반올림한다.
SELECT ENAME, HIREDATE, ROUND(HIREDATE, 'YYYY') AS "월기준 반올림"
FROM EMP;
-- 버림
SELECT SYSDATE, TRUNC(SYSDATE, 'CC') AS "년도두자리",
       TRUNC(SYSDATE, 'YYYY') AS "월기준", -- 월을 기준으로 년도를 올리는지 내리는지
       TRUNC(SYSDATE, 'DDD') AS "시기준",
       TRUNC(SYSDATE, 'HH') AS "분기준",
       TRUNC(SYSDATE, 'MM') AS "일기준",
       TRUNC(SYSDATE, 'DAY') AS "주기준",
       TRUNC(SYSDATE, 'MI') AS "초기준"
FROM EMP;
-- 2020년에 입사한 사원들의 사원번호, 사원이름, 급여, 입사일을 가져온다.
SELECT EMPNO, ENAME, SAL, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '2020/01/01' AND '2020/12/31';

SELECT EMPNO, ENAME, SAL, HIREDATE
FROM EMP
WHERE TRUNC(HIREDATE, 'YYYY') = '20/01/01';

-- 두 날짜 사이의 일수를 구한다.
SELECT 

-- 16분 부터 다시 듣기!!
```
## [16강] DECODE, CASE
### DECODE
- 값에 따라 반환값이 결정되는 구문이다.
```SQL
decode(컬럼명,
        값1, 반환값1,
        값2, 반환값2,
        값3, 반환값3)
```
```SQL
각 사원의 부서 이름을 가져온다.
  10 : 인사과, 20 : 개발부, 30 : 경원지원팀,   
  40 : 생산부


직급에 따라 인상된 급여액을 가져온다.
   CLERK : 10%
   SALESMAN : 15%
   PRESIDENT : 200%
   MANAGER : 5%
   ANAYST : 20%
```
### CASE
- 조건에 따라 반환값이 결정되는 구문이다
```SQL
case when 조건식1 then 반환값1
     when 조건식2 then 반환값2
end
```
- 급여액 별 등급을 가져온다.
   1000 미만 : C등급
   1000 이상 2000미만 : B등급
   2000 이상 : A등급
- 직원들의 급여를 다음과 같이 인상한다.
  1000 이하 : 100%
  1000 초과 2000미만 : 50%
  2000 이상 : 200%
```SQL
/*
각 사원의 부서 이름을 가져온다.
  10 : 인사과, 20 : 개발부, 30 : 경원지원팀,   
  40 : 생산부
*/
SELECT EMPNO, ENAME, 
       DECODE(DEPTNO, 10, '인사과',
                      20, '개발부',
                      30, '경영지원팀',
                      40, '생산부')
FROM EMP;
/*
직급에 따라 인상된 급여액을 가져온다.
   CLERK : 10%
   SALESMAN : 15%
   PRESIDENT : 200%
   MANAGER : 5%
   ANAYST : 20%
*/
SELECT EMPNO, ENAME, JOB,
       DECODE(JOB, 'CLERK', SAL*1.1, 
                   'SALESEMAN', SAL*1.15,
                   'PRESIDENT', SAL*2,
                   'MANAGER', SAL*1.05,
                   'ANAYST', SAL*1.2)
FROM EMP;

/*
- 급여액 별 등급을 가져온다.
   1000 미만 : C등급
   1000 이상 2000미만 : B등급
   2000 이상 : A등급
*/
SELECT EMPNO, ENAME,
       CASE WHEN SAL < 1000 THEN 'C등급'
            WHEN SAL > 1000 AND SAL < 2000 THEN 'B등급'
            WHEN SAL > 2000 THEN 'A등급'
       END
FROM EMP; --쉼표는 빼야한다!!!
/*
- 직원들의 급여를 다음과 같이 인상한다.
  1000 이하 : 100%
  1000 초과 2000미만 : 50%
  2000 이상 : 200%
*/
SELECT EMPNO, ENAME,
       CASE WHEN SAL <= 1000 THEN SAL*2
            WHEN SAL > 1000 AND SAL < 2000 THEN SAL/2
            WHEN SAL >= 2000 THEN SAL*3
        END
FROM EMP;
```
- DECODE를 사용하면 값에 따라 반환 값을 결정
- CASE를 사용하면 조건에 따라 반환 값을 결정

## [17강] 그룹함수
- select 문을 통해 가져올 결과를 그룹으로 묶고 그룹 내에서 지정된 컬럼의 총합, 평균 등을 구할 수 있는 함수
    - sum : 총합
    - avg : 평균
    - count : 로우의 수
    - max : 최대 값
    - min : 최소 값
```SQL
```
- 4분부터 들으면 됨.
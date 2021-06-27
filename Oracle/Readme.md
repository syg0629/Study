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
>> 17. WHERE 절 이어질때 AND 까먹지 마라.......(╯°□°）╯
>> 18. 서브쿼리할때 조인을 너무 남발하는 듯 ㅠㅠ
>> 19. KING을 직속상관으로 가지고 있는 사원들이 근무하고 있는 근무 부서명, 지역을 가지고 온다.

---

<br><br>
## 목차

<!-- TOC -->
  - [목차](#목차)
  - [[6강] DML - SELECT 기본](#6강-dml---select-기본)
  - [[7강] DML - 연산자 사용하기](#7강-dml---연산자-사용하기)
    - [CONCAT 연산자](#concat-연산자)
    - [DISTICT](#distict)
    - [조건절](#조건절)
  - [[9강] 논리 연산자 사용하기](#9강-논리-연산자-사용하기)
  - [[10강] Like 연산자](#10강-like-연산자)
  - [[11강] NULL](#11강-null)
  - [[12강] 정렬](#12강-정렬)
  - [[13강] 숫자함수](#13강-숫자함수)
  - [[14강] 문자열 함수](#14강-문자열-함수)
  - [[15강] 날짜 함수](#15강-날짜-함수)
  - [[16강] DECODE, CASE](#16강-decode-case)
      - [DECODE](#decode)
      - [CASE](#case)
  - [[17강] 그룹함수](#17강-그룹함수)
  - [[18강] Group By](#18강-group-by)
  - [[19강] Having](#19강-having)
  - [[20강] 조인(join)](#20강-조인join)
  - [[21강] Self Join, Outer Join](#21강-self-join-outer-join)
      - [SELF JOIN](#self-join)
      - [OUTER JOIN](#outer-join)
  - [[22강] 서브쿼리](#22강-서브쿼리)
  - [[23강] 결과가 하나 이상인 서브쿼리](#23강-결과가-하나-이상인-서브쿼리)
  - [[24강] SET](#24강-set)
<br><br>

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
SELECT SYSDATE - HIREDATE
FROM EMP;
-- 모든 사원이 근무한 개월 수를 구한다.
SELECT TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE))
FROM EMP;
-- 100일 후 / 100개월 후(개월 수 더하기)
SELECT SYSDATE + 100, ADD_MONTHS(SYSDATE,100) 
FROM DUAL;
--각 사원들의 입사일 후 100개월 되는 날짜를 구한다.
SELECT ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 100)
FROM EMP;
-- 지정된 날짜를 기준으로 지정된 요일이 몇일인지...
SELECT SYSDATE, NEXT_DAY(SYSDATE, '월요일')
FROM DUAL;
-- 지정된 날짜의 월의 마지막 날짜를 구한다.
SELECT SYSDATE, LAST_DAY(SYSDATE)
FROM DUAL;
-- TO CHAR : 날짜나 숫자함수를 문자로. 오라클 데이터베이스에서 프로그램으로 날짜 데이터를 가져올 때 주로 사용
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS AM')
FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY년 MM월 HH시 MI분 SS초 AM') --> 오류남. 날짜 형식에는 한글이 들어갈 수 없음.
FROM DUAL;
-- TO_DATE : 프로그램에서 얻어진 날짜 값을 오라클에 저장
SELECT TO_DATE('2021-06-24 05:49:20 오전', 'YYYY-MM-DD HH:MI:SS AM')
FROM DUAL;
-- 사원들의 입사일을 다음과 같은 양식으로 가져온다.
-- 1900-10-10
SELECT ENAME, HIREDATE, TO_CHAR(HIREDATE, 'YYYY-MM-DD')
FROM EMP;
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
-- 사원들의 급여 총합을 구한다.
SELECT SUM(SAL) -- 그룹함수와 다른 컬럼은 함께 가져올 수 없다.
FROM EMP;
-- 사원들의 커미션 총합을 구한다.
SELECT SUM(COMM) -- 그룹함수는 NULL 값을 다 없애버리고 계산함
FROM EMP;
-- 급여가 1500 이상인 사원들의 급여 총합을 구한다.
SELECT SUM(SAL)
FROM EMP
WHERE SAL>=1500;
-- 20번 부서에 근부하고 있는 사원들의 급여 총합을 구한다.
SELECT SUM(SAL)
FROM EMP
WHERE DEPTNO = 20;
-- 직무가 SALESMAN인 사원들의 급여 총합을 구한다.
SELECT SUM(SAL)
FROM EMP
WHERE JOB = 'SALESMAN';
-- 직무가 SALESMAN인 사원들의 이름과 급여총합을 가져온다.
SELECT ENAME, SUM(SAL) --> 이름은 4개인데 총 합은 하나니까 갯수가 맞지 않음! 오류!
FROM EMP
WHERE JOB = 'SALESMAN';
-- 전 사원의 급여 평균을 구한다.
SELECT TRUNC(AVG(SAL))
FROM EMP;
-- 커미션을 받는 사원들의 커미션 평균을 구한다.
SELECT TRUNC(AVG(COMM)) --> 그룹함수에서 NULL값 저절로 제외하고 계산함
FROM EMP;
-- 전 사원의 커미션의 평균을 구한다.
SELECT TRUNC(AVG(NVL(COMM,0)))
FROM EMP;
-- 커미션을 받는 사원들의 급여 평균을 구한다.
SELECT TRUNC(AVG(SAL))
FROM EMP
WHERE COMM IS NOT NULL;
-- 30번 부서에 근무하고 있는 사원들의 급여 평균을 구한다.
SELECT TRUNC(AVG(SAL))
FROM EMP
WHERE DEPTNO = 30;
-- 직무가 SALESMAN인 사원들의 급여 + 커미션 평균을 구한다.
SELECT TRUNC(AVG(SAL + COMM)) --> 더하기 전에 NULL이 있는지 우선 확인!
FROM EMP
WHERE JOB = 'SALESMAN';
-- 사원들의 총 수를 가져온다.
SELECT COUNT(ENAME)
FROM EMP;

SELECT COUNT(*)
FROM EMP;
-- 커미션을 받는 사원들의 총 수를 가져온다.
SELECT COUNT(COMM)
FROM EMP;
-- 사원들의 급여 최대, 최소값을 가져온다.
SELECT MAX(SAL), MIN(SAL)
FROM EMP;
```

## [18강] Group By
- 그룹 함수를 사용할 경우 select ~ from ~ where 절 까지 모두 수행하여 가져온 결과를 하나의 그룹으로 묶어 총합, 평균 등을 구할 수 있다.
- Group By 절을 사용하면 select문을 수행하여 가져온 하나의 결과를 여러 그룹으로 나눠 그룹 각각의 총합과 평균 등을 구할 수 있다.
```SQL
select 컬럼명
from 테이블명
where 조걸절
group by 그룹기준
order by 정렬기준
```
```SQL
-- 각 부서별 사원들의 급여 평균을 구한다.
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO;
-- 각 직무별 사원들의 급여 총합을 구한다.
SELECT JOB, SUM(SAL)
FROM EMP
GROUP BY JOB;
-- 1500 이상 급여를 받는 사원들의 부서별 급여 평균을 구한다.
SELECT  DEPTNO, AVG(SAL)
FROM EMP
WHERE SAL >= 1500
GROUP BY DEPTNO;
```

## [19강] Having
- Group by로 묶인 각 그룹들 중에 실제 가져올 그룹을 선택할 조건을 having 절에 작성한다.
  - SELECT에서 가져온 전제 결과를 GROUP BY으로 각각의 그룹으로 묶은 다음에 HAVING절의 조건에 맞는 그룹만 남겨놓고(조건에 맞지 않는 그룹 자체를 통체로 날려버림) GROUP함수를 이용해서 남은 그룹들의 결과를 가져옴.
- Having은 Group By 절의 조건이 된다.
```SQL
select 컬럼명
from 테이블명
where 조걸절(select문을 통해 가져오는 각 ROW)
group by 그룹기준
having 묶인 그룹에 대한 조건
order by 정렬기준
```
```SQL
-- 부서별 평균 급여가 2000이상은 부서의 급여 평균을 가져온다.
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING AVG(SAL) >= 2000;
-- 부서별 최대 급여액이 3000이하인 부서의 급여 총합을 가져온다.
SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING MAX(SAL) <= 3000;
-- 부서별 최소 급여액이 1000 이하인 부서에서 직무가 CLERK인 사원들의 급여 총합을 구한다.
SELECT SUM(SAL)
FROM EMP
WHERE JOB = 'CLERK'
GROUP BY DEPTNO
HAVING MIN(SAL) <= 1000;
-- 각 부서의 급여 최소가 900이상 최대가 10000이하인 부서의 사원들 중 1500이상의 급여를 받는 사원들의 평균 급여액을 가져온다.
SELECT AVG(SAL)
FROM EMP
WHERE SAL >= 1500
GROUP BY DEPTNO
HAVING MIN(SAL) >= 900 AND MAX(SAL) <= 10000;
```

## [20강] 조인(join)
- 두 개 이상의 테이블에 있는 컬럼의 값을 한번에 가져오기 위해 사용
- `select 컬럼명 from 테이블1, 테이블 2;`
- 두 개 이상의 테이블을 조인하게 되면 다 대 다의 관계로 가져오기 때문에 테이블1의 로우의 수 X 테이블2의 로우의 수 만큼 로우를 가져오게 된다.
- 두 개 이상의 테이블에서 가져온 결과 중에 정확한 결과만 가져오기 위해 공통 부분을 이용한 조건문이 반드시 필요하다.

```SQL
-- 사원의 사원번호, 이름, 근무지역을 가져온다.
SELECT A.EMPNO, A.ENAME, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO;
-- 사원의 사원번호, 이름, 근무부서 이름을 가져온다.
SELECT A.EMPNO, A.ENAME, B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO;
-- DALLAS에 근무하고 있는 사원들의 사원번호, 이름, 직무를 가져온다.
SELECT A.EMPNO, A.ENAME, A.JOB
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO 
  AND B.LOC = 'DALLAS';
-- SALES 부서에 근무하고 있는 사원들의 급여 평균을 가져온다.
SELECT AVG(A.SAL)
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
  AND B.DNAME = 'SALES';
-- 2020년에 입사한 사원들의 사원번호, 이름, 입사일, 근무부서 이름을 가져온다.
SELECT A.EMPNO, A.ENAME, A.HIREDATE, B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
  AND A.HIREDATE BETWEEN '2020/01/01' AND '2020/12/31';
-- 각 사원들의 사원번호, 이름, 급여, 급여등급을 가져온다.
SELECT A.EMPNO, A.ENAME, A.SAL, B.GRADE 
FROM EMP A, SALGRADE B
WHERE A.SAL BETWEEN B.LOSAL AND HISAL; --> WHERE 조건이 같다 아니다만 들어가진 않는다. 범위도 들어갈 수 있다.
-- SALES 부서에 근무하고 있는 사원의 사원번호, 이름, 급여등급을 가져온다.
SELECT A.EMPNO, A.ENAME, C.GRADE
FROM EMP A, DEPT B, SALGRADE C
WHERE A.DEPTNO = B.DEPTNO
  AND B.DNAME = 'SALES' 
  AND A.SAL BETWEEN C.LOSAL AND C.HISAL;
-- 각 급여 등급별 급여의 총합과 평균, 사원의수, 최대급여, 최소급여를 가져온다.
SELECT SUM(A.SAL), TRUNC(AVG(A.SAL)), COUNT(A.EMPNO), MAX(A.SAL), MIN(A.SAL)
FROM EMP A, SALGRADE B
WHERE A.SAL BETWEEN B.LOSAL AND B.HISAL
GROUP BY B.GRADE 
HAVING B.GRADE = 4;
-- 급여 등급이 4등급인 사원들의 사원번호, 이름, 급여, 근무부서이름, 근무지역을 가져온다.
SELECT A.EMPNO, A.ENAME, A.SAL, B.DNAME, B.LOC
FROM EMP A, DEPT B, SALGRADE C
WHERE A.DEPTNO = B.DEPTNO
  AND A.SAL BETWEEN C.LOSAL AND C.HISAL
  AND C.GRADE = 4;
```

## [21강] Self Join, Outer Join
### SELF JOIN
- 같은 테이블을 두번 이상 조인하는 것을 의미
- 어떤 테이블이 어떠한 용도로 사용하는 건지 정의 후 사용하는게 수월함
```SQL
--SMITH 사원의 사원번호, 이름, 직속상관 이름을 가져온다.
-- A1 : SMITH 사원의 정보
-- A2 : 직속상관의 정보
SELECT A1.EMPNO, A1.ENAME, A2.ENAME
FROM EMP A1, EMP A2
WHERE A1.MGR = A2.EMPNO
  AND A1.ENAME = 'SMITH';
--FORD 사원 밑에서 일하는 사원들의 사원번호, 이름, 직무를 가져온다.
-- A1 : FORD 사원의 정보
-- A2 : 부하직원의 정보
SELECT A2.EMPNO, A2.ENAME, A2.JOB
FROM EMP A1, EMP A2
WHERE A2.MGR = A1.EMPNO
  AND A1.ENAME = 'FORD';
--SMITH 사원의 직속상관과 동일한 직무를 가지고 있는 사원들의 사원번호, 이름, 직무를 가져온다.
-- A1 : SMITH 정보
-- A2 : SMITH 사원의 직속상관 정보
-- A3 : 직속상관과 동일한 직무를 가진 사원의 정보 
SELECT A3.EMPNO, A3.ENAME, A3.JOB
FROM EMP A1, EMP A2, EMP A3
WHERE A1.MGR = A2.EMPNO
  AND A2.JOB = A3.JOB
  AND A1.ENAME = 'SMITH';
```
### OUTER JOIN
- 조인 조건에 해당하지 않기 때문에 결과에 포함되지 않는 로우까지 가져오는 조인 (+)
```SQL
--각 사원의 이름, 사원번호, 직장상사 이름을 가져온다. 단 직속상관이 없는 사원도 가져온다.
-- A1 : 각 사원정보
-- A2 : 직장상사 정보
SELECT A1.ENAME, A1.EMPNO, A2.ENAME
FROM EMP A1, EMP A2
WHERE A1.MGR = A2.EMPNO(+); --> 사원의 정보(A1)에는 KING이 있는데 직장상사의 정보(A2)에는 KING이 없음. 부족한 쪽에 (+)를 붙여주기. 그럼 KING도 나옴
--모든 부서의 소속 사원의 근무부서명, 사원번호, 사원이름, 급여를 가져온다.
SELECT * FROM DEPT; --> 4행 출력
SELECT DISTINCT DEPTNO FROM EMP; --> 3행 출력. 40번 부서에서 근무하는 사원이 없다는 뜻
-- A1 : 모든 부서 소속 사원
-- A2 : 소속이 없는 사원
SELECT B.DNAME, A.EMPNO, A.ENAME, A.SAL
FROM EMP A, DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO --> EMP 테이블에 40번이 없으니까!
ORDER BY DNAME ASC;
```

## [22강] 서브쿼리
- 쿼리문 안에 들어가는 쿼리문을 서브 쿼리라고 한다.
- 쿼리문 작성시 사용되는 값을 다른 쿼리문을 통해 구해야 할 경우 사용한다.
```SQL
--SCOTT 사원이 근무하고 있는 부서의 이름을 가져온다.
SELECT B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
  AND A.ENAME = 'SCOTT'; --> 서브쿼리를 만드는 건 조인문으로도 가능하다.
  
SELECT DNAME
FROM DEPT 
WHERE DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME = 'SCOTT');
--SMITH와 같은 부서에 근무하고 있는 사원들의 사원번호, 이름, 급여액, 부서이름을 가져온다.
SELECT A.EMPNO, A.ENAME, A.SAL, B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
  AND A.DEPTNO = (SELECT DEPTNO 
                 FROM EMP
                 WHERE ENAME = 'SMITH');
                 
--MARTIN과 같은 직무를 가지고 있는 사원들의 사원번호, 이름, 직무를 가져온다.
SELECT EMPNO, ENAME, JOB 
FROM EMP
WHERE JOB = (SELECT JOB
             FROM EMP
             WHERE ENAME = 'MARTIN');
--ALLEN과 같은 직속상관을 가진 사원들의 사원번호, 이름, 직속상관이름을 가져온다.
-- A : 사원의 정보
-- B : AEELEN의 직속 상관 정보
SELECT A.EMPNO, A.ENAME, B.ENAME
FROM EMP A, EMP B
WHERE A.MGR = B.EMPNO
  AND A.MGR = (SELECT MGR  --> WHERE 절 이어질때 AND 까먹지 마라.......(╯°□°）╯
               FROM EMP
               WHERE ENAME = 'ALLEN');
--WARD와 같은 부서에 근무하고 있는 사원들의 사원번호, 이름, 부서번호를 가져온다.               
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME='WARD');
--SALESMAN의 평균 급여보다 많이 받는 사원들의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)
             FROM EMP
             WHERE JOB = 'SALESMAN');
--DALLAS 지역에 근무하는 사원들의 평균 급여를 가져온다.          
SELECT TRUNC(AVG(SAL))
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE LOC = 'DALLAS');
--SALES 부서에 근무하는 사원들의 사원번호, 이름, 근무지역을 가져온다.
SELECT A.EMPNO, A.ENAME, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
  AND A.DEPTNO = (SELECT DEPTNO
                  FROM DEPT
                  WHERE DNAME = 'SALES');
--CHICAGO 지역에 근무하는 사원들 중 BLAKE이 직속상관인 사원들의 사원번호, 이름, 직무를 가져온다.	
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE LOC = 'CHICAGO')
  AND MGR = (SELECT EMPNO
             FROM EMP
             WHERE ENAME = 'BLAKE'); --> 조인을 너무 많이 쓰려고 하지 마라!!!
```

## [23강] 결과가 하나 이상인 서브쿼리
- 서브쿼리를 통해 가져온 결과가 하나 이상인 경우 결과를 모두 만족하거나 결과 중 하나만 만족하거나 해야 하는 경우가 있다. 이때 다음과 같은 연산자를 사용하면 된다.
  - IN : 서브쿼리의 결과 중 하나라도 일치하면 조건은 참이 된다.
    - 같다 OR 같냐?
  - ANY, SOME : 서브쿼리의 결과와 하나 이상 일치하면 조건은 참이 된다.
    - 조건을 자유롭게 만들 수 있음.
  - ALL : 서브쿼리의 결과와 모두 일치해야 조건은 참이 된다.
```SQL
--3000 이상의 급여를 받는 사원들과 같은 부서에 근무하고 있는 사원의 사원번호, 이름, 급여를 가져온다
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                FROM EMP
                WHERE SAL >= 3000); --> IN : 서브쿼리 결과 중 조건이 하나라도 일치하면 참

SELECT ENAME, DEPTNO  --> 급여를 3000이상 받는 사람, 부서번호
FROM EMP
WHERE SAL >= 3000;
--직무가 CLERK인 사원과 동일한 부서에 근무하고 있는 사원들의 사원번호, 이름, 입사일 가져온다.
SELECT EMPNO, ENAME, HIREDATE, JOB, DEPTNO
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                FROM EMP
                WHERE JOB = 'CLERK');
SELECT ENAME, JOB, DEPTNO
FROM EMP
WHERE JOB = 'CLERK';
--KING을 직속상관으로 가지고 있는 사원들이 근무하고 있는 근무 부서명, 지역을 가지고 온다.
SELECT DNAME, LOC
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE MGR = (SELECT EMPNO
                              FROM EMP
                              WHERE ENAME = 'KING'));
SELECT ENAME,DEPTNO, MGR
FROM EMP
WHERE MGR = (SELECT EMPNO
             FROM EMP
             WHERE ENAME = 'KING');
--CLERK들의 직속상관의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE EMPNO IN (SELECT MGR
                FROM EMP
                WHERE JOB = 'CLERK');
--각 부서별 급여 평균보다 더 많이 받는 사원의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > ALL (SELECT AVG(SAL) --> 서브쿼리의 결과들이 모두 급여 평균보다 많아야 하므로 ALL!!
                 FROM EMP
                 GROUP BY DEPTNO);
 SELECT AVG(SAL), DEPTNO --> 각 부서별 평균 급여
 FROM EMP
 GROUP BY DEPTNO;
 
 SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MAX(AVG(SAL)) --> 최고 급여액보다 더 큰 것을 가져오면 되므로 MAX
             FROM EMP
             GROUP BY DEPTNO);
--각 부서별 급여 최저치보다 더 많이 받는 사원들의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > ALL (SELECT MIN(SAL)
                 FROM EMP
                 GROUP BY DEPTNO);

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MAX(MIN(SAL))
             FROM EMP
             GROUP BY DEPTNO);

SELECT MAX(MIN(SAL))
FROM EMP
GROUP BY DEPTNO;

SELECT MIN(SAL)
FROM EMP
GROUP BY DEPTNO;
--SALESMAN 보다 급여를 적게 받는 사원들의 사원번호, 이름, 급여를 가져온다.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL < ALL (SELECT SAL
                 FROM EMP
                 WHERE JOB = 'SALESMAN');
SELECT SAL
FROM EMP
WHERE JOB = 'SALESMAN';

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL <  (SELECT MIN(SAL)
              FROM EMP
              WHERE JOB = 'SALESMAN');
--각 부서별 최저 급여액수보다 많이 받는 사원들이 사원번호, 이름, 급여를 가져온다. (하나라도 만족하면 가져옴)
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > ANY (SELECT MIN(MIN(SAL))
                 FROM EMP
                 GROUP BY DEPTNO);

SELECT MIN(MIN(SAL))
FROM EMP
GROUP BY DEPTNO;

SELECT MIN(SAL)
FROM EMP
GROUP BY DEPTNO;
--DALLAS에 근무하고 있는 사원들 중 가장 나중에 입사한 사원의 입사 날짜보다 더 먼저 입사한 사원들의 사원번호, 이름, 입사일을 가져온다. (하나라도 만족하면 가져옴)
SELECT EMPNO, ENAME, HIREDATE
FROM EMP
WHERE HIREDATE < ANY(SELECT HIREDATE
                     FROM EMP
                     WHERE DEPTNO = (SELECT DEPTNO
                                     FROM DEPT
                                     WHERE LOC = 'DALLAS'));

SELECT MAX(HIREDATE)
FROM EMP
WHERE DEPTNO = ();
SELECT DEPTNO
FROM DEPT
WHERE LOC = 'DALLAS';
```

## [24강] SET

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
>> 8. 
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
- 
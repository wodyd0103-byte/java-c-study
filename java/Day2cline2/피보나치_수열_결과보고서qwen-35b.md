# 피보나치 수열 구현 결과보고서

## 1. 작업 개요

### 1.1 작업 목적
Java 를 사용한 피보나치 수열 구현

### 1.2 작업 환경
- **IDE**: IntelliJ IDEA Ultimate
- **언어**: Java
- **프로젝트 경로**: C:/Users/USER/Desktop/workspace/java/Day2cline2

---

## 2. 구현 요구사항

### 2.1 사용자 선택 사항
| 항목 | 선택 내용 |
|------|-----------|
| 구현 방식 | 반복 방식 (Iterative) |
| 출력 형식 | N 번째 항까지 출력 |
| 메서드 구성 | 별도의 메서드로 분리 |

---

## 3. 피보나치 수열 설명

### 3.1 수열 정의
피보나치 수열은 다음과 같은 규칙을 따르는 수열입니다:
- F(0) = 0
- F(1) = 1
- F(n) = F(n-1) + F(n-2) (n ≥ 2)

### 3.2 수열 예시
```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
```

---

## 4. 구현 코드

### 4.1 전체 코드 (src/Main.java)

```java
void main() {
    IO.println(String.format("Hello and welcome!"));

    // 피보나치 수열 구현
    int n = 10;
    
    IO.println("=== 피보나치 수열 (반복 방식) ===");
    IO.println(n + " 번째 항까지 출력:");
    printFibonacci(n);
    
    IO.println("\n" + n + " 번째 피보나치 수: " + getFibonacci(n));
}

/**
 * N 번째 항까지 피보나치 수열을 모두 출력하는 메서드
 * @param n 출력할 항의 개수
 */
public static void printFibonacci(int n) {
    if (n <= 0) {
        IO.println("잘못된 입력입니다.");
        return;
    }
    
    if (n == 1) {
        IO.println(0);
        return;
    }
    
    int prev = 0;  // F(0)
    int curr = 1;  // F(1)
    
    // 첫 번째 항 출력
    IO.println(prev);
    
    // 두 번째 항부터 n 번째 항까지 출력
    for (int i = 2; i <= n; i++) {
        IO.println(curr);
        int next = prev + curr;
        prev = curr;
        curr = next;
    }
}

/**
 * N 번째 피보나치 수를 계산하는 메서드
 * @param n 계산할 항의 번호 (1 부터 시작)
 * @return N 번째 피보나치 수
 */
public static int getFibonacci(int n) {
    if (n <= 0) {
        return 0;
    }
    
    if (n == 1) {
        return 0;
    }
    
    if (n == 2) {
        return 1;
    }
    
    int prev = 0;  // F(0)
    int curr = 1;  // F(1)
    
    // 3 번째 항부터 n 번째 항까지 계산
    for (int i = 3; i <= n; i++) {
        int next = prev + curr;
        prev = curr;
        curr = next;
    }
    
    return curr;
}
```

---

## 5. 실행 결과

### 5.1 출력 결과 (n=10)
```
Hello and welcome!
=== 피보나치 수열 (반복 방식) ===
10 번째 항까지 출력:
0
1
1
2
3
5
8
13
21
34

10 번째 피보나치 수: 34
```

---

## 6. 기술적 분석

### 6.1 알고리즘 복잡도
| 항목 | 복잡도 |
|------|--------|
| 시간 복잡도 | O(n) |
| 공간 복잡도 | O(1) |

### 6.2 재귀 방식과의 비교
| 방식 | 시간 복잡도 | 공간 복잡도 |
|------|------------|------------|
| 재귀 | O(2^n) | O(n) |
| **반복** | **O(n)** | **O(1)** |

### 6.3 구현 특징
1. **효율성**: 반복 방식으로 불필요한 재귀 호출 제거
2. **가독성**: 주석을 통한 코드 설명
3. **재사용성**: 별도의 메서드로 분리
4. **예외 처리**: n <= 0 인 경우 처리

---

## 7. 결론

반복 방식을 사용한 피보나치 수열 구현이 성공적으로 완료되었습니다. 재귀 방식에 비해 성능이 우수하며, 유지보수가 용이한 구조로 구현되었습니다.

---

*보고서 작성일: 2026. 4. 2.*
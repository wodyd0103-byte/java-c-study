#include <stdio.h>

int main() {
    int a = 10;

    // [틀린 코드]
    // int *p;          // 초기화 안 함 - 위험!
    // *p = 10;         // 어디에 쓸지 모름 → 세그폴트

    // [올바른 코드]
    int *p = &a;        // 선언과 동시에 a의 주소로 초기화
    *p = 20;            // a의 값이 20으로 변경됨

    printf("a = %d\n", a);   // 20

    return 0;
}
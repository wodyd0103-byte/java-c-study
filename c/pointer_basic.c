#include <stdio.h>

int main() {
    int a = 10;                    // 정수형 변수 a에 10 저장
    int *p = &a;                   // 포인터 p에 a의 주소 저장

    printf("a의 값: %d\n", a);     // 10
    printf("a의 주소: %p\n", &a);  // a의 주소
    printf("p의 값: %p\n", p);     // a의 주소 (p == &a)
    printf("*p의 값: %d\n", *p);   // 10 (p가 가리키는 곳의 값)

    return 0;
}
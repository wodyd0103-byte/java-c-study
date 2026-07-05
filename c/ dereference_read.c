//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 10;                    // a에 10 저장
    int *p = &a;                   // p는 a의 주소를 저장

    printf("a = %d\n", a);         // 직접 접근: 10
    printf("*p = %d\n", *p);       // 포인터로 접근: 10

    // a와 *p는 같은 메모리!
    printf("같은가? %d\n", (a == *p));  // 1 (참)

    return 0;
}
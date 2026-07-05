//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 10;                    // a = 10
    int *p = &a;                   // p → a

    *p = 20;                       // a가 20으로 변경!

    printf("%d\n", a);             // 출력1
    printf("%d\n", a + *p);        // 출력2

    return 0;
}
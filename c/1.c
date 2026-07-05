//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 5;                     // a = 5
    int *p = &a;                   // p는 a를 가리킴

    printf("%d\n", a);             // 출력1
    printf("%d\n", *p);            // 출력2
    printf("%d\n", *p + 3);        // 출력3

    return 0;
}
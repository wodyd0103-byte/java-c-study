//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 3;                     // a = 3
    int *p = &a;                   // p → a

    (*p)++;                        // a를 1 증가 → a = 4
    printf("%d\n", a);             // 출력1

    (*p) += 2;                     // a에 2를 더함 → a = 6
    printf("%d\n", a);             // 출력2

    return 0;
}
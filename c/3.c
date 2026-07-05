//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 1, b = 2;             // a=1, b=2
    int *p = &a;                   // p → a
    int *q = &b;                   // q → b

    *p = *q + 3;                   // ???
    *q = *p + *q;                  // ???

    printf("%d %d\n", a, b);       // 출력은?

    return 0;
}
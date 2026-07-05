//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int a = 10;                    // a에 10 저장
    int *p = &a;                   // p는 a의 주소

    printf("변경 전: a = %d\n", a);    // 10

    *p = 20;                       // p가 가리키는 곳(=a)에 20 저장

    printf("변경 후: a = %d\n", a);    // 20 (a가 바뀜!)
    printf("변경 후: *p = %d\n", *p);  // 20

    return 0;
}
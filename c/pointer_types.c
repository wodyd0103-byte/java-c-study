#include <stdio.h>

int main() {
    int a = 10;                    // int형 변수
    char c = 'A';                  // char형 변수
    double d = 3.14;               // double형 변수

    int *ip = &a;                  // int 포인터
    char *cp = &c;                 // char 포인터
    double *dp = &d;               // double 포인터

    printf("*ip = %d\n", *ip);     // 10
    printf("*cp = %c\n", *cp);     // A
    printf("*dp = %.2f\n", *dp);   // 3.14

    return 0;
}
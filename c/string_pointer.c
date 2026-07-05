//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    char *str = "Hello";               // 문자열 포인터

    printf("문자열: %s\n", str);        // 전체 문자열 출력
    printf("첫 글자: %c\n", *str);      // H (역참조)
    printf("세번째: %c\n", *(str+2));   // l (포인터 산술)
    printf("세번째: %c\n", str[2]);     // l (인덱스)

    return 0;
}
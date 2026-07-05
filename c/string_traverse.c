//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    char *str = "Hello";
    char *p = str;                     // 문자열 시작 주소
    int len = 0;

    // '\0' 만날 때까지 한 글자씩 출력
    while (*p != '\0') {               // 끝이 아닐 동안
        printf("%c ", *p);             // 현재 문자 출력
        p++;                           // 다음 문자로 이동
        len++;                         // 길이 카운트
    }
    printf("\n길이: %d\n", len);
}
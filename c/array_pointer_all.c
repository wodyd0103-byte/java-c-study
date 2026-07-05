//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    // 정수 배열
    int arr[3] = {100, 200, 300};
    int *p = arr;                      // 배열명 = 포인터

    printf("arr[1] = %d\n", arr[1]);          // 인덱스
    printf("*(arr+1) = %d\n", *(arr+1));      // 배열+산술
    printf("*(p+1) = %d\n", *(p+1));          // 포인터+산술

    // 문자열
    char *msg = "Pointer";
    printf("msg[0]=%c, *(msg+3)=%c\n",
        msg[0], *(msg+3));
}

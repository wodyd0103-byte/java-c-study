//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int arr[4] = {10, 20, 30, 40};    // int 배열 선언

    printf("arr     = %p\n", arr);     // 배열명
    printf("&arr[0] = %p\n", &arr[0]); // 첫 원소 주소

    // 같은 주소인지 확인
    if (arr == &arr[0])
        printf("arr == &arr[0] → 같다!\n");

    return 0;
}
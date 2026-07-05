//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int arr[4] = {10, 20, 30, 40};
    int *p = arr;                      // p는 arr[0]을 가리킴

    // 포인터 이동으로 배열 순회
    for (int i = 0; i < 4; i++) {
        printf("p = %d\n", p);       // 현재 가리키는 값
        p++;                           // 다음 원소로 이동
    }

    return 0;
}
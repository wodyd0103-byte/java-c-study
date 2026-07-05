//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int arr[4] = {10, 20, 30, 40};

    for (int i = 0; i < 4; i++) {
        printf("arr[%d] 주소: %p, 값: %d\n",
               i, &arr[i], arr[i]);      // 각 원소의 주소와 값
    }

    return 0;
}
//
// Created by USER on 26. 4. 3..
//
#include <stdio.h>

int main() {
    int arr[4] = {10, 20, 30, 40};
    int *p = arr;                      // p = &arr[0] (배열명=주소)

    // 세 가지 방법 모두 같은 결과!
    for (int i = 0; i < 4; i++) {
        printf("arr[%d]=%d, *(arr+%d)=%d, *(p+%d)=%d\n",
               i, arr[i],               // 방법1: 인덱스
               i, *(arr+i),             // 방법2: 배열명+산술
               i, *(p+i));              // 방법3: 포인터+산술
    }

    return 0;
}
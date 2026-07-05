#include <stdio.h>

void doubleArr(int *arr, int size) {  // 배열 포인터
    for (int i = 0; i < size; i++) {
        arr[i] = arr[i] * 2;          // 원본 배열 변경!
    }
}

int main() {
    int nums[3] = {1, 2, 3};

    printf("변경 전: ");
    for (int i = 0; i < 3; i++) printf("%d ", nums[i]);

    doubleArr(nums, 3);              // 배열 전달

    printf("\n변경 후: ");
    for (int i = 0; i < 3; i++) printf("%d ", nums[i]);
    printf("\n");

    return 0;
}
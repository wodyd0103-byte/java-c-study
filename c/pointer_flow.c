#include <stdio.h>

int main() {
    int a = 10;
    int *p = &a;

    printf("a = %d, *p=%d\n", a, *p);

    *p = 30;
    printf("a = %d, *p=%d\n", a, *p);

    a=50;
    printf("a = %d, *p=%d\n", a, *p);

    return 0;
}
#include <stdio.h>
int foo(void)
{
    int i;
    i = 77;
    return i;
}

int *bar(void)
{
    int v[3] = {1,2,3};
    return v;
}

int main()
{
    int *p;
    p = bar();
    printf("foo: %d\n", foo());
    printf("bar: %d, %d, %d\n", p[0], p[1], p[2]);
    return 0;
}
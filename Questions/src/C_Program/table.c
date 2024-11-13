#include <stdio.h>
int main()
{
    int a = 2;
    int *ptr;
    int i,v;
    ptr = &a;
    for(i=1;i<=10;i++){
        v = *ptr * i;
        printf("%d ",v);
    }
}
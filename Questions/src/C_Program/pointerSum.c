#include<stdio.h>
void main(){
    int a,b=10,c=15;
        int *p,*q,*r;
        p=&a;
        q=&b;
        r=&c;
        *p=*q+*r;
        

}
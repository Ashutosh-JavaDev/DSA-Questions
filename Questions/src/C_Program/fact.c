#include<stdio.h>
int mul=1;
int fact(int num){
    if(num==1){
    return;
    }
    mul*=num;
    fact(num-1);
    return mul;
}
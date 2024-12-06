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
void main(){
    int num;
    printf("Enter the Number\n");
    scanf("%d",&num);
    int result=fact(num);
}
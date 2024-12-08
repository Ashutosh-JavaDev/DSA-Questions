#include<stdio.h>
int SOD(int num){
    if(num<0){
        return;
    }
    return SOD(num%10)+SOD(num/10);
}
void main(){
    int num;
    printf("Enter the Number\n");
    scanf("%d",&num);
    int res=SOD(num);
    printf("Result: %d",res);
}
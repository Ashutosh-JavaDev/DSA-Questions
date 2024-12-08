#include<stdio.h>
int sum=0;
int sOd(int num){
    if(num<0){
        return 0;
    }
    sum+=num%10;
    sOd(num/10);
    return sum;
}
void main(){
    int num;
    printf("Enter the Number\n");
    scanf("%d",&num);
    int res=sOd(num);
    printf("Result: %d",res);
}
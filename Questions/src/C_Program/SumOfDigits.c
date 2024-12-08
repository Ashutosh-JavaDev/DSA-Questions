#include<stdio.h>
int sOd(int num,int sum){
    if(num==0){
        return sum;
    }
    sum+=num%10;
    return sOd(num/10,sum);
}
void main(){
    int num;
    printf("Enter the Number\n");
    scanf("%d",&num);
    int res=sOd(num,0);
    printf("Result: %d",res);
}
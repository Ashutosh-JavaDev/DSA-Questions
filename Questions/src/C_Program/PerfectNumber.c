#include<stdio.h>
void main (){
    int num,i,j,sum,d=0;
    printf("Enter the Number till the Value want to Find\n");
    scanf("%d",&num);
    for(i=1;i<=num;i++){
        sum=0;
        for(j=1;j<i;j++){
            if(i%j==0){
                sum+=j;
                printf("%d ",sum);
                d+=sum;
            }
        }
        if(sum==i){
            printf("%d ",i);
        }
    }
    printf("\nSum of Perfect Number : %d",d);
    printf("\n");
}
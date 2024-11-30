#include<stdio.h>
void main(){
    int arr[100],n,sum=0;
    printf("Enter the Size of the  Array\n");
    scanf("%d",&n);
    printf("Enter the Value in the Array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    printf("%d\n",sum);
}
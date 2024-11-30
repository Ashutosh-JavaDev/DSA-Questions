#include<stdio.h>
int result(){
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
    printf("Sum: %d\n",sum);
}
void main(){
    int n;
    printf("How many time you want to call the Function\n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        printf("Enter the Value in %d\n",i);
        result();
    }
}
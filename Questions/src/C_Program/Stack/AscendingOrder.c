#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int arr[MAX];
int top=-1;
void push(){
    int data;
    if(top==MAX-1){
        printf("Stack OverFlow\n");
    }
    else{
        printf("Enter the value to add in the stack\n");
        scanf("%d",&data);
        top=top+1;
        arr[top]=data;
        printf("Value in %d is %d \n",top,arr[top]);
    }
}
void pop();
void peek();
void ascending(){
    
}
void main()
{

}
#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int top = -1;
int arr[MAX];

void push(){
    int data;
    if(top==MAX-1){
        printf("Stack Overflow\n");
    }
    else{
        printf("Enter the value You want to add: ");
        scanf("%d",&data);
        top=top+1;
        arr[top]=data;
        printf("Value at %d index is %d \n",top,arr[top]);
    }
}
void pop(){
    if(top==-1){
        printf("Stack UnderFlow\n");
    }
    else{
        printf("%d is Removed...\n",arr[top]);
        top=top-1;
    }
}
void peek(){
    if(top==-1){
        printf("Stack UnderFlow\n");
    }
    else{
        printf("%d is Peeked Up...\n",arr[top]);
    }
}
void main()
{
    int choose;
    while (1)
    {
        printf("Choose Wisely\n1.To Push()\n2.To Pop()\n3.To Peek()\n4.To Exit()\n");
        scanf("%d",&choose);
        printf("--------------------------------------------------------------------");
        switch (choose)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            exit(0);
            break;
        default:
            printf("Choose Wisely");
            break;
        }
    }
}

#include <stdio.h>
#include <stdlib.h>
#define MAX 5
int stack[MAX];
int top = -1;
// void push();
// void pop();
// void peek();
void main()
{
    int choose;
    printf("Choose the Option...\n1.To Push\n2.To Pop\n3.To Peek\n");
    scanf("%d", &choose);
    while (1)
    {
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
        default:
            printf("Choose Wisely\n");
            break;
        }
    }
}
void push()
{
    int data;
    if (top == MAX - 1)
    {
        printf("Stack Overflow...\n");
    }
    printf("Enter the Number\n");
    scanf("%d",&data);
    data=stack[top];
    printf("Present Element in Stack is : %d",data);
}
void pop(){
    if(top==-1){
        printf("Stack is UnderFlow, Store the data first..\n");
    }
    printf("%d is removed from the stack...",stack[top]);
    top=top-1;
}
void peek(){
    if(top==-1){
        printf("Stack is Underflow...\n");
    }
    printf("%d is present in the stack...",stack[top]);
}
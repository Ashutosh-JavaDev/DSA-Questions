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

    while (1)
    {
        printf("Choose the Option...\n1.To Push\n2.To Pop\n3.To Peek\n4.To Exit\n");
        scanf("%d", &choose);
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
    else
    {
        printf("Enter the Number\n");
        scanf("%d", &data);
        top = top + 1;
        stack[top] = data;
        printf("Present Element in Stack is : %d\n", data);
    }
}
void pop()
{
    if (top == -1)
    {
        printf("Stack is UnderFlow, Store the data first..\n");
    }
    else
    {
        printf("%d is removed from the stack...\n", stack[top]);
        top = top - 1;
    }
}
void peek()
{
    if (top == -1)
    {
        printf("Stack is Underflow...\n");
    }
    else
    {
        printf("%d is present at the top in the stack...\n", stack[top]);
    }
}
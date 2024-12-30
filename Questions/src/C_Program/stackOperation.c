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
}
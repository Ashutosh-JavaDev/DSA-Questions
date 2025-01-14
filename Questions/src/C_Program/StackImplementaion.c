#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int top = -1;
int arr[MAX];

void push();
void pop();
void peek();

void main()
{
    int choose;
    while (1)
    {
        printf("Choose Wisely\n1.To Push()\n2.To Pop()\n3.To Peek()\n4.To Exit()");
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
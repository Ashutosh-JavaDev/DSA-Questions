#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int arr[MAX];
int top = -1;
void push()
{
    int data;
    if (top == MAX - 1)
    {
        printf("Stack OverFlow\n");
    }
    else
    {
        printf("Enter the value to add in the stack\n");
        scanf("%d", &data);
        top = top + 1;
        arr[top] = data;
        printf("Value in %d is %d \n", top, arr[top]);
    }
}
void pop();
void peek();
void ascending();
void descending();
void main()
{
    int choice;
    while (1)
    {
        printf("Enter the choice wisely\n1.To Push\n2.To Pop\n3.To Peek\n4.To print Ascending\n5.To print Descending\n6.To EXIT");
        scanf("%d", &choice);
        switch (choice)
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
            ascending();
            break;
            case 5:
            descending();
            break;
            case 6:
            EXIT(0);
            break;
            default:
            printf("Choose wisely\n");
            break;
        }
    }
}
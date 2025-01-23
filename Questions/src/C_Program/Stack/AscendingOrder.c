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
void pop()
{
    if (top == -1)
    {
        printf("Stack UnderFlow\n");
    }
    else
    {
        printf("%d is Remove from the stack...\n", arr[top]);
        top = top - 1;
        printf("New Top is %d...\n", arr[top]);
    }
}
void peek()
{
    if (top == -1)
    {
        printf("Stack UnderFlow\n");
    }
    else
    {
        printf("%d is Peeked from the stack...\n", arr[top]);
    }
}
void ascending()
{
    if (top == -1)
    {
        printf("Stack UnderFlow\n");
    }
    else{
        int temp=-1;
        if(arr[top]>arr[top+1]){
            arr[temp]=arr[top];
        }
    }
}
void descending()
{
     if (top == -1)
    {
        printf("Stack UnderFlow\n");
    }
    else{
        int temp=-1;
        if(arr[top]<arr[top+1]){
            arr[temp]=arr[top];
        }
    }
}
void main()
{
    int choice;
    while (1)
    {
        printf("Enter the choice wisely\n1.To Push\n2.To Pop\n3.To Peek\n4.To EXIT");
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
            int choice;
            while (1)
            {
                printf("Choose Wisely\n1.For Print Ascending\n2.To Print Descending\n");
                scanf("%d", &choice);
                switch (choice)
                {
                case 1:
                    ascending();
                    break;
                case 2:
                    descending();
                    break;
                default:
                    printf("Choice wisely\n");
                    break;
                }
            }
            EXIT(0);

            break;
        default:
            printf("Choose wisely\n");
            break;
        }
    }
}
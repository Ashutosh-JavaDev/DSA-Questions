#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int arr[MAX];
int sorted_Stack[MAX];
int top = -1;

void push(int data)
{
    if (top == MAX - 1)
    {
        printf("Stack OverFlow\n");
    }
    else
    {
        top++;
        arr[top] = data;
        printf("Value in %d is %d \n", top, arr[top]);
    }
}

int pop()
{
    if (top == -1)
    {
        printf("Stack UnderFlow\n");
        return -1; // Indicating underflow
    }
    else
    {
        int val = arr[top];
        top--;
        return val;
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

void sort_stack()
{
    int temp;
    int sortedTop = -1;

    while (top != -1)
    {
        temp = pop();
        while (sortedTop != -1 && sorted_Stack[sortedTop] < temp)
        {
            push(sorted_Stack[sortedTop]);
            sortedTop--;
        }
        sortedTop++;
        sorted_Stack[sortedTop] = temp;
    }

    while (sortedTop != -1)
    {
        push(sorted_Stack[sortedTop]);
        sortedTop--;
    }
}

void ascending()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
        return;
    }
    sort_stack();
    printf("Stack in Ascending Order: ");
    for (int i = 0; i <= top; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void descending()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
        return;
    }
    sort_stack();
    printf("Stack in Descending Order: ");
    for (int i = top; i >= 0; i--)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main()
{
    int choice;
    while (1)
    {
        printf("Enter the choice wisely\n1.To Push\n2.To Pop\n3.To Peek\n4.To EXIT\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the value to add in the stack\n");
            int val;
            scanf("%d", &val);
            push(val);
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            while (1)
            {
                printf("Choose Wisely\n1.For Print Ascending\n2.To Print Descending\n3.To Exit\n");
                scanf("%d", &choice);
                switch (choice)
                {
                case 1:
                    ascending();
                    break;
                case 2:
                    descending();
                    break;
                case 3:
                    exit(0);
                default:
                    printf("Choose wisely\n");
                    break;
                }
            }
        default:
            printf("Choose wisely\n");
            break;
        }
    }
    return 0;
}

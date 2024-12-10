#include <stdio.h>

#define MAX 100
typedef struct
{
    int size;
    int top;
    int arr[];
} Stack;
void initilization(Stack *s)
{
    s->top = -1;
}
int isFull(Stack s)
{
    return s.top == MAX - 1;
}
void push(struct stack, int arr[])
{
    if (isFull(stack))
    {
    }
}
void main()
{
}
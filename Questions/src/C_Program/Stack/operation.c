#include <stdio.h>

#define MAX 100
typedef struct
{
    int size;
    int top;
    int arr[MAX];
} Stack;
void initilization(Stack *s)
{
    s->top = -1;
}

int isEmpty(Stack s){
    return s.top==-1;
}
int isFull(Stack s)
{
    return s.top == MAX - 1;
}
void push(Stack *s, int value)
{
    if (isFull(*s))
    {
        printf("Stack Overflow Condition Occur\n");
    }
     s->arr[++(s->top)]==value;
}
int pop(Stack *s){
    if(isEmpty(*s)){
        printf("Stack UnderFlow\n");
    }
    return s->arr[(s->top)--];
}
int peek(Stack s){
   if(isEmpty(s)){
    printf("Stack UnderFlow\n");
   } 
}
void main()
{

}
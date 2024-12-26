#include <stdio.h>
// #include <process.h>
#include<stdlib.h>
#define MAX 5;
int stack[MAX];
int top = -1;
void main()
{
    int choice;
    printf("1.to Push\n2.to Pop\n3.to Peek\n4.Exit");
    scanf("%d", &choice);
    while (1 > 0)
    {
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
            exit(0);
            break;
        default:
            printf("Press Valid Button\n");
            break;
        }
    }
}
void push(){
    int n;
    if(top==MAX-1){
        printf("Stack OverFlow\n");
    }
    else{
          printf("Enter the value to push: ");
        scanf("%d", &n);
        top = top + 1;
        stack[top] = n;
        printf("Pushed %d onto the stack\n", stack[top]);
    }
}
void pop(){
    int n;
    if(top==-1){
        printf("Stack is Empty\n");
    }
    else{
        top=top-1;
        printf("%d is Remove from the Stack...\n",n);
    }
}

void peek(){
    int n;
    if(top==-1){
        printf("Stack Is Empty\n");
    }
    else{
        printf("Top Element is %d\n",n);
    }
}
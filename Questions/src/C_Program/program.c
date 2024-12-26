#include <stdio.h>
#include <stdlib.h>
#define MAX 5

int stack[MAX];
int top = -1;

// Function prototypes
void push();
void pop();
void peek();

void main() {
    int choice;
    while (1) {
        printf("\n1. Push\n2. Pop\n3. Peek\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) {
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
                printf("Press a valid option.\n");
                break;
        }
    }
}

void push() {
    int n;
    if (top == MAX - 1) {
        printf("Stack Overflow\n");
    } else {
        printf("Enter the value to push: ");
        scanf("%d", &n);
        top = top + 1;
        stack[top] = n;
        printf("Pushed %d onto the stack\n", stack[top]);
    }
}

void pop() {
    if (top == -1) {
        printf("Stack is Empty\n");
    } else {
        printf("%d is removed from the stack...\n", stack[top]);
        top = top - 1;
    }
}

void peek() {
    if (top == -1) {
        printf("Stack is Empty\n");
    } else {
        printf("Top element is %d\n", stack[top]);
    }
}

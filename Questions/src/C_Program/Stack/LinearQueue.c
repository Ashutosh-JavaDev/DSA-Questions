#include <stdio.h>

#define MAX 5
int queue[MAX];
int front = -1;
int rear = -1;
// Introduction of the function
void Enqueue()
{
    int data;
    if (rear == MAX - 1)
    {
        printf("Queue Overflow\n");
    }
    else if (front == -1 && rear == -1)
    {
        front=rear=0;
        queue[rear]=data;
        printf("%d is added in the queue\n");
    }
    else{
        rear++;
        queue[rear]=data;
        printf("%d is added in the Queue\n");
    }
}
void Dequeue(){
    if(front==-1&& rear==-1){
        printf("Queue Underflow\n");
    }
}
void Peek();
void Display();
// Main Function
int main()
{
    int choice;
    while (1)
    {
        printf("1.To Enqueue()\n2.To Dequeue()\n3.Peek()\n4.To Display()");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            Enqueue();
            break;
        case 2:
            Dequeue();
            break;
        case 3:
            Peek();
            break;
        case 4:
            Display();
            break;
        default:
            printf("Choose Wisely\n");
            break;
        }
    }
}
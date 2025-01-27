#include <stdio.h>
#define MAX 5
int queue[MAX];
int front = -1;
int rear = -1;

void Enqueue()
{
    int data;
    if ((rear + 1) % 5 == front)
    {
        printf("Queue is OverFlow\n");
    }
    else if (front == -1 && rear == -1)
    {
        front = rear = 0;
        printf("Enter the value: ");
        scanf("%d", &data);
        printf("\n");
        queue[rear] = data;
        printf("%d is added in the queue\n", data);
    }
    else
    {
        rear = (rear + 1) % 5;
        printf("Enter the value: ");
        scanf("%d", &data);
        printf("\n");
        queue[rear] = data;
        printf("%d is added in Queue\n", data);
    }
}
void Dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is Underflow\n");
    }
    else if (front == rear)
    {
        front = rear = -1;
    }
    else
    {
        printf("%d is removed from the queue\n", queue[front]);
        front = (front + 1) % 5;
    }
}
void Peek()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is Underflow\n");
    }
    else
    {
        printf("%d is at the Front of the queue\n", queue[rear]);
    }
}
void Display()
{
    int i = front;
    if (front == -1 && rear == -1)
    {
        printf("Queue is Underflow\n");
    }
    else
    {
        while (i != rear)
        {
            printf("%d ", queue[i]);
            i = (i + 1) % 5;
        }
        printf("%d ", queue[rear]);
        printf("\n");
    }
}
int main()
{
    int choice;
    while (1)
    {
        printf("1.To Enqueue()\n2.To Dequeue()\n3.To Peek()\n4.To Display()\n");
        scanf("%d", &choice);
        printf("----------------------------------------------------\n");
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
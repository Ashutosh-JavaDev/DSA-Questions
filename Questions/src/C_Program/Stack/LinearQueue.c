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
        front = rear = 0;
        printf("Enter the value\n");
        scanf("%d",&data);
        queue[rear] = data;
        printf("%d is added in the queue\n",data);
    }
    else
    {
        rear++;
        printf("Enter the value\n");
        scanf("%d",&data);
        queue[rear] = data;
        printf("%d is added in the Queue\n",data);
    }
}
void Dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue Underflow\n");
    }
    else if (front == rear)
    {
        printf("%d is Removed from the Queue\n",queue[front]);
        front = rear = -1;
    }
    else
    {
        printf("%d is removed from the queue\n",queue[front]);
        front++;
    }

}
void Peek(){
     if (front == -1 && rear == -1)
    {
        printf("Queue Underflow\n");
    }
    else{
        printf("%d is at the front\n",queue[front]);
    }

}
void Display(){
     if (front == -1 && rear == -1)
    {
        printf("Queue Underflow\n");
    }
    else{
        for(int i=front;i<rear+1;i++){
            printf("%d" "",queue[front]);
        }
    }
}
// Main Function
int main()
{
    int choice;
    while (1)
    {
        printf("1.To Enqueue()\n2.To Dequeue()\n3.Peek()\n4.To Display()\n");
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
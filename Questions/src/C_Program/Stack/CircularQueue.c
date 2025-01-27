#include<stdio.h>
#define MAX 5
int front=-1;
int rear=-1;

void Enqueue(){
    int data;
    if(rear==MAX-1){
        printf("Queue is Underflow\n");
    }
    else if(front==-1&&rear==-1){
        front=rear=0;
        printf("Enter the value: ");
        scanf("%d",&data);
        printf("\n");
        printf("%d is added in the queue\n",data);
    }
    else{
        rear=(rear+1)%5;
    }
}
void Dequeue();
void Peek();
void Display();
int main()
{
    int choice;
    while (1)
    {
        printf("1.To Enqueue()\n2.To Dequeue()\n3.Peek()\n4.To Display()\n");
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
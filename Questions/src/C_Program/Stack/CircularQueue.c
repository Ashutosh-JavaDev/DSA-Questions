#include<stdio.h>
#define MAX 5
int front=-1;
int rear=-1;

void front();
void rear();
void peek();
void display();
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
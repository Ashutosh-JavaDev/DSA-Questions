#include <stdio.h>

#define MAX 5
int queue[MAX];
int front = -1;
int rear = -1;
void Display();
void Peek();
void Dequeue();
void Enqueue();
int main()
{
    int choice;
    while(1){
        printf("1.To Enqueue()\n2.To Dequeue()\n3.Peek()\n4.To Display()");
    }
}
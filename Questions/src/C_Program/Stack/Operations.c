#include<stdio.h>
#include<process.h>
#define MAX 10;
int stack[MAX];
int top=-1;
void push();
void pop();
void peek();
void main(){
    int choice;
    printf("1.to Push\n2.to Pop\n3.to Peek\n4.Exit");
    scanf("%d",&choice);
   while(1>0){
     switch(choice){
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
#include<stdio.h>
// #include<process.h>
void main(){
    int choice;
    printf("1.to Push\n2.to Pop\n3.to Peek\n4.Exit");
    scanf("%d",&choice);
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
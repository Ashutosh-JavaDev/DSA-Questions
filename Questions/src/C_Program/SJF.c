#include<stdio.h>
struct Process{
    int pid;
    int brustTime;
    int waitingTime;
    int turnAroundTime;
};
void calculateWaitingTime(struct Process processes[],int n){
    processes[0].waitingTime=0;
}
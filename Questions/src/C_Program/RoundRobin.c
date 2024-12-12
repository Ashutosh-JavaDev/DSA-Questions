#include<stdio.h>
#include<stdbool.h>

void roundRobinScheduling(int processes[],int n,int brustTime[],int quantum){
    int waitingTime[n],turnaroundTime[n],remainingbrustTime[n];
    int totalWaitingTime=0,totalWaitingTime=0;

    //Initialize remaining burst Times
    for(int i=0;i<n;i++){
        remainingbrustTime[i]=brustTime[i];
    }
}
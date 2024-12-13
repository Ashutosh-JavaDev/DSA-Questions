#include<stdio.h>
struct Process{
    int pid;
    int brustTime;
    int waitingTime;
    int turnAroundTime;
};
void calculateWaitingTime(struct Process processes[],int n){
    processes[0].waitingTime=0;//First process has no waiting time
    for(int i=1;i<n;i++){
        processes[i].waitingTime=processes[i-1].waitingTime+processes[i-1].brustTime;
    }

}
void calculateTurnAroundTime(struct Process processes[],int n){
    for(int i=0;i<n;i++){
        processes[i].turnAroundTime=processes->waitingTime+processes[i].brustTime;
    }
}
void sortProcessesByBurstTime(struct Process processes[],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(processes[j].brustTime>processes[j+1].brustTime){
                struct Process temp=processes[j];
                processes[j]=processes[j+1];
                processes[j+1]=temp;
            }
        }
    }
}
int main(){
    int n;
    printf("Enter the Number of Processes: ");
    scanf("%d",&n);

    struct Process processes[n];

    for(int i=0;i<n;i++){
        processes[i].pid=i+1;
        printf("Enter burst Time for Process %d: ",i+1);
        scanf("%d",&processes[i].brustTime);
    }

    sortProcessesByBurstTime(processes,n);

    calculateWaitingTime(processes,n);
    calculateTurnAroundTime(processes,n);

    int totalWaitingTime=0;
    int totalTurnAroundTime=0;
    for(int i=0;i<n;i++){
        totalWaitingTime+=processes[i].waitingTime;
        totalTurnAroundTime+=processes[i].turnAroundTime;
    }
}
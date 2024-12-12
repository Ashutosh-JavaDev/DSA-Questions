#include <stdio.h>
#include <stdbool.h>

void roundRobinScheduling(int processes[], int n, int brustTime[], int quantum)
{
    int waitingTime[n], turnaroundTime[n], remainingbrustTime[n];
    int totalWaitingTime = 0, totalTurnAroundTime = 0;

    // Initialize remaining burst Times
    for (int i = 0; i < n; i++)
    {
        remainingbrustTime[i] = brustTime[i];
    }
    int time = 0;

    while (true)
    {
        bool allDone = true;
        for (int i = 0; i < n; i++)
        {
            if (remainingbrustTime[i] > 0)
            {
                allDone = false;

                if (remainingbrustTime[i] > quantum)
                {
                    time += quantum;
                    remainingbrustTime[i] -= quantum;
                }
                else
                {
                    // Process Finishes Execution
                    time += remainingbrustTime[i];
                    waitingTime[i] = time - brustTime[i];
                    // waitingTime[i]=time-brustTime[i];
                    remainingbrustTime[i] = 0;
                }
            }
        }

        if (allDone)
            break;
    }
    //Calculate Turnaround Times
    for(int i=0;i<n;i++){
        turnaroundTime[i]=brustTime[i]+waitingTime[i];
    }
    //Display Results
    printf("Process\tBrust TIme\tWaiting Time\tTurn Around\n");
    for(int i=0;i<n;i++){
        printf("P%d\t\t%d\t\t%d\n",processes[i],brustTime[i,waitingTime[i],turnaroundTime[i]]);
        totalWaitingTime+=waitingTime[i];
        totalTurnAroundTime+=turnaroundTime[i];
    }

    printf("\nAverage Waiting TIme: %2f\n",(float)totalWaitingTime/n);
    printf("Average Turnaround Time: %2f\n",(float)totalTurnAroundTime/n);
}
int main(){
    int n,quantum;
    printf("Enter the Number of Processes: ");
    scanf("%d",&n);

    int processes[n],brustTime[n];
    printf("Enter the burst time of each process:\n");
    for(int i=0;i<n;i++){
        processes[i]=i+1;
        printf("p%d: ",processes[i]);
        scanf("%d",&brustTime[i]);
    }
    printf("Enter the Time Quantum:");
    scanf("%d",&quantum);
    roundRobinScheduling(processes,n,brustTime,quantum);
    return 0;
}
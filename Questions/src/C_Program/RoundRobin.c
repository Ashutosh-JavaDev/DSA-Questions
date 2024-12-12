#include <stdio.h>
#include <stdbool.h>

void roundRobinScheduling(int processes[], int n, int brustTime[], int quantum)
{
    int waitingTime[n], turnaroundTime[n], remainingbrustTime[n];
    int totalWaitingTime = 0, totalWaitingTime = 0;

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
        totalWaitingTime+=turnaroundTime[i];
    }
}
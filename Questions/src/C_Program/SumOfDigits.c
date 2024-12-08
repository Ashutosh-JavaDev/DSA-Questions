#include<stdio.h>
int SOD(int num){
    if(num<0){
        return;
    }
    return SOD(num%10)+SOD(num/10);
}
void main(){

}
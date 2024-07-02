#include<stdio.h>
void dectooct(int);
int main(){
    dectooct(224);
}
 void dectooct(int n){
    if(n== 0 ){
        return ;
    }
    int r = n %8;
    dectooct (n/8);
    printf("%d ",r);
}
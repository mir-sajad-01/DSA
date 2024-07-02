#include<stdio.h>
void dectohexd(int n);
 int main(){
    dectohexd(7562);
    return 0;
 }
 void dectohexd(int n){
    if(n == 0){
        return;
    }
    int r = n % 16;
    dectohexd(n/16);
    if(r <10 ){
        printf("%d",r );
    }else{
        printf("%c",'A'+r -10);
    }
    ;

 }
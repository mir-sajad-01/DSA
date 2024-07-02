#include<stdio.h>
int sumofnumbers(int n,int sum);
int main(){
    printf("%d",sumofnumbers(521,0));
}
int sumofnumbers(int n,int sum){
    if ( n == 0){  
        return sum;
    }
    int r = n % 10;
    sum = sum + r;
   
    return  sumofnumbers(n/10,sum);
}
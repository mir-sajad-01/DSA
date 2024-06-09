#include <stdio.h>
int main()
{
   
    // biggest and smallest no.
    
    int n;
    printf("Enter the total numbers ");
    scanf("%d", &n);
    int numbers[n];

    printf("Enter the numbers ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &numbers[i]);
    }
    int small = numbers[0];
    for(int i = 0 ;i<n ;i++){
        if(small>numbers[i]){
            small = numbers[i];
        }
    }
    printf("smalles number %d ",small);
    int big = numbers[0];
    for ( int i = 0 ;i<n;i++){
        if(big<numbers[i]){
            big = numbers[i];
        }
    }
    printf("biggest number is %d",big);
}
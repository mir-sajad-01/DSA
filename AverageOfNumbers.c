#include <stdio.h>
int main()
{
    // average of n numbers

    int n;
    printf("Enter the total numbers ");
    scanf("%d", &n);
    int numbers[n];

    printf("Enter the numbers ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &numbers[i]);
    }
    float sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += numbers[i];
    }
    float average = sum / n;
    printf("%f", average);
}
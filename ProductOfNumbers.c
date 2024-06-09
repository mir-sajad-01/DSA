#include <stdio.h>
int main()
{
    // product of n no.s
    int n;
    float product = 1.0;
    printf("Enter the total numbers ");
    scanf("%d", &n);
    int numbers[n];

    printf("Enter the numbers ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &numbers[i]);
    }
    for (int i = 0; i < n; i++)
    {
        product *= numbers[i];
    }
    printf("%f", product);
}
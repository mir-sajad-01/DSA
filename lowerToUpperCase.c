#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(){ 
    char str[5];
    printf("Enter the string in lowercase:");
    gets(str);
    int i = 0 ;
    while(str[i]!='\0'){
        int p = str[i];
        int  c = p -32;
        printf("%c",c);
        i++;
    }
}

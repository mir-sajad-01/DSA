#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(){
    char name[5];
    printf("Enter the string ");
    gets(name);
   
     int i = strlen(name);
     printf("In reverse order ");
     while(i>=0){
          printf("%c",name[i]);
          i--;
     }
}

#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){

     char str1[5];
     char str2[5];
     printf("Enter str1 and str2 \n");
     gets(str1);
     gets(str2);
     int i = 0 ;
     int p = 0;
     while(str1[i] != '\0' || str2[i] != '\0'){
          if(str1[i]!=str2[i]){
               p = 1;
               break;
          }
          i++;
     }
     if(p == 0){
          printf("Equal");
     }else{
          printf("Not Equal");
     }
}
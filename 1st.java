
#include <stdio.h>
int main(){
 char s[]="hello world";
 char *p=s;
 while(*p!='\0'){
 printf("%c",(*p)^0);
 p++;
 }
 return 0;
}   1.c
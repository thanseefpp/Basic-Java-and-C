#include <stdio.h>
int main() {
	char str1[50],str2[50];
    int i;
    printf("Enter values to array:");
    gets(str1);

    for(i=0;str1[i]!='\0';i++){
        str2[i]=str1[i];
    }

    str2[i]='\0';
    printf("Entered value:%s",str1);
    printf("\nCopied value:%s \n",str2);
    return 0;
}
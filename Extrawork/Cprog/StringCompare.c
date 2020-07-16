#include<stdio.h>
int main() {
   char string1[50],string2[50];
   int i=0,flag=0;
   printf("Enter the first string:");
   gets(string1);
   printf("\nEnter the second string:");
   gets(string2);
   for(i=0;string1[i]!='\0';i++)
   {
       if(string1[i]!=string2[i]){
           flag=1;
           break;
           }
   }
   if (flag==0)
   {
      printf("Both are same \n ");
   }
   else
   {
       printf("Not same ...\n");
   }
   return 0;
}

/*#include<stdio.h>
#include<string.h>

int main(){
    char str1[10],str2[10];
    int result,i;
    i=0;

    printf("Enter the first string:");
    scanf("%s",str1);

    printf("Enter you second name:");
    scanf("%s",str2);

    while (str1[i] == str2[i] && str1[i] == '\0'){
    i++;
    }

    if(str1[i] == str2[i])
    {
        printf("Both are same ");
        printf("\n");
    }
    else{
        printf("not same...");
        printf("\n");
    }
    return 0;
}*/
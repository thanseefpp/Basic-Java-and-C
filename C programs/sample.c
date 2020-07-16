#include<stdio.h>

int main(void){
    int a,i,j;
    printf("Enter a number :\n");
    scanf("%d",&a);
    for (i = 0; i<=a; i++)
    {
        for(j=0;j<i;j++)
        {
            printf("* ");
        }
        printf("  ");
        printf("\n");
    }
    return 0;
}
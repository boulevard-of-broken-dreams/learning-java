#include<stdio.h>
#include<conio.h>
int main()
{
int i,j,n,k;
printf("enter the number :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
for(k=n;k>i;k--)printf(" ");
for(j=1;j<=i;j++)
{
printf("%d",j);
}
if(i>1)
{
for(j=i;j>1;j--)
{
printf("%d",j-1);
}
}
printf("\n");
}

getch();
return 0;
} 
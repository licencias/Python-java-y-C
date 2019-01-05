#include <stdio.h>

long long float pow(int a,long long float b)
{
    long long float pot = 1.0;
    int i;

    for(i = 0; i < b; i++)
    {
        pot = pot*a; 
    }
    return pot;

}

int main()
{
    long long float p,x;

    scanf("%f",p);
    x = (pow(2,p))-1;

    printf("%f",x);
    return 0;
}
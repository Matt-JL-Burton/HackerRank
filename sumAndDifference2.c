#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int firstInt;
    int secondInt;
    float firstFloat;
    float secondFloat;
    scanf("%d %d",&firstInt, &secondInt);
    int addInt = firstInt + secondInt;
    int minusInt = firstInt - secondInt;
    scanf("\n");
    scanf("%f %f",&firstFloat, &secondFloat);
    float addFloat = firstFloat + secondFloat;
    float minusFloat = firstFloat - secondFloat;
    printf("%d %d\n",addInt, minusInt);    
    printf("%.1f %.1f\n",addFloat,minusFloat);
    return 0;
}
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int palindromo(char string[41])
{
    char contrario[41];
    int total=0,i,j,erro=0;

    total = strlen(string);
    j = total;
    total++;
    j--;

    for(i=0; i < total; i++) {
        contrario[i] = string[j];
        j--;
    }

    total--;

    for(i=0; i < total; i++) {
        if(string[i] != contrario[i]) { erro = 1; }
    }

    if(erro == 1) printf("\nNAO");
    else printf("\nSIM");
}

int main() {

    char string[41];
    scanf("%s",&string);

    printf(palindromo(string));

    return 0;
}

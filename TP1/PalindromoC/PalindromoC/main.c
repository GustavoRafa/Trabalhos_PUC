#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>

bool isFim(char s[]){
    bool ehFim = false;

    if(strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M')
        ehFim = true;

    return ehFim;
}

char InverterPalavra(char s[]){
    char palavraInvertida[1000];
    int len = strlen(s);

    for(int i=len-1;i>=0;i--){
        palavraInvertida[i] = palavraInvertida[i] + s[i];
    }

    return palavraInvertida;
}

int Palindromo(char s[]){
       char ehPalin[3];

       if(InverterPalavra(s) == s)
           printf("SIM");
       else
           printf("NAO");

       return 0;
}

int main (){
    char palavra[100];
    int numEntrada = 0;
    char teste[1000];

    do{
        gets(teste);
        palavra[numEntrada] = teste;
    }while(isFim(palavra[numEntrada++]) == false);
    numEntrada--;

    for(int i = 0; i < numEntrada; i++){
        Palindromo(palavra[i]);
    }

    return 0;
}

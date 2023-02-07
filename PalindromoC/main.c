#include <stdio.h>
#include <stdbool.h>

#define NUMENTRADA 1000
#define TAMLINHA 1000

  int tamanho(char s[]){
      int tamanho = 0;
      int i = 0;
      int parar = 0;

      do{

        if (s[i]!='\0'){
            i++;
            tamanho++;
        }else
            parar = 1;

      }while(parar == 0);
      tamanho--;

  return tamanho;
  }

  bool isFim(char s[]){
    return (tamanho(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
  }

  int isPalindromo(char s[]){
    int aux=0;
    int retorno = 500;
    int tam = tamanho(s);

    for(int i = 0; i<tam;i++){
        if( s[i] == s[ tam-i-1 ] ){
            aux++;
        }
     }

     if( aux == tam )
         retorno = 1;
     else
         retorno = 0;

  return retorno;
  }


  int main (void){
    char entrada[NUMENTRADA][TAMLINHA];
    int numEntrada = 0;

    do{
        fgets(entrada[numEntrada],TAMLINHA, stdin);
    }while(isFim(entrada[numEntrada++]) == false);
    numEntrada--;

    for(int i = 0; i < numEntrada; i++){
        if(isPalindromo(entrada[i])==1)
          printf("SIM\n");
        else
          printf("NAO\n");
       }

  }

#include <stdio.h>
#include <stdbool.h>
#include <string.h>

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
  bool isVogal(char s[]){
     bool retorno = false;
     int aux = 0;

     for(int i = 0; i < tamanho(s) ; i++){
        if( s[i]=='a' || s[i]=='A' || s[i]=='e' || s[i]=='E' || s[i]=='i' || s[i]=='I' || s[i]=='o' || s[i]=='O' || s[i]=='u' || s[i]=='U')
         aux++;
     }

     if(aux==tamanho(s))
        retorno = true;
     else   
        retorno = false;

    return retorno;
  }
  bool isConsoante(char s[]){
     bool retorno = false;
     int aux = 0;

     for(int i = 0; i < tamanho(s) ; i++){
        if( ((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')) && s[i]!='a' && s[i]!='A' && s[i]!='e' && s[i]!='E' && s[i]!='i' && s[i]!='I' && s[i]!='o' && s[i]!='O' && s[i]!='u' && s[i]!='U')
         aux++;
     }

     if(aux==tamanho(s))
        retorno = true;
     else   
        retorno = false;

        
    return retorno;
  } 
  bool isInteiro(char s[]){
     bool retorno = false;
     int aux = 0;
     float numero = 0;

     for(int i = 0; i<tamanho(s);i++){
         numero+=((char)s[i]-48)*10;
     }numero/=10;
     
     if(numero<2147483647){
        for(int i = 0; i < tamanho(s); i++)
            if(s[i]>='0' && s[i]<='9')
               aux++;
     }

     if(aux==tamanho(s))
        retorno = true;
     else   
        retorno = false;
        
    return retorno;
  } 
  bool isReal(char s[]){
     bool retorno = false;
     int aux = 0;
     int virgula = 0;

     for(int i = 0; i < tamanho(s); i++){
        if(s[i]>='0' && s[i]<='9')
            aux++;
        else if(s[i] == ','|| s[i] == '.'){
            aux++;
            virgula++;
        }
     }

     if(aux==tamanho(s) && virgula<=1)
        retorno = true;
     else   
        retorno = false;
        
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
        printf(isVogal(entrada[i]) == true ? "SIM" : "NAO");
        printf(isConsoante(entrada[i]) == true ? " SIM" : " NAO");
        printf(isInteiro(entrada[i]) == true ? " SIM" : " NAO");
        printf(isReal(entrada[i]) == true ? " SIM" : " NAO");
        printf("\n");
    }
}
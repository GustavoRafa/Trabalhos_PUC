#include <stdio.h>

    int main(void){
        
        int cont = 0;
        scanf("%i", &cont);
        double entrada = 0;
        
        FILE * fPointer;
        fPointer = fopen("arquivo.txt", "wb");

        for( int i= 0; i< cont; i++ ){
            scanf("%lf", &entrada );
            fwrite(&entrada, sizeof(double), 1, fPointer);
        }
        
        fclose(fPointer);
        
        
        fPointer = fopen("arquivo.txt", "rb");
          double num;

            for(int i = (cont-1)*sizeof(double); i>=0; i-=sizeof(double)){
                fseek(fPointer, i, SEEK_SET);
                fread(&num, sizeof(double), 1, fPointer);
                    if(num-(int)num == 0 )
                        printf("%i\n", (int)num);
                    else
                        printf("%g\n", num);
        }

            
          
        fclose(fPointer); 
        

    }
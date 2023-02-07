public class Prova1_Java {
    
    public static void main(String[] args) {
        int entrada;
        int numEntrada[] = new int[1000];
        int menor, aux;
        
            
            entrada = MyIO.readInt();
            
            for(int i = 0; i < entrada; i++){
                numEntrada[i] = MyIO.readInt();
            }

            for(int i = 0; i < entrada; i++){
                menor = i;
                for(int j = i+1; j < entrada; j++){
                    if(numEntrada[j] < numEntrada[menor]) 
                        menor = j;
                }

                aux = numEntrada[i];
                numEntrada[i] = numEntrada[menor];
                numEntrada[menor] = aux;
            }

            for(int i = 0; i < entrada; i++){
                MyIO.println(String.format("%04d", numEntrada[i]));
            }
        
    }
}

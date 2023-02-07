public class Prova1_Java {
    
    public static void main(String[] args) {
        String entrada;
        int numEntrada[] = new int[1000];
        int menor, aux;

           while((entrada= MyIO.readLine())!=null){
            
                for(int i = 0; i < Integer.parseInt(entrada) ; i++){
                    numEntrada[i] = MyIO.readInt();
                }

                for(int i = 0; i < Integer.parseInt(entrada); i++){
                    menor = i;
                    for(int j = i+1; j < Integer.parseInt(entrada); j++){
                        if(numEntrada[j] < numEntrada[menor]) 
                            menor = j;
                    }

                    aux = numEntrada[i];
                    numEntrada[i] = numEntrada[menor];
                    numEntrada[menor] = aux;
                }

                for(int i = 0; i < Integer.parseInt(entrada); i++){
                    MyIO.println(String.format("%04d", numEntrada[i]));
                }
        }
    }
}
package prova2b;

public class Prova2B {
    public static void main(String[] args) {
        int N, PContagem = 0, MContagem = 0, P, M;
        String entrada;
        int numEntrada[] = new int[1000];
        
        numEntrada[0] = MyIO.readInt();
        N = numEntrada[0];
        
        for(int i = 1; i <= N; i++){
            numEntrada[i] = MyIO.readInt();
            
            if(numEntrada[i] == 1){
                PContagem++;
            }else if(numEntrada[i] == 2){
                MContagem++;
            }
        }
        
        numEntrada[N+1] = MyIO.readInt();
        P = numEntrada[N+1];
        
        numEntrada[N+2] = MyIO.readInt();
        M = numEntrada[N+2];
        
        if(PContagem == P && MContagem == M){
            MyIO.print("S");
        }else
            MyIO.print("N");
           
    }
    
}

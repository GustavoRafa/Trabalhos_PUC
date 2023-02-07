package prova2a;

import main.MyIO;

public class Prova2A {
    public static void main(String[] args) {
        String entrada;
        int numEntrada[] = new int[1000];

        entrada = MyIO.readLine();
				
		String array[] = new String[3];
		array = entrada.split(" ");
				
		int N, K, U;
				
		N = Integer.parseInt(array[0]);
		K = Integer.parseInt(array[1]);
		U = Integer.parseInt(array[2]);
				
		String entradaK;
		int numEntradaK[] = new int[1000];
				
        for(int i = 0; i < N*K ; i++){
			numEntradaK[i] = MyIO.readInt();
			MyIO.println(numEntradaK[i]);
		}
    }
}

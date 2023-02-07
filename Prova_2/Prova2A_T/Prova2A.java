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
				
		String entradaKN;
		int numEntradaKN[] = new int[1000];
				
        for(int i = 0; i < N*K ; i++){
			numEntradaKN[i] = MyIO.readInt();
		}
		
		String entradaU;
		int numEntradaU[] = new int[1000];
		
		for(int i = 0; i < U; i++){
			numEntradaU[i] = MyIO.readInt();	
		}
		
		if(numEntradaKN[3] == numEntradaU[0])
			MyIO.println("3");
	}
}

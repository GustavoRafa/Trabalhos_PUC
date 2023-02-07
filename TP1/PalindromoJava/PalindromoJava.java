public class PalindromoJava{
    
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
   
   public static String InverterPalavra(String s){
       String palavraInvertida = "";
       
       for(int i=s.length()-1;i>=0;i--){  
            palavraInvertida += s.charAt(i);
       }
       
       return palavraInvertida;
   }
   
   public static String Palindromo(String s){
       String ehPalin = "";
       
       if(InverterPalavra(s).equals(s))
           ehPalin = "SIM";
       else 
           ehPalin = "NAO";
       
       return ehPalin;
   }
   
    public static void main(String[] args) {    
        int numEntrada = 0;
 	String palavra[] = new String[1000];

        do{
            String teste = MyIO.readLine();
            palavra[numEntrada] = teste;
        }while(isFim(palavra[numEntrada++]) == false);
        numEntrada--;

        for(int i = 0; i < numEntrada; i++){
            MyIO.println(Palindromo(palavra[i]));
        }
    }
}

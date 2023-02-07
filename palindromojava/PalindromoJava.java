package palindromojava;

public class PalindromoJava{
    
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
   
   public static int Palidromo(String s, int a, int b) {
        int n=0;
        if (a < s.length()) {
            if (s.charAt(a) == s.charAt(b)) {
                return 1+Palidromo(s, a + 1, b - 1); 
            }
        }
        return 0;
    }
   
   public static String Palindromo(String s){
       String ehPalin;
       
       if(Palidromo(s,0,s.length()-1) == s.length())
           ehPalin = "SIM";
       else 
           ehPalin = "NAO";
       
       return ehPalin;
   }
   
    public static void main(String[] args) { 
        
        String palavra[] = new String[1000];
        int numEntrada = 0;
       
        do{
            String teste = MyIO.readString();
            palavra[numEntrada] = teste;
        }while(isFim(palavra[numEntrada++]) == false);
        numEntrada--;

        for(int i = 0; i < numEntrada; i++){
            MyIO.println(Palindromo(palavra[i]));
        }
    }
}
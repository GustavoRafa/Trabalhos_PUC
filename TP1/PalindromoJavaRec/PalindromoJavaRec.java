class PalindromoJavaRec {
    public static boolean isFim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }
    public static boolean isPalindromo(String s){
     
      boolean retorno = false;
            
               if(s.length()>1 && s.charAt(0)==s.charAt(s.length()-1)){
                  retorno = true;
                  s=s.substring(1,s.length()-1);
                  return isPalindromo(s);
               }else if(s.length()==1 || s.length() == 0){
                  retorno = true;
               }else 
                  retorno = false;

      return retorno;
    }

    public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;

      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;

      for(int i = 0; i < numEntrada; i++){
         if(isPalindromo(entrada[i])==true)
           System.out.println("SIM");
         else
           System.out.println("NAO");
       }

    }
}
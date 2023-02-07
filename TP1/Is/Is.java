class Is{
    public static boolean isFim(String s){
        return (s.length()>=3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isVogal(String s){
     boolean retorno = false;
     int aux = 0;

     for(int i = 0; i < s.length() ; i++){
        if( s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
         aux++;
     }

     if(aux==s.length())
        retorno = true;
     else   
        retorno = false;

    return retorno;
    }

    public static boolean isConsoante(String s){
     boolean retorno = false;
     int aux = 0;

     for(int i = 0; i < s.length() ; i++){
        if( ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) && s.charAt(i)!='a' && s.charAt(i)!='A' && s.charAt(i)!='e' && s.charAt(i)!='E' && s.charAt(i)!='i' && s.charAt(i)!='I' && s.charAt(i)!='o' && s.charAt(i)!='O' && s.charAt(i)!='u' && s.charAt(i)!='U')
         aux++;
     }

     if(aux==s.length())
        retorno = true;
     else   
        retorno = false;

        
    return retorno;
    }
    
    public static boolean isInteiro(String s){
     boolean retorno = false;
     int aux = 0;
     float numero = 0;

     for(int i = 0; i<s.length();i++){
         numero+=((char)s.charAt(i)-48)*10;
     }numero/=10;
     
     if(numero<2147483647){
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
               aux++;
     }

     if(aux==s.length())
        retorno = true;
     else   
        retorno = false;
        
    return retorno;
    }
    
    public static boolean isReal(String s){
     boolean retorno = false;
     int aux = 0;
     int virgula = 0;

     for(int i = 0; i < s.length(); i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9')
            aux++;
        else if(s.charAt(i) == ','||s.charAt(i) == '.'){
            aux++;
            virgula++;
        }
     }

     if(aux==s.length() && virgula<=1)
        retorno = true;
     else   
        retorno = false;
        
    return retorno;
    }
    public static void main(String args[]){
        String[] entrada = new String[1000];
        int numEntrada = 0;
        
        do{
            entrada[numEntrada]=MyIO.readLine();
        }while ( isFim(entrada[numEntrada++]) == false );
        numEntrada--;
        
        for(int i = 0; i < numEntrada; i++){
            System.out.print(isVogal(entrada[i]) == true ? "SIM" : "NAO");
            System.out.print(isConsoante(entrada[i]) == true ? " SIM" : " NAO");
            System.out.print(isInteiro(entrada[i]) == true ? " SIM" : " NAO");
            System.out.print(isReal(entrada[i]) == true ? " SIM" : " NAO");
            System.out.println();

        }
    }
}
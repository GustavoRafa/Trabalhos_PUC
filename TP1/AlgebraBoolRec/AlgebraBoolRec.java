class AlgebraBoolRec{
    public static boolean isZero(String s){
        return (s.length()>=1 && s.charAt(0)== '0');
    }
    public static String trocarLetras(String nova, String s){
        for(int i = 0; i<s.length(); i++){
        nova=nova.replace((char)(65+i), s.charAt(i));
        }
    return nova;
    }
    public static String algebra(String nova){
        if(nova.length()>1){
            nova=nova.replace("not(0)", "1");
            nova=nova.replace("not(1)", "0");
            nova=nova.replace("and(1,1)", "1");
            nova=nova.replace("and(1,0)", "0");
            nova=nova.replace("and(0,1)", "0");
            nova=nova.replace("and(0,0)", "0");
            nova=nova.replace("and(0,0,0)", "0");
            nova=nova.replace("and(0,0,1)", "0");
            nova=nova.replace("and(0,1,0)", "0");
            nova=nova.replace("and(1,0,0)", "0");
            nova=nova.replace("and(1,1,0)", "0");
            nova=nova.replace("and(0,1,1)", "0");
            nova=nova.replace("and(1,0,1)", "0");
            nova=nova.replace("and(1,1,1)", "1");
            nova=nova.replace("or(1,1)", "1");
            nova=nova.replace("or(1,0)", "1");
            nova=nova.replace("or(0,1)", "1");
            nova=nova.replace("or(0,0)", "0");
            nova=nova.replace("or(0,0,0)", "0");
            nova=nova.replace("or(0,0,1)", "1");
            nova=nova.replace("or(0,1,0)", "1");
            nova=nova.replace("or(1,0,0)", "1");
            nova=nova.replace("or(1,1,0)", "1");
            nova=nova.replace("or(0,1,1)", "1");
            nova=nova.replace("or(1,0,1)", "1");
            nova=nova.replace("or(1,1,1)", "1");
            nova=nova.replace("or(1,1,1,1)", "1");
            nova=nova.replace("or(0,1,1,1)", "1");
            nova=nova.replace("or(1,0,1,1)", "1");
            nova=nova.replace("or(1,1,0,1)", "1");
            nova=nova.replace("or(1,1,1,0)", "1");
            nova=nova.replace("or(0,1,1,0)", "1");
            nova=nova.replace("or(0,0,1,1)", "1");
            nova=nova.replace("or(1,0,0,1)", "1");
            nova=nova.replace("or(1,1,0,0)", "1");
            nova=nova.replace("or(0,0,0,1)", "1");
            nova=nova.replace("or(1,0,0,0)", "1");
            nova=nova.replace("or(0,1,0,0)", "1");
            nova=nova.replace("or(0,0,1,0)", "1");
            nova=nova.replace("or(0,0,0,1)", "1");
            nova=nova.replace("or(0,0,0,0)", "0");
            return algebra(nova);
        }        
          
    return nova;
    }
    public static String formatar(String s){
        String nova = "";
        int tamInicial=Integer.parseInt(String.valueOf(s.charAt(0)));// transforma char em posicao tal pra inteiro

        s=s.replaceAll(" ", "");

        for(int i = tamInicial+1;i<s.length();i++){
            nova+=s.charAt(i);// string nova tem apenas a operacao
        }

        s=s.substring(1,tamInicial+1);// separa os valores binarios do resto da string

        nova=trocarLetras(nova,s); // troca as letras pelo seus valores
        nova=algebra(nova);// faz a conta booleana
        
    return nova;
    }
    public static void main (String args[]){
        String[] entrada = new String[1000];
        int numEntrada = 0;
        
        do{
            entrada[numEntrada]=MyIO.readLine();
        }while (isZero(entrada[numEntrada++]) == false);
        numEntrada--;

        for(int i = 0; i<numEntrada ; i++)
        MyIO.println(formatar(entrada[i]));
    }
}
package aleatoriojava;

import java.util.Random;

public class AleatorioJava {
    public static boolean isFim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
    public static String trocarLetra(String s,char meuChar, char meuChar2){
        
        String palavraTrocada = "";

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == meuChar)
                palavraTrocada += meuChar2;
            else
                palavraTrocada += s.charAt(i);
        }
        
        return palavraTrocada;
    }
    
    public static void main(String[] args) {
        
        int numEntrada = 0;
        String str[] = new String[1000];
        Random gerador = new Random();
        gerador.setSeed(4) ;
        
        do{
            String teste = MyIO.readLine();
            str[numEntrada] = teste;
        }while(isFim(str[numEntrada++]) == false);
        numEntrada--;
    
        for (int i = 0; i < numEntrada; i++) {
            char meuChar = ( char )( 'a' + (Math.abs(gerador.nextInt())%26));
            char meuChar2 = ( char )( 'a' + (Math.abs(gerador.nextInt())%26));
            MyIO.println(trocarLetra(str[i],meuChar,meuChar2));
        }

    }
    
}

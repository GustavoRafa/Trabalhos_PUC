import java.io.RandomAccessFile;
import java.util.Scanner;

class Arquivo{
    public static void main(String args[]) throws Exception{
        
        int cont = MyIO.readInt();
        double num = 0;
        RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "rw");
        
        long pos = raf.getFilePointer();

        for( int i= 0; i< cont; i++ ){
            raf.seek(pos+i*8);
            raf.writeDouble(MyIO.readDouble());
        }
        
        raf.close();
        
        
        RandomAccessFile raf2 = new RandomAccessFile("arquivo.txt", "r");


            for(int i = (cont-1)*8; i>=0; i-=8){
                raf2.seek(i);
                num = raf2.readDouble();
                    if(num-(int)num == 0 )
                        MyIO.println((int)num);
                    else
                        MyIO.println(num);
        }

            
          
        raf2.close(); 
        

    }
}

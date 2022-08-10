package sumanumeros2;

import java.util.Scanner;
import java.io.*;

public class While {
    public static void main(String[] args){
        int a,b;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número límite a mostrar \n");
            a=entrada.nextInt();
            b=1;
            
                while(b<=a){
                    System.out.print("Voy en: "+b+"\n");
                    b=b+1;
                }
    }
}

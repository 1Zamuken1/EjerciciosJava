package sumanumeros2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class SumaNumeros2 {
    
    public static void main(String[] args) {
        
        int n1,n3,n4,n5,n6,n7,n8,n9;
        double n2;
        
        Scanner exti = new Scanner(System.in);
        System.out.println("Programa de operaciones");
        System.out.println("Ingrese el primer número");
            n1=exti.nextInt();
        System.out.println("Ingrese el segundo número");
            n2=exti.nextDouble();
            
            
            n3=(int) (n1+n2);
            n4=(int) (n1-n2);
            n5=(int) (n1*n2);
            n6=(int) (n1/n2);
            n7=(int) sqrt(n1);
            n8=(int) sqrt(n2);
            n9 = (int) Math.pow(n1,n2);
            
            
        System.out.println("  la suma es:"+n3);
        System.out.println("  la resta es:"+n4);
        System.out.println("  la multiplicacion es:"+n5);
        System.out.println("  la division es:"+n6);
        System.out.println("  la raiz de "+n1+" es:"+n7);
        System.out.println("  la raiz de "+n2+" es:"+n8);
        System.out.println("  la potencia de "+n1+" a "+n2+" es: "+n9);
    }
}

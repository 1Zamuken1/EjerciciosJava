/*Si el cliente asegura a más personas de la indicadas en el cuadro anterior tendrá que pagar 
S/.8.00 mensuales por cada persona adicional si es que el seguro es de tipo A o B, y S/.5.00 
mensuales por cada persona adicional si es que el seguro es de tipo C o D. Calcular el monto
anual que tiene que pagar un determinado cliente.*/ 
package conexionMYSQL;
import java.util.Scanner;
public class seguros 
{
    public static void main(String args[]) 
    {    
        double montomensual,montoanual,tarifa;  
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el tipo de seguro A,B,C,D :");
        char tipo=lectura.next().toUpperCase().charAt(0);
        switch(tipo)
            {
            case 'A': 
                tarifa=40;
                System.out.println("Ingrese el numero de personas");
                int personasA=lectura.nextInt();
                if(personasA>8)
                    {
                    montomensual=(((personasA-8)*8)+tarifa);
                    montoanual=montomensual*12;
                    System.out.println("El pago anual del tipo A es:"+montoanual);
                    }
                else
                    {
                    montoanual=tarifa*12;
                    System.out.println("El pago anual del tipo A es:"+montoanual);  
                    }
            break;
            case 'B': 
                tarifa=30;
                System.out.println("Ingrese el numero de personas ");
                int personasB=lectura.nextInt();
                if(personasB>6)
                    {
                    montomensual=(((personasB-6)*8)+tarifa);
                    montoanual=montomensual*12;
                    System.out.println("El pago anual del tipo B es:"+montoanual);
                    }
                else
                    {
                    montoanual=tarifa*12;
                    System.out.println("El pago anual del tipo B es:"+montoanual);                            
                    }
            break;  
            case 'C': 
                tarifa=20;
                System.out.println("Ingrese el numero de personas ");
                int personasC=lectura.nextInt();
                if(personasC>4)
                    {
                    montomensual=(((personasC-4)*5)+tarifa);
                    montoanual=montomensual*12;
                    System.out.println("El pago anual del tipo C es:"+montoanual);
                    }
                else
                    {
                    montoanual=tarifa*12;
                    System.out.println("El pago anual del tipo C es:"+montoanual);       
                    }
            break; 
            case 'D': 
                tarifa=10;
                System.out.println("Engrese el numero de personas ");
                int personasD=lectura.nextInt();
                if(personasD>2)
                    {   
                    montomensual=(((personasD-2)*5)+tarifa);
                    montoanual=montomensual*12;
                    System.out.println("El pago anual del tipo D es:"+montoanual);
                    }
                else
                    {                      
                    montoanual=tarifa*12;
                    System.out.println("El pago anual del tipo D es:"+montoanual);       
                    }
                  break;
            default: System.out.println("No existe la categioria digitada"); 
            break;
            }
    //System.out.println("El monto anual que tiene que pagar un determinado cliente : es "+montoanual);          
    }
}
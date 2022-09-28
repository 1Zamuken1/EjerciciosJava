
package auto;

import javax.swing.JOptionPane;


public class Auto {

    /**
     * @param args the command line arguments
     */
    String color;
    String marca;
    boolean rinesLujo;
    boolean descapotable;
    int puestos;
    int modelo;
    
    public static void main(String[] args) {
        Auto auto1=new Auto();
        auto1.color ="Blanco";
        auto1.marca ="ferrari";
        auto1.modelo =2020;
        String Color ="\nEl color del auto es: ";
        String marca =" \nLa marca  del auto es: ";
        String modelo =" \nEl modelo del auto es: ";
        String rines =" \nEl auto tiene rines de lujo: ";
        String descapotable="\n El auto es descapotable: ";
        String puestos="\n La Cantidad de puestos que tiene son: ";

        
        Auto auto2=new Auto();
        auto2.color ="rojo";
        auto2.marca ="renault";
        auto2.modelo =2021;
        
        
        Auto auto3=new Auto();
        auto3.color ="naranja";
        auto3.marca ="honda";
        auto3.modelo =2000;
        auto3.rinesLujo = true;

        
        Auto auto4=new Auto();
        auto4.color ="verde";
        auto4.marca ="bmw";
        auto4.modelo =2005;
        auto4.descapotable=true;
        
        
        Auto auto5=new Auto();
        auto5.color ="azul";
        auto5.marca ="renault";
        auto5.modelo =2001;
        auto5.puestos=5;
        
    
    String cadena =JOptionPane.showInputDialog("Que auto quiere ver");
    int carros = Integer.parseInt(cadena);
    switch(carros){
            case 1 -> JOptionPane.showMessageDialog(null,Color +auto1.color+ marca + auto1.marca+ modelo+ auto1.modelo);
            case 2 -> JOptionPane.showMessageDialog(null,Color +auto2.color+ marca + auto2.marca+ modelo+ auto2.modelo);
            case 3 -> JOptionPane.showMessageDialog(null,Color +auto3.color+ marca + auto3.marca+ modelo+ auto3.modelo +rines + auto3.rinesLujo);
            case 4 -> JOptionPane.showMessageDialog(null,Color +auto4.color+ marca + auto4.marca+ modelo+ auto4.modelo +descapotable + auto4.descapotable);
            case 5 -> JOptionPane.showMessageDialog(null,Color +auto5.color+ marca + auto5.marca+ modelo+ auto5.modelo +puestos + auto5.puestos);
            default -> JOptionPane.showMessageDialog(null ,"No tenemos ese modelo disponoble");
        }
    }   
}

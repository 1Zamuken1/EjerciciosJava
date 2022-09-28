package Autos;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Autos {
    
    String color;
    String marca;
    int modelo;
    int sillas;
    boolean tanque;
    boolean estado;
    
    
    public static void main(String[]args){
        Autos auto1=new Autos();
        auto1.color="Blanco";
        auto1.marca="Ferrari";
        auto1.modelo=2020;
        auto1.sillas=2;
        auto1.tanque=true;
        auto1.estado=true;
        
        
        
        
        
        
        String color1="\nEl color del auto es: ";
        String marca1="\nLa marca del auto es: ";
        String modelo1="\nEl modelo del auto es: ";
        String sillas1="\nLas sillas son: ";
        String tanque1="\n¿El tanque está lleno? ";
        String estado1="\n¿El auto está en movimiento? ";
        
        
        
        Autos auto2=new Autos();
        auto2.color="Rojo";
        auto2.marca="Renault";
        auto2.modelo=2021;
        auto2.sillas=4;
        auto2.tanque=true;
        auto2.estado=false;
        
        
        
        Autos auto3=new Autos();
        auto3.color="naranja";
        auto3.marca="honda";
        auto3.modelo=2000;
        auto3.sillas=5;
        auto3.tanque=false;
        auto3.estado=false;
        
        
        
        Autos auto4=new Autos();
        auto4.color="rojo";
        auto4.marca="marcopolo";
        auto4.modelo=2004;
        auto4.sillas=30;
        auto4.tanque=true;
        auto4.estado=true;
        
        
        
        Autos auto5=new Autos();
        auto5.color="negro";
        auto5.marca="Lamborgini";
        auto5.modelo=2015;
        auto5.sillas=2;
        auto5.tanque=true;
        auto5.estado=true;
        
        
        /*
                                                    Experimento, cambiar boolean a String
        
        if(auto1.tanque || auto2.tanque || auto3.tanque || auto4.tanque || auto5.tanque== true){
        String Stanque = Boolean.toString(auto1.tanque || auto2.tanque || auto3.tanque || auto4.tanque || auto5.tanque);
        Stanque = "El tanque está lleno";
        } else{
         String Stanque = "El tanque está vacio";
        }*/
        
        if(auto1.tanque == true){
            String autoOne = Boolean.toString(auto1.tanque);
                autoOne="El tanque está lleno";
        
         if(auto2.tanque == true){
            String autoTwo = Boolean.toString(auto2.tanque);
                autoTwo="El tanque está lleno";
        
          if(auto3.tanque == true){
            String autoThree = Boolean.toString(auto3.tanque);
                autoThree="El tanque está lleno";
        
         if(auto4.tanque == true){
            String autoFour = Boolean.toString(auto4.tanque);
                autoFour="El tanque está lleno";
        
         if(auto5.tanque == true){
            String autoFive = Boolean.toString(auto5.tanque);
                autoFive="El tanque está lleno";
        
        }else{ System.out.print("El tanque está vacio");
        }
        }
        }
        }
        }
        
        
        

        String cadena =JOptionPane.showInputDialog("Que auto quiere ver");
    int carros= Integer.parseInt(cadena);
    switch(carros){
            case 1 -> JOptionPane.showMessageDialog(null,color1+auto1.color + marca1+auto1.marca + modelo1+auto1.modelo + estado1+auto1.estado);
            case 2 -> JOptionPane.showMessageDialog(null,color1+auto2.color + marca1+auto2.marca + modelo1+auto2.modelo + sillas1+auto1.sillas+tanque1+auto2.tanque);
            case 3 -> JOptionPane.showMessageDialog(null,marca1+auto3.marca + modelo1+auto3.modelo + tanque1+auto3.tanque +estado1+auto3.estado);
            case 4 -> JOptionPane.showMessageDialog(null,color1+auto4.color + marca1+auto4.marca + sillas1+auto4.sillas + estado1+auto4.estado);
            case 5 -> JOptionPane.showMessageDialog(null,color1+auto5.color + marca1+auto5.marca + modelo1+auto5.modelo + sillas1+auto5.sillas + tanque1+auto5.tanque +estado1+auto5.estado);

            default -> JOptionPane.showMessageDialog(null ,"No tenemos ese modelo disponoble");
        }
    }
}
    

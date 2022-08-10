package cruzroja;

import java.awt.*;
import javax.swing.*;

class CruzRoja extends Frame {
    
    Button BtnLimp = new Button();
    Button BtnMod =new Button();

    public CruzRoja() {
        Button BtnOne = new Button();
        Button BtnTwo = new Button();
        Button BtnThre = new Button();
        Button BtnFour = new Button();
        
        BtnOne.setBounds(new Rectangle(0,30, 200,200)); BtnOne.setLabel("Suma");       BtnOne.setForeground(Color.black);BtnOne.setBackground(Color.white);        BtnOne.setFont(new java.awt.Font("Arial", 1, 12));this.add(BtnOne, null);
        BtnTwo.setBounds(new Rectangle(415,30, 200,200));BtnTwo.setForeground(Color.black);BtnTwo.setLabel("Resta"); this.add(BtnTwo,null);BtnTwo.setBackground(Color.white);   BtnTwo.setFont(new java.awt.Font("Arial",1,12));
        BtnThre.setBounds(new Rectangle(0,385, 200,200));BtnThre.setForeground(Color.black);BtnThre.setLabel("Multiplicación");this.add(BtnThre,null);BtnThre.setBackground(Color.white);   BtnThre.setFont(new java.awt.Font("Arial",1,12));
        BtnFour.setBounds(new Rectangle(415,385, 200,200));BtnFour.setForeground(Color.black);BtnFour.setLabel("División");   this.add(BtnFour,null);BtnFour.setBackground(Color.white);   BtnFour.setFont(new java.awt.Font("Arial",1,12));
    }
    
public static void main(String args[]){
        CruzRoja ventana = new CruzRoja();
            ventana.setLayout(null);
            ventana.setTitle("Cruz Roja");
            ventana.setBackground(Color.RED);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.resize(620, 590);
            ventana.setVisible(true);//mostrar la ventana
}

public boolean handleEvent(Event evento) 
        {
            if (evento.id == Event.WINDOW_DESTROY) 
                {
                    System.exit(0);
                }
            return super.handleEvent(evento);
        }

public boolean action(Event evt, Object arg) 
    {
        
        if (evt.target instanceof Button) 
        {
        
            if ("Suma".equals(arg)) {this.Suma();}
            
             if ("Resta".equals(arg)) {this.Resta();} 

            if ("Multiplicación".equals(arg)) {this.Multiplicación();}
            
            if ("División".equals(arg)) {this.División();}       
        }
        return false;
        
    }

    private void Suma() {
        double a,b,c;
        
        String N = JOptionPane.showInputDialog("ingrese el primer numero");
        a = Double.parseDouble(N);
        String N1 = JOptionPane.showInputDialog("ingrese el segundo número");
        b = Double.parseDouble(N1);
        c = a+b;
        JOptionPane.showMessageDialog(null, a + "  +  " + b + " = " + c + "\n");
        System.out.println(c);
     
    }
    
    private void Resta() {
        double a,b,c;
        
        String N = JOptionPane.showInputDialog("ingrese el primer numero");
        a = Double.parseDouble(N);
        String N1 = JOptionPane.showInputDialog("ingrese el segundo número");
        b = Double.parseDouble(N1);
        c = a-b;
        JOptionPane.showMessageDialog(null, a + "  -  " + b + " = " + c + "\n");
        System.out.println(c);
     
    }
    
     private void Multiplicación() {
        double a,b,c;
        
        String N = JOptionPane.showInputDialog("ingrese el primer numero");
        a = Double.parseDouble(N);
        String N1 = JOptionPane.showInputDialog("ingrese el segundo número");
        b = Double.parseDouble(N1);
        c = a*b;
        JOptionPane.showMessageDialog(null, a + "  *  " + b + " = " + c + "\n");
        System.out.println(c);
     
    }
     
      private void División() {
        double a,b,c;
        
        String N = JOptionPane.showInputDialog("ingrese el primer numero");
        a = Double.parseDouble(N);
        String N1 = JOptionPane.showInputDialog("ingrese el segundo número");
        b = Double.parseDouble(N1);
        c = a / b;
        JOptionPane.showMessageDialog(null, a + "  /  " + b + " = " + c + "\n");
        System.out.println(c);
     
    }
        
    }
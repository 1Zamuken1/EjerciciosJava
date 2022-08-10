import java.awt.*;
import javax.swing.*;

public class juansitouwu extends JFrame{
    
JCheckBox check1, check2, check3,check4,check5;
private final JPanel panel;

public juansitouwu(){ 
    
super("Días de la semana   :3");
panel = new JPanel(); 
panel.setLayout(null);
panel.setBackground(Color.green);
setSize(300,560);
setVisible(true);

    check1 = new JCheckBox("Lunes");
    check1.setFont(new Font("broadway", 1,17));
    check1.setBounds(50,10,120,60);
    check1.setForeground(Color.BLUE);
    
    check2 = new JCheckBox("Martes");
    check2.setFont(new Font("broadway", 1,17));
    check2.setBounds(50,60,120,60);
    check2.setForeground(Color.BLUE);
    
    check3 = new JCheckBox("Miercoles");
    check3.setFont(new Font("broadway", 1,17));
    check3.setBounds(50,110,120,60);
    check3.setForeground(Color.BLUE);
    
    check4 = new JCheckBox("Jueves");
    check4.setFont(new Font("broadway", 1,17));
    check4.setBounds(50,160,120,60);
    check4.setForeground(Color.BLUE);
    
    check5 = new JCheckBox("Viernes"/*, true*/); //True para chekear el campo apenas se ejecuta
    check5.setFont(new Font("broadway", 1,17));
    check5.setBounds(50,210,120,60);
    check5.setForeground(Color.BLUE);
    
        panel.add(check1);
        panel.add(check2);
        panel.add(check3);
        panel.add(check4);
        panel.add(check5);
        
        
add(panel); 
}
public static void main(String[]args){
 juansitouwu ch = new juansitouwu();
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates por andres2288 javayotros.blogspot.com
 * and open the template in the editor.
 */
package Juegos;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class pacman extends JFrame {

    public pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Juegos());
        setTitle("http://javayotros.blogspot.com/");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Juegos ex = new Juegos();
            ex.setVisible(true);
        });
    }
}

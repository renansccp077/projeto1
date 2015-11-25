/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Renan
 */
public class Questao2 extends JFrame{

    public Questao2() {
        super("Atenção!");
        Container c = getContentPane();
        c.setLayout (new FlowLayout());
        
        c.add(new JLabel("Deseja realmente cadastrar essas informações?"));
        c.add(new JButton ("yes"));
        c.add(new JButton ("no"));
        
        
        setSize(300,100);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    
    
    public static void main (String[] args){
        new Questao2();
    }
}

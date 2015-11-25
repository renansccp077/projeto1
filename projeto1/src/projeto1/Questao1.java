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
public class Questao1 extends JFrame {

    public Questao1(){
        super("Tela de login");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        
        c.add(new JLabel("Digite um nome: "));
        c.add(new JTextField(21));
        c.add(new JLabel ("Digite uma senha: "));
        c.add(new JPasswordField(8));
        c.add(new JButton("login"));
        c.add(new JButton ("cancel"));
        
        pack();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
    new Questao1();    
         
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.awt.Container;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Renan
 */
public class Questao3 extends JFrame{
    JComboBox<String> combo;
    public Questao3(){
        super ("Cadastro...");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(new JLabel("Nome:"));
        c.add(new JTextField(20));
        c.add(new JLabel("Sexo:"));
        
        combo = new JComboBox<String>();
        combo.addItem("Masculino");
        combo.addItem("Feminino");
        c.add(combo);
        
        c.add(new JLabel("Disciplinas:"));
        c.add(new JCheckBox("Programação Orientada a Objetos II"));
        c.add(new JCheckBox("Redes de Computadores II"));
        c.add(new JCheckBox("Auditoria e Segurança de Sistemas"));
        c.add(new JCheckBox("TCC I"));
        c.add(new JCheckBox("Circuitos Digitais"));
        c.add(new JButton("cadastrar"));
        
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main (String[] args){
        new Questao3();
    }


    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.awt.*;
import javax.swing.*;
public class Quiz3 extends JFrame {
    public Quiz3(){
    setTitle("Tugas dengan border layout");
    setLayout (new GridLayout(1,5));
    setSize(350,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
        JLabel b1 = new JLabel("255,102,102");
        JLabel b2 = new JLabel("255,51,51");
        JLabel b3 = new JLabel("255,0,0");
        JLabel b4 = new JLabel("204,0,0");
        JLabel b5 = new JLabel("153,0,0");
        
        b1.setBackground(new java.awt.Color(255, 102, 102));
        b1.setOpaque(true);
        b2.setBackground(new java.awt.Color(255, 51, 51));
        b2.setOpaque(true);
        b3.setBackground(new java.awt.Color(255, 0 , 0));
        b3.setOpaque(true);
        b4.setBackground(new java.awt.Color(204, 0, 0));
        b4.setOpaque(true);
        b5.setBackground(new java.awt.Color(153, 0, 0));
        b5.setOpaque(true);
        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args){
        Quiz3 q3 = new Quiz3();
    }
    
}
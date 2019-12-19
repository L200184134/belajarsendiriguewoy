/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.awt.*;
import javax.swing.*;
public class Quiz2 extends JFrame {
    public Quiz2(){
    setTitle("Tugas dengan border layout");
    setLayout (new BorderLayout());
    setSize(350,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
        JLabel b1 = new JLabel("East");
        JLabel b2 = new JLabel("West");
        JLabel b3 = new JLabel("North");
        JLabel b4 = new JLabel("South");
        JLabel b5 = new JLabel("Center");
        
        b1.setBackground(Color.red);
        b1.setOpaque(true);
        b2.setBackground(Color.blue);
        b2.setOpaque(true);
        b3.setBackground(Color.green);
        b3.setOpaque(true);
        b4.setBackground(Color.yellow);
        b4.setOpaque(true);
        b5.setBackground(Color.orange);
        b5.setOpaque(true);
        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args){
        Quiz2 q2 = new Quiz2();
    }
    
}
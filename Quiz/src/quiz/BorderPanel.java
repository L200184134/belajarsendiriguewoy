/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.awt.*;
import javax.swing.*;
public class BorderPanel extends JPanel
{
public BorderPanel()
{
setLayout (new BorderLayout());
setBackground (Color.green);
JButton b1 = new JButton ("BUTTON 1");
JButton b2 = new JButton ("BUTTON 2");
JButton b3 = new JButton ("BUTTON 3");
JButton b4 = new JButton ("BUTTON 4");
JButton b5 = new JButton ("BUTTON 5");
add (b1, BorderLayout.CENTER);
add (b2, BorderLayout.NORTH);
add (b3, BorderLayout.SOUTH);
add (b4, BorderLayout.EAST);
add (b5, BorderLayout.WEST);
} 
}
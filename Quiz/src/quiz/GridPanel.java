/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.awt.*;
import javax.swing.*;
public class GridPanel extends JPanel
{
public GridPanel()
{
setLayout (new GridLayout (2, 3));
setBackground (Color.green);
JButton b1 = new JButton ("BUTTON 1");
JButton b2 = new JButton ("BUTTON 2");
JButton b3 = new JButton ("BUTTON 3");
JButton b4 = new JButton ("BUTTON 4");
JButton b5 = new JButton ("BUTTON 5");
add (b1);
add (b2);
add (b3);
add (b4);
add (b5);
}
}
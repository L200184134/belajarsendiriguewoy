/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.*;
import javax.swing.*;
public class IntroPanel extends JPanel
{
public IntroPanel()
{
setBackground (Color.green);
JLabel l1 = new JLabel ("Tampilan Layout untuk GUI.");
JLabel l2 = new JLabel ("Pilih tiap tab untuk melihat karakteristiknya ");
add (l1);
add (l2);
}
}

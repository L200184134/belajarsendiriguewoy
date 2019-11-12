
package asw ;
import javax.swing.*;        
import javax.swing.JButton ;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel ;

public class Login extends javax.swing.JFrame {
    
    Login(){
        initComponents();
    }
    
    public void initComponents(){
        JFrame window = new JFrame();
        JLabel name = new JLabel();
        JLabel password = new JLabel();
        JTextField textfield1 = new JTextField ();
        JTextField textfield2 = new JTextField();
        
        
        name.setText("Username");
        password.setText("Password");
        
        window.setSize(350, 300);
        
        
        window.getComponents();
    }
    
    public static void main (String[] args){
        new Login().setVisible(true);
        
    }
}

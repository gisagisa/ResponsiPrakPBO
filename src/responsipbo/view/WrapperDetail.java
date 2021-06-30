package responsipbo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import responsipbo.model.Karyawan;

/**
 *
 * @author user
 */
public class WrapperDetail extends JFrame implements ActionListener{
    
    JLabel lname = new JLabel("Nama :");
    JLabel lage = new JLabel("Umur :");
    JLabel lsalary = new JLabel("Gaji :");
    
    JLabel lValuename = new JLabel();
    JLabel lValueage = new JLabel();
    JLabel lValuesalary = new JLabel();
    
    JButton bback = new JButton("Kembali");

    public WrapperDetail() {
        setSize(500,350);   
        setLayout(null);
        
        
        super.add(lname);
        super.add(lage);
        super.add(lsalary);
        
        super.add(lValuename);
        super.add(lValueage);
        super.add(lValuesalary);
        
        super.add(bback);
        
        
        lname.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lage.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lsalary.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        lValuename.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lValueage.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lValuesalary.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        bback.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        lname.setBounds(40, 10, 80, 30);
        lage.setBounds(40, 50, 80, 30);
        lsalary.setBounds(40, 90, 80, 30);
        
        lValuename.setBounds(160, 10, 280, 30);
        lValueage.setBounds(160, 50, 280, 30);
        lValuesalary.setBounds(160,90, 280, 30);
        
        bback.setBounds(40, 270,100, 25);
        
        bback.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

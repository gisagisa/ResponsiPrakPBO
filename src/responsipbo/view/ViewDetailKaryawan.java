package responsipbo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author user
 */
public class ViewDetailKaryawan extends WrapperDetail implements ActionListener{
    
    JLabel ltotalSalary = new JLabel("Total Gaji :");
    JLabel lValuetotal = new JLabel();

    public ViewDetailKaryawan() {
        
        setTitle("");
        
        super.add(ltotalSalary);
        super.add(lValuetotal);
        
        
        ltotalSalary.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lValuetotal.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        ltotalSalary.setBounds(40, 130, 80, 30);

        lValuetotal.setBounds(160, 135, 280, 25);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bback) {
            this.dispose();
        }
    }
    
}

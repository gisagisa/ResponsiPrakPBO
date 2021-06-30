package responsipbo.view;

/**
 *
 * @author user
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WrapperKaryawan extends JFrame  implements ActionListener{
    JLabel lheader = new JLabel();
    
    protected String title;
    protected String header;
    
    JLabel lname = new JLabel("Nama");
    JLabel lage = new JLabel("Umur");
    JLabel lsalary = new JLabel("Gaji");
    
    final JTextField fname = new JTextField();
    final JTextField fage = new JTextField();
    final JTextField fsalary = new JTextField();
    
    JButton bsubmit = new JButton("SUBMIT");
    JButton breset = new JButton("RESET");
    JButton bback = new JButton("KEMBALI");

    public WrapperKaryawan(String title, String header){
        setSize(500,300);   
        setLayout(null);
        
        this.title = title;
        this.header = header;
        
        setTitle(this.title);
        lheader.setText(this.header);
        
        super.add(lheader);
        
        super.add(lname);
        super.add(lage);
        super.add(lsalary);
        
        super.add(fname);
        super.add(fage);
        super.add(fsalary);
        
        super.add(bsubmit);
        super.add(breset);
        super.add(bback);
        
        lheader.setFont(new Font("Century Gothic",Font.BOLD,12));
        
        lname.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lage.setFont(new Font("Century Gothic",Font.PLAIN,12));
        lsalary.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        fname.setFont(new Font("Century Gothic",Font.PLAIN,12));
        fage.setFont(new Font("Century Gothic",Font.PLAIN,12));
        fsalary.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        bsubmit.setFont(new Font("Century Gothic",Font.PLAIN,12));
        breset.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bback.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        lheader.setBounds(40, 10, 200, 30);
        lname.setBounds(40, 50, 80, 30);
        lage.setBounds(40, 90, 80, 30);
        lsalary.setBounds(40, 130, 80, 30);
        
        fname.setBounds(160, 55, 280, 25);
        fage.setBounds(160, 95, 280, 25);
        fsalary.setBounds(160, 135, 280, 25);
        
        bsubmit.setBounds(160, 180, 120, 25);
        breset.setBounds(320, 180, 120, 25);
        bback.setBounds(40, 230,400, 25);
       
        bsubmit.setBackground(Color.blue);
        bsubmit.setForeground(Color.white);
        breset.setBackground(Color.red);
        breset.setForeground(Color.white);
        
        bsubmit.addActionListener(this);
        breset.addActionListener(this);
        bback.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    
}

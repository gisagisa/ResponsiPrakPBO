package responsipbo.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import responsipbo.controller.ControllerAddKaryawan;
import responsipbo.controller.ControllerLihatKaryawan;

/**
 *
 * @author user
 */
public class ViewMenu extends JFrame implements ActionListener{
    ControllerAddKaryawan controllerAddKaryawan = new ControllerAddKaryawan();
    ControllerLihatKaryawan controllerLihatKaryawan = new ControllerLihatKaryawan();
    JLabel lheader = new JLabel("Main Menu");
    
    JButton badd = new JButton("Tambah Karyawan");
    JButton bread = new JButton("Lihat Karyawan");

    public ViewMenu() {
        setLayout(null);
        setSize(200,200);   
        
        super.add(lheader);
        super.add(badd);
        super.add(bread);
        
        lheader.setFont(new Font("Century Gothic",Font.BOLD,12));
        badd.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bread.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        lheader.setBounds(60, 10, 190, 30);
        badd.setBounds(20, 70, 150, 25);
        bread.setBounds(20, 105, 150, 25);
        
        badd.addActionListener(this);
        bread.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == badd) {
            controllerAddKaryawan.viewAddKaryawan();
        }
        if (e.getSource() == bread) {
            controllerLihatKaryawan.viewLihatKaryawan();
        }
    }
}

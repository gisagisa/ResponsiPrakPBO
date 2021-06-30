package responsipbo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import responsipbo.controller.ControllerLemburKaryawan;
import responsipbo.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewLemburKaryawan extends WrapperDetail implements ActionListener{
    
    ControllerLemburKaryawan controllerLemburKaryawan = new ControllerLemburKaryawan();
    
    JLabel llembur = new JLabel("Lembur(jam) :");
    
    final JTextField fjamLembur= new JTextField();
 
    JButton btotal = new JButton("Total Gaji");
    JButton bedit = new JButton("Edit");
    JButton bdelete = new JButton("Hapus");
    
    Karyawan karyawan;

    public ViewLemburKaryawan(Karyawan karyawan) {
        
        this.karyawan=karyawan;
        
        setTitle("");
        
        lValuename.setText(karyawan.getName());
        lValueage.setText(String.valueOf(karyawan.getAge()));
        lValuesalary.setText(String.format("%,.2f", karyawan.getSalary()));
        
        super.add(llembur);
        
        super.add(fjamLembur);
        
        super.add(btotal);
        super.add(bedit);
        super.add(bdelete);
        
        
        llembur.setFont(new Font("Century Gothic",Font.PLAIN,12));
        fjamLembur.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        btotal.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bedit.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bdelete.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        llembur.setBounds(40, 130, 80, 30);

        fjamLembur.setBounds(160, 135, 280, 25);
        
        btotal.setBounds(180, 210, 120, 25);
        
        bedit.setBounds(190, 270,100, 25);
        bdelete.setBounds(340, 270, 100, 25);
       
        bedit.setBackground(Color.blue);
        bedit.setForeground(Color.white);
        bdelete.setBackground(Color.red);
        bdelete.setForeground(Color.white);
        
        btotal.addActionListener(this);
        bedit.addActionListener(this);
        bdelete.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btotal) {
            //controllerLemburKaryawan.viewDetailKaryawan(this, karyawan, total);
        }
        if (e.getSource() == bback) {
            this.dispose();
        }
        if (e.getSource() == bedit) {
            controllerLemburKaryawan.edit(this, karyawan);
        }
        if (e.getSource() == bdelete) {
            controllerLemburKaryawan.delete(this, karyawan.getId());
        }
    }
    
}

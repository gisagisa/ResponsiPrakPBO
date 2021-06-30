package responsipbo.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import responsipbo.controller.ControllerLemburKaryawan;

import responsipbo.controller.ControllerLihatKaryawan;
import responsipbo.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewLihatKaryawan extends JFrame implements MouseListener, ActionListener{
    JTable tabel;
    DefaultTableModel model;
    
    Object[] opt ;
    
    JButton bback = new JButton("KEMBALI");
    
    ControllerLihatKaryawan controllerLihatKaryawan = new ControllerLihatKaryawan();
    ControllerLemburKaryawan controllerLemburKaryawan = new ControllerLemburKaryawan();
    
    Karyawan[] emps = new Karyawan[500];
    
    public ViewLihatKaryawan(Karyawan[] emps) {
        
        this.emps=emps;
        
        setLayout(null);
        setSize(600,300);   
        
        setTitle("Data Karyawan");
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","NAMA","USIA","GAJI"});
        tabel = new JTable(model);
        
        TableColumn column;
        tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = tabel.getColumnModel().getColumn(0); 
        column.setPreferredWidth(50);
        column = tabel.getColumnModel().getColumn(1); 
        column.setPreferredWidth(250); 
        column = tabel.getColumnModel().getColumn(2); 
        column.setPreferredWidth(60); 
        column = tabel.getColumnModel().getColumn(3); 
        column.setPreferredWidth(200); 
        
        this.emps=emps;
        for (Karyawan emp : emps) {//type value : values
            try{
            model.addRow(new Object[]{emp.getId(), emp.getName(),
            emp.getAge(),emp.getSalary()});
            }catch(Exception e){
               
            }   
        }
        
        tabel.setFont(new Font("Century Gothic",Font.PLAIN,14));
        
        JScrollPane scroll = new JScrollPane(tabel);
       
        super.add(scroll);
        scroll.setBounds(10,10,560,200);
        
        super.add(bback);
        
        bback.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bback.setBounds(10, 230,565, 25);
        bback.addActionListener(this);
        
        addMouseListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bback) {
            this.dispose();
        }
    };

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tabel.getSelectedRow() != -1) {
            int index = tabel.getSelectedRow() ;
            controllerLihatKaryawan.viewLemburKaryawan(this, emps[index]);
        }
        else{
            System.out.println("gagal");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}

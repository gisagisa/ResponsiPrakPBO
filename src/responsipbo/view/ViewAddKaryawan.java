package responsipbo.view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import responsipbo.controller.ControllerAddKaryawan;

/**
 *
 * @author user
 */
public class ViewAddKaryawan extends WrapperKaryawan {

    ControllerAddKaryawan controllerAddKaryawan = new ControllerAddKaryawan();

    public ViewAddKaryawan() {
        super("Input Karyawan", "Input Karyawan");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == bsubmit) {
//            try {
//                String name = this.fname.getText();
//                int age = Integer.parseInt(this.fage.getText());
//                double salary = Double.parseDouble(this.fsalary.getText());
//
//                controllerAddKaryawan.AddKaryawanBaru(0, name, age, salary, this);
//            }catch (Exception e) {
//                System.out.print(e.getMessage());
//                if ("Bilangan Harus Positif".equals(e.getMessage())) {
//                    JOptionPane.showMessageDialog(this, e.getMessage());
//                } else {
//                    JOptionPane.showMessageDialog(this, "Usia dan Gaji Harus Bilangan");
//                }
//            }
//        }
        if (e.getSource() == breset) {
            this.fname.setText("");
            this.fage.setText("");
            this.fsalary.setText("");
        }
        if (e.getSource() == bback) {
            this.dispose();
        }
    }
}

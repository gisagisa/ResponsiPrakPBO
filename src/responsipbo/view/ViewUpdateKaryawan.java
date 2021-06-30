package responsipbo.view;

//import java.awt.event.ActionEvent;

import java.awt.event.ActionEvent;
import responsipbo.model.Karyawan;

//import projectprak.controller.ControllerCheckin;

/**
 *
 * @author user
 */
public class ViewUpdateKaryawan extends WrapperKaryawan {
    Karyawan update;
    //ControllerCheckin controllerCheckin = new ControllerCheckin();
    public ViewUpdateKaryawan(Karyawan karyawan) {
        super("", "Update Karyawan");
        this.update=karyawan;
//        super.getFnama().setText(karyawan.getNama());
//        super.getFusia().setText(String.valueOf(karyawan.getUsia()));
//        super.getFgaji().setText(String.format("%,.2f", karyawan.getGaji()));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bsubmit) {
//            String name = this.fname.getText();
//            int age = Integer.parseInt(this.fage.getText());
//            double salary = Double.parseDouble(this.fsalary.getText());
//            controllerAddKaryawan.AddKaryawanBaru(0,name,age,salary,this);
        }
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

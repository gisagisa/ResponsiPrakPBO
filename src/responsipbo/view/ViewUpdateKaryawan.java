package responsipbo.view;

//import java.awt.event.ActionEvent;

import java.awt.event.ActionEvent;

//import projectprak.controller.ControllerCheckin;

/**
 *
 * @author user
 */
public class ViewUpdateKaryawan extends WrapperKaryawan {
    //ControllerCheckin controllerCheckin = new ControllerCheckin();
    public ViewUpdateKaryawan() {
        super("", "Update Karyawan");
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

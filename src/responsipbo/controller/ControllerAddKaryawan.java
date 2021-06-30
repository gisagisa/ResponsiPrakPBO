package responsipbo.controller;

import javax.swing.JOptionPane;
import responsipbo.model.Karyawan;
import responsipbo.model.ModelKaryawan;
import responsipbo.view.ViewAddKaryawan;

/**
 *
 * @author user
 */
public class ControllerAddKaryawan {

    public ViewAddKaryawan viewAddKaryawan() {
        return new ViewAddKaryawan();
    }

    public void AddKaryawanBaru(int id, String name, int age , double Salary, ViewAddKaryawan view) {
        Karyawan newEmp = new Karyawan(0, name, age, Salary);
        ModelKaryawan mk = new ModelKaryawan();
        String msg = mk.create(newEmp);

        JOptionPane.showMessageDialog(view, msg);

    }

}

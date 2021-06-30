package responsipbo.controller;

import responsipbo.model.Karyawan;
import responsipbo.model.ModelKaryawan;
import responsipbo.view.ViewLemburKaryawan;
import responsipbo.view.ViewLihatKaryawan;

/*
 *
 * @author user
 */
public class ControllerLihatKaryawan {
    public ViewLihatKaryawan viewLihatKaryawan() {
       ModelKaryawan mk= new ModelKaryawan();
       Karyawan[] emps = mk.getAll();
       
       return new ViewLihatKaryawan(emps);
    }
    public void viewLemburKaryawan(ViewLihatKaryawan list, Karyawan karyawan) {
        list.toBack();
        ModelKaryawan mk= new ModelKaryawan();
        Karyawan emp = mk.getOne(karyawan.getId());
        System.out.println(emp);
        ViewLemburKaryawan baru = new ViewLemburKaryawan(emp);
        baru.toFront();
        //return new ViewLemburKaryawan(emp);
    }
}

package responsipbo.controller;

import responsipbo.model.Karyawan;
import responsipbo.model.ModelKaryawan;
import responsipbo.view.ViewLemburKaryawan;
import responsipbo.view.ViewLihatKaryawan;

/*
 *
 * @author user
 */
public class ControllerLemburKaryawan {
    public ViewLemburKaryawan DetailKaryawan(ViewLihatKaryawan list, Karyawan karyawan) {
        ModelKaryawan mk= new ModelKaryawan();
        Karyawan emp = mk.getOne(karyawan.getId());
        System.out.println(emp);
        //ViewLemburKaryawan baru = new ViewLemburKaryawan(emp);
        return new ViewLemburKaryawan(emp);
    }
}

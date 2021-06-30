package responsipbo.controller;

import responsipbo.model.Karyawan;
import responsipbo.model.ModelKaryawan;
import responsipbo.view.ViewDetailKaryawan;
import responsipbo.view.ViewLemburKaryawan;
import responsipbo.view.ViewLihatKaryawan;

/*
 *
 * @author user
 */
public class ControllerDetailKaryawan {
    public ViewDetailKaryawan viewDetailKaryawan() {
       return new ViewDetailKaryawan();
    }
}

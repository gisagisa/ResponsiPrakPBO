package responsipbo.controller;

import javax.swing.JOptionPane;
import responsipbo.model.Karyawan;
import responsipbo.model.ModelKaryawan;
import responsipbo.view.ViewLemburKaryawan;
import responsipbo.view.ViewLihatKaryawan;
import responsipbo.view.ViewUpdateKaryawan;

/*
 *
 * @author user
 */
public class ControllerLemburKaryawan {
    public ViewLemburKaryawan DetailKaryawan(ViewLihatKaryawan list, Karyawan karyawan) {
        ModelKaryawan mk= new ModelKaryawan();
        Karyawan emp = mk.getOne(karyawan.getId());
        return new ViewLemburKaryawan(emp);
    }
    public void edit(ViewLemburKaryawan gaji, Karyawan karyawan) {
        gaji.toBack();
        ViewUpdateKaryawan baru = new ViewUpdateKaryawan(karyawan);
        baru.toFront();
    }

    public void delete(ViewLemburKaryawan gaji, int id) {
        int input = JOptionPane.showConfirmDialog(gaji,
                "Yakin ingin menghapus?", "Hapus data",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        System.out.println(input);
        if (input == 0) {
            ModelKaryawan mk = new ModelKaryawan();
            String msg = mk.delete(id);
            JOptionPane.showMessageDialog(gaji,msg);
            gaji.toBack();
        }
    }
}

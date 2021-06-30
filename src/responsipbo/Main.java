package responsipbo;

import responsipbo.model.Karyawan;
import responsipbo.view.ViewAddKaryawan;
import responsipbo.view.ViewDetailKaryawan;
import responsipbo.view.ViewLemburKaryawan;
import responsipbo.view.ViewLihatKaryawan;
import responsipbo.view.ViewMenu;
import responsipbo.view.ViewUpdateKaryawan;
import responsipbo.view.WrapperKaryawan;


/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new ViewMenu();
        new ViewDetailKaryawan();
        new WrapperKaryawan("","Edit Karyawan");
    }
    
}

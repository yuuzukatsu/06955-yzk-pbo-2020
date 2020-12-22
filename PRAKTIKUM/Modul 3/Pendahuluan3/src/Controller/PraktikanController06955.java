package Controller;
import Entity.DaftarPrakEntity06955;
import Entity.PraktikanEntity06955;
import java.util.Date;
    
public class PraktikanController06955 implements ControllerInterface06955{
    int indexLogin = 0;
    public PraktikanController06955(){}

    public PraktikanEntity06955 getData(){
        return AllObjectModel06955.praktikanmodel.getDataPraktikanEntityArrayList(indexLogin);
    }
    
    public void daftarPraktikum(int indexPraktikum, PraktikanEntity06955 praktikanentity, boolean isVerfied){
        AllObjectModel06955.daftarprakmodel.insertDataDaftarPrak(new DaftarPrakEntity06955(indexPraktikum,praktikanentity,isVerfied));
    }
    
    @Override
    public void login(String npm, String password) {
        indexLogin = AllObjectModel06955.praktikanmodel.cekData(npm, password);
    }
    
    public void insert(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas){
        AllObjectModel06955.praktikanmodel.insertPraktikan(new PraktikanEntity06955(npm,password,nama,no_telp,tglLahir,kelas));
    }
    
    public PraktikanEntity06955 praktikanEntity(){
        return AllObjectModel06955.praktikanmodel.getDataPraktikanEntityArrayList(indexLogin);
    }
    
    public int cekDaftarprak(String npm){
        int cek = AllObjectModel06955.daftarprakmodel.cekData(npm, null);
        return cek;
    }
    
    public DaftarPrakEntity06955 showDaftarPrak(int index){
        return AllObjectModel06955.daftarprakmodel.showDaftarPrak(index);
    }
}

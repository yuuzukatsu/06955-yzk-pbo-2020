package Controller;
import Entity.DaftarPrakEntity06955;
import Entity.PraktikanEntity06955;
import Entity.PraktikumEntity06955;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
    
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
    
    public DefaultTableModel daftarprak(){
        DefaultTableModel dtmprak = new DefaultTableModel();
        Object[] kolom = {"NPM","Nama","Password","No. Telp","Tgl Lahir","Praktikum","Verfified","Kelas"};
        dtmprak.setColumnIdentifiers(kolom);
        int size = AllObjectModel06955.daftarprakmodel.alldataprak().size();
        String verif = null;
        for(int i=0;i<size;i++){
            if(AllObjectModel06955.daftarprakmodel.alldataprak().get(i).isVerified()==false){
                verif = "no";
            }else{
                verif = "yes";
            }
            Object[] data = new Object[8];
            data[0] = AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getNpm();
            data[1] = AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getNama();
            data[2] = AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getPassword();
            data[3] = AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getNo_telp();
            data[4] = new SimpleDateFormat("dd-MM-YYYY").format(AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getTglLahir());
            data[5] = PraktikumEntity06955.nama[AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getIndexPrak()];
            data[6] = verif;
            data[7] = AllObjectModel06955.daftarprakmodel.alldataprak().get(i).getPraktikan().getKelas();
            dtmprak.addRow(data);
        }
        return dtmprak;
    }
    
}

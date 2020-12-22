package Model;
import Entity.DaftarPrakEntity06955;
import Entity.PraktikumEntity06955;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarPrakModel06955 implements ModelInterfaces06955 {
    public static ArrayList<DaftarPrakEntity06955> daftarPrakArrayList;
    
    public DaftarPrakModel06955(){
        daftarPrakArrayList = new ArrayList<DaftarPrakEntity06955>();
    }
    public void insertDataDaftarPrak(DaftarPrakEntity06955 daftarPrak){
        daftarPrakArrayList.add(daftarPrak);
    }
    
    public ArrayList<DaftarPrakEntity06955> getDaftarPrakArrayList(){
        return daftarPrakArrayList;
    }
    
    @Override
    public void view(){
        for(DaftarPrakEntity06955 daftarprak : daftarPrakArrayList){
            System.out.println("==================");
            System.out.println("NPM : "+daftarprak.getPraktikan().getNpm());
            System.out.println("Nama : "+daftarprak.getPraktikan().getNama());
            System.out.println("Password : "+daftarprak.getPraktikan().getPassword());
            System.out.println("No. Telp : "+daftarprak.getPraktikan().getNo_telp());
            System.out.println("Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarprak.getPraktikan().getTglLahir()));
            System.out.println("Praktikum : "+PraktikumEntity06955.nama[daftarprak.getIndexPrak()]);
            System.out.print("Is Verified : ");
            if(daftarprak.isVerified() == false){
                System.out.println("Belum verifikasi");
            }else{
                System.out.println("Sudah Verifikasi");
            }
            System.out.println("==================");
        }
    }
    @Override
    public int cekData(String npm, String password){
        int loop = 0;
        if(daftarPrakArrayList.size()==0){
            loop = -1;
        }else{
            for(int i = 0;i < daftarPrakArrayList.size();i++){
                if(daftarPrakArrayList.get(i).getPraktikan().getNpm().equals(npm)){
                    loop = i;
                    break;
                }else{
                    loop=-2;
                }
            }
        } return loop;
    }
    public DaftarPrakEntity06955 showDaftarPrak(int index){
        return daftarPrakArrayList.get(index);
    }
    public void updateIsVerified(int index, DaftarPrakEntity06955 daftarprak){
        daftarPrakArrayList.set(index, daftarprak);
    }
}

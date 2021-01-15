package Project;

import view.GUI;

public class Main06955 {
    
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
    }
    
    /*
    public static AdminController06955 admin = new AdminController06955();
    public static PraktikanController06955 praktikan = new PraktikanController06955();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int loop=0, pilih;
        admin.dataAslab();
        do{
            System.out.print(""
                    + "Selamat Datang di Lab Informatika ITATS\n"
                    + "1. Login\n"
                    + "2. Daftar\n"
                    + "0. Exit\n"
                    + "Masukkan Pilihan : ");pilih = input.nextInt();
            switch(pilih){
                case 1:
                    int pilLogin = 0;
                    System.out.print(""
                            + "1. Login Aslab\n"
                            + "2. Login Praktikan\n"
                            + "Pilih : "); pilLogin = input.nextInt();
                    if(pilLogin == 1){
                        loginAslab();
                    }else{
                        loginPraktikan();
                    }
                    break;
                case 2:
                    registerPraktikan();
                    break;
                case 3:
                    admin.viewAslab();
                    break;
                default:
                    break;
            }
        }while(pilih!=0);
    }
    
    static void registerPraktikan(){
        try{
            System.out.print("Input NPM = ");String npm = input.next();
            System.out.print("Input Nama = ");String nama = input.next();
            System.out.print("Input Password = ");String pass = input.next();
            System.out.print("Input No Telp = ");String telp = input.next();
            System.out.print("Input Tlg Lahir (dd/mm/yyyy) = ");Date tanggal = new Date(input.next());
            System.out.print("Input Kelas = ");String kelas = input.next();
            praktikan.insert(npm,pass,nama,telp,tanggal,kelas);
            System.out.println("Daftar sukses");
        }catch (Exception exception){
            System.out.println("Format salah");   
        }
    }
    
    static void registerPraktikum(){
        for(int i=0;i<PraktikumEntity06955.nama.length;i++){
            System.out.println(i+". "+PraktikumEntity06955.nama[i]);
        }
        System.out.print("Pilih Praktikum = ");int pilPrak = input.nextInt();
        praktikan.daftarPraktikum(pilPrak,praktikan.getData(),false);
        admin.listPendaftarPraktikum();
    }
    
    static void viewDaftarPrak(){
        admin.listPendaftarPraktikum();
    }
    
    static void loginAslab(){
        System.out.print("NPM : "); String npm = input.next();
        System.out.print("Password : "); String pass = input.next();
        try{
            admin.login(npm, pass);
            System.out.println("Selamat datang");
            if(admin.cekdaftarprakModel().size() == 0){
                System.out.println("Data kosong");
            }else{
                viewDaftarPrak();
                updateIsVerified();
            }
        }catch (Exception exception){
            System.out.println("NPM atau Password salah");
        }
    }
    
       static void loginPraktikan(){
        System.out.print("NPM : "); String npm = input.next();
        System.out.print("Password : "); String pass = input.next();
        praktikan.login(npm, pass);
        System.out.println("Selamat datang" + praktikan.praktikanEntity().getNama());
        int cek = praktikan.cekDaftarprak(praktikan.praktikanEntity().getNpm());
        if(cek == -1){
            System.out.println("Belum daftar");
            registerPraktikum();
        }else if(cek == -2){
            System.out.println("Belum daftar");
            registerPraktikum();
        }else{
            System.out.println("============================");
            System.out.println("NPM         : "+praktikan.showDaftarPrak(cek).getPraktikan().getNpm());
            System.out.println("Nama        : "+praktikan.showDaftarPrak(cek).getPraktikan().getNama());
            System.out.println("Password    : "+praktikan.showDaftarPrak(cek).getPraktikan().getPassword());
            System.out.println("No.Telp     : "+praktikan.showDaftarPrak(cek).getPraktikan().getNo_telp());
            System.out.println("Praktikum   : "+PraktikumEntity06955.nama[praktikan.showDaftarPrak(cek).getIndexPrak()]);
            System.out.print  ("Is Verified : ");
            if(praktikan.showDaftarPrak(cek).isVerified()==false){
                System.out.println("Belum verifikasi admin");
            }else{
                System.out.println("Sudah Verifikasi");
            }
            System.out.println("Kelas       : "+praktikan.showDaftarPrak(cek).getPraktikan().getKelas());
            System.out.println("============================");
        }
    }

    static void updateIsVerified(){
        System.out.print("NPM Praktikan = ");
        String npm = input.next();
        int index = AllObjectModel06955.daftarprakmodel.cekData(npm, null);
        admin.updateIsVerified(index, praktikan.showDaftarPrak(index).getIndexPrak(),praktikan.showDaftarPrak(index).getPraktikan());
    }
    
}*/

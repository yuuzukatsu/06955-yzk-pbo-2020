package Project;

import Entity.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main06955 {
    private static AslabModel06955 aslabModel = new AslabModel06955();
    private static Scanner input = new Scanner(System.in);
    private static PraktikanModel06955 praktikanModel = new PraktikanModel06955();
    private static DaftarPrakModel06955 daftarPrakModel = new DaftarPrakModel06955();
    private static int pilPrak;
    static int cekPraktikan,cekAslab;
    
    public static void main(String[] args) {
        int loop=0, pilih;
        dataAslab();
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
                        loginAdmin();
                    }else{
                        login();
                    }
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    aslabModel.view();
                    break;
                default:
                    break;
            }
        }while(pilih!=0);
    }
    
    static void dataAslab(){
        String npmAslab[]={"01","02","03","04","05","06","07"};
        String passwordAslab[]={"01","02","03","04","05","06","07"};
        String namaAslab[]={"Michael","Fadlan","Odalia","Fitria","Sita","Eric","Fernanda"};
        String notelpAslab[]={"01","02","03","04","05","06","07"};
        String tgllahirAslab[]={"04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000"};
        String lab[]={"RPL", "SO", "BASPRO","RPL", "SO", "BASPRO", "RPL"};
        for(int i=0;i<npmAslab.length;i++){
            aslabModel.insertAslab(new AslabEntity06955(npmAslab[i],passwordAslab[i],namaAslab[i],notelpAslab[i],new Date(tgllahirAslab[i]), lab[i]));
        }
    }
    
    static void register(){
        System.out.print("Input NPM = ");String npm = input.next();
        System.out.print("Input Nama = ");String nama = input.next();
        System.out.print("Input Password = ");String pass = input.next();
        System.out.print("Input No Telp = ");String telp = input.next();
        System.out.print("Input Tlg Lahir (dd/mm/yyyy) = ");Date tanggal = new Date(input.next());
        System.out.print("Input Kelas = ");String kelas = input.next();
        praktikanModel.insertPraktikan(new PraktikanEntity06955(npm,pass,nama,telp,tanggal,kelas));
    }
    static void login(){
        System.out.print("NPM : "); String npm = input.next();
        System.out.print("Password : "); String pass = input.next();
        cekPraktikan = praktikanModel.cekData(npm,pass);
        System.out.println("Selamat datang "+praktikanModel.getDataPraktikanEntityArrayList(cekPraktikan).getNama());
        int cekPraktikum = daftarPrakModel.cekData(npm, pass);
        if(cekPraktikum == -1 || cekPraktikum == -2){
            System.out.println("Anda belum daftar");
            daftarPrak();
        }else{
            System.out.println("Nama : "+daftarPrakModel.showDaftarPrak(cekPraktikan).getPraktikan().getNama());
            System.out.println("NPM : "+daftarPrakModel.showDaftarPrak(cekPraktikan).getPraktikan().getNpm());
            System.out.println("No Telp : "+daftarPrakModel.showDaftarPrak(cekPraktikan).getPraktikan().getNo_telp());
            System.out.println("Is Verified : "+daftarPrakModel.showDaftarPrak(cekPraktikan).isVerified());
        }
    }
    static void daftarPrak(){
        for(int i=0;i<PraktikumEntity06955.nama.length;i++){
            System.out.println(i+". "+PraktikumEntity06955.nama[i]);
        }
        System.out.print("Pilih Praktikum = ");pilPrak = input.nextInt();
        daftarPrakModel.insertDataDaftarPrak(new DaftarPrakEntity06955(pilPrak,praktikanModel.getDataPraktikanEntityArrayList(cekPraktikan),false));
    }
    
    static void loginAdmin(){
        System.out.print("NPM : "); String npm = input.next();
        System.out.print("Password : "); String pass = input.next();
        cekAslab = aslabModel.cekData(npm, pass);
        System.out.println("Selamat Datang "+aslabModel.showDataAslab(cekAslab).getNama());
        praktikanModel.view();
        updateIsVerified();
    }
    static void updateIsVerified(){
        System.out.print("NPM Praktikan = ");
        String npm = input.next();
        int index = daftarPrakModel.cekData(npm, null);
        System.out.println(index);
        daftarPrakModel.updateIsVerified(index, new DaftarPrakEntity06955(pilPrak, praktikanModel.getDataPraktikanEntityArrayList(index),true));
    }
}

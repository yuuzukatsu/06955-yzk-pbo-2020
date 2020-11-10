package Dimas06955_MonitoringCaseGangguan;
import java.util.ArrayList;
import java.util.Scanner;

public class Dimas06955_PelangganEntity {
    static ArrayList <Dimas06955_PelangganEntity> Dimas06955_ArrayPelanggan = new ArrayList();
    static Scanner input = new Scanner(System.in);
    int Dimas06955_IdPelanggan,Dimas06955_Kontak;
    String Dimas06955_NamaPelanggan,Dimas06955_Alamat;
    
    public Dimas06955_PelangganEntity(int Dimas06955_IdPelanggan, String Dimas06955_NamaPelanggan, int Dimas06955_Kontak, String Dimas06955_Alamat){
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_NamaPelanggan=Dimas06955_NamaPelanggan;
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        this.Dimas06955_Alamat=Dimas06955_Alamat;
    }
    int GetIdPelanggan(){
        return this.Dimas06955_IdPelanggan;
    }
    String GetNamaPelanggan(){
        return this.Dimas06955_NamaPelanggan;
    }
    int GetKontak(){
        return this.Dimas06955_Kontak;
    }
    String GetAlamat(){
        return this.Dimas06955_Alamat;
    }
    
    public static void TampilanMenu(){
        int Dimas06955_Index, Dimas06955_Pilihan, Dimas06955_IdPelanggan, Dimas06955_Kontak;
        String Dimas06955_NamaPelanggan, Dimas06955_Alamat;
        do{
            System.out.println("Menu Pelanggan");
            System.out.println("1. Create Pelanggan");
            System.out.println("2. Edit Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Tampilkan Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Dimas06955_Pilihan = input.nextInt();
            switch(Dimas06955_Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Pelanggan   = "); Dimas06955_IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); Dimas06955_NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); Dimas06955_Kontak = input.nextInt();
                    System.out.print("Alamat         = "); Dimas06955_Alamat = input.next();
                    Dimas06955_ArrayPelanggan.add(new Dimas06955_PelangganEntity(Dimas06955_IdPelanggan, Dimas06955_NamaPelanggan, Dimas06955_Kontak, Dimas06955_Alamat));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Dimas06955_Index = input.nextInt();
                    System.out.print("Id Pelanggan   = "); Dimas06955_IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); Dimas06955_NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); Dimas06955_Kontak = input.nextInt();
                    System.out.print("Alamat         = "); Dimas06955_Alamat = input.next();
                    Dimas06955_ArrayPelanggan.set(Dimas06955_Index, new Dimas06955_PelangganEntity(Dimas06955_IdPelanggan, Dimas06955_NamaPelanggan, Dimas06955_Kontak, Dimas06955_Alamat));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Dimas06955_Index = input.nextInt();
                    Dimas06955_ArrayPelanggan.remove(Dimas06955_Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<Dimas06955_ArrayPelanggan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Pelanggan    = "+Dimas06955_ArrayPelanggan.get(i).GetIdPelanggan());
                        System.out.println("Nama Pelanggan  = "+Dimas06955_ArrayPelanggan.get(i).GetNamaPelanggan());
                        System.out.println("Kontak          = "+Dimas06955_ArrayPelanggan.get(i).GetKontak());
                        System.out.println("Alamat          = "+Dimas06955_ArrayPelanggan.get(i).GetAlamat());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Dimas06955_Pilihan!=5);
        
    }
    
    public static void TambahSample(){
        Dimas06955_ArrayPelanggan.add(new Dimas06955_PelangganEntity(123, "Google", 234, "Jl Pajajaran"));
        Dimas06955_ArrayPelanggan.add(new Dimas06955_PelangganEntity(234, "Facebook", 345, "Jl Ir Soekarno"));
        Dimas06955_ArrayPelanggan.add(new Dimas06955_PelangganEntity(456, "Apple", 567, "Jl Sulaiman"));
    }
 }


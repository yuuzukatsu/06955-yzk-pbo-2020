package MonitoringCaseGangguan;
import java.util.Scanner;
public class PelangganEntity {
    static Scanner input = new Scanner(System.in);
    int IdPelanggan,Kontak;
    String NamaPelanggan,Alamat;
    
    public PelangganEntity(int IdPelanggan, String NamaPelanggan, int Kontak, String Alamat){
        this.IdPelanggan=IdPelanggan;
        this.NamaPelanggan=NamaPelanggan;
        this.Kontak=Kontak;
        this.Alamat=Alamat;
    }
    int GetIdPelanggan(){
        return this.IdPelanggan;
    }
    String GetNamaPelanggan(){
        return this.NamaPelanggan;
    }
    int GetKontak(){
        return this.Kontak;
    }
    String Alamat(){
        return this.Alamat;
    }
    
    public static void TampilanMenu(){
        int pil;
        do{
            System.out.println("Menu Pelanggan");
            System.out.println("1. Create Pelanggan");
            System.out.println("2. Edit Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Tampilkan Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); pil = input.nextInt();
            switch(pil){
                case 1:
                    System.out.println("WIP");
                    break;
                case 2:
                    System.out.println("WIP");
                    break;
                case 3:
                    System.out.println("WIP");
                    break;
                case 4:
                    System.out.println("WIP");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(pil!=5);
        
    }
    
 }


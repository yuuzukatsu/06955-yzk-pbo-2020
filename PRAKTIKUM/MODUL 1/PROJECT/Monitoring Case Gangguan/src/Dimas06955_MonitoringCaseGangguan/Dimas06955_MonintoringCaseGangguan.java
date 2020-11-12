package Dimas06955_MonitoringCaseGangguan;
import java.util.Scanner;

public class Dimas06955_MonintoringCaseGangguan {
   
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Dtang di Aplikasi Monitoring Case Gangguan");
        int Dimas06955_Pilihan;
        
        //Tambahkan Contoh Sample Data
        /*
        Dimas06955_HelpdeskEntity.TambahSample();
        Dimas06955_PelangganEntity.TambahSample();
        Dimas06955_CaseGangguanEntity.TambahSample();
        */
        //Tambahkan Contoh Sample Data
        
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); Dimas06955_Pilihan = input.nextInt();
            switch(Dimas06955_Pilihan){
                case 1:
                    Dimas06955_CaseGangguanEntity.TampilanMenu();
                    break;
                case 2:
                    Dimas06955_PelangganEntity.TampilanMenu();
                    break;
                case 3:
                    Dimas06955_HelpdeskEntity.TampilanMenu();
                    break;
                case 4:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(Dimas06955_Pilihan!=4);
    }
}

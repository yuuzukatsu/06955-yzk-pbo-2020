package MonitoringCaseGangguan;
import java.util.Scanner;

public class MonintoringCaseGangguan {

    
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Dtang di Aplikasi Monitoring Case Gangguan");
        int Pilihan;
        
        //Tambahkan Contoh Sample Data
        HelpdeskEntity.TambahSample();
        PelangganEntity.TambahSample();
        CaseGangguanEntity.TambahSample();
        //Tambahkan Contoh Sample Data
        
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    CaseGangguanEntity.TampilanMenu();
                    break;
                case 2:
                    PelangganEntity.TampilanMenu();
                    break;
                case 3:
                    HelpdeskEntity.TampilanMenu();
                    break;
                case 4:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(Pilihan!=4);
    }
}

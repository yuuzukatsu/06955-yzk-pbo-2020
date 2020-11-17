package MonitoringCaseGangguan;
import java.util.Scanner;

public class Dimas06955_MonitoringCaseGangguan { 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Monitoring Case Gangguan");
        int Pilihan;
        
        Dimas06955_CaseGangguan Dimas06955_CaseGGN = new Dimas06955_CaseGangguan();
        Dimas06955_Helpdesk Dimas06955_HD = new Dimas06955_Helpdesk();
        Dimas06955_Pelanggan Dimas06955_PLG = new Dimas06955_Pelanggan();
        
        //Tambahkan Contoh Sample Data
        Dimas06955_HD.TambahSample();
        Dimas06955_PLG.TambahSample();
        Dimas06955_CaseGGN.TambahSample();
        //Tambahkan Contoh Sample Data
        
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    Dimas06955_CaseGGN.TampilanMenu();
                    break;
                case 2:
                    Dimas06955_PLG.TampilanMenu();
                    break;
                case 3:
                    Dimas06955_HD.TampilanMenu();
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

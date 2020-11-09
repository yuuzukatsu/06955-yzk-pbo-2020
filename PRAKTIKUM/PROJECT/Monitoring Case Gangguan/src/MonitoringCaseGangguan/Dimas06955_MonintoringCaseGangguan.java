package MonitoringCaseGangguan;
import java.util.ArrayList;
import java.util.Scanner;

public class Dimas06955_MonintoringCaseGangguan {

    static ArrayList <Dimas06955_PelangganEntity> Dimas06955_Pelanggan = new ArrayList();
    static ArrayList <Dimas06955_CaseGangguanEntity> Dimas06955_CaseGangguan = new ArrayList();
    static ArrayList <Dimas06955_HelpdeskEntity> Dimas06955_Helpdesk = new ArrayList();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Dtang di Aplikasi Monitoring Case Gangguan");
        int pil;
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); pil = input.nextInt();
            switch(pil){
                case 1:
     //               MenuCaseGangguan();
                    break;
                case 2:
   //                 MenuPelanggan();
                    break;
                case 3:
 //                   MenuHelpdesk();
                    break;
                case 4:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(pil!=4);
    }
    
    static void MenuCaseGangguan(){
        int pil;
        do{
            System.out.println("Menu Case Gangguan");
            System.out.println("1. Create Case");
            System.out.println("2. Edit Case");
            System.out.println("3. Delete Case");
            System.out.println("4. Tampilkan Case");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); pil = input.nextInt();
            switch(pil){
                case 1:
                    
            }
        }while(pil!=5);
        
    }
}

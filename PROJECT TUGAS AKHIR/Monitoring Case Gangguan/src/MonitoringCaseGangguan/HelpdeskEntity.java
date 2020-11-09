package MonitoringCaseGangguan;
import java.util.Scanner;
public class HelpdeskEntity {
    static Scanner input = new Scanner(System.in);
    int IdHelpdesk;
    int Kontak;
    String NamaHelpdesk;
    
    public HelpdeskEntity(int IdHelpdesk, String NamaHelpdesk, int Kontak){
        this.IdHelpdesk=IdHelpdesk;
        this.NamaHelpdesk=NamaHelpdesk;
        this.Kontak=Kontak;
        
    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.NamaHelpdesk;
    }
    int GetKontak(){
        return this.Kontak;
    }
    
    public static void TampilanMenu(){
        int pil;
        do{
            System.out.println("Menu Helpdesk");
            System.out.println("1. Create Helpdesk");
            System.out.println("2. Edit Helpdesk");
            System.out.println("3. Delete Helpdesk");
            System.out.println("4. Tampilkan Helpdesk");
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


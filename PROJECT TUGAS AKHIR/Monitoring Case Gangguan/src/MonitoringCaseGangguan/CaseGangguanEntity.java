package MonitoringCaseGangguan;
import java.util.Date;
import java.util.Scanner;

public class CaseGangguanEntity {
    static Scanner input = new Scanner(System.in);
    int NoCase,IdPelanggan,IdHelpdesk;
    Date Tanggal;
    String Komplain;
    
    public CaseGangguanEntity(int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        this.NoCase=NoCase;
        this.Tanggal=Tanggal;
        this.IdPelanggan=IdPelanggan;
        this.IdHelpdesk=IdHelpdesk;
        this.Komplain=Komplain;
        
    }
    int GetNoCase(){
        return this.NoCase;
    }
    Date GetTanggal(){
        return this.Tanggal;
    }
    int GetIdPelanggan(){
        return this.IdPelanggan;
    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetKomplain(){
        return this.Komplain;
    }
    
    public static void TampilanMenu(){
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


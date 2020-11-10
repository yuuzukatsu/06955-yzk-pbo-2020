package MonitoringCaseGangguan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CaseGangguanEntity {
    static ArrayList <CaseGangguanEntity> ArrayCaseGangguan = new ArrayList();
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
        int Index, Pilihan, NoCase, IdPelanggan, IdHelpdesk;
        String Komplain;
        Date Tanggal;
        do{
            System.out.println("Menu Case Gangguan");
            System.out.println("1. Create Case");
            System.out.println("2. Edit Case");
            System.out.println("3. Delete Case");
            System.out.println("4. Tampilkan Case");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Nomor Case          = "); NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Komplain = input.next();
                    ArrayCaseGangguan.add(new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Index = input.nextInt();
                    System.out.print("Nomor Case          = "); NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Komplain = input.next();
                    ArrayCaseGangguan.set(Index, new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayCaseGangguan.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayCaseGangguan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nomor Case          = "+ArrayCaseGangguan.get(i).GetNoCase());
                        System.out.println("Tanggal(dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(ArrayCaseGangguan.get(i).GetTanggal()));
                        System.out.println("Id Pelanggan        = "+ArrayCaseGangguan.get(i).GetIdPelanggan());
                        System.out.println("Id Helpdesk         = "+ArrayCaseGangguan.get(i).GetIdHelpdesk());
                        System.out.println("Komplain            = "+ArrayCaseGangguan.get(i).GetKomplain());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
        
    }
    
 }


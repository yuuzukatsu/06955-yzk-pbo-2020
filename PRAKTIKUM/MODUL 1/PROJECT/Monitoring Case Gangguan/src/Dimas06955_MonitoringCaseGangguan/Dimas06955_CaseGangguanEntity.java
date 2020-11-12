package Dimas06955_MonitoringCaseGangguan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Dimas06955_CaseGangguanEntity {
    static ArrayList <Dimas06955_CaseGangguanEntity> Dimas06955_ArrayCaseGangguan = new ArrayList();
    static Scanner input = new Scanner(System.in);

    int Dimas06955_NoCase,Dimas06955_IdPelanggan,Dimas06955_IdHelpdesk;
    Date Dimas06955_Tanggal;
    String Dimas06955_Komplain;
    
    public Dimas06955_CaseGangguanEntity(int Dimas06955_NoCase, Date Dimas06955_Tanggal, int Dimas06955_IdPelanggan, int Dimas06955_IdHelpdesk, String Dimas06955_Komplain){
        this.Dimas06955_NoCase=Dimas06955_NoCase;
        this.Dimas06955_Tanggal=Dimas06955_Tanggal;
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_Komplain=Dimas06955_Komplain;
        
    }
    int GetNoCase(){
        return this.Dimas06955_NoCase;
    }
    Date GetTanggal(){
        return this.Dimas06955_Tanggal;
    }
    int GetIdPelanggan(){
        return this.Dimas06955_IdPelanggan;
    }
    int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    String GetKomplain(){
        return this.Dimas06955_Komplain;
    }
    
    public static void TampilanMenu(){ 
        int Dimas06955_Index, Dimas06955_Pilihan, Dimas06955_NoCase, Dimas06955_IdPelanggan, Dimas06955_IdHelpdesk;
        String Dimas06955_Komplain;
        Date Dimas06955_Tanggal;
        do{
            System.out.println("Menu Case Gangguan");
            System.out.println("1. Create Case");
            System.out.println("2. Edit Case");
            System.out.println("3. Delete Case");
            System.out.println("4. Tampilkan Case");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Dimas06955_Pilihan = input.nextInt();
            switch(Dimas06955_Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Nomor Case          = "); Dimas06955_NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Dimas06955_Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); Dimas06955_IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); Dimas06955_IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Dimas06955_Komplain = input.next();
                    Dimas06955_ArrayCaseGangguan.add(new Dimas06955_CaseGangguanEntity(Dimas06955_NoCase, Dimas06955_Tanggal, Dimas06955_IdPelanggan, Dimas06955_IdHelpdesk, Dimas06955_Komplain));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index         = "); Dimas06955_Index = input.nextInt();
                    System.out.print("Nomor Case          = "); Dimas06955_NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Dimas06955_Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); Dimas06955_IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); Dimas06955_IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Dimas06955_Komplain = input.next();
                    Dimas06955_ArrayCaseGangguan.set(Dimas06955_Index, new Dimas06955_CaseGangguanEntity(Dimas06955_NoCase, Dimas06955_Tanggal, Dimas06955_IdPelanggan, Dimas06955_IdHelpdesk, Dimas06955_Komplain));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Dimas06955_Index = input.nextInt();
                    Dimas06955_ArrayCaseGangguan.remove(Dimas06955_Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<Dimas06955_ArrayCaseGangguan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nomor Case          = "+Dimas06955_ArrayCaseGangguan.get(i).GetNoCase());
                        System.out.println("Tanggal(dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(Dimas06955_ArrayCaseGangguan.get(i).GetTanggal()));
                        System.out.println("Id Pelanggan        = "+Dimas06955_ArrayCaseGangguan.get(i).GetIdPelanggan());
                        System.out.println("Id Helpdesk         = "+Dimas06955_ArrayCaseGangguan.get(i).GetIdHelpdesk());
                        System.out.println("Komplain            = "+Dimas06955_ArrayCaseGangguan.get(i).GetKomplain());
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
        Dimas06955_ArrayCaseGangguan.add(new Dimas06955_CaseGangguanEntity(1, new Date("02/02/2019"), 123, 234, "Internet Mati"));
        Dimas06955_ArrayCaseGangguan.add(new Dimas06955_CaseGangguanEntity(2, new Date("02/02/2019"), 345, 456, "Router Mati"));
        Dimas06955_ArrayCaseGangguan.add(new Dimas06955_CaseGangguanEntity(3, new Date("02/02/2019"), 567, 678, "Putus putus"));
    }
    
 }


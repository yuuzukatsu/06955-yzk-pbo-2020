package MonitoringCaseGangguan;
//import Entity.*;
import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CaseGangguan {
    
    //private ArrayList <Dimas06955_CaseGangguanEntity> ArrayCaseGangguan = new ArrayList();
    private CaseGangguanController CaseGGN = new CaseGangguanController();
    private HelpdeskController HD = new HelpdeskController();
    private PelangganController PLG = new PelangganController();

    
    private int Index, Pilihan, NoCase, IdPelanggan, IdHelpdesk;
    private String Komplain;
    private Date Tanggal;
    
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){   
        
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
                    try{
                        System.out.print("Nomor Case          = "); NoCase = input.nextInt();
                        System.out.print("Tanggal(dd/mm/yyyy) = "); Tanggal = new Date(input.next());

                        //Dimas06955_Pelanggan Dimas06955_PLG = new Dimas06955_Pelanggan();
                        System.out.println("==================");
                        for(int i=0;i<AllObjectModel.PLG.GetArray().size();i++){
                            System.out.print(i+". ");
                            System.out.println(AllObjectModel.PLG.GetArray().get(i).GetIdPelanggan());
                        }
                        System.out.print("Index Id Pelanggan        = "); Index = input.nextInt();
                        IdPelanggan = AllObjectModel.PLG.GetArray().get(Index).GetIdPelanggan();

                        //Dimas06955_Helpdesk Dimas06955_HD = new Dimas06955_Helpdesk();
                        System.out.println("==================");
                        for(int i=0;i<AllObjectModel.HD.GetArray().size();i++){
                            System.out.print(i+". ");
                            System.out.println(AllObjectModel.HD.GetArray().get(i).GetIdHelpdesk());
                        }
                        System.out.print("Id Helpdesk         = "); Index = input.nextInt();
                        IdHelpdesk = AllObjectModel.HD.GetArray().get(Index).GetIdHelpdesk();
                        System.out.print("Komplain            = "); Komplain = input.next();

                        //ArrayCaseGangguan.add(new Dimas06955_CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                        CaseGGN.Insert(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain);
                        
                    }catch (Exception exception){
                        System.out.println("Input salah");
                    }
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Index = input.nextInt();
                    System.out.print("Nomor Case          = "); NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Komplain = input.next();
                    //ArrayCaseGangguan.set(Index, new Dimas06955_CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                    CaseGGN.Edit(Index, NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain);
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    CaseGGN.Delete(Index);
                    break;
                case 4:
                    //VIEW
                    CaseGGN.View();
                    /*for(int i=0;i<AllObjectModel.CaseGGN.GetArray().size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nomor Case          = "+AllObjectModel.CaseGGN.GetArray().get(i).GetNoCase());
                        System.out.println("Tanggal(dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(AllObjectModel.CaseGGN.GetArray().get(i).GetTanggal()));
                        System.out.println("Id Pelanggan        = "+AllObjectModel.CaseGGN.GetArray().get(i).GetIdPelanggan());
                        System.out.println("Id Helpdesk         = "+AllObjectModel.CaseGGN.GetArray().get(i).GetIdHelpdesk());
                        System.out.println("Komplain            = "+AllObjectModel.CaseGGN.GetArray().get(i).GetKomplain());
                        System.out.println("");
                    }*/
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
        
    }
}

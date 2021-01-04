
package MonitoringCaseGangguan;

import Controller.HelpdeskController;
import Controller.AllObjectModel;

import Entity.HelpdeskEntity;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpdesk {
    //public static ArrayList <Dimas06955_HelpdeskEntity> ArrayHelpdesk = new ArrayList();
    
    private HelpdeskController HD = new HelpdeskController();
    
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){
        int Index, Pilihan, IdHelpdesk, Kontak;
        String NamaHelpdesk;
        do{
            System.out.println("Menu Helpdesk");
            System.out.println("1. Create Helpdesk");
            System.out.println("2. Edit Helpdesk");
            System.out.println("3. Delete Helpdesk");
            System.out.println("4. Tampilkan Helpdesk");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Helpdesk   = "); IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Kontak = input.nextInt();
                   // ArrayHelpdesk.add(new Dimas06955_HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
                    HD.Insert(IdHelpdesk, NamaHelpdesk, Kontak);
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Index = input.nextInt();
                    System.out.print("Id Helpdesk   = "); IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Kontak = input.nextInt();
                    //ArrayHelpdesk.set(Index, new Dimas06955_HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
                    HD.Edit(Index, IdHelpdesk, NamaHelpdesk, Kontak);
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    //ArrayHelpdesk.remove(Index);
                    HD.Delete(Index);
                    break;
                case 4:
                    //VIEW
                    HD.View();
                    /*for(int i=0;i<AllObjectModel.HD.GetArray().size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Helpdesk   = "+AllObjectModel.HD.GetArray().get(i).GetIdHelpdesk());
                        System.out.println("Nama Helpdesk = "+AllObjectModel.HD.GetArray().get(i).GetNamaHelpdesk());
                        System.out.println("Kontak        = "+AllObjectModel.HD.GetArray().get(i).GetKontak());
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

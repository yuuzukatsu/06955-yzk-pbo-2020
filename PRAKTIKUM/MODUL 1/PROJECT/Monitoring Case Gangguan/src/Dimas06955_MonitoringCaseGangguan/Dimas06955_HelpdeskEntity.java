package Dimas06955_MonitoringCaseGangguan;
import java.util.ArrayList;
import java.util.Scanner;

public class Dimas06955_HelpdeskEntity {
    static ArrayList <Dimas06955_HelpdeskEntity> Dimas06955_ArrayHelpdesk = new ArrayList();
    static Scanner input = new Scanner(System.in);
    int Dimas06955_IdHelpdesk, Dimas06955_Kontak;
    String Dimas06955_NamaHelpdesk;
    
    public Dimas06955_HelpdeskEntity(int Dimas06955_IdHelpdesk, String Dimas06955_NamaHelpdesk, int Dimas06955_Kontak){
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_NamaHelpdesk=Dimas06955_NamaHelpdesk;
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        
    }
    int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.Dimas06955_NamaHelpdesk;
    }
    int GetKontak(){
        return this.Dimas06955_Kontak;
    }
    
    public static void TampilanMenu(){
        int Dimas06955_Index, Dimas06955_Pilihan, Dimas06955_IdHelpdesk, Dimas06955_Kontak;
        String Dimas06955_NamaHelpdesk;
        do{
            System.out.println("Menu Helpdesk");
            System.out.println("1. Create Helpdesk");
            System.out.println("2. Edit Helpdesk");
            System.out.println("3. Delete Helpdesk");
            System.out.println("4. Tampilkan Helpdesk");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Dimas06955_Pilihan = input.nextInt();
            switch(Dimas06955_Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Helpdesk   = "); Dimas06955_IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); Dimas06955_NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Dimas06955_Kontak = input.nextInt();
                    Dimas06955_ArrayHelpdesk.add(new Dimas06955_HelpdeskEntity(Dimas06955_IdHelpdesk, Dimas06955_NamaHelpdesk, Dimas06955_Kontak));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Dimas06955_Index = input.nextInt();
                    System.out.print("Id Helpdesk   = "); Dimas06955_IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); Dimas06955_NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Dimas06955_Kontak = input.nextInt();
                    Dimas06955_ArrayHelpdesk.set(Dimas06955_Index, new Dimas06955_HelpdeskEntity(Dimas06955_IdHelpdesk, Dimas06955_NamaHelpdesk, Dimas06955_Kontak));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Dimas06955_Index = input.nextInt();
                    Dimas06955_ArrayHelpdesk.remove(Dimas06955_Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<Dimas06955_ArrayHelpdesk.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Helpdesk   = "+Dimas06955_ArrayHelpdesk.get(i).GetIdHelpdesk());
                        System.out.println("Nama Helpdesk = "+Dimas06955_ArrayHelpdesk.get(i).GetNamaHelpdesk());
                        System.out.println("Kontak        = "+Dimas06955_ArrayHelpdesk.get(i).GetKontak());
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
        Dimas06955_ArrayHelpdesk.add(new Dimas06955_HelpdeskEntity(123, "Helpdesk Jakarta", 234));
        Dimas06955_ArrayHelpdesk.add(new Dimas06955_HelpdeskEntity(345, "Helpdesk Surabaya", 456));
        Dimas06955_ArrayHelpdesk.add(new Dimas06955_HelpdeskEntity(567, "Helpdesk Semarang", 678));
    }
 }


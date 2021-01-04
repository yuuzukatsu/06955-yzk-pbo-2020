package Model;

import Entity.HelpdeskEntity;
import java.util.ArrayList;

public class HelpdeskModel {
    public static ArrayList <HelpdeskEntity> ArrayHelpdesk;
    
    public HelpdeskModel(){
        ArrayHelpdesk = new ArrayList<HelpdeskEntity>();
    }
    
    public ArrayList<HelpdeskEntity> GetArray(){
        return ArrayHelpdesk;
    }
    
    public void insert(HelpdeskEntity helpdesk){
       ArrayHelpdesk.add(helpdesk);
   }
    
    public void edit(int index, HelpdeskEntity helpdesk){
       ArrayHelpdesk.set(index, helpdesk);
   }
    
    public void delete(int index){
       ArrayHelpdesk.remove(index);
   }
    
    public void view(){
        for(int i=0;i<ArrayHelpdesk.size();i++){
            System.out.println("Index "+i);
            System.out.println("Id Helpdesk   = "+ArrayHelpdesk.get(i).GetIdHelpdesk());
            System.out.println("Nama Helpdesk = "+ArrayHelpdesk.get(i).GetNamaHelpdesk());
            System.out.println("Kontak        = "+ArrayHelpdesk.get(i).GetKontak());
            System.out.println("");
        }
    }
    
    public void TambahSample(){
        ArrayHelpdesk.add(new HelpdeskEntity(123, "Helpdesk Jakarta", 234));
        ArrayHelpdesk.add(new HelpdeskEntity(345, "Helpdesk Surabaya", 456));
        ArrayHelpdesk.add(new HelpdeskEntity(567, "Helpdesk Semarang", 678));
    }
    
}

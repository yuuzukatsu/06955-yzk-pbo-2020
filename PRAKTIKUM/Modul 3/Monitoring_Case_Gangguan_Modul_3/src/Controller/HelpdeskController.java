
package Controller;

import Entity.HelpdeskEntity;

public class HelpdeskController {
    public HelpdeskController(){}
    
    public void Insert(int IdHelpdesk, String NamaHelpdesk, int Kontak){
        AllObjectModel.HD.insert(new HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
    }
    
    public void Edit(int index, int IdHelpdesk, String NamaHelpdesk, int Kontak){
        AllObjectModel.HD.edit(index, new HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
    }
    
    public void Delete(int index){
        AllObjectModel.HD.delete(index);
    }
    
    public void View(){
        AllObjectModel.HD.view();
    }
    
    public void TambahSample(){
        AllObjectModel.HD.TambahSample();
    }
    
}

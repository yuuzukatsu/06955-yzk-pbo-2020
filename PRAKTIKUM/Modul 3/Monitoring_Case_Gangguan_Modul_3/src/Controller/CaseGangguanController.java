
package Controller;

import Entity.CaseGangguanEntity;
import java.util.Date;

public class CaseGangguanController {
    public CaseGangguanController(){}
    
    public void Insert(int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        AllObjectModel.CaseGGN.insert(new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
    }
    
    public void Edit(int index, int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        AllObjectModel.CaseGGN.edit(index, new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
    }
    
    public void Delete(int index){
        AllObjectModel.CaseGGN.delete(index);
    }
    
    public void View(){
        AllObjectModel.CaseGGN.view();
    }
    
    public void TambahSample(){
        AllObjectModel.CaseGGN.TambahSample();
    }
    
}

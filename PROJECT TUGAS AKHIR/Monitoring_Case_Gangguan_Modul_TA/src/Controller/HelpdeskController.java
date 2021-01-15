
package Controller;

import Entity.HelpdeskEntity;
import javax.swing.table.DefaultTableModel;

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
    
    public DefaultTableModel dtm(){
        DefaultTableModel dtm = new DefaultTableModel();
        Object[] kolom = {"ID Helpdesk", "Nama Helpdesk", "Kontak"};
        dtm.setColumnIdentifiers(kolom);
        int size = AllObjectModel.HD.GetArray().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[3];
            data[0] = AllObjectModel.HD.GetArray().get(i).GetIdHelpdesk();
            data[1] = AllObjectModel.HD.GetArray().get(i).GetNamaHelpdesk();
            data[2] = AllObjectModel.HD.GetArray().get(i).GetKontak();
            dtm.addRow(data);
        }
        return dtm;
    }
    
}

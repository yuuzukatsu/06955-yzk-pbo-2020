
package Controller;

import Entity.CaseGangguanEntity;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class CaseGangguanController {
    public CaseGangguanController(){}
    
    public void Insert(int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        AllObjectModel.ctrGGN.insert(new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
    }
    
    public void Edit(int index, int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        AllObjectModel.ctrGGN.edit(index, new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
    }
    
    public void Delete(int index){
        AllObjectModel.ctrGGN.delete(index);
    }
    
    public void View(){
        AllObjectModel.ctrGGN.view();
    }
    
    public void TambahSample(){
        AllObjectModel.ctrGGN.TambahSample();
    }
    
    public DefaultTableModel dtm(){
        DefaultTableModel dtm = new DefaultTableModel();
        Object[] kolom = {"NoCase", "Tanggal", "IdPelanggan", "IdHelpdesk", "Komplain"};
        dtm.setColumnIdentifiers(kolom);
        int size = AllObjectModel.ctrGGN.GetArray().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[5];
            data[0] = AllObjectModel.ctrGGN.ArrayCaseGangguan.get(i).GetNoCase();
            data[1] = AllObjectModel.ctrGGN.ArrayCaseGangguan.get(i).GetTanggal();
            data[2] = AllObjectModel.ctrGGN.ArrayCaseGangguan.get(i).GetIdPelanggan();
            data[3] = AllObjectModel.ctrGGN.ArrayCaseGangguan.get(i).GetIdHelpdesk();
            data[4] = AllObjectModel.ctrGGN.ArrayCaseGangguan.get(i).GetKomplain();
            dtm.addRow(data);
        }
        return dtm;
    }
    
}

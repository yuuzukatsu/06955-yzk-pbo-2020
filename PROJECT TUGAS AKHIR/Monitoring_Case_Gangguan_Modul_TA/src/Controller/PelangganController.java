
package Controller;

import Entity.PelangganEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PelangganController {
    public PelangganController(){}
    
    public void Insert(int IdPelanggan, String NamaPelanggan, int Kontak, String Alamat){
        AllObjectModel.PLG.insert(new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
    }
    
    public void Edit(int index, int IdPelanggan, String NamaPelanggan, int Kontak, String Alamat){
        AllObjectModel.PLG.edit(index, new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
    }
    
    public void Delete(int index){
        AllObjectModel.PLG.delete(index);
    }
    
    public ArrayList<PelangganEntity> GetArray(){
        return AllObjectModel.PLG.GetArray();
    }
    
    public void View(){
        AllObjectModel.PLG.view();
    }
    
    public void TambahSample(){
        AllObjectModel.PLG.TambahSample();
    }
    
    public DefaultTableModel dtm(){
        DefaultTableModel dtm = new DefaultTableModel();
        Object[] kolom = {"ID Pelanggan", "Nama Pelanggan", "Kontak", "Alamat"};
        dtm.setColumnIdentifiers(kolom);
        int size = AllObjectModel.PLG.GetArray().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[4];
            data[0] = AllObjectModel.PLG.GetArray().get(i).GetIdPelanggan();
            data[1] = AllObjectModel.PLG.GetArray().get(i).GetNamaPelanggan();
            data[2] = AllObjectModel.PLG.GetArray().get(i).GetKontak();
            data[3] = AllObjectModel.PLG.GetArray().get(i).GetAlamat();
            dtm.addRow(data);
        }
        return dtm;
    }
}

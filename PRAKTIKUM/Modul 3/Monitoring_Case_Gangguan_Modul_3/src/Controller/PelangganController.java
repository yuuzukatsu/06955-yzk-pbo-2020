
package Controller;

import Entity.PelangganEntity;
import java.util.ArrayList;

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
}

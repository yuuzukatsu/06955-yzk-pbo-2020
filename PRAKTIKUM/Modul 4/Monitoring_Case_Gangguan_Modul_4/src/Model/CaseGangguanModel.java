/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.CaseGangguanEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CaseGangguanModel {
    public ArrayList <CaseGangguanEntity> ArrayCaseGangguan;
    
    public CaseGangguanModel(){
        ArrayCaseGangguan = new ArrayList<CaseGangguanEntity>();
    }
    
    public ArrayList<CaseGangguanEntity> GetArray(){
        return ArrayCaseGangguan;
    }
    
    public void insert(CaseGangguanEntity ggn){
       ArrayCaseGangguan.add(ggn);
   }
    
    public void edit(int index, CaseGangguanEntity ggn){
       ArrayCaseGangguan.set(index, ggn);
   }
    
    public void delete(int index){
       ArrayCaseGangguan.remove(index);
   }
    
    public void view(){
        for(int i=0;i<ArrayCaseGangguan.size();i++){
            System.out.println("Index "+i);
            System.out.println("Nomor Case          = "+ArrayCaseGangguan.get(i).GetNoCase());
            System.out.println("Tanggal(dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(ArrayCaseGangguan.get(i).GetTanggal()));
            System.out.println("Id Pelanggan        = "+ArrayCaseGangguan.get(i).GetIdPelanggan());
            System.out.println("Id Helpdesk         = "+ArrayCaseGangguan.get(i).GetIdHelpdesk());
            System.out.println("Komplain            = "+ArrayCaseGangguan.get(i).GetKomplain());
            System.out.println("");
        }
    }
    
    public void TambahSample(){
        ArrayCaseGangguan.add(new CaseGangguanEntity(1, new Date("02/02/2019"), 123, 234, "Internet Mati"));
        ArrayCaseGangguan.add(new CaseGangguanEntity(2, new Date("02/02/2019"), 345, 456, "Router Mati"));
        ArrayCaseGangguan.add(new CaseGangguanEntity(3, new Date("02/02/2019"), 567, 678, "Putus putus"));
    }
}

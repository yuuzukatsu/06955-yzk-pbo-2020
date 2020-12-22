/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.*;
import java.util.Date;
import java.util.ArrayList;

public class AdminController06955 implements ControllerInterface06955{
    int indexLogin = 0;
    
    public AdminController06955(){}
    
    public void dataAslab(){
        String npmAslab[]={"01","02","03","04","05","06","07"};
        String passwordAslab[]={"01","02","03","04","05","06","07"};
        String namaAslab[]={"Michael","Fadlan","Odalia","Fitria","Sita","Eric","Fernanda"};
        String noTelpAslab[]={"01","02","03","04","05","06","07"};
        String tglLahirAslab[]={"04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000","04/05/2000"};
        String laboratorium[]={"RPL", "SO", "BASPRO","RPL", "SO", "BASPRO", "RPL"};
        for(int i = 0; i < npmAslab.length; i++){
            AllObjectModel06955.aslabmodel.insertAslab(new AslabEntity06955(npmAslab[i],passwordAslab[i],namaAslab[i],noTelpAslab[i],new Date(tglLahirAslab[i]),laboratorium[i]));
        }
    }
    
    public void viewAslab(){
        AllObjectModel06955.aslabmodel.view();
    }
    
    public void listPendaftarPraktikum(){
        AllObjectModel06955.daftarprakmodel.view();
    }
    
    @Override
    public void login(String npm, String password){
        indexLogin = AllObjectModel06955.aslabmodel.cekData(npm, password);
    }
    
    public void updateIsVerified(int index, int indexPrak, PraktikanEntity06955 praktikanEntity){
        AllObjectModel06955.daftarprakmodel.updateIsVerified(index, new DaftarPrakEntity06955(indexPrak,praktikanEntity,true));
    }
    
    public ArrayList<DaftarPrakEntity06955> cekdaftarprakModel(){
        return AllObjectModel06955.daftarprakmodel.getDaftarPrakArrayList();
    } 
}

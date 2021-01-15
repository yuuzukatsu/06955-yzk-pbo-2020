/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.PelangganEntity;
import java.util.ArrayList;

public class PelangganModel {
    public static ArrayList <PelangganEntity> ArrayPelanggan;
    
    public PelangganModel(){
        ArrayPelanggan = new ArrayList<PelangganEntity>();
    }
    
    public ArrayList<PelangganEntity> GetArray(){
        return ArrayPelanggan;
    }
    
    public void insert(PelangganEntity plg){
       ArrayPelanggan.add(plg);
   }
    
    public void edit(int index, PelangganEntity plg){
       ArrayPelanggan.set(index, plg);
   }
    
    public void delete(int index){
       ArrayPelanggan.remove(index);
   }
    
    public void view(){
        for(int i=0;i<ArrayPelanggan.size();i++){
            System.out.println("Index "+i);
            System.out.println("Id Pelanggan    = "+ArrayPelanggan.get(i).GetIdPelanggan());
            System.out.println("Nama Pelanggan  = "+ArrayPelanggan.get(i).GetNamaPelanggan());
            System.out.println("Kontak          = "+ArrayPelanggan.get(i).GetKontak());
            System.out.println("Alamat          = "+ArrayPelanggan.get(i).GetAlamat());
            System.out.println("");
        }
    }
    
    public void TambahSample(){
        ArrayPelanggan.add(new PelangganEntity(123, "Google", 234, "Jl Pajajaran"));
        ArrayPelanggan.add(new PelangganEntity(234, "Facebook", 345, "Jl Ir Soekarno"));
        ArrayPelanggan.add(new PelangganEntity(456, "Apple", 567, "Jl Sulaiman"));
    }
}

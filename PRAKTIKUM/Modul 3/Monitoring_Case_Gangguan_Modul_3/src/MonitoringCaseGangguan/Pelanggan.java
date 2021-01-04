/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonitoringCaseGangguan;

import Controller.PelangganController;
import Controller.AllObjectModel;
import Entity.PelangganEntity;
import java.util.Scanner;

/**
 *
 * @author dimdi
 */
public class Pelanggan {
    //public static ArrayList <Dimas06955_PelangganEntity> ArrayPelanggan = new ArrayList();
    
    private PelangganController PLG = new PelangganController();
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){
        int Index, Pilihan, IdPelanggan, Kontak;
        String NamaPelanggan, Alamat;
        do{
            System.out.println("Menu Pelanggan");
            System.out.println("1. Create Pelanggan");
            System.out.println("2. Edit Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Tampilkan Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Pelanggan   = "); IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); Kontak = input.nextInt();
                    System.out.print("Alamat         = "); Alamat = input.next();
                    //ArrayPelanggan.add(new Dimas06955_PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
                    PLG.Insert(IdPelanggan, NamaPelanggan, Kontak, Alamat);
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Index = input.nextInt();
                    System.out.print("Id Pelanggan   = "); IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); Kontak = input.nextInt();
                    System.out.print("Alamat         = "); Alamat = input.next();
                    //ArrayPelanggan.set(Index, new Dimas06955_PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
                    PLG.Edit(Index, IdPelanggan, NamaPelanggan, Kontak, Alamat);
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    //ArrayPelanggan.remove(Index);
                    PLG.Delete(Index);
                    break;
                case 4:
                    //VIEW
                    PLG.View();
                    /*for(int i=0;i<ArrayPelanggan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Pelanggan    = "+ArrayPelanggan.get(i).GetIdPelanggan());
                        System.out.println("Nama Pelanggan  = "+ArrayPelanggan.get(i).GetNamaPelanggan());
                        System.out.println("Kontak          = "+ArrayPelanggan.get(i).GetKontak());
                        System.out.println("Alamat          = "+ArrayPelanggan.get(i).GetAlamat());
                        System.out.println("");
                    }*/
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
        
    }    
}


package Model;

import Entity.PraktikanEntity06955;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PraktikanModel06955 implements ModelInterfaces06955 {
   private static ArrayList<PraktikanEntity06955> praktikanEntityArrayList;
   
   public PraktikanModel06955(){
       praktikanEntityArrayList = new ArrayList<PraktikanEntity06955>();
   }
   
   public void insertPraktikan(PraktikanEntity06955 praktikan){
       praktikanEntityArrayList.add(praktikan);
   }
   
   @Override
   public void view(){
       for(PraktikanEntity06955 praktikan : praktikanEntityArrayList){
           System.out.print(praktikan.getNpm());
           System.out.print(praktikan.getNama());
           System.out.print(praktikan.getPassword());
           System.out.print(praktikan.getNo_telp());
           System.out.print(new SimpleDateFormat("dd-MM-yyyy").format(praktikan.getTglLahir()));
           System.out.println();
       }
   }
   
   @Override
   public int cekData(String npm, String password){
       int loop=0;
       for(PraktikanEntity06955 praktikan : praktikanEntityArrayList){
           if(praktikan.getNpm().equals(npm) && praktikan.getPassword().equals(password)){
               break;
           }else{
               loop++;
           }
       }
       return loop;
   }
    public PraktikanEntity06955 getDataPraktikanEntityArrayList(int index){
        return praktikanEntityArrayList.get(index);
    }
}
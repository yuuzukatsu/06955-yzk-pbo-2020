
package Model;

import Entity.AslabEntity06955;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AslabModel06955 implements ModelInterfaces06955 {
   private ArrayList<AslabEntity06955> aslabEntityArrayList;
   
   public AslabModel06955(){
       aslabEntityArrayList = new ArrayList<AslabEntity06955>();
   }
   
   public void insertAslab(AslabEntity06955 aslab){
       aslabEntityArrayList.add(aslab);
   }
   
   @Override
   public void view(){
       for(AslabEntity06955 aslabEntity06955 : aslabEntityArrayList){
           System.out.println(aslabEntity06955.getNpm());
           System.out.println(aslabEntity06955.getNama());
           System.out.println(aslabEntity06955.getPassword());
           System.out.println(aslabEntity06955.getNo_telp());
           System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(aslabEntity06955.getTglLahir()));
           System.out.println();
       }
   }

   @Override
   public int cekData(String npm, String password){
       int loop=0;
       for(AslabEntity06955 aslabEntity06955 : aslabEntityArrayList){
           if(aslabEntity06955.getNpm().equals(npm) && aslabEntity06955.getPassword().equals(password)){
               break;
           }else{
               loop++;
           }
       }
       return loop;
   }
    public AslabEntity06955 showDataAslab(int index){
        return aslabEntityArrayList.get(index);
    }
}
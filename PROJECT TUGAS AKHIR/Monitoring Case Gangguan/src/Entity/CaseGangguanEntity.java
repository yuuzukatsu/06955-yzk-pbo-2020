package Entity;
import java.util.Date;

public class CaseGangguanEntity {

    int Dimas06955_NoCase,Dimas06955_IdPelanggan,Dimas06955_IdHelpdesk;
    Date Dimas06955_Tanggal;
    String Dimas06955_Komplain;
    
    public CaseGangguanEntity(int Dimas06955_NoCase, Date Dimas06955_Tanggal, int Dimas06955_IdPelanggan, int Dimas06955_IdHelpdesk, String Dimas06955_Komplain){
        this.Dimas06955_NoCase=Dimas06955_NoCase;
        this.Dimas06955_Tanggal=Dimas06955_Tanggal;
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_Komplain=Dimas06955_Komplain;
        
    }
    public int GetNoCase(){
        return this.Dimas06955_NoCase;
    }
    public Date GetTanggal(){
        return this.Dimas06955_Tanggal;
    }
    public int GetIdPelanggan(){
        return this.Dimas06955_IdPelanggan;
    }
    public int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    public String GetKomplain(){
        return this.Dimas06955_Komplain;
    }
 }


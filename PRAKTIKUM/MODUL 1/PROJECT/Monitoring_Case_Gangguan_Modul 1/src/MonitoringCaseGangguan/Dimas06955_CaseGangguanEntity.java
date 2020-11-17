package MonitoringCaseGangguan;
import java.util.Date;

public class Dimas06955_CaseGangguanEntity {

    int Dimas06955_NoCase,Dimas06955_IdPelanggan,Dimas06955_IdHelpdesk;
    Date Dimas06955_Tanggal;
    String Dimas06955_Komplain;
    
    public Dimas06955_CaseGangguanEntity(int Dimas06955_NoCase, Date Dimas06955_Tanggal, int Dimas06955_IdPelanggan, int Dimas06955_IdHelpdesk, String Dimas06955_Komplain){
        this.Dimas06955_NoCase=Dimas06955_NoCase;
        this.Dimas06955_Tanggal=Dimas06955_Tanggal;
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_Komplain=Dimas06955_Komplain;
        
    }
    int GetNoCase(){
        return this.Dimas06955_NoCase;
    }
    Date GetTanggal(){
        return this.Dimas06955_Tanggal;
    }
    int GetIdPelanggan(){
        return this.Dimas06955_IdPelanggan;
    }
    int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    String GetKomplain(){
        return this.Dimas06955_Komplain;
    }
 }


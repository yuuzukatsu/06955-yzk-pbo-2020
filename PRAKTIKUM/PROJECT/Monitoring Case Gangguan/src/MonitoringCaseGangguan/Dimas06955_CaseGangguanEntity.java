package MonitoringCaseGangguan;
import java.util.Date;
public class Dimas06955_CaseGangguanEntity {
    int NoCase,IdPelanggan,IdHelpdesk;
    Date Tanggal;
    String Komplain;
    public Dimas06955_CaseGangguanEntity(int NoCase, Date Tanggal, int IdPelanggan, int IdHelpdesk, String Komplain){
        this.NoCase=NoCase;
        this.Tanggal=Tanggal;
        this.IdPelanggan=IdPelanggan;
        this.IdHelpdesk=IdHelpdesk;
        this.Komplain=Komplain;
        
    }
    int GetNoCase(){
        return this.NoCase;
    }
    Date GetTanggal(){
        return this.Tanggal;
    }
    int GetIdPelanggan(){
        return this.IdPelanggan;
    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetKomplain(){
        return this.Komplain;
    }
 }


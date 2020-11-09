package MonitoringCaseGangguan;
public class Dimas06955_HelpdeskEntity {
    int IdHelpdesk;
    int Kontak;
    String NamaHelpdesk;
    public Dimas06955_HelpdeskEntity(int IdHelpdesk, String NamaHelpdesk, int Kontak){
        this.IdHelpdesk=IdHelpdesk;
        this.NamaHelpdesk=NamaHelpdesk;
        this.Kontak=Kontak;
        
    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.NamaHelpdesk;
    }
    int GetKontak(){
        return this.Kontak;
    }
 }


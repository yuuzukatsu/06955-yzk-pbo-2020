package MonitoringCaseGangguan;

public class Dimas06955_HelpdeskEntity {
    int Dimas06955_IdHelpdesk, Dimas06955_Kontak;
    String Dimas06955_NamaHelpdesk;
    
    public Dimas06955_HelpdeskEntity(int Dimas06955_IdHelpdesk, String Dimas06955_NamaHelpdesk, int Dimas06955_Kontak){
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_NamaHelpdesk=Dimas06955_NamaHelpdesk;
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        
    }
    int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.Dimas06955_NamaHelpdesk;
    }
    int GetKontak(){
        return this.Dimas06955_Kontak;
    }
 }


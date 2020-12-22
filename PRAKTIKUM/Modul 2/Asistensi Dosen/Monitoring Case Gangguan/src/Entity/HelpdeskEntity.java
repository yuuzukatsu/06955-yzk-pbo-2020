package Entity;

public class HelpdeskEntity {
    int Dimas06955_IdHelpdesk, Dimas06955_Kontak;
    String Dimas06955_NamaHelpdesk;
    
    public HelpdeskEntity(int Dimas06955_IdHelpdesk, String Dimas06955_NamaHelpdesk, int Dimas06955_Kontak){
        this.Dimas06955_IdHelpdesk=Dimas06955_IdHelpdesk;
        this.Dimas06955_NamaHelpdesk=Dimas06955_NamaHelpdesk;
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        
    }
    public int GetIdHelpdesk(){
        return this.Dimas06955_IdHelpdesk;
    }
    public String GetNamaHelpdesk(){
        return this.Dimas06955_NamaHelpdesk;
    }
    public int GetKontak(){
        return this.Dimas06955_Kontak;
    }
 }


package MonitoringCaseGangguan;
import Controller.*;
import GUI.MenuGUI;

public class MonitoringCaseGangguan {

    public static void main(String[] args) {
        
        //TAMBAHKAN SAMPLE DATA
        CaseGangguanController CaseGGN = new CaseGangguanController();
        HelpdeskController HD = new HelpdeskController();
        PelangganController PLG = new PelangganController();
        PLG.TambahSample();
        HD.TambahSample();
        CaseGGN.TambahSample();
        //TAMBAHKAN SAMPLE DATA
        
        //Tampilkan GUI
        MenuGUI gui = new MenuGUI(); 
    }
}

package MonitoringCaseGangguan;

public class Dimas06955_PelangganEntity {
    int Dimas06955_IdPelanggan,Dimas06955_Kontak;
    String Dimas06955_NamaPelanggan,Dimas06955_Alamat;
    
    public Dimas06955_PelangganEntity(int Dimas06955_IdPelanggan, String Dimas06955_NamaPelanggan, int Dimas06955_Kontak, String Dimas06955_Alamat){
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_NamaPelanggan=Dimas06955_NamaPelanggan;
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        this.Dimas06955_Alamat=Dimas06955_Alamat;
    }
    int GetIdPelanggan(){
        return this.Dimas06955_IdPelanggan;
    }
    String GetNamaPelanggan(){
        return this.Dimas06955_NamaPelanggan;
    }
    int GetKontak(){
        return this.Dimas06955_Kontak;
    }
    String GetAlamat(){
        return this.Dimas06955_Alamat;
    }
 }


package Entity;

public class PelangganEntity extends PelangganParentEntity {
    int Dimas06955_Kontak;
    String Dimas06955_Alamat;
    
    public PelangganEntity (int Dimas06955_IdPelanggan, String Dimas06955_NamaPelanggan, int Dimas06955_Kontak, String Dimas06955_Alamat){
        super(Dimas06955_IdPelanggan,Dimas06955_NamaPelanggan);
        this.Dimas06955_Kontak=Dimas06955_Kontak;
        this.Dimas06955_Alamat=Dimas06955_Alamat;
    }
    
    @Override
    public int GetIdPelanggan() {
        return Dimas06955_IdPelanggan;
    }
    
    @Override
    public String GetNamaPelanggan(){
        return Dimas06955_NamaPelanggan;
    }
    public int GetKontak(){
        return this.Dimas06955_Kontak;
    }
    public String GetAlamat(){
        return this.Dimas06955_Alamat;
    }

    
 }


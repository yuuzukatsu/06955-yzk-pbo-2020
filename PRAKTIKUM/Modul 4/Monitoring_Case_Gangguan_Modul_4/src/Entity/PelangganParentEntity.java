package Entity;

public abstract class PelangganParentEntity {
    int Dimas06955_IdPelanggan;
    String Dimas06955_NamaPelanggan;
    
    public PelangganParentEntity(int Dimas06955_IdPelanggan, String Dimas06955_NamaPelanggan){
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
        this.Dimas06955_NamaPelanggan=Dimas06955_NamaPelanggan;
    }   
    public abstract int GetIdPelanggan();   
    public abstract String GetNamaPelanggan();
 }


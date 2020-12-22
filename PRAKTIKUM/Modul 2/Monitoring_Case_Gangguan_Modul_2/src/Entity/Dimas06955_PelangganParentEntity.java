package Entity;

public abstract class Dimas06955_PelangganParentEntity {
    int Dimas06955_IdPelanggan;
    String Dimas06955_NamaPelanggan;
    
    public Dimas06955_PelangganParentEntity(int Dimas06955_IdPelanggan, String Dimas06955_NamaPelanggan){
        this.Dimas06955_IdPelanggan=Dimas06955_IdPelanggan;
    }   
    public abstract int GetIdPelanggan();   
    public abstract String GetNamaPelanggan();
 }


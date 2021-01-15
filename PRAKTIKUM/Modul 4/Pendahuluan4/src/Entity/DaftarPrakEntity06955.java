package Entity;

public class DaftarPrakEntity06955 {
    private PraktikanEntity06955 praktikan;
    private boolean isVerified;
    private int indexPraktikum;
    
    public DaftarPrakEntity06955(int indexPraktikum, PraktikanEntity06955 praktikan, boolean isVerified){
        this.praktikan = praktikan;
        this.isVerified = isVerified;
        this.indexPraktikum = indexPraktikum;
    }
    
    public PraktikanEntity06955 getPraktikan(){
        return praktikan;
    }
    public void setPraktikan(PraktikanEntity06955 praktikan){
        this.praktikan = praktikan;
    }
    public boolean isVerified(){
        return isVerified;
    }
    public void setVerified(boolean verified){
        this.isVerified = verified;
    }
    public int getIndexPrak(){
        return indexPraktikum;
    }
    public void setIndexPrak(int indexPrak){
        this.indexPraktikum = indexPrak;
    }
}

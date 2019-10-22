package bai5;

public abstract class DiemHP {
    protected String tenHP;
    protected int soTinChi;
    public  DiemHP(String tenHP, int soTinChi){
         this.tenHP = tenHP;
         this.soTinChi = soTinChi;
    }
    public String layTenHocPhan(){
        return tenHP;
    }
    public int laySoTinChi(){
        return soTinChi;
    }
    abstract public double tinhDiem();    
   
}


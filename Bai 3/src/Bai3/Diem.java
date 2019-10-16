package Bai3;

	public class Diem {

		private String tenHocPhan;
	    private int soTinChi;
	    private int chuyenCan,GiuaKy,CuoiKy;
	    public int laySTC(){
	    return soTinChi;
	    }
	    public Diem(String thp,int stc,int cc,int gk,int ck){
	        tenHocPhan=thp;
	        soTinChi=stc;
	        chuyenCan=cc;
	        GiuaKy=gk;
	        CuoiKy=ck;
	    }
	    public double tinhDiem(){
	        return 0.1*chuyenCan+0.2*GiuaKy+0.7*CuoiKy;
	    }
	}
	class SinhVien {
		 private String hoTen;
		    private double dm1,dm2;
		    public SinhVien(String ten,Diem x,Diem y){
		       hoTen=ten;
		       dm1=x.tinhDiem();
		       dm2=y.tinhDiem();
		    }
		    public double tinhDTB(){
		        return (dm1+dm2)/2;
		    }
		    public String toString(){
		        return "Ho ten Sinh Vien: "+hoTen+"\nDiem trung binh: "+tinhDTB();
		    }
		}

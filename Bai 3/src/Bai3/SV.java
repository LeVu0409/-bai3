package Bai3;

public class SV {
	public static void main(String[] args) {
		    SinhVien[] sv = new SinhVien[3];
		    Diem[] monhoc = new Diem[6];
		    monhoc[0]= new Diem("Giai tich",3,8,7,6);
		    monhoc[1]= new Diem("Mac - Lenin",3,7,5,8);
		    monhoc[2]= new Diem("Tu tuong HCM",3,4,1,5);
		    monhoc[3]= new Diem("Lap trinh co ban",3,9,9,7);
		    monhoc[4]= new Diem("Toan Logic",3,8,7,6);
		    monhoc[5]= new Diem("Ðai so tuyen tinh",3,7,8,5);
		    sv[0]= new SinhVien("Le Loc",monhoc[0],monhoc[1]);
		    sv[1]= new SinhVien("Le Vu",monhoc[2],monhoc[3]);
		    sv[2]= new SinhVien("Le Loi",monhoc[4],monhoc[5]);
		    
		    for(int i=0;i<3;i++)
		        System.out.println(sv[i]);
		    }

		    
		}

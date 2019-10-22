package bai5;
public class Main {
    public static void main (String[] args){
        SinhVien[] sv=new SinhVien[3];
        sv[0]=new SinhVien("Le Vu",
                            new HPLyThuyet("Tu tuong HCM",4,10,9,8),
                            new HPThucHanh("Lap trinh co ban",3,9,7,8));
        
        sv[1]=new SinhVien("Le Loi",
                            new HPLyThuyet("Phap luat dai cuong",3,9,9,8),
                            new HPThucHanh("Lap trinh HDT",4,8,7,8));
        sv[2]=new SinhVien("Le Lai",
                            new HPLyThuyet("Ki nang mem",2,7,7,7),
                            new HPThucHanh("Nhap mon mang may tinh",3,8,9,9));
        
        for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }
}
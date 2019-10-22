package bai5;

public class Main {
    public static void main(String[]  args){
          SinhVien[] sv=new SinhVien[3];
        sv[0]=new SinhVien("Le Lai",
                            new HPLyThuyet("Tu tuong HCM",3,5,6,7),
                            new HPThucHanh("Lap trinh co ban",3,8,9,5));
        
        sv[1]=new SinhVien("Le Hieu",
                            new HPLyThuyet("Phap luat dai cuong",3,4,6,4),
                            new HPThucHanh("Lap trinh HDT",4,8,7,8));
        sv[2]=new SinhVien("Le Trung",
                            new HPLyThuyet("Ki nang mem",2,8,7,9),
                            new HPThucHanh("Nhap mon mang may tinh",3,8,5,7));
        
        for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }
}


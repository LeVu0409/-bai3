package bai5;

public class HPLyThuyet extends DiemHP {

    private int chuyenCan, cuoiKy, giuaKy;

    public HPLyThuyet(String tenHP, int soTinChi, int chuyenCan, int cuoiKy, int giuaKy) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.cuoiKy = cuoiKy;
        this.giuaKy = giuaKy;
    }

    public double tinhDiem() {
        return (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7);
    }
    }

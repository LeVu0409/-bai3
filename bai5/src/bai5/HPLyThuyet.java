package bai5;

class HPLyThuyet extends DiemHP{
	public HPLyThuyet(String THP, int STC, double chuyenCan , double giuaKy ,double cuoiKy) {
		super(THP, STC);
		this.chuyenCan = chuyenCan;
		this.cuoiKy = cuoiKy;
		this.giuaKy = giuaKy;
	}
	private double chuyenCan;
	private double giuaKy;
	private double cuoiKy;
	public double tinhDiem() {
		return (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7 );
		
	}
	}
package bai5;

public class HPThucHanh extends DiemHP {
	private double db1, db2, db3;

	public HPThucHanh(String TenHP, int soTinChi, double db1, double db2, double db3) {
		super(TenHP, soTinChi);
	}

	public double tinhDiem() {
		return (db1 + db2 + db3) / 3;
	}

}

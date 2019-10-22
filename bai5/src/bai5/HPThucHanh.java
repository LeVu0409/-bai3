package bai5;

class HPThucHanh extends DiemHP{

	public HPThucHanh(String THP, int STC , double db1 , double db2 , double db3) {
		super(THP, STC);
		this.db1 = db1;
		this.db2 = db2;
		this.db3 = db3;
	}
	private double db1 , db2 , db3;
	
	
	public double tinhDiem() {
		return (db1 + db2 + db3) / 3;
	}
	

}

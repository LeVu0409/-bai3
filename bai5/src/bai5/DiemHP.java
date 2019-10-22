package bai5;

public abstract class DiemHP {
	protected String tenHP;
	protected int soTinChi;
	
	public DiemHP(String THP, int STC) {
		tenHP	= THP;
		soTinChi= STC; 
	}
	public String layTenHP() {
		return tenHP;
	}
	public int laySoTinchi() {
		return soTinChi;
	}
	public abstract double tinhDiem();
}

	


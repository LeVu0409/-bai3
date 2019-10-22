package bai5;

public class SinhVien {
	private String hoTen;
	private DiemHP hp1, hp2;

	public SinhVien(String hoTen, DiemHP hp1, DiemHP hp2) {
		this.hoTen = hoTen;
		this.hp1 = hp1;
		this.hp2 = hp2;
	}

	public float tinhDiemTB() {
		return (float) ((hp1.tinhDiem() * hp1.laySoTinchi() + hp2.tinhDiem() * hp2.laySoTinchi())
				/ (hp1.laySoTinchi() + hp2.laySoTinchi()));
	}
	public String toString() {
		return "Ho Ten : " + hoTen
				+ "\nDiemHP1 : " + hp1.tinhDiem()
				+"\nDiemHP2 : " + hp2.tinhDiem()
				+"\nDiemTB : " + tinhDiemTB()
				;
	}

}

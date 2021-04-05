package ngo1.dev;

public class Fish extends Animal {
	String kieuVay;
	String loaiNuoc;
	public Fish(String tenGoi, int canNang, String kieuVay, String loaiNuoc) {
		super(tenGoi, canNang);
		this.kieuVay = kieuVay;
		this.loaiNuoc = loaiNuoc;
	}
	

}

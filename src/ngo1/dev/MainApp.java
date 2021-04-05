package ngo1.dev;

public class MainApp {
public static void main(String[] args) {
	Cat cat = new Cat("Meo tom", 10, "xanh", "vang");
	System.out.println("Can nang " + cat.tenGoi);
	System.out.println("Mau long " + cat.mauLong);
	System.out.println("Can nang " + cat.tenGoi);
	System.out.println("Mau mat" + cat.mauMat);
	cat.an();
	
	System.out.println("**********");
	Fish fish = new Fish ("Ca map", 100,"Xam","Xanh");
	System.out.println("Can nang " + fish.tenGoi);
	System.out.println("Kieu vay " + fish.kieuVay);
	System.out.println("Loai nuoc " + fish.loaiNuoc);
	fish.an();
	}
}

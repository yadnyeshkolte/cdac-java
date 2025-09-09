package assignment6.productinventory;
import java.util.ArrayList;

class ProductData {
	static ArrayList<Product> getProductItems(){
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(1, "Laptop", 60000f, 2));
		al.add(new Product(2, "Smartphone", 30000f, 5));
		al.add(new Product(3, "Tablet", 25000f, 3));
		al.add(new Product(4, "Monitor", 15000f, 4));
		al.add(new Product(5, "Keyboard", 1200f, 10));
		al.add(new Product(6, "Mouse", 800f, 12));
		al.add(new Product(7, "Printer", 9000f, 2));
		al.add(new Product(8, "Scanner", 7000f, 1));
		al.add(new Product(9, "Webcam", 2000f, 6));
		al.add(new Product(10, "Router", 2500f, 3));
		al.add(new Product(11, "Speaker", 3500f, 5));
		al.add(new Product(12, "Headphones", 2200f, 7));
		al.add(new Product(13, "SSD", 4000f, 4));
		al.add(new Product(14, "Hard Disk", 3500f, 6));
		al.add(new Product(15, "RAM", 3200f, 8));
		al.add(new Product(16, "Graphics Card", 25000f, 2));
		al.add(new Product(17, "Motherboard", 15000f, 3));
		al.add(new Product(18, "Power Supply", 4500f, 4));
		al.add(new Product(19, "UPS", 5000f, 2));
		al.add(new Product(20, "Cabinet", 3000f, 3));
		al.add(new Product(21, "Microphone", 1800f, 6));
		al.add(new Product(22, "Projector", 35000f, 1));
		al.add(new Product(23, "Smartwatch", 8000f, 4));
		al.add(new Product(24, "VR Headset", 40000f, 1));
		al.add(new Product(25, "Camera", 25000f, 2));
		al.add(new Product(26, "Tripod", 1800f, 5));
		al.add(new Product(27, "Charger", 1200f, 8));
		al.add(new Product(28, "Pen Drive", 700f, 15));
		al.add(new Product(29, "Memory Card", 900f, 14));
		al.add(new Product(30, "Bluetooth Adapter", 600f, 10));
		
		return al;
	} 

}

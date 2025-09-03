package assignment4updated.appliance;

public class ApplianceMain {
	public static void main() {
		Appliance a = new Appliance(); 
		Fan f = new Fan();
		AirConditioner ac = new AirConditioner();
		Refrigerator r = new Refrigerator();
		
		a.showConsumption(0);
		f.showConsumption(20);
		ac.showConsumption(8);
		r.showConsumption(24);
	}
}

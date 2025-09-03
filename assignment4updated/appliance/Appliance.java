package assignment4updated.appliance;


public class Appliance {
	String name;
	float power;
	
	Appliance(){
		name = "Empty";
		power = 0;
	}
	Appliance(String name,float power){
		this.name= name;
		this.power=power;
		
	}
	void showConsumption(int hours) {
		System.out.println(" Total Consumption "+ power*hours);
	}
}
class Fan extends Appliance{
	
	Fan(){
		name = "Fan";
		power = 20;
	}
	Fan(String name,float power){
	super(name,power);	
	}
	
	@Override
	void showConsumption(int hours) {
		System.out.println(" Total Consumption "+ power*hours);
	}
}
class AirConditioner  extends Appliance{
	
	AirConditioner(){
		name = "air-conditioner";
		power = 100;
	}
	AirConditioner (String name,float power){
	super(name,power);	
	}
	@Override
	void showConsumption(int hours) {
		System.out.println(" Total Consumption "+ power*hours);
	}
}

class Refrigerator extends Appliance{
	
	Refrigerator (){
		name = "Refrigerator";
		power = 90;
	}
	Refrigerator (String name,float power){
	super(name,power);	
	}
	@Override
	void showConsumption(int hours) {
		System.out.println(" Total Consumption "+ power*hours);
	}
}


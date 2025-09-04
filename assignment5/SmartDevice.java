package assignment5;

interface SmartDevice {
	void turnOn();
	void turnOff(); 
	boolean getStatus();
}

class Light implements SmartDevice{
	int deviceId;
	boolean status= false;
	public Light(int deviceId, boolean status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	public void turnOn() {
		status = true;
	}
	public void  turnOff() {
		status = false;
	}
	public boolean getStatus() {
		return status;
	}
}

class Fan implements SmartDevice{
	int deviceId;
	boolean status= false;
	public Fan(int deviceId, boolean status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	public void turnOn() {
		status = true;
	}
	public void turnOff() {
		status = false;
	}
	public boolean getStatus() {
		return status;
	}
	
}
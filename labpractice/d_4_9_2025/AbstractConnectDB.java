package labpractice.d_4_9_2025;

abstract class AbstractConnectDB {
	void connectingDB() {
		System.out.println("Connecting to DB");
	}
	abstract void gettingDB();
}



interface InterfaceConnectDB2{
	 void connectingToDMBS2();
}

interface interface3 extends InterfaceConnectDB2{
	abstract void connectingToDMBS3();
}
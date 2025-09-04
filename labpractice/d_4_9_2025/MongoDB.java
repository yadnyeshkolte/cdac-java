package labpractice.d_4_9_2025;

class MongoDB extends AbstractConnectDB implements InterfaceConnectDB1, InterfaceConnectDB2, interface3 {

	@Override
	void connectingDB() {
		System.out.println("Connecting to DB");
	}

	@Override
	void gettingDB() {
		System.out.println("Getting to DB");
	}
	public void connectingToDMBS1() {
		System.out.println("Connecting to DMBS 1");
	}

	@Override
	public void connectingToDMBS2() {
		System.out.println("Connecting to DMBS 2");
	}
	
	@Override
	public void connectingToDMBS3() {
		System.out.println("Connecting to DMBS 3");
	}

}

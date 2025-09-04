package labpractice.d_4_9_2025;

class Oracle implements ConnectDB, GetDB {
	@Override
	public void connectSQL(){
		System.out.println("Connecting to SQL");
	}
	public void connectTo() {
		System.out.println("Connecting to DB");
	}
	@Override
	public void getSQL() {
		System.out.println("Getting to SQL");
	}
	@Override
	public void getTo() {
		System.out.println("Getting to DB");
		
	}
}

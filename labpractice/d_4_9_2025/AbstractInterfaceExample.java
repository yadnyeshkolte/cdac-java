package labpractice.d_4_9_2025;

public class AbstractInterfaceExample {
	public static void main(String[] args) {
		Oracle o = new Oracle();
		o.connectSQL();
		o.connectTo();
		o.getSQL();
		o.getTo();
		System.out.println("=============");
		MongoDB m = new MongoDB();
		m.connectingDB();
		m.gettingDB();
		m.connectingToDMBS1();
		m.connectingToDMBS2();
		m.connectingToDMBS3();
	}
}

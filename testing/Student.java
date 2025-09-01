
package testing;
public class Student {
	int rollNo;
	String name;
	int emarks;
	int cmarks;
	int mmarks;
	Student(){
		rollNo = 0;
		name = "Empty";
		emarks = 0;
		cmarks = 0;
		mmarks = 0;
	}
	Student(int rollNo, String name, int emarks, int cmarks, int mmarks){
		this.rollNo = rollNo;
		this.name = name;
		this.emarks  = emarks;
		this.cmarks = cmarks;
		this.mmarks = mmarks;
	}
}

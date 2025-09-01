package constructer;
// If this integer instance variable is not assigned then it will give value 0 automatically
// But in the int[] array it will give null values to each component in the array
class A{
	int i;
	A(){
		i=10;
		System.out.println("A no Argument Constructer Intialized");
	}
	A(int i){
		this.i = i;
		System.out.println("A Parameterized Constructer Intialized");
	}
	void displayA() {
		System.out.println(i);
	}
}
class B extends A{
	int j;
	B(){
		j=20;
		System.out.println("B no Argument Constructer Intialized");
	}
	B(int j){
		this.j = j;
		System.out.println("B Parameterized Constructer Intialized");
	}
	void displayB() {
		System.out.println(j);
	}
}

class C extends A{
	int k;
	C(){
		k=30;
		System.out.println("C no Argument Constructer Intialized");
	}
	C(int k){
		this.k = k;
		System.out.println("C Parameterized Constructer Intialized");
	}
	void displayC() {
		System.out.println(k);
	}
}



class D extends A{
	int m;
	D(){
		m=40;
		System.out.println("D no Argument Constructer Intialized");
	}
	D(int i,int m){
		super(i);
		this.m = m;
		System.out.println("D Parameterized Constructer Intialized");
	}
	void displayD() {
		System.out.println(m);
	}
}

class E extends A{
	int n;
	E(){
		//n=50;
		System.out.println("E no Argument Constructer Intialized");
	}
	E(int i,int n){
		super(i);
		this.n = n;
		System.out.println("E Parameterized Constructer Intialized");
	}
	void displayE() {
		System.out.println(n);
	}
}


public class ABCs {
	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		b.displayB();
		b.displayA();
		c.displayC();
		System.out.println("===========");
		D d = new D(150,120);
		d.displayD();
		d.displayA();
		E e = new E();
		e.displayA();
		e.displayE();
	}
}

//Output
/*
A no Argument Constructer Intialized
C no Argument Constructer Intialized
A no Argument Constructer Intialized
B no Argument Constructer Intialized
20
10
30
===========
A Parameterized Constructer Intialized
D Parameterized Constructer Intialized
120
150
A no Argument Constructer Intialized
E no Argument Constructer Intialized
10
0*/

public class TestOperator {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("a has value "+a);
        System.out.println("a = "+ a);
        System.out.println("++a = "+ ++a);
        System.out.println("a++ = "+ a++);

        int b = 0;
        System.out.println("b has value "+b);
        System.out.println("b = "+ b);
        System.out.println("++b = "+ b++);
        System.out.println("b++ = "+ ++b);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        int d1 = c1;
        int d2 = c2 + ++c2;
        int d3 = c3 + ++c3 + c3++;
        int d4 = c4 + ++c4 + c4++ + ++c4;
        //System.out.println("c + ++c + c++ + ++c = "+d);
        System.out.println("d1 = "+ d1);
        System.out.println("d2 = "+ d2);
        System.out.println("d3 = "+ d3);
        System.out.println("d4 = "+ d4);
    }
}

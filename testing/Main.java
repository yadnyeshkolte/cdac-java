package testing;


public class Main {

	public static void main(String[] args) {
		String s= "()))()()((())";
		//40 41 41 41 40 41 40 41 40 40 40 41 41
		int count = minParentheses(s);
		System.out.println(count);
	}
	
    public static int minParentheses(String s) {
        // code here
        int total = 0;
        int counta = 0;
        int countb = 0;

        if(s.charAt(0)!='('){
            s = "("+s;
            total++;
        }
        if(s.charAt(s.length()-1)!=')'){
            s = s+")";
            total++;
        }
        System.out.println(total);
        System.out.println(s);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                counta++;
            }
            if(s.charAt(i)==')'){
                countb++;
            }
        }
        if(counta==countb){
            return total;
        }
        else{
            if(counta>countb){
                total += counta-countb;
            }
            else{
                total += countb-counta;
            }
        }
        return total;
    }
}
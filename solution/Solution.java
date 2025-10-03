package solution;

import java.util.HashMap;
import java.util.Map;
class Solution {
	public static void main(String[] args) {
		String s = "abcd";
		majorityFrequencyGroup(s);
	}
    public static void majorityFrequencyGroup(String s) {
        HashMap<String, Integer> ph = new HashMap<>();
        HashMap<String, Integer> ph1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
        	String s2 = s.charAt(i)+"";
            if(ph.containsKey(s2)==false){
                ph.put(s2,1);
            }
        }
        for(Map.Entry<String, Integer> e : ph.entrySet()){
            ph.replace(e.getKey(), e.getValue(), getNumberTimes(s, e.getKey()));
        }

        for(Map.Entry<String, Integer> g : ph.entrySet()){
        		String s3 = g.getKey();
            for(Map.Entry<String, Integer> h : ph.entrySet()){
            		if(g.getValue()==h.getValue() && g.getKey().equals(h.getKey())==false) {
            			s3 = s3+h.getKey();
            		}
            }

            if(s3.equals("")==false) {
            		ph1.put(s3, g.getValue());
            }
            
        }
        for(Map.Entry<String, Integer> f : ph1.entrySet()){
            System.out.println(f.getKey()+" "+f.getValue());
        }
    }
    public static int getNumberTimes(String s, String target){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(target.equals(s.charAt(i)+"")){
                count++;
            }
        }
        return count;
    }
}
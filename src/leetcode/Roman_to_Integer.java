package leetcode;

import java.util.HashMap;
import java.util.Map;
/*
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 * */
public class Roman_to_Integer {
	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			Integer ch = map.get(s.charAt(i));
			sum+=ch;
			if(i<s.length()-1&&ch<map.get(s.charAt(i+1))) {
				sum-=2*ch;
			}
		}
		return sum;
    }
}

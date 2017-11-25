package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_of_a_Phone_Number {
	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		if(digits.isEmpty()) {
			return ans;
		}
		Map<Character, String> map = new HashMap<>();
		map.put('1', "");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		map.put('0', "");
		char nums[] = digits.toCharArray();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<nums.length;i++) {
			if(map.get(nums[i])=="") {
				continue;
			}
			list.add(map.get(nums[i]));
		}
		System.out.println("----------"+list.toString()+"----------");
		if(list.size()==1) {
			char ch[] =list.get(0).toCharArray();
			for(int i=0;i<ch.length;i++) {
				ans.add(String.valueOf(ch[i]));
			}
			return ans;
		}
		String curr = "";
		combin(list, curr, 0,ans);
		return ans;
    }
	private void combin(List<String> s,String curr,int index,List<String> ans){
		if(index==s.size()) {
			ans.add(curr.toString());
			return;
		}
		for(int i=0;i<s.get(index).length();i++) {
			curr+=s.get(index).charAt(i);
			combin(s, curr, index+1,ans);
			curr=curr.substring(0, curr.length()-1);
		}
	}
}

package leetcode;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring {
	public int lengthOfLongestSubstring(String s) {
		int ans=0;
		Set<Character> set = new HashSet<>();
		if(s.length()==1) {
			ans=1;
		}else {
			for(int i=0;i<s.length();i++) {
				set.clear();
				set.add(s.charAt(i));
				for(int j=i+1;j<s.length();j++) {
					if(set.contains(s.charAt(j))&&set.size()!=1) {
						break;
					}else {
						set.add(s.charAt(j));
						if(set.size()>ans) {
							ans=set.size();
						}
					}
				}
			}
		}
		return ans;
    }
	public boolean allUnique(String substring) {
		boolean bool=true;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<substring.length();i++) {
			if(set.contains(substring.charAt(i))) {
				bool=false;
			}else {
				set.add(substring.charAt(i));
			}
		}
		return bool;
	}
}

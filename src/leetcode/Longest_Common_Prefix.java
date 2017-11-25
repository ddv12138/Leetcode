package leetcode;
public class Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) {
			return "";
		}
		String s=strs[0];
		for(int i=0;i<strs.length;i++) {
			if(strs[i]=="") {
				return "";
			}
			for(int j=0;j<Math.min(s.length(), strs[j].length());j++) {
				s=common(s, strs[i]);
			}
		}
		return s;
    }
	private String common(String s,String p) {
		int i=0;String common="";
		while(i<Math.min(s.length(), p.length())&&s.charAt(i)==p.charAt(i)) {
			common+=s.charAt(i);
			i++;
		}
		return common;
	}
}

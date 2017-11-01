package leetcode;


public class Longest_Palindromic_Substring {
	public String longestPalindrome(String s) {
		//List<Character> list = new ArrayList<>();
		//int len=0;
		String ans = "";
		for(int i=0;i<s.length();i++) {
			int ind1[] = isLoopback(s, i,i);
			int ind2[] = isLoopback(s,i, i+1);
			String str1 = s.substring(ind1[0], ind1[1]+1);
			String str2 = s.substring(ind2[0], ind2[1]+1);
			String str= str1.length()>str2.length()?str1:str2;
			//System.out.println(str1+"---"+str2);
			if(str.length()>ans.length()&&str!=null) {
				ans=str;
			}
		}
		return ans;
    }
	public int[] isLoopback(String s,int l,int r) {
		int i=l,j=r;
		int ind[]=new int[2];
		while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)) {
				ind[0]=i;
				ind[1]=j;
				i--;
				j++;
		}
		return ind;
	}
	public boolean isLoopback(String s) {
		boolean flag = true;
		int i=0,j=s.length()-1;
		char ch[]=s.toCharArray();
		while(i<j) {
			if(ch[i]!=ch[j]) {
				flag=false;
			}
			i++;
			j--;
		}
		return flag;
	}
}

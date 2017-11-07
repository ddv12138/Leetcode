package leetcode;
/*
 * �˶�ԭ�����http://www.cnblogs.com/grandyang/p/4461713.html
 * ��δ��ȫ����
 * */
public class Palindrome_Number {
	public boolean isPalindrome(int x) {
		boolean flag =false;
		long sum=(long)x;
		if(sum<0) {
			return false;
		}
		String s= Long.toString(sum);
		System.out.println(s);
		int i,j;
		if(s.length()%2==0) {
			i=s.length()/2-1;
			j=i+1;
		}else {
			i=s.length()/2;
			j=i;
		}
		flag=isPalin(s, i, j);
		return flag;
    }
	public boolean isPalin(String s,int i,int j) {
		boolean flag=true;
		while(i<=j&&i>=0&&j<s.length()) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
			}
			i--;
			j++;
		}
		return flag;
	}
}

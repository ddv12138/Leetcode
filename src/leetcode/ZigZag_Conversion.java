package leetcode;

public class ZigZag_Conversion {
	public String convert(String s, int numRows) {
		String ans="";
		if(numRows==1) {
			ans=s;
		}else {
			String str[] = new String[numRows];
			for(int i=0;i<str.length;i++) {
				str[i]="";
			}
			boolean flag = true;
			int currRow=0;
			for(int i=0;i<s.length();i++) {
				if(currRow>numRows-1) {
					currRow-=2;
				}else if(currRow<0) {
					currRow+=2;
				}
				str[currRow]+=s.charAt(i);
				if(flag) {
					currRow++;
					if(currRow>numRows-1) {
						flag=false;
					}
				}else {
					currRow--;
					if(currRow<0) {
						flag=true;
					}
				}
			}
			for(int i=0;i<str.length;i++) {
				ans+=str[i];
			}
		}
		return ans;
    }
}

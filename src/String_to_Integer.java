

public class String_to_Integer {
	public int myAtoi(String str) {
		int ans=0,i=0;
		int sign=1;
		if(str.length()==0) {
			return 0;
		}
		while(i<str.length()&&str.charAt(i)==' ') {
			i++;
		}
		if(i<str.length()&&str.charAt(i)=='-') {
			sign=-1;
			i++;
		}else if(i<str.length()&&str.charAt(i)=='+') {
			i++;
		}
		while(i<str.length()&&str.charAt(i)=='0') {
			i++;
		}
		int sum=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				if(Integer.MAX_VALUE/10<sum) {System.out.println(1);}
				if(Integer.MAX_VALUE/10==sum ) {System.out.println(2);}
				if(Integer.MAX_VALUE%10<str.charAt(i)) {System.out.println(3);}
				if(Integer.MAX_VALUE/10<sum||Integer.MAX_VALUE/10==sum && Integer.MAX_VALUE%10<(str.charAt(i)-'0')) {
					return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
				}
				sum=(str.charAt(i)-'0')+(sum*10);
				
			}else {
				break;
			}
		}
		ans=sum;
		return ans*sign;
    }
	/*public static int myAtoi(String str) {
        if(str.length()==0)
            return 0;
        StringBuilder sb=new StringBuilder();
        int sign=1,i=0;
        //removing leading white spaces
            while (str.charAt(i)==' ')
                i++;
        //taking care of signs
            if(str.charAt(i)=='+') {
                sign = 1;
                i++;
            }
            else if(str.charAt(i)=='-') {

                sign = -1;
                i++;
            }
            //extracting digits
            while(i<str.length()) {
                if(str.charAt(i)<'0'|| str.charAt(i)>'9') {
                    break;
                }
                else {
                    sb.append(str.charAt(i) - '0');
                }
                i++;
            }
        int total=0;
        for(char ch: sb.toString().toCharArray())
        {
            int digit=Integer.parseInt(ch+"");
            System.out.println(total);
            //handling the overflow case
            if(Integer.MAX_VALUE/10<total||Integer.MAX_VALUE/10==total && Integer.MAX_VALUE%10<digit )
            {
                return sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            total=total*10+digit;
        }
        return total*sign;
    }*/
}

package leetcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Reverse_Integer {
	public int reverse(int x) {
		boolean flag =true;
		String s="";
		if(x<0) {
			x=-x;
			flag=false;
		}
		List<Integer> list = new ArrayList<>();
		int tmp=x;
		while(tmp/10!=0) {
			list.add(tmp%10);
			tmp=tmp/10;
		}
		list.add(tmp%10);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			s+=it.next().toString();
		}
		if(!flag) {
			s="-"+s;
		}
		int i =0;
		try {
			i = Integer.parseInt(s);
		}catch(Exception e) {
			return 0;
		}
		return i;
    }
}

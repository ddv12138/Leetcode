package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parentheses {
	public boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push(')');
			}else if(s.charAt(i)=='[') {
				stack.push(']');
			}else if(s.charAt(i)=='{') {
				stack.push('}');
			}else if(stack.peek()==null||stack.pop()!=s.charAt(i)) return false;
		}
		return stack.isEmpty();
    }
}

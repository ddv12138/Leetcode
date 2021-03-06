package leetcode;

// Definition for singly-linked list.
public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
       
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resualt=new ListNode(0);
        ListNode curr = resualt,p=l1,q=l2;
        int carry = 0;
        while(p!=null || q!=null){
            int x=(p!=null)?p.val:0;
            //System.out.println(p==null);
            int y=(q!=null)?q.val:0;
            int sum=x+y+carry;
            carry = sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return resualt.next;
    }
}
package leetcode;

public class Remove_Nth_Node_From_End_of_List {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode ans = new ListNode(0);
		ans.next=head;
		if(ans.next==null) {
			return null;
		}
		int len=0;
        ListNode tmp = head;
        while(tmp!=null) {
        	tmp=tmp.next;
        	len++;
        }
        if(len==1) {
        	return null;
        }
        int index = len-n;
        tmp =ans;
        while(index>1) {
        		tmp=tmp.next;
        		index--;
        }
        tmp.next=tmp.next.next;
		return ans.next;
    }
}

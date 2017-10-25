
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		
		l1.next = l2;
		l2.next = l3;
		
		l4.next=l5;
		l5.next=l6;
		//System.out.println(l1==null);
		ListNode r=s.addTwoNumbers(l1, l4);
		while(r!=null) {
			System.out.println(r.val);
			r=r.next;
		}
	}

}

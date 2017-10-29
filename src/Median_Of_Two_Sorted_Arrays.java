import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
public class Median_Of_Two_Sorted_Arrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		int num[] = new int[nums1.length+nums2.length];
		double mid=0;
		for(int i=0;i<Math.max(nums1.length, nums2.length);i++) {
			if(nums1.length>i)list.add(nums1[i]);
			if(nums2.length>i)list.add(nums2[i]);
		}
		Iterator<Integer> it= list.iterator();
		int flag = 0;
		while(it.hasNext()) {
			num[flag]=it.next();
			flag++;
		}
		Arrays.sort(num);
		if(num.length%2!=0) {
			mid=num[(num.length)/2];
		}else {
			int a=num[num.length/2]-1;
			int b =num[num.length/2];
			mid=(double)(a+b)/2;
		}
		return mid;
	}
}

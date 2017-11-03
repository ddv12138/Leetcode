package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Three_Sum_Closest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int j,k=nums.length-1,sum;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			j=i+1;
			k=nums.length-1;
			while(j<k) {
				sum=nums[i]+nums[j]+nums[k];
				System.out.println(sum);
				list.add(sum);
				//distance=Math.max(target,sum)-Math.min(target,sum);
				if(sum<target) {
					j++;
				}else if(sum>target) {
					k--;
				}else {
					return sum;
				}
			}
		}
		int min=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(Math.max(list.get(i), target)-Math.min(list.get(i), target)<Math.max(min, target)-Math.min(min, target)) {
				min=list.get(i);
			}
		}
		return min;
    }
}

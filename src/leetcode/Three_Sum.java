package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class Three_Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		int j=0,k=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			j=i+1;
			k=nums.length-1;
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				if(sum>0) {
					k--;
				}else if(sum<0) {
					j++;
				}else {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);		list.add(nums[j]);		list.add(nums[k]);
					set.add(list);
					j++;
					k--;
				}
			}
		}
		return new ArrayList<>(set);
    }
}

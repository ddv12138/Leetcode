package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Four_Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> tmp = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int k=j+1,l=nums.length-1;
				while(k<l) {
					int sum=nums[i]+nums[j]+nums[k]+nums[l];
					if(sum==target) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						list.add(nums[l]);
						tmp.add(list);
						l--;
						k++;
					}else if(sum>target) {
						l--;
					}else {
						k++;
					}
				}
			}
		}
		 List<List<Integer>> ans = new ArrayList<>();
		 ans.addAll(tmp);
		return ans;
    }
}

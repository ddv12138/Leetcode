
public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        int resualt[]=new int[2];
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
        	for(int j =i+1;j<nums.length;j++) {
            	if(nums[i]+nums[j]==target) {
            		resualt[0]=i;
            		resualt[1]=j;
            		flag=true;
            		break;
            	}
        	}
        	if(flag) {
        		break;
        	}
        }
        return resualt;
    }
}

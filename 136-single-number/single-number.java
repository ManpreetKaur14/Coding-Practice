class Solution {
    public int singleNumber(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                return nums[i];
            }
        }
        return nums[0];
        
    }
}
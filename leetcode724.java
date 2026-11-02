class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int start=0;
        int end=0;

        for(int j =0;j<nums.length;j++){
            totalsum=totalsum+nums[j];
        }

        for(int i =0;i<nums.length;i++){
            end=totalsum-start-nums[i];
            if(start==end){
                return i;
            }
            start=start+nums[i];
        }
        return -1;
    }
}

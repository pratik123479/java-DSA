class Solution {
    public int maxProduct(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x){
                y=x;
                x=nums[i];
            }else if(nums[i]>y){
                y=nums[i];
            }
        }
         int max=(x-1)*(y-1);
         return max;
    }
}

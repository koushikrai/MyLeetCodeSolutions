class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int pos= 0,neg=0;

        for (int i=0;i<n;i++){
            if(nums[i]>0){
                pos++;
            }
             if(nums[i]<0){
                neg++;
            }
           
        }
        return Math.max(pos,neg);
    }
}

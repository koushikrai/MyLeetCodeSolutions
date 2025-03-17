//sorting for better space complexity

class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0 ) return false;
        Arrays.sort(nums);                                                    
        for (int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }

        }
        return true;
    }
}

// using hashmap for better time complexity
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i : nums){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for (int i : hm.keySet()){
            if (hm.get(i)%2!=0){
                return false;
            }
        }
        return true;
    }
}

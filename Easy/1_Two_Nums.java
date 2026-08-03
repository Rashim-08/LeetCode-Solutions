class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int w=target-nums[i];
            if(map.containsKey(w)){
                return new int[] {map.get(w),i};
            }
            map.put(nums[i],i);
       }
       return new int[] {-1,-1};

}
}
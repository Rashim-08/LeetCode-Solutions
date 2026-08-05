class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i:map.keySet()){
            if(map.get(i)>(nums.length/2)){
                return i;
            }
    }
    return 1;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
       int el=0;
       int count=0;
    
       for(int i=0;i<nums.length;i++){
        if(count==0){
            el=nums[i];
            count++;
            continue;
        }
        else if(nums[i]==el)count++;
        else count--;
       }
       int co=0;
       for(int i:nums){
        if(i==el)co++;
       }
       if(co>(nums.length/2))return el;
       return -1;
    }
}
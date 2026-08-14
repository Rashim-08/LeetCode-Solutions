class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int count=1;
       int cal=0;;
       if(nums.length==0)return 0;
       if(nums.length==1)return 1;
       
       for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]-nums[i] == 1){
            count++;
            cal=Math.max(cal,count);
        }
        
        else if(nums[i+1]-nums[i]==0)continue;
        else count=1;
       
       }
        cal=Math.max(cal,count);
       //if(count>0)count++;
       return cal;
    }
}
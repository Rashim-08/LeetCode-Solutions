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

lass Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
       Set<Integer> st=new HashSet<>();
       for(int i:nums){
        st.add(i);
       }
       
    int count=1;
       for(int i:st){
        
       if(!st.contains(i - 1)) {

                int next = i;
                int lon = 1;

                while(st.contains(next + 1)) {
                    lon++;
                    next++;
                } 
         count=Math.max(count,lon);
        }
       }
       return count;
    }
}
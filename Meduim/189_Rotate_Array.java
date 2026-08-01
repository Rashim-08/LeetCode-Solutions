class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length)k=k%nums.length;
        if(k==0)return;
        int a[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i+k>=nums.length){
                j=i+k-nums.length;
            }
            else{
                j=i+k;
            }
            a[j]=nums[i];
        }
       for(int i = 0; i < nums.length; i++){
    nums[i] = a[i];
}
        // for(int x:nums){
        //     System.out.println(x);
        // }
        
        
    }
}

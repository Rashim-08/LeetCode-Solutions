class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]=new int[nums.length];
        int pos;
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            pos=2*p;
            a[pos]=nums[i];
            p++;
           }
           else{
            pos= 2 * n + 1;
            a[pos]=nums[i];
            n++;
           }
        }
        return a;
    }
}

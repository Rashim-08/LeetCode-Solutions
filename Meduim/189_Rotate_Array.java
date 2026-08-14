class Solution {
    public void rotate1(int i,int j,int[] nums){
         while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
    }
    public void rotate(int[] nums, int k) {
    if (nums.length == 0) return;
    if(k>=nums.length) {k = k % nums.length;}
    if (k == 0) return;
       int i=0;
       int j=nums.length-1;
    rotate1(i,j,nums);
       i=0;
       j=k-1;
     rotate1(i,j,nums);
       i=k;
       j=nums.length-1;
    rotate1(i,j,nums);
    }
}
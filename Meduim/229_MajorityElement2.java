class Solution {
    public List<Integer> majorityElement(int[] nums) {
    // if(nums.length<=2){
    //      List<Integer>l=new ArrayList<>();
    //      if(nums.length==0)return l;
    //      else if(nums.length==1 || nums[0]==nums[1]){
    //         l.add(nums[0]);
    //         return l;
    //      }
    //      else{
    //         l.add(nums[0]);
    //         l.add(nums[1]);
    //         return l;
    //      }

    // }
   int el1=0,el2=0;
   int c1=0,c2=0;
   for(int i:nums){
    if(i==el1)c1++;
    else if(i==el2)c2++;
    else if(c1==0){
        el1=i;
        c1++;
        }
    else if(c2==0){
        el2=i;
        c2++;
        }
    else{
        c1--;
        c2--;
    }

   }
    c1=0;
    c2=0;
    for(int i:nums){
        if(i==el1)c1++;
        if(i==el2)c2++;
    }
    List<Integer>l=new ArrayList<>();
    if(c1>nums.length/3)l.add(el1);
    if(c2>nums.length/3 && el1!=el2)l.add(el2);
    return l;
    }
}

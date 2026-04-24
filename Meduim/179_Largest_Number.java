
class Solution {
    public String largestNumber(int[] nums) {
       String []s=new String[nums.length];
       for(int i=0;i<nums.length;i++)
       s[i]=String.valueOf(nums[i]);

        //this line caused error?
       //Arrays.sort(s,(a,b)->(a+b).compareTo(b+a));
       Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
       if(s[0].equals("0"))return "0";
       return String.join("",s);
    }
}
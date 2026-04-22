class Solution {
    public int lengthOfLastWord(String s) {
       boolean t=true;
        int count=0;
          
            for(int i=s.length()-1;i>=0;i--){
                System.out.println(s.charAt(i));
                if(s.charAt(i)==' ' && count>0)break;
                if(s.charAt(i)==' ' && count==0)continue;
                else count++;
                }
    return count;
}
}

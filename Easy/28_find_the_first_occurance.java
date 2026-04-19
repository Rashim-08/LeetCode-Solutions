class Solution {
    public int strStr(String haystack, String needle) {
       int i=0;
      while(i<haystack.length()){
    
        System.out.println(haystack.charAt(i)+","+needle.charAt(0));
        
        if(haystack.charAt(i)==needle.charAt(0) && i<=(haystack.length()-needle.length())){
            int f=0;
            for(int k=0;k<needle.length();k++){
                if(haystack.charAt(i+k)==needle.charAt(f)){
                    f++;
                }
                
            }
         if(f==needle.length())break;
        }
        i++;
      }
      if(i==haystack.length())i=-1;
        return i;
    }
}

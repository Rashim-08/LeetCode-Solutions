class Solution {
    public String longestCommonPrefix(String[] strs) {
        String k="";
        if(strs.length == 1){
            k=strs[0];
            return k;
        }
    
            int min=201;
                for(String l: strs){
                    if(l.length()<min){
                        min=l.length();
                    }
                }
                
            char c;
            char d;
            outer:
                for(int i=0;i<min;i++){
                    // System.out.println(i);
                    for(int j=0;j<strs.length-1;j++){
                        // System.out.println(i+","+j);
                        c=strs[j].charAt(i);
                        d=strs[j+1].charAt(i);

                        if(c != d){
                        break outer;
                        }
                        else if(j==strs.length-2){
                        k+=c;
                        }
                    }
                    
                }
        
        return k;
           
            
        
    }
}
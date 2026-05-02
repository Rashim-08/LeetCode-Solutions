class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char c:s.toCharArray()){ans^=c;}
        for(char c:t.toCharArray()){ans^=c;}
    return ans;
    }
}

//logic;-
/*
0^a=a 
a^b=a^b
a^b^c=same
same^c=a^b*/
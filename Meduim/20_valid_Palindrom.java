class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
    int j = s.length() - 1;
    
    while (i < j) {
        char c = s.charAt(i);
        char d = s.charAt(j);
        
        if (!Character.isLetterOrDigit(c)) {
            i++;
        } else if (!Character.isLetterOrDigit(d)) {
            j--;
        } else {
        
            if (Character.toLowerCase(c) != Character.toLowerCase(d)) {
                return false;
            }
            i++;
            j--;
            
        }
    }
    return true;
    }
}

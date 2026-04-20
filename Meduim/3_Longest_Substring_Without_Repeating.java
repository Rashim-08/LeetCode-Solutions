class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set <Character> set =new HashSet<>();

       
        int c = 0;   // max length
        int i = 0;   // left pointer

        for (int j = 0; j < s.length(); j++) {  // right pointer

            // FIX 1: Proper duplicate handling
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            // FIX 2: Add current character
            set.add(s.charAt(j));

            // FIX 3: Correct length calculation
            c = Math.max(c, j - i + 1);
        }

        return c;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int []m={-1,-1};
        if(nums.length==1){
            if (nums != null && nums.length == 0)return m;
            else if(nums[0]==target){
                m[0]=m[1]=0;
                return m;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && m[0]==-1){
                m[0]=m[1]=i;
                continue;
                }
            if(nums[i]==target)m[1]=i;
        }
        return m;
    }
}

//optimal solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the leftmost boundary
        result[0] = findBound(nums, target, true);
        
        // If the target wasn't found at all, we can return early
        if (result[0] == -1) {
            return result;
        }
        
        // Find the rightmost boundary
        result[1] = findBound(nums, target, false);
        
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {
                    // Continue searching the left side for an earlier match
                    high = mid - 1;
                } else {
                    // Continue searching the right side for a later match
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
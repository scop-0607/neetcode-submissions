class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean ans = true;
        int mon = 0;
        for(int i =0; i<n; i++)
        {
            if(nums[i] < mon)
            {
                ans = false;
            }
            else if(nums[i] > mon)
            {
                ans = false;
            }
        
        }
        return ans;
    }
}
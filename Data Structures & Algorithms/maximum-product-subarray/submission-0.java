class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int curprod = 0;
        int maxprod = 0;

        for(int i=0; i<n; i++)
        {
            int temp = curprod * nums[i];
            if(temp < nums[i])
            {
                curprod = nums[i];
            }
            else
            {
                curprod = temp;
            }

            if(curprod > maxprod)
            {
                maxprod = curprod;
            }
        }
        return maxprod; 
    }
}

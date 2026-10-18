class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n ;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int longest = 0;
        
        for(int i=0; i<n; i++)
        {
            int start = nums[i];
            int count = 1;
            if(!map.containsKey(start -1))
            {
            while(map.containsKey(start + 1))
            {
            start++;
            count++;
            }
            longest = Math.max(longest,count);
        }
        }
        return longest;
    }
}

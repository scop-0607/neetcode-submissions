class Solution {
    public static boolean hasDuplicate(int[] nums) {
        int n = nums.length;
    
        for(int i=0;i<n-1;i++)
        {
            for( int j =i+1;j<n;j++)
            {
                if(nums[i] == nums[j])
                {
                return true;
                }
            }
       }
    return false;
    }
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        boolean result = hasDuplicate(nums);
        System.out.println("Has duplicate: " + result);   
        sc.close();     
    }
}
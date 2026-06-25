class Main 
{
    public void twoSum(int[] nums, int target)
    {
        boolean found = false;
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.print(i + " " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found)
        {
            System.out.println("Target not found");
        }
        
    }
    public static void main(String[] args) {
        
        Main main = new Main();

        int arr[] = {2,7,11,15} ;
        main.twoSum(arr, 27);
    }
}
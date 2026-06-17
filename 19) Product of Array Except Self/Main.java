class Main  
{
    public int[] productExceptSelf(int[] nums)
    {
        for (int i=0; i<nums.length; i++)
        {
            nums[i] += ((i+1) * (i+2));
        }

        return nums;
    }
    public static void main(String[] args) {
        
        Main main = new Main();
        int arr[] = {1,2,3,4};

        System.out.print(main.productExceptSelf(arr));

        
    }
}
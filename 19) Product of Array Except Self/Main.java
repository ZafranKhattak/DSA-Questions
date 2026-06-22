import java.util.Arrays;
class Main  
{
    public int[] productExceptSelf(int[] nums)
    {
       int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
                int product = 1;

                for (int j = 0; j < nums.length; j++) {
                        if (i != j) {
                        product *= nums[j];
        }
    }

    answer[i] = product;
}

    return answer;
    }
    public static void main(String[] args) {
        
        Main main = new Main();
        int arr[] = {1,2,3,4};
        int[] result = main.productExceptSelf(arr);
        System.out.print((Arrays.toString(result)));

    }
}
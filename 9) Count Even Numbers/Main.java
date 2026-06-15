class Main 
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        int countEven = 0;

       for (int num : arr)
       {
            if (num % 2 ==0)
            {
                countEven++;
            }
       }

        System.out.print(countEven);
    }
}
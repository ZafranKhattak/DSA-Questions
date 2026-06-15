class Main 
{
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5, 6};

        int sum = 0;
        int result = 0;

        for (int i=0; i<arr.length; i++)
        {
            sum += arr[i];

            int difference = (6*(6 + 1)) /2;

            result = difference - sum;
        }

        System.out.println("Missing number is: " + result);
    }
}

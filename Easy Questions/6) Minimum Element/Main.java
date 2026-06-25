class Main
{
    public static void main (String args[])
    {
        int[] arr = {8, 3, 15, 2, 10, 6};

        int min = arr[0];

        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }

        System.out.println("Minimun is: " + min);
    }
}
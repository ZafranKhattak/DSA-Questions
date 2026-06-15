class Testing
{
    static void insertion()
    {
        int arr[] = new int[7];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        int size = 6;

        for (int i=size; i>2; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[2] = 3;
        size++;

        for (int i = 0; i < size; i++)
    {
        System.out.print(arr[i] + " ");
    }
    }
}

class Insertion
{
    public static void main(String args[])
    {
        
        Testing.insertion();
    }
}
class Main
{
    int firtOccurence()
    {
        int[] arr = {4, 7, 2, 7, 9, 7};
        int target = 7;

        int index = -1;
        for (int i=0; i<arr.length; i++)
        {         
                if (arr[i] == target)
                {
                    return i;                   
            }                    
        }
        return index;
    }
    public static void main(String[] args) {
        
        Main main = new Main();

        System.out.print(main.firtOccurence());
    }
}

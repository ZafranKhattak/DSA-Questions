class Main {

    void sortedArray() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j=1; j<arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    System.out.println("Not Sorted");
                    return;
                }
            }
        }
            System.out.println("Sorted");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sortedArray();
    }
}
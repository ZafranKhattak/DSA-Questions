class Testing {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        Testing test = new Testing();

        int k = test.removeDuplicates(nums);

        System.out.println("Unique count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
import java.util.Arrays;

class Testing {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toLowerCase().toCharArray();
        char[] arr2 = t.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

class Main {
    public static void main(String[] args) {

        Testing test = new Testing();

        System.out.println(test.isAnagram("Cat", "Bat")); 
        System.out.println(test.isAnagram("Cat", "Tac")); 
        

    }
}
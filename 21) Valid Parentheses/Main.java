class Solution 
{
    public boolean isValid(String s)
    {
            char [] valid = s.toCharArray();

            for (int i=0; i<valid.length-1; i++)
            {
                for (int j=i+1; j<valid.length; j++)
                {
                    if (valid[i] == valid[j])
                }
            }

            return false;
    }
}

class Main 
{
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        System.out.print(sol.isValid("()"));
    }
}
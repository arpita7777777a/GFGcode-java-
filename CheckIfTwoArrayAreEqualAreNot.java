class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        boolean equal = Arrays.equals(A,B);
        
        return equal;
        //Your code here
    }
}
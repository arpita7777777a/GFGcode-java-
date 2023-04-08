class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack <Integer> s =new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }
            else if(!s.empty() &&((s.peek()<0&& arr[i]>=0) || s.peek()>=0 && arr[i]<0)){
                s.pop();
            }
            else{
                s.push(arr[i]);
            }
        }
        return new ArrayList<Integer>(s);
    }
}
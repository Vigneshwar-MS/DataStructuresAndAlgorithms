class Solution {


    static int print2largest(int arr[], int n) {
        if(n <= 1) return -1;

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > first) {
                second = first;
                first = val;
            }else if(val < first && val > second){
                second = val;
            }
        }
        if(second == Integer.MIN_VALUE) return -1;
        return second;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{12, 35, 1, 10, 34, 1}, 6));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
class Solution {


    public static int largest(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            max = Math.max(val, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{1, 8, 7, 56, 90}, 5));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
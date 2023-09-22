class Solution {


    void leftRotate(long arr[], int k,int n)
    {
        k = k % n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    void reverse(long[] arr, int start, int end){
        while(start < end){
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
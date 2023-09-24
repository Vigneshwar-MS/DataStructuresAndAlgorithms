class Solution {

    // Function to find ceiling of x
    // arr: input array
    // n is the size of array
    static int findCeil(long arr[], int n, long x)
    {
        int left = 0, right = n - 1, ans = -1;
        while(left <= right){

            int mid = (left + right) / 2;
            if(arr[mid] >= x){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(findCeil(arr, 6, 5));
    }
}

//Time Complexity is O(logN)
//Space complexity is O(1)

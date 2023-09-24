class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int left = 0, right = n - 1, ans = -1;
        while(left <= right){

            int mid = (left + right) / 2;
            if(arr[mid] <= x){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr, 7, 5));
    }
}

//Time Complexity is O(logN)
//Space complexity is O(1)

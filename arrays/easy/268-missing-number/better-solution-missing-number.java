class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        
        int[] arr = new int[len + 1];

        for(int i = 0; i < len; i++){
            arr[nums[i]]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) return i;
        }

        return -1;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)

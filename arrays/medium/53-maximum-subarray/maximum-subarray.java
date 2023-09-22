class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0, maxSum = Integer.MIN_VALUE, len = nums.length;
        int start = 0, indexStart = -1, indexEnd = -1;

        for(int i = 0; i < len; i++){
            if(sum == 0){
                start = i;
            }
            sum += nums[i];
            
            if(sum > maxSum){
                indexStart = start;
                indexEnd = i;
                maxSum = sum;
            }
            
            if(sum < 0){
                sum = 0;
                
            }
        }
        
        //This is to find the starting and ending index of the subarray with the maximum sum
        System.out.println(indexStart);
        System.out.println(indexEnd);
        return maxSum;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)
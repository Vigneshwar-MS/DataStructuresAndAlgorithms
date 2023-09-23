class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE, len = piles.length;
        int ans = -1;
        for(int i = 0; i < len; i++){
            max = Math.max(max, piles[i]);
        }

        int low = 1, high = max;
        while(low <= high){
            int mid = (low + high) / 2;
            int hours = 0;
            for(int i = 0; i < len; i++){
                hours += Math.ceil((double) (piles[i] / (double) mid));
            }
            if(hours <= h){
                ans = mid;
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
//Time Complexity is O(N * log(Max)), where Max - maximum element and N is length of array
//Space complexity is O(1)
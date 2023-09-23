class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Integer.MIN_VALUE, len = weights.length;
        int ans = -1;
        
        for(int i = 0; i < len; i++){
            min = Math.max(min, weights[i]);
        }
        int max = 0;
        for(int i = 0; i < len; i++){
            max += weights[i];
        }

        int low = min, high = max;
        while(low <= high){
            int weight = (low + high) / 2;
            if(canShipPackages(weights, weight, days)){
                ans = weight;
                high = weight - 1;
            }
            else{
                low = weight + 1;
            }
        }
        return ans;
    }

    static boolean canShipPackages(int[] weights, int weight, int days){
        int cntdays = 0, sum = 0;
        for(int i = 0; i < weights.length; i++){
            if(sum == 0){
                cntdays++;
                sum = weights[i];
            }
            else if(sum + weights[i] > weight){
                sum = weights[i];
                cntdays++;
            }
            else{
                sum += weights[i];
            }
        }
        return cntdays <= days;
    }
}
//Time Complexity is O(N * log(Max-Min)), where Max - maximum element, Min is minimum element in the array and N is length of array
//Space complexity is O(1)
 
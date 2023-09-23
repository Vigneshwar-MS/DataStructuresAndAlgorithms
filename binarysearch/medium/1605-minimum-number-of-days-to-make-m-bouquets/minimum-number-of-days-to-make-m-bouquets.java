class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, len = bloomDay.length;
        int ans = -1;
        if(len < m * k ) return -1;

        for(int i = 0; i < len; i++){
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }

        int low = min, high = max;
        while(low <= high){
            int day = (low + high) / 2;
            if(daysToMakeBouquet(bloomDay, m, k, day)){
                ans = day;
                high = day - 1;
            }
            else{
                low = day + 1;
            }
        }
        return ans;
    }

    static boolean daysToMakeBouquet(int[] bloomDay, int m, int k, int days){
        int flowers = 0, bouquets = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(days >= bloomDay[i]){
                flowers++;
            }else{
                bouquets += flowers / k;
                flowers = 0;
            }
        }
        bouquets += flowers / k;
        return bouquets >= m;
    }
}
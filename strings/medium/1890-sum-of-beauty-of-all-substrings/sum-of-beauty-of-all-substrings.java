class Solution {
    public int beautySum(String s) {
        int ans = 0, n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int[] map = new int[26];
                for(int k = i; k <= j; k++){
                    map[s.charAt(k) - 'a']++;
                }
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for(int l = 0; l < 26; l++){
                    if(map[l] != 0){
                        min = Math.min(min, map[l]);
                        max = Math.max(max, map[l]);
                    }
                    
                }
                ans += max - min;
            }
        }

        return ans;
    }
}
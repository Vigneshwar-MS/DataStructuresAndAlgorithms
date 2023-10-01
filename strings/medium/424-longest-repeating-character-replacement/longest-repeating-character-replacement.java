class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0, left = 0;
        int[] map = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            map[s.charAt(i) - 'A']++;
            int max = Integer.MIN_VALUE;
            
            for(int j = 0; j < 26; j++){
                max = Math.max(max, map[j]);
            }

            while((i - left + 1) - max > k){
                map[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)
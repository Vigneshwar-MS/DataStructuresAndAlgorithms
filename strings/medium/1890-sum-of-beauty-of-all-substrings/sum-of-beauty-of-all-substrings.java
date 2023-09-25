class Solution {
    public int beautySum(String s) {
        int ans = 0, n = s.length();
        for(int i = 0; i < n; i++){
            
            int[] map = new int[26];
            for(int j = i; j < n; j++){
            
                map[s.charAt(j) - 'a']++;    
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for(int k = 0; k < 26; k++){
                    if(map[k] != 0){
                        min = Math.min(min, map[k]);
                        max = Math.max(max, map[k]);
                    }    
                }
                ans += max - min;
            }
        }

        return ans;
    }
}

//Time Complexity :  O(N*N).  where N is the length of String. 
//Space complexity is O(1).
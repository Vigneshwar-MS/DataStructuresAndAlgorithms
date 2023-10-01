class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0, left = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            
            while((i - left + 1) - Collections.max(map.values()) > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)
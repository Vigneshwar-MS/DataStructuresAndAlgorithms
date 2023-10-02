class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for(int i = 0; i < s.length(); i++){

            while(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(left));
                left++;
                
            }
            map.put(s.charAt(i), 1);
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;;
        for(int i = 0, j = 0; i < s.length() && j < t.length(); i++, j++){
            max1 = Math.max(max1, s.charAt(i));
            max2 = Math.max(max2, t.charAt(j));
        }
        
        int[] map1 = new int[max1 + 1];
        int[] map2 = new int[max2 + 1];
        
        for(int i = 0; i < s.length(); i++){
            
            if(map1[s.charAt(i)] != map2[t.charAt(i)]) return false;
            
            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
//Time Complexity :  O(2N) ~ O(N)
//Space complexity is O(2(max(s) + 1))

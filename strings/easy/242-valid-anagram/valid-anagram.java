class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int len1 = s.length(), len2 = t.length();
        int[] map = new int[26];

        for(int i = 0; i < len1; i++){
            map[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < len2; i++){
            map[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(map[i] != 0) return false;
        }


        return true;

    }
}
//Time Complexity :  O(N).  where N is the length of each string. 
//Space complexity is O(1).
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0) return "";
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}

//Time Complexity :  O ()N).  where n is the number of strings in the input array. 
//Space complexity is O(1).
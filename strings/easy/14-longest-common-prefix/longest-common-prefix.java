class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1) return strs[0];
        Comparator<String> comp = (a, b) -> a.compareTo(b);
        String smallest = Arrays.stream(strs).min(comp).get();
        int k = 0;
        for(int i = 0; i < smallest.length(); i++) {
            if (checkPrefix(i, strs)) {
                k++;
            }
            else{
                break;
            }
        }
        return smallest.substring(0, k);
    }

    static boolean checkPrefix(int index, String[] strs){
        for(int i = 0; i < strs.length; i++){
            if(strs[i].charAt(index) != strs[0].charAt(index)){
                return false;
            }
        }
        return true;
    }

}
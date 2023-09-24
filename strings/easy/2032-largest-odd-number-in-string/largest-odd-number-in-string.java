class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for(int i = len - 1; i >= 0; i--){
            if(num.charAt(i) % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
//Time Complexity is O(N)
//Space Complexity is O(1)
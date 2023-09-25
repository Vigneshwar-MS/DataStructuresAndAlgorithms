class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length(), max = Integer.MIN_VALUE;
        

        for(int i = 0; i < n; i++){
            
            
            String oddAns = checkPalindrome(s, i, i);
            int sizeOdd = oddAns.length();
            if(sizeOdd > max){
                ans = oddAns;
                max = sizeOdd;
            }
            
            String evenAns = checkPalindrome(s, i, i + 1);
            int sizeEven = evenAns.length();
            if(sizeEven > max){
                ans = evenAns;
                max = sizeEven;
            }    
        }
        return ans;
    }

    static String checkPalindrome(String s, int first, int second){
        int left = first, right = second, len = s.length();
        if(left >= 0 && right < len){
            if(s.charAt(left) != s.charAt(right)) return "";
        }
        
        while(left >= 0 && right < len){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }else{
                left--;
                right++;
            }
        }

        return s.substring(left + 1, right);
    }
}
//Time Complexity is O(N*N)
//Space Complexity is O(1)
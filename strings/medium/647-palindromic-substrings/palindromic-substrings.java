class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length(), count = 0;
        if(len == 1) return 1;

        for(int i = 0; i < len; i++){

            //Odd Palindrome
            count += checkPalindrome(s, i, i);
        
            //Even Palindrome
            count += checkPalindrome(s, i, i + 1);
            
        }

        return count;
    }

    int checkPalindrome(String s, int start, int end){
        int count = 0;
        while(start >= 0 && end < s.length()){
            if(s.charAt(start) != s.charAt(end)){
                break;
            } 
            count++;
            start--;
            end++;
        }
        return count;
    }
}

//Time Complexity is O(N*N), where N is length of string
//Space Complexity is O(1)
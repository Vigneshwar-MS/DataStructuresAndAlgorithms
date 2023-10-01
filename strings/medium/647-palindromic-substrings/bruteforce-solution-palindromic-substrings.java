class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length(), count = 0;
        if(len == 1) return 1;

        for(int i = 0; i < len; i++){
            
            for(int j = i; j < len; j++){
                int left = i, right = j;
                boolean isPalindrome = true;

                while(left <= right){
                    if(s.charAt(left) != s.charAt(right)){
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(isPalindrome) count++;
            }
            
        }

        return count;
    }
}

//Time Complexity is O(N*N*N), where N is length of string
//Space Complexity is O(1)

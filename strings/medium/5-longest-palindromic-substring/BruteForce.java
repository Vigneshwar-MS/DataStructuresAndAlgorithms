class BruteForce {

    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length(), max = Integer.MIN_VALUE;


        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                boolean isPalindrome = true;
                int left = i, right = j;
                while(left <= right){
                    if(s.charAt(left) != s.charAt(right)){
                        isPalindrome = false;
                    }
                    left++;
                    right--;
                }
                if(isPalindrome){
                    if((j - i + 1) > max){
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }
}
//Time Complexity is O(N*N*N)
//Space Complexity is O(1)
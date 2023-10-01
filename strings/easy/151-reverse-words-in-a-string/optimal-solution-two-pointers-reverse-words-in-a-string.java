class Solution {
    public String reverseWords(String s) {
        int n = s.length();
    
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i >= n){
                break;
            }

            int j = i + 1;
            while(j < n && s.charAt(j) != ' '){
                j++;
            }
            
            if(ans.isEmpty()){
                ans = ans.append(s.substring(i, j));
            }
            else{
                ans = ans.insert(0, s.substring(i, j) + " ");
            }
            i = j + 1;
        }
            

        return ans.toString();
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)

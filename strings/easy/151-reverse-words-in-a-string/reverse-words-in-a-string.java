class Solution {
    public String reverseWords(String s) {
        int n = s.length();
     
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                if(!temp.isEmpty()){
                    if(ans.isEmpty()){
                        ans = temp;
                    }
                    else{
                        ans.insert(0, temp + " ");
                    }
                    temp = new StringBuilder();
                }
            }
            else{
                temp.append(s.charAt(i));
            }
        }
        if(!temp.isEmpty()){
            if(ans.isEmpty()){
                ans = temp;
            }
            else{
                ans.insert(0, temp + " ");
            }
        }

        return ans.toString();
    }
}

//Time Complexity is O(N)
//Space Complexity is O(1)
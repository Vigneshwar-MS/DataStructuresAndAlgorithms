class Solution {
    public String reverseWords(String s) {
        int n = s.length();
     
        String temp = "", ans = "";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                if(!temp.isEmpty()){
                    if(ans.isEmpty()){
                        ans = temp;
                    }
                    else{
                        ans = temp + " " + ans;
                    }
                    temp = "";
                }
            }
            else{
                temp += s.charAt(i);
            }
        }
        if(!temp.isEmpty()){
            if(ans.isEmpty()){
                ans = temp;
            }
            else{
                ans = temp + " " + ans;
            }
        }

        return ans;
    }
}
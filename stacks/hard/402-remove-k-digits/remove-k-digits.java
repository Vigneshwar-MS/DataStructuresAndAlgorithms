class Solution {
    public String removeKdigits(String num, int k) {
       int len = num.length();
       if(k > len){
           return "0";
       }
       if(k == 0) return num;

       Stack<Character> stack = new Stack<>();
       
       for(int i = 0; i < len; i++){
           char ch = num.charAt(i);
           while(k > 0 && !stack.isEmpty() && ch < stack.peek()){
               stack.pop();
               k--;
           }

           if(!stack.isEmpty() || ch != '0'){
               stack.push(ch);
           }
       }

       while(k > 0 && !stack.isEmpty()){
           stack.pop();
           k--;
       }

        if(stack.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }

        return sb.toString();
        
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)







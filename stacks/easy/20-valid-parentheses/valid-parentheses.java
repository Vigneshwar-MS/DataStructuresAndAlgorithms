class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i = 0; i < len; i++){
            Character ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);   
            }
            else{
                Character temp = map.get(ch);
                if(stack.isEmpty() || stack.peek() != temp){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}

//Time Complexity is O(N), where N is length of String
//Space Complexity is O(N), where N is length of String
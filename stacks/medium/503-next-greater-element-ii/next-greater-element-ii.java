class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int len = nums.length;
        int[] arrNew = new int[len];
        Stack<Integer> stack = new Stack();
        
        for (int i = (2*len) - 1; i >=0 ; i--) {

            while(!stack.empty() && nums[i % len] >= stack.peek()){
                stack.pop();
            }
            if(i < len){
                if(stack.empty() == false && nums[i] < stack.peek()){
                    arrNew[i] = stack.peek();;
                }else{
                    arrNew[i] = -1;
                }
            }
            stack.push(nums[i % len]);
        }

        return arrNew;
    }
}

//Time Complexity is O(N)
//Space Complexity is O(N)
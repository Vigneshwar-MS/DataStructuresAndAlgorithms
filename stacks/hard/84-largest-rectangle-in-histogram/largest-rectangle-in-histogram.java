class Solution {
    static class Pair
    {
        int height, index;
        public Pair(int height, int index)
        {
            this.height = height;
            this.index = index;
        }
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        Stack<Pair> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            int start = i;

            while(!stack.isEmpty() && heights[i] < stack.peek().height){
                
                int h = stack.peek().height;
                int index = stack.peek().index;
                maxArea = Math.max(maxArea, h * (i - index));
                
                start = index;
                stack.pop();
            }

            stack.push(new Pair(heights[i], start));
        }

        while(!stack.isEmpty()){
            maxArea = Math.max(maxArea, stack.peek().height * (n - stack.peek().index));
            stack.pop();
        }

        return maxArea;
    }
}
//Time Complexity is O(N)
//Space Complexity is O(N)

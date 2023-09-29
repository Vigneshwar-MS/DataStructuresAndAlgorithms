class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int len = asteroids.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < len; i++){
            outer:{
                while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                    int neg = Math.abs(asteroids[i]);
                    int pos = stack.peek();
                    if(pos > neg){
                        break outer;
                    }
                    else if(pos == neg){
                        stack.pop();
                        break outer;
                    }
                    else {
                        stack.pop();
                    }
                }    

                stack.push(asteroids[i]);
            }
            
        }

        int[] arr = new int[stack.size()];
        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = stack.pop();
        }
        return arr;   
    } 
}

//Time Complexity is O(N)
//Space Complexity is O(N)
    

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < len; i++){

            if(!deque.isEmpty() && deque.peekFirst() == i - k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }

            deque.offer(i);
            if(i >= k - 1){
                ans[index++] = nums[deque.peekFirst()];
            }

        }
        return ans;    
    }
}   

//Time Complexity is O( (N), where N is length of array
//Space Complexity is O(N)
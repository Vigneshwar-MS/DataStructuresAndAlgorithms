class Solution {
    
    public boolean check(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int index = -1;
        for(int i = 0; i < len; i++){
            if(i != len - 1 && nums[i] > nums[i+1]) index = i + 1;
        }
        
        if(index != -1){
            for(int i = 0; i < len; i++){
                arr[i] = nums[(i + index) % len];
            }

            for(int i = 0; i < len; i++){
                if(i != len - 1 && arr[i] > arr[i+1]) return false;
            }
        }

        return true;   
    }
}

//Time Complexity is O(3N) ~ O(N)
//Space Complexity is ~ O(N)
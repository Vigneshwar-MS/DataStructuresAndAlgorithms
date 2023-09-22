class Solution {
    public void sortColors(int[] nums) {
        int[] sizeArr = new int[3];
        int len = nums.length;

        if(len == 1) return;

        for(int i = 0; i < len; i++){
            int val = nums[i] == 0 ? sizeArr[0]++ : nums[i] == 1 ? sizeArr[1]++ : sizeArr[2]++;
        }

        int[] ans = new int[len];
        int k = 0, i = 0;
        while(i <= 2){
            if(sizeArr[i] == 0){
                i++;
                continue;
            }
            ans[k++] = i;
            sizeArr[i]--;
        }

        // for(int j = 0; j < len; j++){
        //     if(sizeArr[i] == 0) i++;
        //     ans[j] = i;
        //     sizeArr[i]--;
        // }

        for(int t = 0; t < len; t++){
            nums[t] = ans[t];
        }
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(N)
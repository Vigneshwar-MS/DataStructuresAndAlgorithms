class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;;
        int[] ans = new int[len1];
        for(int i = 0; i < len1; i++){
            int j;
            for(j = 0; j < len2; j++){
                if(nums1[i] == nums2[j]){
                    break;
                }
            }
            ans[i] = -1;
            for(int k = j + 1; k < len2; k++){
                if(nums2[k] > nums1[i]){
                    ans[i] = nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}

//Time Complexity is O(M * N), where M and N are lenght of nums1 and nums2
//Space Complexity is O(1)

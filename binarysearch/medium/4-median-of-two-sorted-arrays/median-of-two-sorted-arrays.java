class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        
        int index2 = (nums1.length + nums2.length) / 2;
        int index1 = index2 - 1;
        int index1Val = -1;
        int index2Val = -1;
        
        int i = 0, j = 0;
        int count = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                if(count == index1) index1Val = nums1[i];
                if(count == index2) index2Val = nums1[i];
                count++;
                i++;
            }
            else{
                if(count == index1) index1Val = nums2[j];
                if(count == index2) index2Val = nums2[j];
                count++;
                j++; 
            }
        }
        while(i < nums1.length){
            if(count == index1) index1Val = nums1[i];
            if(count == index2) index2Val = nums1[i];
            count++;
            i++;
        }

        while(j < nums2.length){
            if(count == index1) index1Val = nums2[j];
            if(count == index2) index2Val = nums2[j];
            count++;
            j++;
        }
        if((nums1.length + nums2.length) % 2 == 1) return index2Val;
        else{
            return (double) (index1Val + index2Val) / 2.0;
        }
    }
}

//Time Complexity is O(M + N), where M and N are length of nums1 and nums2
//Space Complexity is O(1)
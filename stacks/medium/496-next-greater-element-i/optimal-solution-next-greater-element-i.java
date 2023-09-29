class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;;
        
        Stack<Integer> stack = new Stack<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len1; i++){
            map.put(nums1[i], i);
        }


        for(int i = len2 - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                stack.pop();
            }

            if(map.containsKey(nums2[i])){
                if(stack.isEmpty()){
                    nums1[map.get(nums2[i])] = -1;
                }
                else{
                    nums1[map.get(nums2[i])] = stack.peek();
                }
            }
            
            stack.push(nums2[i]);
        }

        return nums1;
    }
}

//Time Complexity is O(M + N), where M and N are length of nums1 and nums2
//Space Complexity is O(N)

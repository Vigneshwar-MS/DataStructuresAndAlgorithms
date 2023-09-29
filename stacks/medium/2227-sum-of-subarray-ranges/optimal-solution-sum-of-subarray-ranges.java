class Solution {
    static class pair
    {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    
    public long subArrayRanges(int[] nums) {
        return calculateMax(nums) - calculateMin(nums);
    }

    public long calculateMin(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<pair> s1 = new Stack<pair>();
        Stack<pair> s2 = new Stack<pair>();

        //Time is O(N) and space is O(N)
        // getting number of element strictly larger
        // than A[i] on Left.
        for (int i = 0; i < n; ++i) {
            int cnt = 1;

            // get elements from stack until element
            // greater than A[i] found
            while (!s1.isEmpty() &&
                    (s1.peek().first) > nums[i]) {
                cnt += s1.peek().second;
                s1.pop();
            }

            s1.push(new pair(nums[i], cnt));
            left[i] = cnt;
        }

        //Time is O(N) and space is O(N)
        // getting number of element larger
        // than A[i] on Right.
        for (int i = n - 1; i >= 0; --i) {
            int cnt = 1;

            // get elements from stack until element
            // greater or equal to A[i] found
            while (!s2.isEmpty() &&
                    (s2.peek().first) >= nums[i]) {
                cnt += s2.peek().second;
                s2.pop();
            }

            s2.push(new pair(nums[i], cnt));
            right[i] = cnt;
        }

        long result = 0;

        //Time is O(N)
        // calculating required resultult
        for (int i = 0; i < n; ++i){
            long temp = nums[i];
            temp *= left[i];
            temp *= right[i];
            System.out.println("The temp is " + temp);
            result += temp;
            System.out.println("The result is " + result);
        }


        return (long) (result);
    }

    public long calculateMax(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<pair> s1 = new Stack<pair>();
        Stack<pair> s2 = new Stack<pair>();

        //Time is O(N) and space is O(N)
        // getting number of element strictly larger
        // than A[i] on Left.
        for (int i = 0; i < n; ++i) {
            int cnt = 1;

            // get elements from stack until element
            // greater than A[i] found
            while (!s1.isEmpty() &&
                    (s1.peek().first) < nums[i]) {
                cnt += s1.peek().second;
                s1.pop();
            }

            s1.push(new pair(nums[i], cnt));
            left[i] = cnt;
        }

        //Time is O(N) and space is O(N)
        // getting number of element larger
        // than A[i] on Right.
        for (int i = n - 1; i >= 0; --i) {
            int cnt = 1;

            // get elements from stack until element
            // greater or equal to A[i] found
            while (!s2.isEmpty() &&
                    (s2.peek().first) <= nums[i]) {
                cnt += s2.peek().second;
                s2.pop();
            }

            s2.push(new pair(nums[i], cnt));
            right[i] = cnt;
        }

        long result = 0;

        //Time is O(N)
        // calculating required resultult
        for (int i = 0; i < n; ++i){
            long temp = nums[i];
            temp *= left[i];
            temp *= right[i];
            System.out.println("The temp is " + temp);
            result += temp;
            System.out.println("The result is " + result);
        }


        return (long) (result);
    }

    
}

//Time Complexity is O(N)
//Space Complexity is O(N)

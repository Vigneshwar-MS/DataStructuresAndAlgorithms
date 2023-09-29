class BruteForce {

//    Source of the problem - https://leetcode.com/problems/sum-of-subarray-minimums/description/
//    Tag - Stack Medium level


    static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0;
        Stack<Pair> stack1 = new Stack<>();
        Stack<Pair> stack2 = new Stack<>();

        int[] leftAns = new int[n];
        int[] rightAns = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            while(!stack1.isEmpty() && arr[i] < stack1.peek().x){
                count += stack1.peek().y;
                stack1.pop();
            }
            stack1.push(new Pair(arr[i], count));
            leftAns[i] = count;
        }


        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while(!stack2.isEmpty() && arr[i] <= stack2.peek().x){
                count += stack2.peek().y;
                stack2.pop();
            }
            stack2.push(new Pair(arr[i], count));
            rightAns[i] = count;
        }

        for(int i = 0; i < n; i++){
            sum += leftAns[i] * rightAns[i] * arr[i];
        }

        return (int)(sum % (Math.pow(10, 9) + 7));

    }
}

//Time complexity is O(2N) ~ O(N), where N is the length of the array
//Space complexity is O(4N) ~ O(N)

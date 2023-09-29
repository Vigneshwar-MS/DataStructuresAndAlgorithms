class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
//    Tag - Stack Easy level


    static List<Integer> leftSmaller(int n, int a[])
    {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && a[i] <= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(stack.peek());
            }
            stack.push(a[i]);
        }
        return ans;
    }
}

//Time Complexity is O(N)
//Space complexity is O(N)

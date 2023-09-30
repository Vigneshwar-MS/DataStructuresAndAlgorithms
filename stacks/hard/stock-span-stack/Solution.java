class Solution {

    //    Source of the problem - https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
    //    Tag - Stack Hard level

    static class Pair{
        int price, span;
        Pair(int price, int span){
            this.price = price;
            this.span = span;
        }
    }

    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Pair> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int span = 1;
            while(!stack.isEmpty() && price[i] >= stack.peek().price){
                span += stack.peek().span;
                stack.pop();
            }

            stack.push(new Pair(price[i], span));
            ans[i] = span;
        }

        return ans;
    }

}

//Time Complexity is ~ O(N), where N is the length of array
//Space Complexity is ~ O(N)
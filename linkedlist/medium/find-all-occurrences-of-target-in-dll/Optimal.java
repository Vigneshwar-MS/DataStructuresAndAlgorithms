class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/0
//    Tag - Doubly Linked List easy level


    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        for(Node current = head; current != null; current = current.next){
            list.add(current.data);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int len = list.size();
        int left = 0, right = len - 1;
        while(left < right){
            int first = list.get(left);
            int second = list.get(right);
            int sum = first + second;
            if(sum == target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(first);
                temp.add(second);
                ans.add(temp);
                left++;
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }

}

//Time Complexity is O(N)
//Space complexity is O(N)

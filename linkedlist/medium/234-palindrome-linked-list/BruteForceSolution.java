class RecursiveSolution {

    //Source - https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/0
    //Tag - Linked List

    boolean isPalindrome(Node head)
    {
        List<Integer> ans = new ArrayList<>();
        while(head != null){
            ans.add(head.data);
            head = head.next;
        }

        for(int i = 0; i < ans.size() / 2; i++){
            if(ans.get(i) != ans.get(ans.size() - i - 1)) return false;
        }
        return true;
    }

}

//Time Complexity is O(N)
//Space Complexity is O(N)
class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/0
//    Tag - Hashing Easy level


    public static Node findIntersection(Node head2, Node head1)
    {
        HashSet<Integer> set = new LinkedHashSet<>();
        Node ans = null, temp = null;
        while(head1 != null){
            set.add(head1.data);
            head1 = head1.next;
        }

        while(head2 != null){
            if(set.contains(head2.data)){
                Node n = new Node(head2.data);
                if(temp == null){
                    temp = ans = n;
                }else{
                    temp.next = n;
                    temp = temp.next;
                }
            }
            head2 = head2.next;
        }
        return ans;
    }

}

//Time Complexity is O(N)
//Space complexity is O(N)

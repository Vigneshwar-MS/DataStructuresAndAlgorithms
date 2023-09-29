class BruteForce {

//    Source of the problem - https://www.codingninjas.com/studio/problems/implement-stack-with-linked-list_1279905
//    Tag - Stack Easy level


    static class Node
    {
        int data;
        Node next;
        Node()
        {
            this.data = 0;
            this.next = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };


 *****************************************************************/
    public class Solution {
        static class Stack {
            //Write your code here
            Node head;
            int size;
            Stack()
            {
                head = null;
                size = 0;
            }

            int getSize()
            {
                return size;
            }

            boolean isEmpty()
            {
                return size == 0;
            }

            void push(int data)
            {
                Node nnode = new Node(data);
                nnode.next = head;
                head = nnode;
                size++;
            }

            void pop()
            {
                if(head != null){
                    head = head.next;
                    size--;
                }

            }

            int getTop()
            {
                if(head != null){
                    return head.data;
                }
                else{
                    return -1;
                }
            }

        }
    }

//Time Complexity is O(N) for the whole stack and every operation push, pop, getTop, getSize, isEmpty is O(1)
//Space complexity is O(N)

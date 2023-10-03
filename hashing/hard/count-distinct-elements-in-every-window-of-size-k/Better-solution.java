class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
//    Tag - Array Medium level


    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            if(i - k == left){
                map.put(A[left], map.getOrDefault(A[left], 0) - 1);
                if(map.getOrDefault(A[left], 0) == 0){
                    map.remove(A[left]);
                }
                left++;
            }

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);


            if(i >= k - 1){
                ans.add(map.size());
            }

        }

        return ans;

    }
}

//Time Complexity is O(N)
//Space complexity is O(N)

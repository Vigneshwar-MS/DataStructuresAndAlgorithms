class Solution {
//    Source of the problem - https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
//    Tag - Array Medium level

    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(i = 0; i < k; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            count++;
            if(count == k){
                ans.add(map.size());
                break;
            }
        }

        for(int j = i + 1; j < n; j++){
            map.put(A[j], map.getOrDefault(A[j], 0) + 1);

            map.put(A[j - k], map.getOrDefault(A[j - k], 0) - 1);
            if(map.get(A[j - k]) == 0){
                map.remove(A[j - k]);
            }

            ans.add(map.size());
        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(countDistinct(new int[]{1,2,1,3,4,2,3}, 7, 4));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(N)

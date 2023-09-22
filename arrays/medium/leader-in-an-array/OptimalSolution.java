class OptimalSolution {


    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int leader = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= leader){
                leader = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }


    public static void main(String[] args) {

        //Example 1
        int[] arr1 = {16,17,4,3,5,2};
        leaders(arr1, arr1.length);

    }
}

//Time Complexity is ~ O(N), where N is the size of array
//Space Complexity is ~ O(1)
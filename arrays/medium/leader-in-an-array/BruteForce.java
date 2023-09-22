class BruteForce {


    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int len = arr.length;

        for(int i = 0; i < len; i++){
            boolean leader = true;
            for(int j = i + 1; j < len; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //Example 1
        int[] arr1 = {16,17,4,3,5,2};
        leaders(arr1, arr1.length);

    }
}

//Time Complexity is ~ O(N^2), where N is the size of array
//Space Complexity is ~ O(1)
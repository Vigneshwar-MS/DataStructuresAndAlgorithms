class BruteForce {


    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int m, int n)
    {
        Set<Integer> set = new TreeSet<>();
        for(int val : arr1){
            set.add(val);
        }
        for(int val : arr2){
            set.add(val);
        }
        ArrayList<Integer> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}
        int arr2 [] = {1, 2, 3}
        findUnion(arr1, arr2, arr1.length, , arr2.length);
    }
}

//Time Complexity is O(M + N)log(M + N) + O(M + N) ~ O(M + N)log(M + N), where M is the size of array 1 and N is the size of array 2
//Space Complexity is ~ O(M + N) for set
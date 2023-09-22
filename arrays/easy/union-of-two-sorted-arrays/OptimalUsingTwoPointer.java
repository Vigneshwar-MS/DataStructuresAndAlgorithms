class OptimalUsingTwoPointer {


    static List<Integer> findUnion(int[] arr1, int[] arr2){
        int n = arr1.length, m = arr2.length;
        int left1 = 0, left2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(left1 < n && left2 < m){

            while(left1 < n-1 && arr1[left1] == arr1[left1+1]) left1++;
            while(left2 < m-1 && arr2[left2] == arr2[left2+1]) left2++;

            if(arr1[left1] == arr2[left2]){
                ans.add(arr1[left1]);
                left1++;
                left2++;
            }else if(arr1[left1] < arr2[left2]){
                ans.add(arr1[left1]);
                left1++;
            }else{
                ans.add(arr2[left2]);
                left2++;
            }
        }
        if(left1 < n){
            for(int i = left1; i < n; i++){
                ans.add(arr1[i]);
            }
        }
        if(left2 < m){
            for(int i = left2; i < m; i++){
                ans.add(arr2[left2]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}
        int arr2 [] = {1, 2, 3}
        findUnion(arr1, arr2, arr1.length, , arr2.length);
    }
}

//Time Complexity is ~ O(M + N), where M is the size of array 1 and N is the size of array 2
//Space Complexity is ~ O(M + N) for set
class Solution {


    static boolean arraySortedOrNot(int[] arr, int n) {
        int i = 1;
        boolean sorted = true;
        while(i < n){
            if(arr[i] < arr[i-1]){
                sorted = false;
            }
            i++;
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(arraySortedOrNot(new int[]{10, 20, 30, 40, 50}, 5));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
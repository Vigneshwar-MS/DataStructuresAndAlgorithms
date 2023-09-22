class Solution {


    static int[] leftRotateByOne(int[] arr){

        if(arr.length == 1){
            return arr;
        }
        int firstValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstValue;
        return arr;
    }

    public static void main(String[] args) {
        leftRotateByOne(new int[]{1,2,3,4,5});
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(1)
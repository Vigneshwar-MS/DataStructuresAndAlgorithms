class Solution {


    public int findPairs(int arr[],int n)
    {

        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){

            for(int j = i+1; j < len; j++){

                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)){
                    return 1;
                }
                map.put(sum, 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(findPairs(new int[]{3, 4, 7, 1, 2, 9, 8}, 7));
    }
}

//Time Complexity is ~ O(N*N)
//Space Complexity is ~ O(N)
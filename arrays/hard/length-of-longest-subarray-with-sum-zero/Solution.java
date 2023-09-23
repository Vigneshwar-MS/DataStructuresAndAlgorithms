class Solution {


    static int maxLen(int arr[])
    {
        int sum = 0, max = Integer.MIN_VALUE, len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            sum += arr[i];
            if(sum == 0) max = Math.max(max, i + 1);

            int diff = sum;
            if(map.containsKey(diff)){
                max = Math.max(max, i - map.get(diff));
            }
            if(!map.containsKey(diff)){
                map.put(sum, i);
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{15,-2,2,-8,1,7,10,23}));
    }
}

//Time Complexity is ~ O(N)
//Space Complexity is ~ O(N)
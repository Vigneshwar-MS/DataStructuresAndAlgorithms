class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/0
//    Tag - Hashing Easy level


        public static String isSubset( long a1[], long a2[], long n, long m) {
            Map<Long, Long> map = new HashMap<>();
            for(Long a : a1){
                map.put(a, map.getOrDefault(a, Long.valueOf(0)) + 1);
            }

            for(Long b : a2){
                if(map.get(b) == null){
                    return "No";
                }

                map.put(b, map.get(b) - 1);
                if(map.get(b) == 0){
                    map.remove(b);
                }
            }

            return "Yes";
        }


    public static void main(String[] args) {

        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
        long a2[] = {11, 3, 7, 1, 7}
        isSubset(a1, a2, a1.length, a2.length);
    }
}

//Time Complexity is O(N)
//Space complexity is O(N)

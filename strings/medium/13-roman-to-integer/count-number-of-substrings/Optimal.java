class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/0
//    Tag - Strings Medium level

    long substrCount (String S, int K) {
        return findSubStringCount(S, K) - findSubStringCount(S, K - 1);
    }

    static long findSubStringCount(String S, int K){
        int count = 0, left = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() > K){
                char leftCh = S.charAt(left);
                map.put(leftCh, map.getOrDefault(leftCh, 0) - 1);
                if(map.get(leftCh) == 0) map.remove(leftCh);
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {

        String S = "abaaca";
        System.out.println(substrCount(S, 1));
    }
}

//Time Complexity is O(N)
//Space complexity is O(1)

class BruteForce {

//    Source of the problem - https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/0
//    Tag - Strings Medium level


        long substrCount (String S, int K) {
            int count = 0;

            boolean[] seen = new boolean[26];
            for(int i = 0; i < S.length(); i++){
                int distCount = 0;
                Arrays.fill(seen, false);
                for(int j = i; j < S.length(); j++){
                    if(!seen[S.charAt(j) - 'a']){
                        distCount++;
                    }
                    seen[S.charAt(j) - 'a'] = true;
                    if(distCount == K) count++;
                    else if(distCount > K) break;
                }
            }
            return count;
        }

    public static void main(String[] args) {

        String S = "abaaca";
        System.out.println(substrCount(S, 1));
    }
}

//Time Complexity is O(N*N)
//Space complexity is O(1), as the size of boolean array is fixed

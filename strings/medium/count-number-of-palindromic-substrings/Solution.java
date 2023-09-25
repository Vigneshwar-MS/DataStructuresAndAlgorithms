class Solution {


    static public int CountPS(String S, int N)
    {
        int count = 0;

        for(int i = 0; i < N; i++){

            //Odd palindrome check
            int size = checkPalindrome(S, i, i);
            count += size;

            //Even palindrome check
            size = checkPalindrome(S, i, i+1);
            count += size;

        }

        return count;
    }

    static int checkPalindrome(String S, int start, int end){

        int count = 0;

        if(start == end){
            count--;
        }

        while(start >= 0 && end < S.length()){
            if(S.charAt(start--) == S.charAt(end++)){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(CountPS(abaab, 5));
    }
}

//Time Complexity is ~ O(N*N)
//Space Complexity is ~ O(1)
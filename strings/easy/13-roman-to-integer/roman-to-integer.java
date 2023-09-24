class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i = 0; i < s.length(); i++){
            int val1 = map.get(s.charAt(i));
            if(i+1 < s.length()){
                int val2 = map.get(s.charAt(i+1));  
                if(val1 < val2){
                    ans += val2 - val1;
                    i++;
                }
                else{
                    ans += val1;
                }
            }
            else{
                ans += val1;
            }
        }
        return ans;
    }
}
//Time Complexity :  O(N) + O(N).  where N is the length of array. 
//Space complexity is O(N).
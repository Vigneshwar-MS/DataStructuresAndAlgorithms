class Solution {
    public String frequencySort(String s) {

        String ans = "";
        char[] ch = s.toCharArray();
        int len = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> lst = new ArrayList<>(map.entrySet());

        lst.sort(new Comparator<Map.Entry<Character, Integer>>() {
          @Override
          public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
              return (o1.getValue()
                      == (o2.getValue()))
                      ? o1.getKey() - o2.getKey()
                      : o2.getValue() - o1.getValue();
            }
        });

        for(Map.Entry<Character, Integer> e : lst){
            for(int i = 0; i < e.getValue(); i++){
                ans += new String(String.valueOf(e.getKey()));
            }
        }
        return ans;

        
    }
}